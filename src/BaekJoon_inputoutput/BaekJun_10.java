package BaekJoon_inputoutput;

import java.util.Scanner;

public class BaekJun_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b;
		int a;
		a=sc.nextInt();
		sc.nextLine();
		b=sc.nextLine();
		System.out.println("this is a"+a);
		System.out.println("this is b"+b);
		System.out.println(a*Integer.parseInt(b.substring(2,3)));
		System.out.println(a*Integer.parseInt(b.substring(1,2)));
		System.out.println(a*Integer.parseInt(b.substring(0,1)));
		System.out.println(a*Integer.parseInt(b));
		
		//https://www.acmicpc.net/problem/2588
		//2588번
	}
}
