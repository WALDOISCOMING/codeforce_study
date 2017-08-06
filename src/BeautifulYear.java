import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
2017_04_07 길경완
제목:A. Beautiful Year
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력:
inputstandard input
outputstandard output
It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.
 
 

 */

public class BeautifulYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //현 자릿수 다음으로 자릿수가 고유 한 걸 찾는다.
         
         
       int input = sc.nextInt();
       
       boolean check = false;
             input++;
      while(check==false){
    	  	boolean c_1000=false;
    	  	boolean c_100=false;
    	  	boolean c_10=false;
    	  
    	  
    	   int a_1000=input/1000;
    	   int a_100 = (input-a_1000*1000)/100;
    	   int a_10 =(input-a_1000*1000-a_100*100)/10;
    	   int a_1 =(input-a_1000*1000-a_100*100-a_10*10);

    	   if(a_1000!=a_100&&a_1000!=a_10&&a_1000!=a_1){
    		   c_1000=true;
    	   }
    	   if(a_100!=a_10&&a_100!=a_1){
    		   c_100=true;
    	   }
    	   if(a_10!=a_1){
    		   c_10=true;
    	   }
    	   if(c_1000==true&&c_100==true&&c_10==true){
    		   check=true;
    	   }else{
    	   input++;
    	   }
       }
       
       System.out.println(input);
     
       
       
    
       
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
