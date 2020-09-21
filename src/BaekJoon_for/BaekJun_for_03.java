package BaekJoon_for;

import java.util.Scanner;

public class BaekJun_for_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		for(int i=0; i<=n; i++) {
			a+=i;
			// 값을 계속 더할 때에는 "  +=  "
		}
		System.out.println(a);
	}
}
