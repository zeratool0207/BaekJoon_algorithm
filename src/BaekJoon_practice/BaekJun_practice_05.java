package BaekJoon_practice;

import java.util.Scanner;

public class BaekJun_practice_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;
		int ccount=N-2;

		for(int i=2*N-1; i>=0; i-=2) {
			count++;
			if(i!=2*N-1) { 
				for(int k=1;k<N;k++) {
					if(count==k) break;
					System.out.print(" ");
				}
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		count =0;
		
		for(int i=1; i<=2*N-1; i+=2) {
			if(i!=1) { 
				for(int k=N-2; k>=1; k--) {
					if(count==k) break;
					System.out.print(" ");
				}
				count++;
				for(int j=i; j<3*i;j+=2) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
