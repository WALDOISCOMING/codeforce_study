package codeforeces_Round_408_Div2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BuyingAHouse {
	public static void main(String[] args) {

		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        
        String firstInput = sc.nextLine();
        String first[] = firstInput.split(" ");
        int index = Integer.parseInt(first[0]);
        int myhome = Integer.parseInt(first[1]);
        myhome--;
        int money = Integer.parseInt(first[2]);
       
        
        String secondInput = sc.nextLine();
        String second[] = secondInput.split(" ");
        int numbers[] = new int[index];

        for(int i=0;i<index;i++){
        numbers[i] = Integer.parseInt(second[i]);
        }
        boolean check =false;
        
        int front=myhome;
        int back=myhome;
        int mt=0;
        while(check==false){
        	++front;
        	--back;

        	if(back>-1){
        		if(numbers[back]<=money&&numbers[back]!=0){
        			mt = back;
        			check=true;
        		}       			
        	}
        	if(front<=index-1){
        		if(numbers[front]<=money&&numbers[front]!=0){
        			mt = front;
        			check=true;
        		}       			
        	}       	      	
        }

        System.out.println(Math.abs(Math.abs(mt)-Math.abs(myhome))*10);
       
        
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
