package codeforces_Round_407_Div2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * A. Anastasia and pebbles
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Anastasia loves going for a walk in Central Uzhlyandian Park. But she became uninterested in simple walking, so she began to collect Uzhlyandian pebbles. At first, she decided to collect all the pebbles she could find in the park.

She has only two pockets. She can put at most k pebbles in each pocket at the same time. There are n different pebble types in the park, and there are wi pebbles of the i-th type. Anastasia is very responsible, so she never mixes pebbles of different types in same pocket. However, she can put different kinds of pebbles in different pockets at the same time. Unfortunately, she can't spend all her time collecting pebbles, so she can collect pebbles from the park only once a day.

Help her to find the minimum number of days needed to collect all the pebbles of Uzhlyandian Central Park, taking into consideration that Anastasia can't place pebbles of different types in same pocket.

Input
The first line contains two integers n and k (1 ≤ n ≤ 105, 1 ≤ k ≤ 109) — the number of different pebble types and number of pebbles Anastasia can place in one pocket.

The second line contains n integers w1, w2, ..., wn (1 ≤ wi ≤ 104) — number of pebbles of each type.

Output
The only line of output contains one integer — the minimum number of days Anastasia needs to collect all the pebbles.
 * 
 */
public class Anastasiaandpebbles {
	public static void main(String[] args) {

		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         String firstInput = sc.nextLine();
         String first[] = firstInput.split(" ");
         int a = Integer.parseInt(first[0]);
         int b = Integer.parseInt(first[1]);
         
         String secondInput = sc.nextLine();
         String second[] = secondInput.split(" ");
         int numbers[] = new int [a];
         int day = 0;
         for(int i=0;i<a;i++){
        	 numbers[i] = Integer.parseInt(second[i]);
         }
         for(int i=0;i<a;i++){
        	 if(numbers[i]>=(2*b)){
        		 numbers[i]-=(b*2);
        		 day++;
        		 continue;
        	 }
        	
         }
         
         for(int i=0;i<a;i++){
        	 for(int j=0;j<a;j++){
        		 if(numbers[i]<=b&&numbers[i]>0&&numbers[j]<(2*b)&&(numbers[j]>(b))&&(i!=j)){
        			 numbers[i] = 0;
    				 numbers[j] -=b;
    				 day++;        			 
        		 }
        		 if(numbers[i]<=b&&numbers[i]>0&&numbers[j]<=(b)&&(numbers[j]>(0))&&(i!=j)){
        			 numbers[i] = 0;
    				 numbers[j] =0;
    				 day++;
        			 
        		 }
        	 }
        	           		        		 
        	 
        	
        	 
         }
         
     
         
         for(int i=0;i<a;i++){       	 
        	 if(numbers[i]!=0){
        		 day++;
        	 }
         }  
         System.out.println(day);
      
        
         
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
