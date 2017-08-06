package day_2017_07_31;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * 
 * A. Fancy Fence
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output


Emuskald needs a fence around his farm, but he is too lazy to build it himself. So he purchased a fence-building robot.

He wants the fence to be a regular polygon. The robot builds the fence along a single path, but it can only make fence corners at a single angle a.

Will the robot be able to build the fence Emuskald wants? In other words, is there a regular polygon which angles are equal to a?

Input
The first line of input contains an integer t (0 < t < 180) — the number of tests. Each of the following t lines contains a single integer a (0 < a < 180) — the angle the robot can make corners at measured in degrees.

Output
For each test, output on a single line "YES" (without quotes), if the robot can build a fence Emuskald wants, and "NO" (without quotes), if it is impossible.

----------------------------------------------------------------------------------------------------
문제제목:A.Fancy Fence
생성자:길경완
생성일자:2017_07_31
시간제한:2초
메모리제한:2565mb
표준입출력.
문제내용:
Emuskald는 농장에서 울타리가 필요하지만 그는 너무 게으르다. 그래서 그는 담장을 만드는 로봇을 구입했습니다.
그는 울타리가 규칙적인 다각형이되기를 원합니다. 로봇은 단일 경로를 따라 울타리를 만듭니다. 단 하나의 각도에서만 울타리 모서리를 만들 수 있습니다.
Emuskald가 원하는 울타리를 로봇이 만들 수 있습니까? 다른 말로하면, 각도가 a와 같은 규칙적인 다각형이 있습니까?
	입력
	첫 번째 입력 줄에는 정수 t (0 <t <180) - 테스트 수가 포함됩니다. 다음의 각 t 줄에는 하나의 정수 a (0 <a <180)가 있습니다. 
	로봇이 각도를 측정 할 수있는 각도입니다.
	산출
	각 테스트에 대해 "YES"(따옴표 제외), Emuskald가 원하는 울타리를 만들 수있는 경우 한 줄에 출력하고 불가능하면 "NO"(따옴표 제외)를 출력합니다.

문제해설:
처음의 입력은 이후의 입력의 갯수를 정하는 number. 이 number갯수만큼 추가로 int 배열을 입력받는다. 이 추가 입력은 1~179이여서 int로 하면된다.
이때 이 int 배열의 값이 정다각형의 각도인 경우, 3각형이면 60, 4각형이면 90인것과 같이 정다각형의 값을 만족하는 경우 YES,아니면 NO를 출력한다.
3각형은 3각형 1개,4각형은 3각형 2개의 방정식을 응용하여, 각이 늘대마다 count를 늘려주어서, 나누어진 몫과 입력값을 비교하면 된다. 이때 나우어진 몫은
int와 같은 정수의 몫이 아닌 실 값과 가까와야하므로 double로 해준다.
 * 
 * 
 */
public class Fancy_Fence {
	public static void main(String[] args) {
	
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
         int number = sc.nextInt();
         int input[] = new int[number];
         boolean result[] = new boolean[number];
         for(int i=0;i<number;i++)
         {
        	 input[i] = sc.nextInt();
        	 int degree=180;
       	  int index_count=3; 
		
       	  
       	 do
       	  {
       		 	//double같은걸로 해줘야 제대로 나눈다. 소숫점이 다르면 다른것이다.
       		 double div_degree = (degree/(double)index_count);
       		  if(div_degree==input[i])
       		  {
       			  result[i] = true;
       			  break;
       		  }
       		  else
       		  {
       			  degree=degree+180;
       			  index_count++;
       		  }
       	  }while((degree/index_count)<=input[i]);
       	  
         }

    
    	   
       
      for(int i=0;i<number;i++)
      {
    	  if(result[i]==true)
    	  {
    		  out.println("YES");
    	  }
    	  else
    	  {
    		  out.println("NO");
    	  }
      }
        
      out.close();
         
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
