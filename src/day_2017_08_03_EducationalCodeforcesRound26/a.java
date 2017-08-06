package day_2017_08_03_EducationalCodeforcesRound26;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 * A형문제.,
 * 
 * 
A. 텍스트 볼륨
테스트 당 시간 제한 1 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력
소문자와 대문자 라틴 문자로 구성된 단일 공백으로 분리 된 단어의 텍스트가 제공됩니다.

단어의 음량은 단어의 대문자 수입니다. 텍스트의 볼륨은 텍스트의 모든 단어의 최대 볼륨입니다.

주어진 텍스트의 볼륨을 계산하십시오.

입력
첫 번째 줄에는 하나의 정수 n (1 ≤ n ≤ 200) - 텍스트의 길이가 포함됩니다.

두 번째 행에는 공백으로 분리 된 s1, s2, ..., si라는 텍스트가 포함되어 있습니다. 작은 및 대문자 라틴 문자로만 구성됩니다.

산출
하나의 정수 - 텍스트의 양을 인쇄하십시오.
 */

public class a {
	static int BIGCOUNT=0;
	static int BEST=0;
	public static void main(String[] args) {
		
	
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
   
        int n = sc.nextInt();
        String input = sc.nextLine();
        
        for(int i=0;i<n;i++)
        {
        	counting(input.charAt(i));
        }
        if(BEST==0)BEST=BIGCOUNT;
        out.println(BEST);
      
      
     out.close();
        
	}
	
	public static void counting(char c)
	{
		if(c>=65&&c<=90)
			BIGCOUNT++;
		if(c==' '){
			if(BIGCOUNT>BEST){
			BEST=BIGCOUNT;
			}
			BIGCOUNT=0;
		}
	}

	static PrintWriter out;
	 static class MyScanner {
	       BufferedReader br;
	       StringTokenizer st;
	  
	       public MyScanner() {
	          br = new BufferedReader(new InputStreamReader(System.in));
	       }
	  
	       String next() {
	           while (st == null || !st.hasMoreElements()) {
	               try {
	                   st = new StringTokenizer(br.readLine());
	               } catch (IOException e) {
	                   e.printStackTrace();
	               }
	           }
	           return st.nextToken();
	       }
	       
	       int nextInt() {
	           return Integer.parseInt(next());
	       }
	  
	       long nextLong() {
	           return Long.parseLong(next());
	       }
	  
	       double nextDouble() {
	           return Double.parseDouble(next());
	       }
	  
	       String nextLine(){
	           String str = "";
	 	  try {
	 	     str = br.readLine();
	 	  } catch (IOException e) {
	 	     e.printStackTrace();
	 	  }
	 	  return str;
	       }

	    }
	 
}
