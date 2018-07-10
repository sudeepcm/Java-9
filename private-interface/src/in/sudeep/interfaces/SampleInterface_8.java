package in.sudeep.interfaces;

public interface SampleInterface_8 {
	
	String CONSTANT_1 = "CONSTANT_1";
	
	public void method1();
	
	default void default_method() {
		System.out.println("This is default method");
	}

	public static void method2() {
		System.out.println("This is a public static method");
	}	
	
}
