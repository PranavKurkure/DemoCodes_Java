package oop_concepts;

//when object is created constructor is called automatically

//This is parent class
class Vehicle{
	String name;
	int numTyre;
	double cost;
	Vehicle()
	{
		System.out.println("Vehicle object created successfully");
	}
	void setDetails(String name, int numTyre, double cost)
	{
		this.name = name;
		this.numTyre = numTyre;
		this.cost = cost;
	}
}
class Car extends Vehicle{
	
	
}



public class inheritance_example {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
