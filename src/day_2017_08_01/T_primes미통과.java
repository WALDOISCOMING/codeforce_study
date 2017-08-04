package day_2017_08_01;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;



/*
B. T-primes
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
We know that prime numbers are positive integers that have exactly two distinct positive divisors. Similarly, we'll call a positive integer t Т-prime, if t has exactly three distinct positive divisors.

You are given an array of n positive integers. For each of them determine whether it is Т-prime or not.

Input
The first line contains a single positive integer, n (1 ≤ n ≤ 105), showing how many numbers are in the array. The next line contains n space-separated integers xi (1 ≤ xi ≤ 1012).

Please, do not use the %lld specifier to read or write 64-bit integers in С++. It is advised to use the cin, cout streams or the %I64d specifier.

Output
Print n lines: the i-th line should contain "YES" (without the quotes), if number xi is Т-prime, and "NO" (without the quotes), if it isn't.

----------------------------------------------------------------------------------------------------
문제제목:B. T-primes
생성자:길경완
생성일자:2017_08_01
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
 
테스트 당 시간 제한 2 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력
소수는 정확히 두 개의 뚜렷한 양수 약수를 갖는 양의 정수라는 것을 알고 있습니다. 마찬가지로 t가 정확히 3 개의 뚜렷한 양수 약수를 가지면 
양수를 t-prime이라고합니다.

n 개의 양의 정수 배열이 주어집니다. 각각의 사람들이 Т-prime인지 여부를 결정하십시오.

입력
첫 번째 줄에는 하나의 양의 정수 n (1 ≤ n ≤ 105)이 포함되어 배열에 몇 개의 숫자가 있는지 보여줍니다. 
다음 행에는 n 개의 공백으로 분리 된 정수 xi (1 ≤ xi ≤ 1012)가 포함됩니다.

iel에서 64 비트 정수를 읽거나 쓸 때 % lld 지정자를 사용하지 마십시오. cin, cout 스트림 또는 % I64d 지정자를 사용하는 것이 좋습니다.

산출
n 줄 인쇄 : i 번째 줄에는 "YES"(따옴표없이), xi가 Т-prime 일 경우 "NO"(따옴표 제외)가 포함되어 있어야합니다.
첫번째 입력. 입력 갯수
이후는 갯수만큼. 이때 이것의 약수가 3개면 YES 아니면 NO
문제해설:
처음은 n, 그 다음은 n크기만큼의 배열들인데 무척이나 큰 10의 12승이므로 long사용하자.
입력된 숫자의 약수가 3개면 YES 아니면 NO. 
 * 
 * 
 */
public class T_primes미통과 {
	final static int limit = 100000;
	public static void main(String[] args) {
		
	
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
       int number = sc.nextInt();
       long input[] = new long[number];
       for(int i=0;i<number;i++)
       {
    	   input[i]=sc.nextLong();
       }
       
       
       boolean primes[]=new boolean[limit+1];
       primes[0] =false;primes[1]=false;
       for(long k=2;k<=limit;k++)
       {
    	   primes[(int) k] = true;
       }
       for(long k=2;k<=Math.sqrt(limit);k++)
       {
    	   if(primes[(int) k]==true)
    	   {
    		   for(long m=2;m<=limit/k;m++)
    		   {
    			   primes[(int) (m*k)]=false;
    		   }
    	   }
       }
       long root=0;
       for(long k = 0; k < number; k++){
           root = (long) Math.sqrt(input[(int) k]);
           
           if(primes[(int) root] && root * root == input[(int) k]){out.println("YES");}
           else{out.println("NO");}
       }
       
      
      
     out.close();
        
	}
	
	

	public static long a(long input,long div)
	{
		
		
	
		return 1;
	}
	public static boolean tPrime(long input,int length)
	{
		
		
		int count=2;
		for(int i=2;i<=(input/2);i++)
		{
			if(count>3)
				return false;
			
			if((input/i)*i==input)
				count++;
			
		}
		if(count==3)
			return true;
		else
			return false;
			
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
