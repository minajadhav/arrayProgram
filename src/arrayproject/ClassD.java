package arrayproject;

import java.util.Scanner;

public class ClassD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		System.out.println("customer name is = " +a );

		int  b = input.nextInt();
		System.out.println("cuurrent balance is = " +b);

		int c = input.nextInt();
		System.out.println("deposit amount is = " +c);
		
		String d = input.nextLine();
		 int k = b + c ;
		 
		System.out.println("total balance is = " +k);



	}

}
