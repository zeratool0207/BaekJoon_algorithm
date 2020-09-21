package BaekJoon_array;

import java.util.Scanner;

public class BaekJun_array_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int []arr = new int[10];
		
		for(int i=0; i<10; i++) {
			A=sc.nextInt();
			arr[i]=A;
		}

		int []dif = new int[42];
		
		for(int i=0; i<arr.length; i++) {
			  dif[arr[i] % 42] +=1;
		}
	
		int count =0;
		
		for(int i=0; i<dif.length; i++) {
			if(dif[i]!=0) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
