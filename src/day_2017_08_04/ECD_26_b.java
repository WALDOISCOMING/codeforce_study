package day_2017_08_04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/*
테스트 당 시간 제한 1 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력
Berland의 깃발은 다음과 같은 조건을 만족하는 사각형 필드 n × m입니다.

깃발은 'R', 'G'및 'B'문자에 해당하는 세 가지 색상으로 구성됩니다.
깃발은 너비와 높이가 같은 3 개의 선과 서로 나란히 있고 깃발의 측면으로 구성됩니다.
'R', 'G'및 'B'문자로 구성된 n × m 필드가 제공됩니다. 이 필드가 Berland의 올바른 플래그와 일치하면 "YES"(따옴표 제외)를 출력합니다. 
그렇지 않으면 "NO"(따옴표 제외)를 인쇄하십시오.

입력
첫 번째 줄에는 두 개의 정수 n과 m (1 ≤ n, m ≤ 100) - 필드의 크기가 포함됩니다.

'R', 'G'및 'B'm 문자로 구성된 다음 n 줄 각각은 필드에 대한 설명입니다.

산출
주어진 필드가 Berland의 올바른 플래그와 일치하면 "YES"(따옴표 제외)를 출력하십시오. 그렇지 않으면 "NO"(따옴표 제외)를 인쇄하십시오.
 */
public class ECD_26_b {

	public static int R=1;
	
	public static int G=1;
	
	public static int B=1;

	
	
	public static void main(String[] args) {
		
	
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int m = sc.nextInt();
        String input[]=new String[n];
        
        boolean str=true;
        int counting=0;
        for(int i=0;i<n;i++){
        		input[i]=sc.nextLine();
        }
        if(base(input[0]))
        {//가로기준
        	char now=input[0].charAt(0);
        	
        	for(int i=1;i<n;i++)
        	{
        		if(now==input[i].charAt(0))
        		{
        			if(now=='R')R++;
        			if(now=='G')G++;
        			if(now=='B')B++;
        		}else{
        			counting++;
        			now=input[i].charAt(0);
        		}
        		
        	}
        	if(counting>=3)
			str=false;
        	
        	
        }else{
        	//세로기준.
        	char now=input[0].charAt(0);
        	
        	for(int i=1;i<m;i++)
        	{
        		if(now==input[0].charAt(i))
        		{
        			if(now=='R')R++;
        			if(now=='G')G++;
        			if(now=='B')B++;
        		}else{
        			counting++;
        			now=input[0].charAt(i);
        		}
        		
        	}
        	if(counting>=3)
    			str=false;
        	
        }
        boolean check=true;
        if(n<3&&m<3)
        	check=false;
        if(R==G&&G==B&&str==true&&check)
        	out.println("YES");
        else
        	out.println("NO");
     out.close();
        
	}
	
	public static boolean base(String input)
	{
		char ch = input.charAt(0);
		for(int i=1;i<input.length();i++)
		{
			if(ch!=input.charAt(i))
				return false;
		}
		return true;
		
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
