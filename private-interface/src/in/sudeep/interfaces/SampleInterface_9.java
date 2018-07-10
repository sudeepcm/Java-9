package in.sudeep.interfaces;

public interface SampleInterface_9 {
	
String CONSTANT_1 = "CONSTANT_1";
	
	public void method1();
	
	default void default_method() {
		System.out.println("This is default method");
		/**
		 * Private method can be called from default method
		 */
		method3();
	}

	public static void method2() {
		System.out.println("This is a public static method");
		/**
		 * Static method can be called from static method
		 */
		method4();
	}	
	
	private void method3() {
		System.out.println("This is private interface method");
	}
	
	private static void method4() {
		System.out.println("This is private static interface method");
	}

}
