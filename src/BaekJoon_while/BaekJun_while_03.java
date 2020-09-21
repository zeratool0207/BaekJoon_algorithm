package BaekJoon_while;

import java.util.Scanner;

public class BaekJun_while_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a=0;
		int b=0;
		int c=0;
		int count=0;
		
		a = N % 10;                      
		b = ((N / 10) + a) % 10;
		
		c = (a*10) + b;                   
		count++;
		if(c == N) {
			System.out.print(count);
		}else {
			while(true) {
				a = c / 10;
				b = c % 10;
			    c = (b*10) + ((a+b)%10);
			    count++;
			    if(c == N) {
			    	System.out.print(count);
			    	break;
			    }
			}
		}
		sc.close();
	}
}
