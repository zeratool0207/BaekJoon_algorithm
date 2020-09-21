package BaekJoon_array;

import java.util.Scanner;

public class BaekJun_array_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C; // 곱하기
		
		int [] divide = {};
		
		if(mul>=1000000 && mul<=9999999) {
			divide = new int[7];
			for(int i=0; i<7; i++) {
				divide[i]= mul % 10;
				mul = mul / 10;
			}
		}else if(mul>=10000000 && mul<=99999999) {
			 divide = new int[8];
			for(int i=0; i<8; i++) {
				divide[i]= mul % 10;
				mul = mul / 10;
			}
		}else {
			divide = new int[9];
			for(int i=0; i<9; i++) {
				divide[i]= mul % 10;
				mul = mul / 10;
			}
		}
		
		int [] answer = new int[10];
		
		for(int i=0; i<divide.length; i++) {
			switch (divide[i]) {
			case 0: answer[0]++; break;
			case 1: answer[1]++; break;
			case 2: answer[2]++; break;
			case 3: answer[3]++; break;
			case 4: answer[4]++; break;
			case 5: answer[5]++; break;
			case 6: answer[6]++; break;
			case 7: answer[7]++; break;
			case 8: answer[8]++; break;
			case 9: answer[9]++; break;
			default:  break;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
