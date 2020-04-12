import java.util.*;

public class MathCompiler {
	
	public static interface Externals {
		public int power(int base, int exponent);
	}
	private Externals externals;
				
	
	public MathCompiler(Externals _externals){
		externals = _externals;
	}

			
	public void compute(){
		System.out.println("first value "+((2)+((3)*(2))));
		System.out.println("second value "+(2));
		System.out.println("External "+(externals.power(2,3)));
	}
}
