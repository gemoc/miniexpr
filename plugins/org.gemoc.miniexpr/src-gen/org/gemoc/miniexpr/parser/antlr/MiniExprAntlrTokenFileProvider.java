/*
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MiniExprAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/gemoc/miniexpr/parser/antlr/internal/InternalMiniExpr.tokens");
	}
}