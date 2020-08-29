package oop_concepts;
//if a class is abstract then then the abstracts method mentioned in it
//must be implemented its child class 
//abstract class provides 

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
