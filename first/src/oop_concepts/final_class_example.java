package oop_concepts;
/*
 * Final class can extend different classes but cannot be extended by 
 * another classes
 * 
 * 
 */

class A{
	void hello()
	{
		System.out.println("In class A");
	}
}

final class Big extends A{
	void hello()
	{
		System.out.println("IN class Big");
	}
}



public class final_class_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new Big();
		b.hello();

	}

}
