package org.gemoc.miniexpr.parser;

import org.eclipse.emf.ecore.EPackage;
import org.gemoc.miniexpr.MiniExprLanguage;
import org.gemoc.miniexpr.MiniExprStandaloneSetup;
import org.gemoc.miniexpr.miniExpr.MiniExprPackage;
import org.gemoc.miniexpr.miniExpr.Model;
import org.eclipse.xtext.testing.util.ParseHelper;

import com.google.inject.Injector;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.source.Source;

@SuppressWarnings("all")
public class MiniExprParser {

	private static MiniExprStandaloneSetup miniExprSetup = new MiniExprStandaloneSetup();

	private static Injector miniExprInjector = miniExprSetup.createInjectorAndDoEMFRegistration();

	private static ParseHelper<Model> miniExprParseHelper = miniExprInjector.<ParseHelper>getInstance(ParseHelper.class);

	public static RootCallTarget parseMiniExpr(MiniExprLanguage language, Source source) throws Exception {
		EPackage.Registry.INSTANCE.put(MiniExprPackage.eNS_URI, MiniExprPackage.eINSTANCE);
		final String model = source.getCharacters().toString();
		return (new MiniExprNodeFactory(language))
				.createExpression(miniExprParseHelper.parse(model).getExpressions().get(0), source);
	}
}
