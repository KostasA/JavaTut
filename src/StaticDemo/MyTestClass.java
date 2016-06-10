package StaticDemo;

public class MyTestClass {
	/**
	 * static means it belongs to the class not an instance,
	 * this means that there is only one copy of that variable/method
	 * shared between all instances of a particular Class
	 */
	
	/*
	 * I took this example from stackoverflow
	 * http://stackoverflow.com/questions/13772827/difference-between-static-and-final
	 */
	public static int variable = 0 ;
//	public int variable = 0; 

	public static void main(String[] args) {
		
		MyTestClass instance1 = new MyTestClass();
		MyTestClass instance2 = new MyTestClass();
		
		MyTestClass.variable = 2;
		System.out.println(instance2.variable);

	}

}
