package BaekJoon_for;

import java.util.Scanner;

public class BaekJun_for_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int A;
		int B;
		for(int i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}
