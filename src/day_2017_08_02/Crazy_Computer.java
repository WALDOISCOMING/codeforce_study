package day_2017_08_02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
A. Crazy Computer
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
ZS the Coder is coding on a crazy computer. If you don't type in a word for a c consecutive seconds, everything you typed disappear!

More formally, if you typed a word at second a and then the next word at second b, then if b - a ≤ c, just the new word is appended to other words on the screen. If b - a > c, then everything on the screen disappears and after that the word you have typed appears on the screen.

For example, if c = 5 and you typed words at seconds 1, 3, 8, 14, 19, 20 then at the second 8 there will be 3 words on the screen. After that, everything disappears at the second 13 because nothing was typed. At the seconds 14 and 19 another two words are typed, and finally, at the second 20, one more word is typed, and a total of 3 words remain on the screen.

You're given the times when ZS the Coder typed the words. Determine how many words remain on the screen after he finished typing everything.

Input
The first line contains two integers n and c (1 ≤ n ≤ 100 000, 1 ≤ c ≤ 109) — the number of words ZS the Coder typed and the crazy computer delay respectively.

The next line contains n integers t1, t2, ..., tn (1 ≤ t1 < t2 < ... < tn ≤ 109), where ti denotes the second when ZS the Coder typed the i-th word.

Output
Print a single positive integer, the number of words that remain on the screen after all n words was typed, in other words, at the second tn.

----------------------------------------------------------------------------------------------------
문제제목:A. Crazy Computer
생성자:길경완
생성일자:2017_08_02
시간제한:2초
메모리제한:256mb
표준입출력.
문제내용:
ex)
	input
	6 5
	1 3 8 14 19 20
	output
	3
	input
	6 1
	1 3 5 7 9 10
	output
	2
ZS 코더는 미친 컴퓨터에서 코딩하고 있습니다. c 초 동안 단어를 입력하지 않으면 입력 한 모든 내용이 사라집니다!

보다 공식적으로, 두 번째 a에 단어를 입력 한 다음 두 번째 b에 다음 단어를 입력하면 b - a ≤ c이면 새 단어가 화면의 다른 단어에 추가됩니다. b - a> c이면 화면의 모든 내용이 사라지고 
입력 한 단어가 화면에 나타납니다.

예를 들어 c = 5이고 1, 3, 8, 14, 19, 20 초에 단어를 입력하면 두 번째 8시에는 화면에 3 단어가 표시됩니다. 그 후 아무것도 입력되지 않았기 때문에 두 번째 13시에 
모든 것이 사라집니다. 초 14와 19에서 또 다른 두 단어가 입력되고 마지막으로 두 번째 20에서 한 단어가 더 입력되고 총 3 단어가 화면에 남아 있습니다.

ZS 코더가 단어를 타이핑 할 때가 주어진다. 그가 타이핑을 마친 후 화면에 남아있는 단어의 수를 결정하십시오.

입력
첫 번째 줄에는 두 개의 정수 n 및 c (1 ≤ n ≤ 100 000, 1 ≤ c ≤ 10의9승)가 포함되어 있습니다. 코더가 입력 한 단어 ZS의 개수와 미친 컴퓨터 지연이 각각 있습니다.

다음 줄에는 n 개의 정수 t1, t2, ..., tn (1 ≤ t1 <t2 <... <tn ≤ 10의9승)이 포함됩니다. 여기서 ti는 ZS가 i 번째 단어를 입력 한 ZS를 나타냅니다.

산출
하나의 양의 정수, 즉 n 개의 단어가 모두 입력 된 후 화면에 남아있는 단어의 수, 즉 두 번째 tn을 인쇄하십시오.

문제해설:
여기에서 c라는 시간제한 내에 입력이 추가로 되지 않으면 이전 글이 삭제되며 결과값은 마지막 화면에서의 단어 갯수를 보여준다.
첫번째입력은 이후 배열의 입력 의 갯수이다.
두번째 입력은 시간제한. c초동안 입력을 하지 않으면 삭제된다.
간단하게 if 앞-뒤>시간제한 count=0; else count++로 하면 되는데 이 경우 
입력이 1 시간최대값로 올수도 있으므로 이 경우를 대비하여 for문이 0이 아닌 1부터 세서 default에서는 count=1로 시작하는 방법으로 막으면 된다ㅣ.
 * 
 */
public class Crazy_Computer {
	public static void main(String[] args) {
		 MyScanner sc = new MyScanner();
	     out = new PrintWriter(new BufferedOutputStream(System.out));
	     int c = sc.nextInt();
	     long n =sc.nextLong();
	     long input[] = new long[c];
	     for(int i=0;i<c;i++)
	     {
	    	 input[i]=sc.nextLong();
	     }
	     int count=1;//n이 10의 5승이므로 그리 안커도됨.
	     for(int i=1;i<(c);i++)
	     {
	    	 if((input[i]-input[i-1])>n)
	    	 {
	    		 count=0;
	    	 }
	    	 count++;
	     }
	     out.println(count);
	   
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
