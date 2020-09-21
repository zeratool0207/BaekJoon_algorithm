package BaekJoon_array;

import java.util.Scanner;

public class BaekJun_array_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 StringBuilder str = new StringBuilder(); 
		int C = sc.nextInt();
		sc.nextLine();
		
		int d;
		int sum;
		double avg;
		int count;
		//5   0
		for(int i=0; i<C; i++) {
			sum=0;
			count=0;
			d = sc.nextInt();
			int [] answer = new int[d]; 
			for(int j=0; j<answer.length; j++) {
				answer[j]=sc.nextInt();
				sum +=answer[j];
			}
			avg = sum / d;
			
			for(int j=0; j<answer.length;j++) {
				if(answer[j]>avg) {
					count+=1;
				}
			}
			double dap = count*100 / (double)d;
			 str.append(String.format("%,.3f", dap)+"%\n"); 
		}
		System.out.println(str.toString()); 
	}
}