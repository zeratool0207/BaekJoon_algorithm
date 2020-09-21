package BaekJoon_array;

import java.util.Scanner;

public class BaekJun_array_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int M =0;
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			M=sc.nextInt();
			arr[i] = M;
		}
		
		max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		for(int i=0; i<arr.length; i++) {
			if(max==arr[i]) {
				System.out.print(i+1);
			}
		}
	}
}
