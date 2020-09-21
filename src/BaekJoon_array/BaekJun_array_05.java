package BaekJoon_array;

import java.util.Scanner;


public class BaekJun_array_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		
		int a = 0;
		for(int i=0; i<arr.length; i++) {
			a= sc.nextInt();
			arr[i]=a;
		}
		
		int M=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>=M) {
				M=arr[i];
			}
		}
		
		double m = M;
		
		double [] arr2 = new double[N];
		
		for(int i=0; i<arr2.length;i++) {
			arr2[i] = arr[i]/m*100; 
		}
		
		m=0;
		for(int i=0; i<arr2.length;i++) {
			m += arr2[i];
		}
		
		System.out.printf("%f",m/N);
		
	}
}
