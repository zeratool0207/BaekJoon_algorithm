package BaekJoon_if;

import java.util.Scanner;

public class BaekJun_if_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(b>=45) {
			System.out.println(a+" "+(b-45));
		}else {
			if(a==0) {
				System.out.println((a+24-1)+" "+(b+60-45));
			}else {
				System.out.println((a-1)+" "+(b+60-45));
			}
		}
	}
}
