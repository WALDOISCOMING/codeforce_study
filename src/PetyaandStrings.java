import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
제목:A. Petya and Strings
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
Little Petya loves presents. His mum bought him two strings of the same size for his birthday.
 The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two 
 strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered
  equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. 
It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin 
letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first 
one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into 
consideration when the strings are compared.
 */

public class PetyaandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 두번의 입력. 대소문자 구별 없이 앞이 크면 1 같으면 0 작으면 -1로 한다.
		 * 이떄 ascii 이용.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
       
         String first = sc.nextLine();
         String second = sc.nextLine();
         int state = 0;
         
         for(int i=0;i<first.length();i++){
        	 int firstch = 0;
        	 int secondch = 0;
        	 
        	 if(first.charAt(i)<=90){
        		 firstch =  (first.charAt(i)+32);
        	 }else{
        		 firstch = first.charAt(i);
        	 }
        	 if(second.charAt(i)<=90){
        		 secondch =  (second.charAt(i)+32);
        	 }else{
        		 secondch = second.charAt(i);
        	 }
        	 
        	 if(firstch>secondch){
        		 state=1;
        		 break;
        	 }else if(firstch<secondch){
        		 state=-1;
        		 break;
        	 }else{
        		 state=0;
        	 }
         }

       System.out.println(state);
        
         
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
