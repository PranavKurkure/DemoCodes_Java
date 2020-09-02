package oop_concepts;
/*
 * Polymorphism: having many forms
 * example : a man can be husband, father, friend, employee depending 
 * on the behaviour in different situations
 * 
 * 2 types --> Compiletime Poly (Method overloading, overriding)
 * 		   --> Run time poly (Dynamic method dispatch)
 * 
 * */
//this is run time polymorphism
class Cars{
	void drive()
	{
		System.out.println("Vroom Vroom");
	}
}

class Maruti extends Cars{
	void drive()
	{
		System.out.println("maruti goes brrrrrrrr");
	}
}

class BMW extends Cars{
	void drive() {
		System.out.println("BMW goes dhuuuummmmmmmmm");
	}
}


public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c1 = new Cars();
		System.out.println("-------------Cars object called------------");
		c1.drive();
		System.out.println("-------------------------------------------");
		
		Maruti m1 = new Maruti();
		System.out.println("-------------Maruti object called------------");
		m1.drive();
		System.out.println("-------------------------------------------");
		
		BMW b1 = new BMW();
		System.out.println("-------------BMW object called------------");
		b1.drive();
		

	}

}
