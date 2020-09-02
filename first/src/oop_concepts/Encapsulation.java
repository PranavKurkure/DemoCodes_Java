package oop_concepts;

//We are using Student class that has private variables in
//it and getters and setters for those variables
/*
 * Encapsulation : Encapsulation is defined as the wrapping up of data under 
 * 				   a single unit.
 *  It is the mechanism that binds together code and the data it manipulates.
 *  
 *  ADVANTAGES : 1) Data hiding
 *  			 2) Increased Flexibility
 *  			 3) Reusability
 *  			 4) Testing code is easy
 *  
 * */

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setAge(56);
		s.setName("pranav");
		s.setHeight(12.35);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getHeight());

	}

}
