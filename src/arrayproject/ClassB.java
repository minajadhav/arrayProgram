package arrayproject;

import java.util.Arrays;

public class ClassB {

	public static void main(String[] args) {

		
		String a[] = {"my","name","is","meena"};
		System.out.println(Arrays.toString(a));
		
		String b[] = Arrays.copyOf(a,2);       //copy of array a lengh 2
		System.out.println(Arrays.toString(b));
		String c[] = Arrays.copyOf(a, 3);       // copy of array a lengh 3
		System.out.println(Arrays.toString(c));
		String d[] = Arrays.copyOf(a, 7);       // copy of array a lengh 7
		System.out.println(Arrays.toString(d));


	}

}
