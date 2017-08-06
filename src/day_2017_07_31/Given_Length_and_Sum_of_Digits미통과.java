package day_2017_07_31;

import java.io.BufferedOutputStream;
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
생성일자:2017_07_31
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
이 경우 m이 100이므로 10의 100승까지 가능한 것이다. 이 경우에서는 BigInteger로 게산한다고했지만 제대로 되지 않았다.

 * 
 * 
 */
public class Given_Length_and_Sum_of_Digits미통과 {
	public static void main(String[] args) {

		
		 MScanner sc = new MScanner();
	      out = new PrintWriter(new BufferedOutputStream(System.out));
	      int m =sc.nextInt();//길이.
	      int s = sc.nextInt();//자리숫자
	      sumDigit(m,s);
	      out.println(arr[0]+" "+arr[1]);
	      out.close();
//	   
	}
	  public static PrintWriter out;
	  static BigInteger []arr = {BigInteger.valueOf(-1),BigInteger.valueOf(-1)};
	
	
		
	
	  
	  public static BigInteger digitAdd(BigInteger i)
	  {
		  
		 if(i.compareTo(BigInteger.TEN)==-1)
		 {
			 return i;
		 }
		  else
		  {
			  return digitAdd(i.divide(BigInteger.TEN)).add((i.mod(BigInteger.TEN)));
		  }
	  }
	  
	 public static BigInteger overlay(int m)
	 {
		 BigInteger big = new BigInteger("1");
		 
		 while(m!=0)
		 {
			 big = big.multiply(BigInteger.valueOf(10));
			 m--;
		 }
		 return big;
	 }
	  
	  public static void sumDigit(int m,int s)
	  {
		  int count=0;
		  BigInteger compare = new BigInteger("0"); 
		 //모두 돌리는 방법이 있긴하다.  
		  BigInteger i = new BigInteger("0");
		  BigInteger limit =  new BigInteger("0");
		  i=i.add(overlay(m-1));
		  limit =limit.add(overlay(m));
		 compare = compare.add(BigInteger.valueOf(s));
	
		 
		 while(i.compareTo(limit)==-1)
		 {
			  if(count==0&&digitAdd(i).compareTo(compare)==0)
			  {
				  arr[count]=i;
				  count++;
			  }
			  if(count==1&&digitAdd(i).compareTo(compare)==0)
			  {
				  arr[1] = i;
			  }
			  i=i.add(BigInteger.ONE);
			 
		 }
		  
	
		  
			  
		  
	  }
	
	
			   public static class MScanner
		   {
			   BufferedReader br;
			      StringTokenizer st;
			
			      public MScanner() {
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
			 /*
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
			      */	 
		   }

		 
		
	
		
}
