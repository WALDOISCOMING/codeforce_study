import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
2017_03_31 길경완
제목:A. Stones on the Table
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.

Input
The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.

Output
Print a single integer — the answer to the problem. 

 */

public class StonesontheTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 두번의 입력. 첫줄은 index 수 두번째는 문자열 
		 * 앞뒤가 다르면. count되지 않고 앞뒤가 같으면 count된다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         int first = sc.nextInt();
         String second = sc.nextLine();
         int count=0;
//         int len = first
         
         for(int i=0;i<first-1;i++){
        	 if(second.charAt(i)==second.charAt(i+1)){
        		 count++;
        	 }
        	 
        	 
         }
         
       
       System.out.println(count);
        
         
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
