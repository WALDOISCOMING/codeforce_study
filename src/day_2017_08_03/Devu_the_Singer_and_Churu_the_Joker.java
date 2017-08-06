package day_2017_08_03;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/*
A. Devu, the Singer and Churu, the Joker
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Devu is a renowned classical singer. He is invited to many big functions/festivals. Recently he was invited to "All World Classical Singing Festival". Other than Devu, comedian Churu was also invited.

Devu has provided organizers a list of the songs and required time for singing them. He will sing n songs, ith song will take ti minutes exactly.

The Comedian, Churu will crack jokes. All his jokes are of 5 minutes exactly.

People have mainly come to listen Devu. But you know that he needs rest of 10 minutes after each song. On the other hand, Churu being a very active person, doesn't need any rest.

You as one of the organizers should make an optimal sсhedule for the event. For some reasons you must follow the conditions:

The duration of the event must be no more than d minutes;
Devu must complete all his songs;
With satisfying the two previous conditions the number of jokes cracked by Churu should be as many as possible.
If it is not possible to find a way to conduct all the songs of the Devu, output -1. Otherwise find out maximum number of jokes that Churu can crack in the grand event.

Input
The first line contains two space separated integers n, d (1 ≤ n ≤ 100; 1 ≤ d ≤ 10000). The second line contains n space-separated integers: t1, t2, ..., tn (1 ≤ ti ≤ 100).

Output
If there is no way to conduct all the songs of Devu, output -1. Otherwise output the maximum number of jokes that Churu can crack in the grand event.
----------------------------------------------------------------------------------------------------
문제제목:A. Devu, the Singer and Churu, the Joker
생성자:길경완
생성일자:2017_08_03
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
 
테스트 당 시간 제한 2 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력

Devu는 유명한 고전 가수입니다. 그는 많은 큰 행사 / 축제에 초청됩니다. 최근에 그는 "All World Classical Singing Festival"에 초대되었습니다. 
Devu 외에도, 코미디언 Churu도 초대되었습니다.

Devu는 주최자에게 노래 목록과 노래를 부르는 데 필요한 시간을 제공했습니다. 그는 n 곡을 부를 것이고, i 곡은 정확하게 ti 분이 걸릴 것입니다.

코미디언, Churu는 농담을 해칠 것입니다. 그의 모든 농담은 정확히 5 분입니다.

사람들은 주로 Devu의 말을 들어 왔습니다. 그러나 당신은 그가 각 노래 후에 10 분의 휴식을 필요로한다는 것을 알고 있습니다. 
반면에, 아주 능동적 인 Churu는 휴식을 필요로하지 않습니다.

주최자 중 한 명이 최적의 일정을 잡아야합니다. 몇 가지 이유로 다음 조건을 따라야합니다.

행사 기간은 d 분 이내 여야합니다.
Devu는 모든 노래를 완성해야합니다.
이전의 두 가지 조건을 만족 시키면 Churu에 의해 크랙 된 농담의 수는 가능한 한 많아야합니다.
Devu의 모든 곡을 연주하는 방법을 찾을 수 없다면 -1을 출력하십시오. 그렇지 않으면 Churu가 그랜드 이벤트에서 깰 수있는 농담의 최대 수를 알아라.

	입력
	첫 번째 줄에는 두 개의 공간으로 분리 된 정수 n, d (1 ≤ n ≤ 100; 1 ≤ d ≤ 10000)가 포함됩니다. 두 번째 줄에는 공백으로 구분 된 n 개의 정수 t1, t2, ..., tn (1 ≤ ti ≤ 100)이 포함됩니다.

	산출
	Devu의 모든 곡을 연주 할 방법이 없다면 -1을 출력하십시오. 그렇지 않으면 Churu가 그랜드 이벤트에서 깰 수있는 최대 농담 수를 출력합니다.
	example
	input
	3 30
	2 2 1
	output
	5
	input
	3 20
	2 1 1
	output
	-1
문제해설:
n은 부르는 노래의 갯수 d는 시간 제한.
예제의 
3 30
2  2 1이면
2분부르고 10(2+5+5)12
2분부르고 10(2+5+5)24
1부르고(5)4분은 버린다.30
3 20
2분부르고 10 (2+5+5)12
2분부르고 10 (2+5+5)12->시간초과. -1출력함.
각 모든시간의 범위는 낮음.
check를 통해서 현재 시간이 Churu때문에 시간초과인지 아니면 정말 노래 부를시간이 없어서 시간초과인지를 생각해야함.
 * 
 * 
 */
public class Devu_the_Singer_and_Churu_the_Joker {
	
	public static void main(String[] args) {
		 MyScanner sc = new MyScanner();
	     out = new PrintWriter(new BufferedOutputStream(System.out));
	    int n = sc.nextInt();
	    int d = sc.nextInt();
	    int input[] = new int[n];
	    int churuCount=0;
	    int time=0;
	    boolean check=false;
	   for(int i=0;i<n;i++)
	   {
		    input[i] = sc.nextInt();		   
	   }
	   int index=0;
	   while(time<=d)
	   {
		   if(index<n){
		   time+=input[index];
		   index++;
		   if(time>d)
			   if(check==false){
				   check=true;
				   out.println("-1");
			   }
		   }
		   churuCount++;
		   time+=5;
		   churuCount++;
		   time+=5;
	   }
	   
	   while(time>d)
	   {
		   churuCount--;
		   time-=5;
	   }
		   
	  
	   if(index!=n&&check==false){
		   out.println("-1");
	   }else if(check==false){
		   out.println(churuCount);
	   }
	
	    
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
