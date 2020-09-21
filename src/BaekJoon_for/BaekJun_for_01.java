package BaekJoon_for;

import java.util.Scanner;

public class BaekJun_for_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
		for(int i=1; i<=9;i++) {
			System.out.println(N + " * "+ i +" = " + (N*i));
		}
	}
}
