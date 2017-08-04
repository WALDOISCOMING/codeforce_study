import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
2017_03_24 길경완
문제제목: A. Way Too Long Words
시간제한:time limit per test2 seconds
메모리제한:memory limit per test256 megabytes
inputstandard input
outputstandard output
Sometimes some words like "localization" or "internationalization" are so long that writing 
them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. 
All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and 
between them we write the number of letters between the first and the last letters. That number 
is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that 
all too long words should be replaced by the abbreviation and the words that are not too 
long should not undergo any changes.

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data. 
 
 단어가 10단어 초과된다면 그 단어는 ...
 */
public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
    	int a = sc.nextInt();
    	String str[] = new String[a];
    	for(int i=0;i<a;i++){
    		str[i] = sc.nextLine();
    	}

    	for(String s:str){
    	int length = s.length();
    	if(length<=10)
    	System.out.println(s);
    	else{		
    		System.out.println(s.substring(0,1)+(s.length()-2)+s.substring(length-1,length));
    	}
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
