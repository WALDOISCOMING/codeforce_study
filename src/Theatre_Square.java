import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class Theatre_Square{
    
    
    public static void main(String[] args){
    	 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
    	String s = sc.nextLine();
    	String[] ab = s.split(" ");
        long n = Long.parseLong(ab[0]);
        long m = Long.parseLong(ab[1]);
        long a = Long.parseLong(ab[2]);  
        
        System.out.println((n%a==0?n/a:n/a+1)*( m%a==0?m/a:m/a+1));
    }
    public static PrintWriter out;
    
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
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