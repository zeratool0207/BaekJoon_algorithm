package BaekJoon_practice;

import java.util.Scanner;

public class BaekJun_practice_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int i = N-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
