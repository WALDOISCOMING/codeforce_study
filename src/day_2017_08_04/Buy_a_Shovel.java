package day_2017_08_04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/*
A. Buy a Shovel
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Polycarp urgently needs a shovel! He comes to the shop and chooses an appropriate one. The shovel that Policarp chooses is sold for k burles. Assume that there is an unlimited number of such shovels in the shop.

In his pocket Polycarp has an unlimited number of "10-burle coins" and exactly one coin of r burles (1 ≤ r ≤ 9).

What is the minimum number of shovels Polycarp has to buy so that he can pay for the purchase without any change? It is obvious that he can pay for 10 shovels without any change (by paying the requied amount of 10-burle coins and not using the coin of r burles). But perhaps he can buy fewer shovels and pay without any change. Note that Polycarp should buy at least one shovel.

Input
The single line of input contains two integers k and r (1 ≤ k ≤ 1000, 1 ≤ r ≤ 9) — the price of one shovel and the denomination of the coin in Polycarp's pocket that is different from "10-burle coins".

Remember that he has an unlimited number of coins in the denomination of 10, that is, Polycarp has enough money to buy any number of shovels.

Output
Print the required minimum number of shovels Polycarp has to buy so that he can pay for them without any change.
----------------------------------------------------------------------------------------------------
문제제목:A. Buy a Shovel
생성자:길경완
생성일자:2017_08_04
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
 

테스트 당 시간 제한 1 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력
폴리 카르 프는 긴급히 삽을 필요로합니다! 그는 상점에 와서 적절한 것을 고른다. Policarp가 선택한 삽은 k 개의 burles로 판매됩니다. 
가게에 그러한 삽을 무제한으로 설치한다고 가정합니다.

그의 주머니에있는 폴리 카프에는 무제한의 "10 개의 주름 형 동전"과 정확히 1 개의 동전 (1 ≤ r ≤ 9)이 있습니다.

Polycarp가 구매해야하는 삽의 최소 개수는 얼마이며 변경하지 않고도 구매 비용을 지불 할 수 있습니까? 10 개의 버블 코치를 지불하고 r 버블의 코인을 사용하지 않고 10 개의 버블 액을 지불 할 수 있습니다. 
그러나 아마도 그는 삽을 거의 사지 않고 아무런 변화없이 돈을 지불 할 수 있습니다. 폴리 카르 프는 최소한 하나의 삽을 사야합니다.

입력
한 줄의 입력에는 두 개의 정수 k와 r (1 ≤ k ≤ 1000, 1 ≤ r ≤ 9)이 포함되어 있습니다. 
하나의 삽 가격과 Polycarp의 주머니에 담겨있는 동전의 명칭은 "10-burle coins"과 다릅니다.

그는 10의 종파에서 무제한의 동전을 가지고 있다는 것을 기억하십시오, 즉, 폴리 카프는 많은 수의 삽을 사기에 충분한 돈이 있습니다.

산출
폴리 카프가 필요로하는 삽의 필요한 최소한의 수를 인쇄하여 변경없이 비용을 지불 할 수 있도록하십시오.

Examples
input
117 3
output
9
input
237 7
output
1
input
15 2
output
2


첫 번째 예에서 폴리 카르는 9 개의 삽을 살 수 있고 9*117 = 1053의 버블을 지불 할 수 있습니다. 실제로, 그는 10-burle 동전과 3-burle 동전을 사용하여이 금액을 지불 할 수 있습니다. 그는 변화없이 삽을 몇 개 더 살 수 없다.

두 번째 예에서는 Polycarp가 하나의 삽을 사면 충분합니다.

세 번째 예에서 Polycarp는 두 개의 삽을 사서 2 · 15 = 30의 버블을 지불해야합니다. 아무런 변화없이이 금액을 지불 할 수 있다는 것이 분명합니다.


문제해설:
별로인문제. 전체 돈갯수를 계속 증가해서 1의자리 돈ㅇ과 1의 자릿수가 같거나, 0이되면 종료인데.. 사실 별로.
 * 
 * 
 */
public class Buy_a_Shovel {
	
	public static void main(String[] args) {
		 MyScanner sc = new MyScanner();
	     out = new PrintWriter(new BufferedOutputStream(System.out));
	     
	     int k = sc.nextInt();
	     int r = sc.nextInt();
	     int count=0;
	     boolean b=true;
//	     int now=remain;
	     
	     while(b)
	     {
	    	 count++;
	    	 if(((k*count)%10)==r||((k*count)%10)==0){
	    		 b=false;
	    	 }

	    	 
	    	 
	    	 
	     }
	     out.println(count);
	     
	     
	    
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
