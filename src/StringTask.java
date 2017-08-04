import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class StringTask {
/*
2017_03_25 길경완
제목:A. String Task
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
표준입출력
inputstandard input
outputstandard output
Petya started to attend programming lessons. On the first lesson his task was to write a simple program. 
The program was supposed to do the following: in the given string, consisting if uppercase and lowercase 
Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input 
is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

Output
Print the resulting string. It is guaranteed that this string is not empty.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 한번 입력되고 출력된다. 이때 모음은 무조건 . 대문자는 무조건 소문자로 변환하나, 맨 앞에 온 대문자는 앞에 .을 붙여준다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
         String firstInput = sc.nextLine();
         //int count = firstInput.length();
         char chararray[] = firstInput.toCharArray();
         StringBuffer bf = new StringBuffer();
         bf.append('.');
         
         
         for(char ch:chararray){
        	if((ch==65||ch==69||ch==73||ch==79||ch==85||ch==89
        		||ch==97||ch==101||ch==105||ch==111||ch==117||ch==121)){
        		continue;
        	}
        	if(ch>=65&&ch<=90){
        		ch = (char) (ch+32);
        		bf.append(ch);
        		bf.append('.');
        		continue;
        	}
        	bf.append(ch);
        	bf.append('.');
         }
         bf.deleteCharAt(bf.length()-1);
       System.out.println(bf);
         
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
