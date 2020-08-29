package data_structures;

import java.util.*;

class MyStack{
	Stack<Integer> s;
	Integer minEle;
	MyStack()
	{
		s = new Stack<>();
	}
	void getMin()
	{
		if(s.empty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Minimum element in stack is : "+minEle);
		}
	}
	void peek()
	{
		if(s.empty())
		{
			System.out.println("Stack is empty");
			return;
		}
		Integer t = s.peek();
		System.out.println("Top most element is: ");
		
		if(t<minEle)
		{
			System.out.println(minEle);
		}
		else
		{
			System.out.println(t);
		}
	}
	void pop()
	{
		if(s.empty())
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Topmost element is removed");
		Integer t = s.pop();
		if(t<minEle)
		{
			System.out.println(minEle);
			
		}
	}
	
}

public class stack_imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		

	}

}
