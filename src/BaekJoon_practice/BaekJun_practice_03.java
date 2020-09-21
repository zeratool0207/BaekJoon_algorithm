package BaekJoon_practice;

import java.util.Scanner;

public class BaekJun_practice_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];
		int tmp=0;
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		System.out.println(arr[1]);
	}
}
