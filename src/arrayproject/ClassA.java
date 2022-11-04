package arrayproject;

import java.util.Arrays;

public class ClassA {

	public static void main(String[] args) {

		int a[] = {100,200,300,400,500};
		
		System.out.println(Arrays.toString(a));
		
		//swapping
	int k = a[0];
	System.out.println(k);
	
	a[0] = a[4];
	a[4] = k;
	System.out.println(Arrays.toString(a));
		
		
	}

}
