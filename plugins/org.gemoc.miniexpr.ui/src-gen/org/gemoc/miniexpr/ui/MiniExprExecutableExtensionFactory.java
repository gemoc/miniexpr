/*
 * generated by Xtext 2.22.0
 */
package org.gemoc.miniexpr.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.gemoc.miniexpr.ui.internal.MiniexprActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MiniExprExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MiniexprActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MiniexprActivator activator = MiniexprActivator.getInstance();
		return activator != null ? activator.getInjector(MiniexprActivator.ORG_GEMOC_MINIEXPR_MINIEXPR) : null;
	}

}
