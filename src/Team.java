import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
2017_03_26 길경완
제목:A. Team
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming 
contests. Participants are usually offered several problems during programming contests. Long before 
the start the friends decided that they will implement a problem if at least two of them are sure 
about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure 
about the solution. Help the friends find the number of problems for which they will write a solution.

Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest. 

 */

public class Team {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 첫번째 입력이 이후 입력 갯수를 조절한다.
		 * 뒤의 입력은 0과 1로 되며 이때 1의 갯수가 2개 이상이라면 그 문제는 구현 가능하다 되어 count 된다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         String firstInput = sc.nextLine();
         int all = Integer.parseInt(firstInput);
         int count=0;
         String userInputs[] =new String[all];
         
         for(int i=0;i<all;i++){
       // 	 userInputs[i] = sc.nextLine();   	 
        	 String[] str = sc.nextLine().split(" ");
        	 int[] a =new int[3]; 
        	 a[0] = Integer.parseInt(str[0]);
        	 a[1] = Integer.parseInt(str[1]);
        	 a[2] = Integer.parseInt(str[2]);
        	 int doit=0;
        	 for(int j=0;j<3;j++){
        		
        		 if(a[j]==1){
        			 doit++;
        		 }
        		 if(doit>=2){
         			count++;
         		 	break;
         		 } 
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
