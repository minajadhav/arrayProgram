package arrayproject;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int []k= {15 ,34,56,87,92};
		System.out.println(Arrays.toString(k));
		for(int i=0; i<k.length;i++) {
			for(int j=(i+1); j<k.length; j++) {
				if(k[i]>k[j]) {
					int temp = k[i];
					k[i]=k[j];
					k[j]=temp;
				}
			}
		}
			System.out.println(k);
		
	}

}
