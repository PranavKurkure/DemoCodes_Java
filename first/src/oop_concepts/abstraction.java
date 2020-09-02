package oop_concepts;
//if a class is abstract then then the abstracts method mentioned in it
//must be implemented its child class 
//abstract class provides 
/*
 * POINTS TO REMEMBER
 * An abstract class is a class that is declared with abstract keyword.
 * An abstract method is a method that is declared without an implementation.
 * An abstract class may or may not have all abstract methods. Some of them can be concrete methods
 * A method defined abstract must always be redefined in the subclass,
 * thus making overriding compulsory OR either make subclass itself abstract.
 * Any class that contains one or more abstract methods must also 
   be declared with abstract keyword.
 * There can be no object of an abstract class.
   That is, an abstract class can not be directly instantiated 
   with the new operator.
 * An abstract class can have parametrized constructors and default constructor is always present in an abstract class.
 * 
 * */

abstract class democlass{
	abstract void absMethod();
	void hello()
	{
		System.out.println("Hello there");
	}
	
}
class B extends democlass{

	@Override
	void absMethod() {
		// TODO Auto-generated method stub
		System.out.println("IN B Class");
		
	}
	
}


public class abstraction extends democlass {
	
	void absMethod()
	{
		System.out.println("in abstraction class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B d1 = new B();
		d1.hello();
		d1.absMethod();
		System.out.println("-------------------------------------");
		abstraction a1 = new abstraction();
		a1.hello();
		a1.absMethod();

	}

}
