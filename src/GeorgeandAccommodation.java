import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
2017_04_04 길경완
제목:A. George and Accommodation
시간제한:time limit per test1 second
메모리제한:memory limit per test256 megabytes
표ㅕ준입출력
inputstandard input
outputstandard output
George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.

George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex.

Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the number of rooms.

The i-th of the next n lines contains two integers pi and qi (0 ≤ pi ≤ qi ≤ 100) — the number of people who already live in the i-th room and the room's capacity.

Output
Print a single integer — the number of rooms where George and Alex can move in.


 */
public class GeorgeandAccommodation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //첫번째는 후에 입력될 줄수
     //그 이후에는 앞은 현 들어와있는 인원, 뒤에는 전체 인원.
     //전체-현인원>=2이면 가능한 방이다.


      int index = sc.nextInt();
      int count=0;
      for(int i=0;i<index;i++){
    	  String input = sc.nextLine();
    	  String str[] = input.split(" ");
    	  int now = Integer.parseInt(str[0]);
    	  int all = Integer.parseInt(str[1]);
    	  if((all-now)>=2){
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
