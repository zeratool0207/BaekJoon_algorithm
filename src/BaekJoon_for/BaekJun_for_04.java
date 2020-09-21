package BaekJoon_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJun_for_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());  
		int A;
		int B;
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			A=Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			bw.write((A+B)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
	//StringBuilder sb = new StringBuilder();
	// for 문 내에    sb.append((A+B)+"\n");
	//System.out.println(sb.toString());
//	5
//	1 1
//	12 34
//	5 500
//	40 60
//	1000 1000
//	2
//	46
//	505
//	100
//	2000

