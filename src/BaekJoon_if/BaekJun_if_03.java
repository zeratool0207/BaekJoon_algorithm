package BaekJoon_if;

import java.util.Scanner;

public class BaekJun_if_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a=sc.nextInt();
		System.out.println("this is a =>"+a);
		
		if(a%4==0&&((a%100!=0)||(a%400==0))) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
