package StaticDemo;

public class MyTestClass {
	
	public static int variable = 0 ;

	public static void main(String[] args) {
		
		MyTestClass instance1 = new MyTestClass();
		MyTestClass instance2 = new MyTestClass();
		
		MyTestClass.variable = 2;
		System.out.println(instance2.variable);

	}

}
