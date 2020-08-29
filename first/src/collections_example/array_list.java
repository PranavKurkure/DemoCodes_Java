/*ArrayList in java is like a dynamic array which can be used for 
dynamically adding , removing, modifying, elements in array
ArrayList is the class in java.util.* package
*********************************************************************
ArrayList(Class) -------> List(Interface) -----------> Collections
*				Implements					extends
**********************************************************************
*/

package collections_example;
import java.util.*;

public class array_list {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
//---------Adding elements to ArrayList---------------//		
		for(int i=0;i<5;i++)
		{
			int x = in.nextInt();
			arr.add(x);
		}
		
//--------Printing all elements in ArrayList-----------//
		System.out.println(arr);
		
//--------Removing an element from ArrayList-----------//
		System.out.println("Enter element index you want to remove :");
		int rem = in.nextInt();
		arr.remove(rem);
		
//--------Printing all elements in ArrayList-----------//
		System.out.println("---------------------------------"+"\nModified list is :");
		System.out.println(arr);		
		
//----------Adding element at specific index in arraylist------------//
		System.out.println("Enter index location:");
		int temp = in.nextInt();
		System.out.println("Enter the ineteger: ");
		int data = in.nextInt();
		arr.add(temp, data);
		
//--------Printing all elements in ArrayList-----------//
		System.out.println("Modified list is :");
		System.out.println(arr);
		
//---------printing elements using get function of ArrayList---------//
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(i+"th element is : "+arr.get(i));
		}
		
		
		

	}

}
