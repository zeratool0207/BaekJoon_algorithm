package BaekJoon_array;

import java.util.Scanner;

public class BaekJun_array_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr = new int[N];
		int M = 0;
		int max=0;
		int min=0;
		int tmp=0;
		
		for(int i=0; i<arr.length; i++) {
			M=sc.nextInt();
			arr[i] = M;
		}
		
		for(int i=1; i<arr.length;i++) {
			if(arr[0]<arr[i]) {
				tmp = arr[0];
				arr[0]=arr[i];
				arr[i]=tmp;
			}
		}
		max = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(arr[0]>arr[i]) {
				tmp = arr[0];
				arr[0]=arr[i];
				arr[i]=tmp;
			}
		}
		min = arr[0];

		System.out.println(min+" "+max);
	}
}
