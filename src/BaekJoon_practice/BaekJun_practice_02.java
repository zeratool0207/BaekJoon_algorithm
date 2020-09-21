package BaekJoon_practice;

import java.util.Scanner;

public class BaekJun_practice_02 {

	public static void main(String[] args) {
		
		//병근이 배열
		
		Scanner sc = new Scanner(System.in);
		int[] bur = new int[3];
		int[] be = new int[2];
		int[] min = new int[2];
		
		for(int i=0;i<bur.length;i++) {
			bur[i] = sc.nextInt();
		}
		min[0] = bur[0];
		for(int i=1;i<bur.length;i++) {
			if(min[0] > bur[i]) min[0] = bur[i];
		}
		
		for(int i=0;i<be.length;i++) {
			be[i] = sc.nextInt();
		}
		
		min[1] = be[0];
		for(int i=1;i<be.length;i++) {
			if(min[1] > be[i]) min[1] = be[i];
		}
		System.out.println(min[0]+min[1]-50);
	}	
}	

		// 내 코드
//			public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int a;
//			int mina=2001;
//			int b;
//			int minb=2001;
//				
//			for(int i=0; i<3; i++) {
//				a=sc.nextInt();
//					
//				if(a<mina) 	mina = a;
//			}
//				
//			for(int i=0; i<2; i++) {
//				b=sc.nextInt();
//					
//				if(b<minb)  minb = b;
//			}
//			System.out.println(mina+minb-50);
//			}
//		}

