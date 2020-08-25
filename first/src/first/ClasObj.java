package first;
import java.util.*;

public class ClasObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		int x = c1.sum(20, 10);
		int y = c1.sub(20, 10);
		System.out.println("x is : "+x+" y is :"+y);
		System.out.print("Max element is : "+Math.max(x, y));

	}

}
