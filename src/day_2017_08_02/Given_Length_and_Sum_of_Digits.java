package day_2017_08_02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
/*
 * 
 * 
 * 
C. Given Length and Sum of Digits...
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You have a positive integer m and a non-negative integer s. Your task is to find 
the smallest and the largest of the numbers that have length m and sum of digits s. 
The required numbers should be non-negative integers written in the decimal base without 
leading zeroes.

Input
The single line of the input contains a pair of integers m, s (1 ≤ m ≤ 100, 0 ≤ s ≤ 900) 
— the length and the sum of the digits of the required numbers.

Output
In the output print the pair of the required non-negative integer numbers — first 
the minimum possible number, then — the maximum possible number. If no numbers satisfying 
conditions required exist, print the pair of numbers "-1 -1" (without the quotes).


----------------------------------------------------------------------------------------------------
문제제목:C. Given Length and Sum of Digits
생성자:길경완
생성일자:2017_08_02
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:

입력 표준 입력
출력 표준 출력
양의 정수 m과 양수가 아닌 정수 s를가집니다. 너의 임무는
길이가 m이고 자리수의 합이 s 인 숫자 중 가장 작고 가장 큰 숫자.
필요한 수는 10 진수로 작성된 음수가 아닌 정수 여야합니다.
선도 0.

입력
	입력의 한 줄에는 한 쌍의 정수 m, s (1 ≤ m ≤ 100, 0 ≤ s ≤ 900)가 포함되어 있습니다.
	- 필요한 숫자의 길이와 합계.

산출
	출력 인쇄에서 필요한 음이 아닌 정수 값 쌍 (첫 번째
	가능한 최소 수, 그 다음에 가능한 최대 수. 숫자가 만족스럽지 않으면
	필요한 조건이 존재하면 숫자 쌍 "-1 -1"(따옴표 제외)을 인쇄하십시오.

-----------------------------------------
문제해설:
ex) 2 15
69 96
첫번째 입력인 m는 10의 자릿수를 정한다. 두번째 입력인 s는 각 자릿수들의 합을 정한다.
만약 s가 만족되지 않으면 -1 -1을 출력하고 제대로 만족하면 "최소만족수 최대만족수"의 순서로 출력한다.
무척 간단하게 생각했다. 길이가 1이고 sum이 0이면 둘다 00을. sum이 길이가1이 아니면서 0이거나 sum이 길이*9보다 큰 초과숫자일때는 -1 -1을 출력하게 했으며
메소드 setMax와 setMin으로 서로 다르게 출력하도록 했다. setMax은 앞자리부터 큰수로 체우며 setMin은 일단 가장 앞자리는 1로 설정하고 가장 뒷자리부터 체우는데,
이때 다 체웠는데도 sum이 남으면 남은숫자를 다 가장 앞자리로 몰아넣기로 한것.
 * 
 * 
 */
public class Given_Length_and_Sum_of_Digits {
	public static void main(String[] args) {
		 MyScanner sc = new MyScanner();
	     out = new PrintWriter(new BufferedOutputStream(System.out));
	     int length = sc.nextInt();
	     int sum = sc.nextInt();
	     
	     

	     String max="";
	     String min="";
	     
	     if(sum==0&&length==1){
	    	 max="0";min="0";
	     }else if(sum<1||sum>length*9){
	    	 max="-1"; min ="-1";
	     }else{

		     max=setMax(length, sum);
		   //  min= new StringBuffer(max).reverse().toString();
	    	 	  min = setMin(length, sum);  		    	 
	     }
	    
	   
	    
	     out.println(min+" "+max);
	   
    out.close();
       
	}
	
	 public static String reverseString(String s) {
		    return ( new StringBuffer(s) ).reverse().toString();
		  }
	public static int returnValue(int number)
	{
		for(int i=9;i>0;i--){
			if((number/i)!=0){
				return i;
			}
		}	
		return 0;
	}
	

	
	public static String setMin(int length,int sum)
	{
		int num[] = new int[length];
		String str= new String();
		num[0] = 1;
		sum--;
		for(int i=length-1;i>0;i--)
		{
			if(sum==0)break;
			
			num[i]=returnValue(sum);
			sum=sum-returnValue(sum);
		}
		if(sum!=0)
			num[0]+=sum;
		
		for(int i=0;i<length;i++)
		{
			str+=num[i];
		}
		
		return str;
	}
	public static String setMax(int length,int sum)
	{
		int num[] = new int[length];
		String str= new String();
		for(int i=0;i<length;i++)
		{
			if(sum==0)break;
			
			num[i]=returnValue(sum);
			sum=sum-returnValue(sum);
		}
		for(int i=0;i<length;i++)
		{
			str+=num[i];
		}
		
		return str;
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
