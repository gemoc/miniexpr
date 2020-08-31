#!/usr/bin/env bash

declare -r JAVA_VERSION="${1:?First argument must be java version.}"
declare -r GRAALVM_VERSION="${2:?Second argument must be GraalVM version.}"
if [[ $JAVA_VERSION == 1.8* ]]; then
    JRE="jre/"
    echo $JRE
elif [[ $JAVA_VERSION == 11* ]]; then
    JRE=""
    echo "Java 11"
else
    echo "Unkown java version: $JAVA_VERSION"
    exit 1
fi
readonly COMPONENT_DIR="component_temp_dir"
readonly LANGUAGE_PATH="$COMPONENT_DIR/$JRE/languages/mnxpr"
if [[ -f ../native/mnxprnative ]]; then
    INCLUDE_MNXPRNATIVE="TRUE"
fi

rm -rf COMPONENT_DIR

mkdir -p "$LANGUAGE_PATH"
cp ../language/target/miniexpr.jar "$LANGUAGE_PATH"

mkdir -p "$LANGUAGE_PATH/launcher"
cp ../launcher/target/mnxpr-launcher.jar "$LANGUAGE_PATH/launcher/"

mkdir -p "$LANGUAGE_PATH/bin"
cp ../mnxpr $LANGUAGE_PATH/bin/
if [[ $INCLUDE_MNXPRNATIVE = "TRUE" ]]; then
    cp ../native/mnxprnative $LANGUAGE_PATH/bin/
fi

touch "$LANGUAGE_PATH/native-image.properties"

mkdir -p "$COMPONENT_DIR/META-INF"
{
    echo "Bundle-Name: MiniExpr";
    echo "Bundle-Symbolic-Name: org.gemoc.miniexpr";
    echo "Bundle-Version: $GRAALVM_VERSION";
    echo "Bundle-RequireCapability: org.graalvm; filter:=\"(&(graalvm_version=$GRAALVM_VERSION)(os_arch=amd64))\"";
    echo "x-GraalVM-Polyglot-Part: True"
} > "$COMPONENT_DIR/META-INF/MANIFEST.MF"

(
cd $COMPONENT_DIR || exit 1
jar cfm ../mnxpr-component.jar META-INF/MANIFEST.MF .

echo "bin/mnxpr = ../$JRE/languages/mnxpr/bin/mnxpr" > META-INF/symlinks
if [[ $INCLUDE_MNXPRNATIVE = "TRUE" ]]; then
    echo "bin/mnxprnative = ../$JRE/languages/mnxpr/bin/mnxprnative" >> META-INF/symlinks
fi
jar uf ../mnxpr-component.jar META-INF/symlinks

{
    echo "$JRE"'languages/mnxpr/bin/mnxpr = rwxrwxr-x'
    echo "$JRE"'languages/mnxpr/bin/mnxprnative = rwxrwxr-x'
} > META-INF/permissions
jar uf ../mnxpr-component.jar META-INF/permissions
)
rm -rf $COMPONENT_DIR
