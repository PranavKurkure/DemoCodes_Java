package first;

import java.util.Arrays;
import java.util.Iterator;

public class test {
	
	final int i;
	
	
	static final int j;
	test()
	{
		i=10;
	}
	static {
		j=10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,5};
		Iterator<Integer> itr = Arrays.stream(arr).iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		

	}

}
