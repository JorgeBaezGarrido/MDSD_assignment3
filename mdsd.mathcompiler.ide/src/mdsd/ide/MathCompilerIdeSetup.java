/*
 * generated by Xtext 2.21.0
 */
package mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import mdsd.MathCompilerRuntimeModule;
import mdsd.MathCompilerStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MathCompilerIdeSetup extends MathCompilerStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MathCompilerRuntimeModule(), new MathCompilerIdeModule()));
	}
	
}
