package day_2017_07_31;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;



/*
A. Holiday Of Equality
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
In Berland it is the holiday of equality. In honor of the holiday the king decided to equalize the welfare of all citizens in Berland by the expense of the state treasury.

Totally in Berland there are n citizens, the welfare of each of them is estimated as the integer in ai burles (burle is the currency in Berland).

You are the royal treasurer, which needs to count the minimum charges of the kingdom on the king's present. The king can only give money, he hasn't a power to take away them.

Input
The first line contains the integer n (1 ≤ n ≤ 100) — the number of citizens in the kingdom.

The second line contains n integers a1, a2, ..., an, where ai (0 ≤ ai ≤ 106) — the welfare of the i-th citizen.

Output
In the only line print the integer S — the minimum number of burles which are had to spend.
----------------------------------------------------------------------------------------------------
문제제목:A. Holiday Of Equality
생성자:길경완
생성일자:2017_07_31
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
 
Berland에서는 평등의 휴일입니다. 이 휴가를 기념하기 위해 국왕은 베를 랜드의 모든 시민들의 복지를 국가 금고의 비용으로 동등하게하기로 결정했습니다.
Berland에는 N 시민이 있으며, 각자의 복리는 AI Burles의 정수로 추정됩니다 (Berle은 Berland의 통화 임).
당신은 왕의 현재에 왕국의 최소한의 혐의를 세어야하는 왕 재무입니다. 왕은 돈만 줄 수 있고, 돈을 버릴 힘이 없습니다.
	
	입력
	첫 번째 줄에는 정수 n (1 ≤ n ≤ 100) - 왕국에있는 시민의 수를 포함합니다.
	두 번째 줄에는 n 개의 정수 a1, a2, ..., an이 포함됩니다. 여기에서 ai (0 ≤ ai ≤ 106) - i 번째 시민의 복지입니다.
	산출
	단 한 줄에 정수 S를 쓰십시오 - 쓸 필요가있는 버클의 최소 수.
-----------------------------------------
문제해설:
ex)
	3 
	1	2	3
	-->2+1+0
첫번째 입력인 n은 다음에 입력될 두번째 입력들 배열의 크기를 정해준다. 이 n과 입력 배열의 크기가 n*m이라고 하였을 때 둘의 최대치가 10600이므로 int로 하면 된다.
이 문제는 무척 쉽다. 최대 숫자에 맞추어 주면 된다. 최대숫자에 각 입력 배열을 빼준 합이 S이다.
 * 
 * 
 */
public class Holiday_Of_Equality {
	public static void main(String[] args) {
		/*
		 * 숫자만큼 입력! 여기에서 최대에게 맞춘다.
		 * 
		 */
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int number = sc.nextInt();
        int input[] = new int[number];
        int best = 0;
        for(int i=0;i<number;i++)
        {
       	 input[i] = sc.nextInt();
       
       	 if(input[i]>best)
       	 {
       		 best = input[i];
       	 }
        }
        int sum=0;
        for(int i=0;i<number;i++)
        {
        	
        	sum+=best-input[i];
        }

        out.println(sum);
   	   
      
  
       
     out.close();
        
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
