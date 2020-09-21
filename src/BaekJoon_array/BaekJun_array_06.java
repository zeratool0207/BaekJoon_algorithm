package BaekJoon_array;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJun_array_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String a;
		int c=0;
		int count=0;
		String [] arr = new String[N];
		int [] answer = new int[N];
		
		for(int i=0; i<answer.length; i++) {
			a = sc.nextLine();
			arr[i] = a;
		}
		
		//진우방식
		char[] carr;
		
		for(int i=0; i<arr.length;i++) {
			carr=arr[i].toCharArray();
			System.out.println("this is carr =>\n" + Arrays.toString(carr));
			for(int j=0; j<carr.length; j++) {
				if(carr[j]=='O') {
					count +=1;
					answer[i] += count;
				}
				else {
					count=0;
				}
			}
			
		}
		
		for(int i=0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
	}
}

//for(int i=0; i<arr.length;i++) {
//
//for(int j=0; j<arr[i].length();j++) {
//	if(arr[i].substring(j, j+1).equals("O")) {
//		count++;
//		c += count;
//	}else if(arr[i].substring(j, j+1).equals("X")) {
//		count = 0;
//	}
//}
//answer[i] = c;
//c=0;
//count=0;
//}
