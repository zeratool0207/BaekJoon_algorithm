package BaekJoon_if;

import java.util.Scanner;

public class BaekJun_If_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0;
		int B=0;
		A=sc.nextInt();
		B=sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A==B) {
			System.out.println("==");
		}else {
			System.out.println("<");
		}
	}

}
