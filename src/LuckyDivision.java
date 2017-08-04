import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
A. Lucky Division
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.

Input
The single line contains an integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.

Output
In the only line print "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).

*/
public class LuckyDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //첫번째 입력은 동전의 갯수. 두번째는 동전의 값들이다. 쌍둥이가 있다면 내가 무조건 많지만 최소한으로 많도록 하자.

         
         
         String input = sc.nextLine();
         int first= Integer.parseInt(input);
         
         int div[] = new int[]{4,7,47,74,444,447,474,477,744,747,774,777};
        boolean luck = false;
        

        for(int i=0;i<input.length();i++){
        	if(input.charAt(i)=='4'||input.charAt(i)=='7'){
        		luck = true;
        	}else{
        		luck = false;
        		break;
        	}
        	
        }
        
        for(int i=0;i<div.length;i++){
        	if((first>div[i])&&(first%div[i]==0)){
        	luck = true;
        	break;
        }
        }
      
        
        if(luck==true){
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
