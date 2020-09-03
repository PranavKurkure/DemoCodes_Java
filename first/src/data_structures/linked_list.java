package data_structures;

import java.util.Scanner;

import data_structures.linkedlist.Node;

class linkedlist{
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void detectLoop()
	{
		Node slow = head;
		Node fast = head;
		int flag=0;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow ==  fast)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Loop is present");
		else
			System.out.println("no loop");
	}
	public Node reverselist() {
		// TODO Auto-generated method stub
		Node curr = head;
		Node prev = null;
		Node temp = null;
		while(curr != null)
		{
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
		return head;
		
	}
	public void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public int get(int n)
	{
		int x=0;
		Node temp = head;
		n--;
		while(n-- > 0)
		{
			x = temp.data;
			temp = temp.next;
		}
		return x;
	}
	
	public void delNode(int del)
	{
		
		Node temp = head;
		
		if(del == 0)
		{
			head = temp.next;
			return;
		}
		
		for(int i=0;i<del && temp!=null;i++)
		{
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null)
		{
			return;
		}
		
		Node nxt = temp.next.next;
		temp.next = nxt;
		
	}
	public int getMax()
	{
		Node temp = head;
		int x =0;
		while(temp!= null)
		{
			x = Math.max(x, temp.data);
			temp = temp.next;
		}
		return x;
	}

	
}






public class linked_list {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		linkedlist l1 = new linkedlist();
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(50);
		
		//l1.head.next.next.next.next.next = l1.head;
		
		
		l1.detectLoop();
		//print(l1);
		
		//----linked list before reversal------//
		System.out.println("Linked list is");
		l1.print();
		
		//-----Reverse a linked list------------//
		l1.reverselist();
		
		//----linked list after reversal------//
		System.out.println("\nReverse linked list");
		l1.print();
		
		//------Nth node in linked list---------//
		System.out.println("\nEnter n for getting nth node data: ");
		int n = in.nextInt();
		System.out.println("Nth node is : "+ l1.get(n));
		
		//------Delete a node at nth position------//
		System.out.println("Enter the node u want to delete : ");
		int del = in.nextInt();
		l1.delNode(del);
		
		l1.print();
		
		//------get max element from linked list--------//
		System.out.println("Max element from linked list is : ");
		System.out.println(l1.getMax());
		
		

	}

	

}
