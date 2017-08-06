import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
제목:A. Helpful Maths
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력:
inputstandard input
outputstandard output
Xenia the beginner mathematician is a third year student at elementary school. She is now learning 
the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

Input
The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

Output
Print the new sum that Xenia can count.

 */
public class HelpfulMaths {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 한번 입력하고 출력한다. 이 연산은 숫자와 +로만 이루어지고 공백이 없으며 앞이 작은수 뒤에 큰수를 가져야한다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         String firstInput = sc.nextLine();
         String numbers[] = firstInput.split("\\+");
         int plusLen  =firstInput.length() - numbers.length;
         int numberLen = numbers.length;       
         int one=0;
         int two=0;
         int three=0;
         int i=0;
         
         
         for(;i<numberLen;i++){
        	 if(numbers[i].equals("1")){
        		 one++;
        		
        	 }
        	 if(numbers[i].equals("2")){
        		 two++;
        		
        	 }
        	 if(numbers[i].equals("3")){
        		 three++;
        		
        	 }
        	 
         }
         i=0;
 
         for(;i<one;i++){
        	 System.out.print(1);
        	 if(plusLen!=0){
        		 plusLen--;
        		 System.out.print("+");
        	 }
         }
         i=0;
         for(;i<two;i++){
        	 System.out.print(2);
        	 if(plusLen!=0){
        		 plusLen--;
        		 System.out.print("+");
        	 }
         }
         i=0;
         for(;i<three;i++){
        	 System.out.print(3);
        	 if(plusLen!=0){
        		 plusLen--;
        		 System.out.print("+");
        	 }
         }
         //System.out.println(result);

         
      
        
      
        
         
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
