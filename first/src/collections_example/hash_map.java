//Implementation of HashMap and TreeMap in java which are useful in many codes
//Methods used for HashMap - clear, containsKey(Object key), containsValue(Object Value),
//						   - replace(K key, V value), size(), isEmpty
package collections_example;

import java.util.*;

public class hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class object
		Scanner in  = new Scanner(System.in);
		//Predefined array with some duplicate elements in it
		int[] arr = {10,20,20,30,30,30,40,40,50,60};
		int n = arr.length;
		//TreeMap is used to store the elements in increasing order
		//HashMap is like unordered_map used in C++
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		for(int i=0;i<n;i++)
		{
			if(tmap.containsKey(arr[i]))
			{
				tmap.put(arr[i], tmap.get(arr[i])+1);
			}
			else
			{
				tmap.put(arr[i], 1);
			}
		}
		System.out.println("-----------TreeMap output----------------");
		for(Map.Entry<Integer, Integer> e : tmap.entrySet())
		{
			System.out.println("Key : "+e.getKey()+" | Value : "+e.getValue());
		}
		System.out.println("\n"+"-----------HashMap output----------------");
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}
			else
			{
				hmap.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> e : hmap.entrySet())
		{
			System.out.println("Key : "+e.getKey()+" | Value : "+e.getValue());
		}
	}

}
