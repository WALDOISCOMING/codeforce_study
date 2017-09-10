import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
2017_04_04 길경완
A. Boy or Girl
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at the first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought so). After that they talked very often and eventually they became a couple in the network.

But yesterday, he came to see "her" in the real world and found out "she" is actually a very strong man! Our hero is very sad and he is too tired to love again now. So he came up with a way to recognize users' genders by their user names.

This is his method: if the number of distinct characters in one's user name is odd, then he is a male, otherwise she is a female. You are given the string that denotes the user name, please help our hero to determine the gender of this user by his method.

Input
The first line contains a non-empty string, that contains only lowercase English letters — the user name. This string contains at most 100 letters.

Output
If it is a female by our hero's method, print "CHAT WITH HER!" (without the quotes), otherwise, print "IGNORE HIM!" (without the quotes).

 */

public class BoyorGirl {

	 public static int[] solution(int[][] v) {
	        int[] answer = {};
	        if(v[0][0]==v[1][0]){
	            if(v[0][1]==v[2][1]){
	                answer[0]=v[2][0];
	                answer[1]=v[1][1];
	            }else{
	                answer[0]=v[2][0];
	                answer[1]=v[0][1];
	            }
	        }
	        if(v[0][0]==v[2][0]){
	            if(v[1][1]==v[2][1]){
	                answer[0]=v[1][0];
	                answer[1]=v[0][1];
	            }else{
	                answer[0]=v[1][0];
	                answer[1]=v[2][1];
	            }
	        }
	        if(v[1][0]==v[2][0]){
	                 if(v[0][1]==v[2][1]){
	                answer[0]=v[0][0];
	                answer[1]=v[1][1];
	            }else{
	                answer[0]=v[0][0];
	                answer[1]=v[0][1];
	            }
	        }
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		int [] a1 ={1,2};
		int [] a2 = {1,3};
		int [] a3 ={2,3};
		int[][] a = {{1,2},{1,3},{2,3}};
	//System.out.println(solution(a));
		System.out.println(a.length);
		/*
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //입력 글자에서 고유 문자 갯수 홀수-남자,짝수-여자


      String name = sc.nextLine();
      
      String str = "";
      str+=name.charAt(0);
      
     for(int i=1;i<name.length();i++){
    	 boolean same = false;
    	 for(int j=0;j<str.length();j++){
    		 if(name.charAt(i)==str.charAt(j)){
    			 same=true;
    			 break;
    		 }    		 
    	 }
    	 
    	 if(same==false){
    		 str+=name.charAt(i);
    	 }
    	 
    	 
     }
//     System.out.println(str.length());
     
     if((str.length()%2)==0){
      System.out.println("CHAT WITH HER!");
     }else{

         System.out.println("IGNORE HIM!");
     }
*/
     
 
         
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
