import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
2017_03_26 길경완
제목:A. Domino piling
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard 
domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as 
many dominoes as possible on the board so as to meet the following conditions:
모디노는 2*1 정사각형들이다.

1. Each domino completely covers two squares.

2. No two dominoes overlap.

3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input
In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).

Output
Output one number — the maximal number of dominoes, which can be placed.

Examples
  
 
 */

public class Dominopoling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 한번 입력되고 출력된다. 2*1의 형태가 입력받는 한줄의 가로 세로를 덮는다. 단 초과하지는 않는다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         String firstInput = sc.nextLine();

         String str[] = firstInput.split(" ");
         int width = Integer.parseInt(str[0]);//가로
         int length = Integer.parseInt(str[1]) ;//세로
         int value = width*length;
         System.out.println(value/2);
         
        
         
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
