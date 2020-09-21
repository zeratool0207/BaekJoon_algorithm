package BaekJoon_practice;

import java.util.Scanner;

public class BaekJun_practice_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int sum=0;
		for(int i=0; i<5; i++) {
			a=sc.nextInt();
			if(a<=40) {
				a=40;
			}
			sum += a;
		}
		System.out.println(sum/5);
	}
}
