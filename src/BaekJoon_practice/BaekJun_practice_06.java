package BaekJoon_practice;

import java.util.Scanner;

public class BaekJun_practice_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int count=0;
		
		char tmp=' ';
		char c='*';
		char d=' ';
		
		if(N%2==1) {
			for(int a=0; a<N; a++) {
				for(int i=1; i<=2*N; i++) {
					if(i%2==1) {
						count++;
						System.out.print("*");
					}else {
						count++;
						System.out.print(" ");
					}
					if(count==N) {
						System.out.println();
					}
				}
				count=0;
				System.out.println();
			}
		}else{
			for(int a=0; a<N; a++) {
				for(int i=1; i<=2*N; i++) {
					if(i%2==1) {
						count++;
						System.out.print(c);
					}else{
						count++;
						System.out.print(d);
					}
					if(count==N) {
						tmp = c;
						c = d;
						d = tmp;
						System.out.println();
					}
				}
				tmp=' ';
				c='*';
				d=' ';
				count=0;
				System.out.println();
			}
		}
	}
}
