package BaekJoon_while;

import java.util.Scanner;

public class BaekJun_while_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		while(sc.hasNextInt()) {
			A=sc.nextInt();
			B=sc.nextInt();
			System.out.println(A+B);
		}
	}
}
