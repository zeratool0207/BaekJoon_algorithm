package BaekJoon_if;

import java.util.Scanner;

public class BaekJun_if_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>=0 && b>=0) {
			System.out.println("1");
		}else if(a<=0 && b>=0) {
			System.out.println("2");
		}else if(a<=0 && b<=0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
	}
}
