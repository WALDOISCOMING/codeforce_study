package codeforeces_Round_408_Div2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class FindTheBone {
	public static void main(String[] args) {

		 MyScanner sc = new MyScanner();
       out = new PrintWriter(new BufferedOutputStream(System.out));
       
       String firstInput = sc.nextLine();
       String first[] = firstInput.split(" ");
       int cups = Integer.parseInt(first[0]);
       int hole_num = Integer.parseInt(first[1]);      
       int index = Integer.parseInt(first[2]);
      
       
       String secondInput = sc.nextLine();
       String second[] = secondInput.split(" ");
       int holes[] = new int[hole_num];
       for(int i=0;i<hole_num;i++){
    	   holes[i] = Integer.parseInt(second[i]);
       }
       
       boolean cups_tf[] = new boolean[cups];
       for(int i=0;i<hole_num;i++){
    	   cups_tf[holes[i]-1]=true;

       }
       
       //String str[] = new String[index];
       int magic[][] = new int[index][2];
       for(int i=0;i<index;i++){
    	  String str = sc.nextLine();
    	   String splitstr[] = str.split(" ");
    	  magic[i][0]=Integer.parseInt(splitstr[0]);
    	  magic[i][1] =Integer.parseInt(splitstr[1]);
      }
       int state=1;
       boolean check=false;
       
       int start=0;
       
       while(check==false){
    	   if(start==index)
    		   break;
    	   
    	   
    	   int next = magic[start][1];
    	   for(int j=0;j<hole_num;j++){
    		   if(cups_tf[next-1]==true){
    			   state=next;
    			   check=true;
    		   }
    	   }
    	   if(check==false){
    	   state=next;
    	   start++;
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
