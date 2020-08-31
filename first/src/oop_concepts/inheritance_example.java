package oop_concepts;

interface Parent1{
	default void fun()
	{
		System.out.println("In Parent1 class");
	}
}

interface Parent2 {
	default void fun()
	{
		System.out.println("In Parent2 class");
	}
}

public class inheritance_example implements Parent1,Parent2 {
	
	public void show()
	{
		Parent1.super.fun();
		Parent2.super.fun();
		
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		Parent1.super.fun();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance_example e1 = new inheritance_example();
		e1.show();
		e1.fun();

	}

}
