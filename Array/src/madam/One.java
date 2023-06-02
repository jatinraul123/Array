package madam;

import java.util.Arrays;

public class One {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr1 = {1, 2, 3, 4, 5 };
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr1));
	System.out.println(arr1[4]);
	arr1[3]=0;
	System.out.println(Arrays.toString(arr1));
	arr1[3]=arr1[4];
	arr1[4]=0;
	System.out.println(Arrays.toString(arr1));
	arr1[4]=6;
	System.out.println(Arrays.toString(arr1));
	


	}

}
