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
	private double height;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		//System.out.println("Name of student : "+ name);
		return this.name;
	}
	public int getAge()
	{
		//System.out.println("Age of student : "+ age);
		return age;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
}
