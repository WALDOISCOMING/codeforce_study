import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
2017_04_03 길경완
제목:A. Chat room
ㅅ간제한:time limit per test1 second
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.

Input
The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.

Output
If Vasya managed to say hello, print "YES", otherwise print "NO". 

 */

public class Chatroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //칫번째 입력에서 hello가 다 들어있다면 true가 된다.

         
         
         String input = sc.nextLine();
         //hello
         boolean check[]=new boolean[]{false,false,false,false,false};         
         char hello[] = new char[]{'h','e','l','l','o'};
        int index=0;
        
 
         for(int i=0;i<input.length();i++){
        	 
        	 
        	if(input.charAt(i)==hello[index]){       		
        		check[index]=true;
        		index++;
        		if(index>=5)
        			break;
        	}
        	 
        }
         
       if(check[0]==true&&check[1]==true&&check[2]==true&&check[3]==true&&check[4]==true){
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
