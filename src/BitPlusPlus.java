import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
2017_03_27 길경완
제목: A. Bit++
시간제한:time limit per test1 second
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.

The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:

Operation ++ increases the value of variable x by 1.
Operation -- decreases the value of variable x by 1.
A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.

A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the statements it contains.

You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).

Input
The first line contains a single integer n (1 ≤ n ≤ 150) — the number of statements in the programme.

Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one variable x (denoted as letter «X»). Thus, there are no empty statements. The operation and the variable can be written in any order.

Output
Print a single integer — the final value of x.

 */

public class BitPlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 처음의 입력이 후의 입력의 갯수를 정한다.
		 * x의 초기값은 0이다. 그리고 ++는 중가 --는 감소라 생각하여 계산된 마지막 x의 값을 출력한다. 그리고 '+' ,'-'연산만 가능하고 하나의 연산은 한번만 나타난다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         int count = sc.nextInt();
         int x = 0;
         
         for(int i=0;i<count;i++){
        	 String str = sc.nextLine();        	 
        	 char ch[] = new char[3];
        	 for(int j=0;j<3;j++){
        		 if(str.charAt(j)=='+'){
        			 x++;
        			 break;
        		 }
        		 if(str.charAt(j)=='-'){
        			 x--;
        			 break;
        		 }
        	 }
        	 
        	 
         }
         System.out.println(x);
         
        
         
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
