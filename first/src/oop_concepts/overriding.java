package oop_concepts;

/*
 * Overriding: feature that allows a subclass or child class to provide a 
 * specific implementation of a method that is already provided by one of 
 * its super-classes or parent classes
 * 
 * */

class Parent{
	void fun()
	{
		System.out.println("In parent class");
	}
}

class Child extends Parent{
	
	//Overridden method in Child class
	@Override
	void fun()
	{
		System.out.println("In child class");
	}
}


public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent class object 
		Parent p1 = new Parent();
		p1.fun();
		
		//Child class object
		Parent p2 = new Child();
		p2.fun();

	}

}
