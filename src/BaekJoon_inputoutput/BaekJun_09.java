package BaekJoon_inputoutput;

import java.util.Scanner;

public class BaekJun_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int C;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);	
	}
}
