/*
 * generated by Xtext 2.21.0
 */
package mdsd;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MathCompilerStandaloneSetup extends MathCompilerStandaloneSetupGenerated {

	public static void doSetup() {
		new MathCompilerStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
