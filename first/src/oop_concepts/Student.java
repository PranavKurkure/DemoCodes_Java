package oop_concepts;
/*This class is used to hide the data from the user and has methods that 
 * are used manipulate the data of the user
 * 
 *  private variables are available in the same class
 *  
 * 
 * 
 * */

public class Student {
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void getName()
	{
		System.out.println("Name of student : "+ name);
	}
	public void getAge()
	{
		System.out.println("Age of student : "+ age);
	}
}
