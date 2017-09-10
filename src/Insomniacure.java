import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/*
2017_04_06 길경완
제목:A. Insomnia cure
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
«One dragon. Two dragon. Three dragon», — the princess was counting. She had trouble falling asleep, and she got bored of counting lambs when she was nine.

However, just counting dragons was boring as well, so she entertained herself at best she could. Tonight she imagined that all dragons were here to steal her, and she was fighting them off. Every k-th dragon got punched in the face with a frying pan. Every l-th dragon got his tail shut into the balcony door. Every m-th dragon got his paws trampled with sharp heels. Finally, she threatened every n-th dragon to call her mom, and he withdrew in panic.

How many imaginary dragons suffered moral or physical damage tonight, if the princess counted a total of d dragons?

Input
Input data contains integer numbers k, l, m, n and d, each number in a separate line (1 ≤ k, l, m, n ≤ 10, 1 ≤ d ≤ 105).

Output
Output the number of damaged dragons.

 
 */
public class Insomniacure {
	public static void main(String[] args) {
	
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //총 5줄의 입력, 4줄동안은 배수이고, 마지막 줄은 모든 용 숫자로 이걸 나눈다.
         
         
         int div_1 = sc.nextInt();
         int div_2 = sc.nextInt();
         int div_3 = sc.nextInt();
         int div_4 = sc.nextInt();
                  
         int dragons = sc.nextInt();
         boolean check[] = new boolean[dragons];
         
         
         int count=0;
         //2 8
         //4
         //0 1 2 3
         //
         //1<3
         //2<3
         //3<3
         for(int i=0;((i+1)*div_1)<=dragons;i++){
        	 if(check[(i+1)*div_1-1]==false){
        		 check[(i+1)*div_1-1]=true;
        		 count++;
        	 }
         }
         for(int i=0;((i+1)*div_2)<=dragons;i++){
        	 if(check[(i+1)*div_2-1]==false){
        		 check[(i+1)*div_2-1]=true;
        		 count++;
        	 }
         }  
         for(int i=0;((i+1)*div_3)<=dragons;i++){
        	 if(check[(i+1)*div_3-1]==false){
        		 check[(i+1)*div_3-1]=true;
        		 count++;
        	 }
         }  
         for(int i=0;((i+1)*div_4)<=dragons;i++){
        	 if(check[(i+1)*div_4-1]==false){
        		 check[(i+1)*div_4-1]=true;
        		 count++;
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
