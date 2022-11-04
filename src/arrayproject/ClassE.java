package arrayproject;

import java.util.Arrays;

public class ClassE {

	public static void main(String[] args)
 {
      
		//MULTIDIMENSIONAL ARRAy
		 
		int a [] = {10,20};
		
		 System.out.println(Arrays.toString(a));
		int b []= {300,400};
		 System.out.println(Arrays.toString(b));

		int k[][] = {a,b};
		System.out.println(Arrays.deepToString(k));
		
		String p [][]= new String[2][3];
		
		p[0][0]= "my ";
		p[0][1]= "name";
		p[0][2]= "is";
		
		p[1][0]= "meena";
		p[1][1]= "age";
		p[1][2]= "30";

System.out.println(Arrays.deepToString(p));


	}

}
