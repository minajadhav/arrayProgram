package arrayproject;

import java.util.Arrays;

public class Class {

	public static void main(String[] args) {
		
		
		System.out.println("=======1st method======");
		int a[] = new int[5];
		 a[0]= 100;
		 a[1] = 200;
		 a[2] = 300;
		 a[3] = 400;
		 a[4] = 500;
		 
		 System.out.println(Arrays.toString(a));
		 
		 //printing stmt from 3rd position
		 
		 System.out.println(a[2]);
		 
		 System.out.println("=======2nd method======");
		 
		 int b[] = {101,202,303,404,505,606,707};
		
		 System.out.println(Arrays.toString(b));
		 System.out.println(b[6]);
		 
		 System.out.println("====print size of an array=== ");
		 System.out.println(a.length);
		 System.out.println(b.length);

		 
	}

}
