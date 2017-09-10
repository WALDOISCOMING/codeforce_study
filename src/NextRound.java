import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
2017_03_25 길경완

제목:A. Next Round
시간제한:time limit per test3 seconds
메모리제한:memory limit per test256 megabytes
일반입출력:
inputstandard input
outputstandard output
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to 
the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate 
how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.
 */
public class NextRound {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//두번의 String 입력! 
		/*
		 * 두번 입력받는다.
		 * 첫 입력은 배열크기과, 비교 index-1
		 * 두번째는 점수로 비교 대상. 여기서 비교 index-1보다 큰것을 count하는데 대신
		 * 점수는 0 초과시에만 count된다.
		 */
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         String firstInput = sc.nextLine();
         String settings[] = firstInput.split(" ");
         int all = Integer.parseInt(settings[0]);//전체 숫자
         int index = Integer.parseInt(settings[1]);//목표.
         
         String secondeInput = sc.nextLine();
         String str[] = secondeInput.split(" ");
         int score[] = new int[all];
         for(int i=0;i<all;i++ ){
        	score[i] = Integer.parseInt(str[i]);
         }
         int target = score[index-1];
         all=0;
         for(int i:score){
        	 if(i>=target&&i>0)
        		 all++;
         }
    	System.out.println(all);
         
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
