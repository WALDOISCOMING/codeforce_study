import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
2017_03_27 ����
����:A. Football
�ð�����"time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not.

Input
The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does not exceed 100 characters. There's at least one player from each team present on the field.

Output
Print "YES" if the situation is dangerous. Otherwise, print "NO". 

 */

public class Football {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * �ѹ� �Է��ϰ� �ѹ� ����ϸ�, �Ϸķ� 7���� �Ǿ������� �����̴�.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         String firstInput = sc.nextLine();
         int len = firstInput.length();
         int count = 0;
         for(int i=1;i<len;i++){
        	 if(count>=6)
        		 break;
        	 
        	 if(firstInput.charAt(i-1)==firstInput.charAt(i))
        		 count++;
        	 else
        		 count = 0;
         
         }
         if(count>=6){
        	 System.out.println("YES");
         }else{
        	 System.out.println("NO");
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
