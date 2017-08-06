package day_2017_08_04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
A. Choosing Teams
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
The Saratov State University Olympiad Programmers Training Center (SSU OPTC) has n students. For each student you know the number of times he/she has participated in the ACM ICPC world programming championship. According to the ACM ICPC rules, each person can participate in the world championship at most 5 times.

The head of the SSU OPTC is recently gathering teams to participate in the world championship. Each team must consist of exactly three people, at that, any person cannot be a member of two or more teams. What maximum number of teams can the head make if he wants each team to participate in the world championship with the same members at least k times?

Input
The first line contains two integers, n and k (1 ≤ n ≤ 2000; 1 ≤ k ≤ 5). The next line contains n integers: y1, y2, ..., yn (0 ≤ yi ≤ 5), where yi shows the number of times the i-th person participated in the ACM ICPC world championship.

Output
Print a single number — the answer to the problem.
----------------------------------------------------------------------------------------------------
문제제목:A. Buy a Shovel
생성자:길경완
생성일자:2017_08_04
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
 

테스트 당 시간 제한 1 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력
사라 토프 주립 대학 올림피아드 프로그래머 교육 센터 (SSU OPTC)에는 n 명의 학생이 있습니다. 각 학생은 ACM ICPC 세계 프로그래밍 챔피언십에 참가한 횟수를 알고있을 것입니다. 
ACM ICPC 규정에 따르면, 각 개인은 최대 5 회까지 세계 선수권에 참가할 수 있습니다.

SSU OPTC의 책임자는 최근 세계 선수권에 참가할 팀을 모으고 있습니다. 각 팀은 정확히 3 명으로 구성되어야하며, 어떤 사람이라도 2 명 이상의 팀 구성원이 될 수 없습니다. 
각 팀이 동일한 멤버와 최소 k 회 월드 챔피언십에 참가하기를 원한다면 어떤 수의 팀을 만들 수 있습니까?

입력
첫 번째 줄에는 두 개의 정수 n과 k가 포함됩니다 (1 ≤ n ≤ 2000; 1 ≤ k ≤ 5). 
다음 줄에는 y1, y2, ..., yn (0 ≤ yi ≤ 5)의 n 개의 정수가 포함됩니다. 
여기서 yi는 i 번째 사람이 ACM ICPC 세계 선수권 대회에 참가한 횟수를 나타냅니다.

input
5 2
0 4 5 1 0
output
1
input
6 4
0 1 2 3 4 5
output
0
input
6 5
0 0 0 0 0 0
output
2
Note
In the first sample only one team could be made: the first, the fourth and the fifth participants.

In the second sample no teams could be created.

In the third sample two teams could be created. Any partition into two teams fits.


문제해설:
무척간단하다. 정렬사용문제라고하지만 그냥 입력때 추가 대회 횟수를 넣어서 이것이 5를 넘겨버리지 않을때만 count한뒤에
이걸 3의 몫만 출력하면됨.

 * 
 * 
 */
public class Choosing_Teams {

	public static void main(String[] args) {
		 MyScanner sc = new MyScanner();
	     out = new PrintWriter(new BufferedOutputStream(System.out));
	     int n = sc.nextInt();
	     int k =sc.nextInt();
	     int input[] =new int[n];

	     int count=0;
	     for(int i=0;i<n;i++)
	     {
	    	 input[i]=sc.nextInt();
	    	 input[i]+=k;
	    	 if(input[i]<=5)
	    		 count++;
	     }
	     
	    out.print(count/3);
	     
	     
	    
	     
	    
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
