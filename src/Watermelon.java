import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Watermelon {
/*
2017_03_24 길경완
문제 제목: A. Watermelon
시간제한:time limit per test1 second
메모리제한:memory limit per test64 megabytes
inputstandard input
outputstandard output
문제:
One hot summer day Pete and his friend Billy decided to buy a watermelon. 
They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, 
and the scales showed w kilos. They rushed home, dying of thirst, and decided to divide the berry, 
however they faced a hard problem.
Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a 
way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that 
the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, 
that's why you should help them and find out, if they can divide the watermelon in the way they want.
For sure, each of them should get a part of positive weight.

Input
The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) 
— the weight of the watermelon bought by the boys.
입력은 1~100사이어야 한다.
Output
Print YES, if the boys can divide the watermelon into two parts, 
each of them weighing even number of kilos; and NO in the opposite case.
만약 w 가 짝수인 경우가 되는걸로 2가지의 경우가 된다면 yes를 뽑는다. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         
    	int a = sc.nextInt();
    	
    	if(a==2)
    		System.out.println("NO");
    	else
    	System.out.println((a%2==0?"YES":"NO"));
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
