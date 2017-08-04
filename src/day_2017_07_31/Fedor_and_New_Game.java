package day_2017_07_31;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
B. Fedor and New Game
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
After you had helped George and Alex to move in the dorm, they went to help their friend Fedor play a new computer game «Call of Soldiers 3».

The game has (m + 1) players and n types of soldiers in total. Players «Call of Soldiers 3» are numbered form 1 to (m + 1). Types of soldiers are numbered from 0 to n - 1. Each player has an army. Army of the i-th player can be described by non-negative integer xi. Consider binary representation of xi: if the j-th bit of number xi equal to one, then the army of the i-th player has soldiers of the j-th type.

Fedor is the (m + 1)-th player of the game. He assume that two players can become friends if their armies differ in at most k types of soldiers (in other words, binary representations of the corresponding numbers differ in at most k bits). Help Fedor and count how many players can become his friends.

Input
The first line contains three integers n, m, k (1 ≤ k ≤ n ≤ 20; 1 ≤ m ≤ 1000).

The i-th of the next (m + 1) lines contains a single integer xi (1 ≤ xi ≤ 2n - 1), that describes the i-th player's army. We remind you that Fedor is the (m + 1)-th player.

Output
Print a single integer — the number of Fedor's potential friends.



조지와 알렉스가 기숙사에서 이사 할 수있게 도와 준 후, 그들은 친구 인 페도르가 새로운 컴퓨터 게임«Call of Soldiers 3»을 할 수 있도록 돕기 위해갔습니다.

이 게임에는 (m + 1) 명의 플레이어와 n 종류의 군인이 있습니다. 플레이어«병사 3의 호출»은 형식 1에서 (m + 1)까지 번호가 매겨집니다. 군인의 유형은 0에서 n - 1까지 번호가 매겨집니다. 각 플레이어는 군대를 가지고 있습니다. i 번째 플레이어의 군대는 음이 아닌 정수 xi로 나타낼 수 있습니다. 
xi의 이진 표현을 고려하십시오 : xi의 j 번째 비트가 1과 같은 경우, i 번째 플레이어의 군대는 j 번째 유형의 군인을 갖습니다.

Fedor는 (m + 1) 번째 게임 플레이어입니다. 그는 두 군데의 군대가 군대 유형이 다른 군대가 다르면 친구가 될 수 있다고 가정합니다 (즉, 해당 숫자의 이진 표현은 기껏해야 k 비트가 다릅니다). Fedor를 도와주고 얼마나 많은 플레이어가 그의 친구가 될 수 있는지 계산하십시오.

입력
첫 번째 줄에는 3 개의 정수 n, m, k (1 ≤ k ≤ n ≤ 20; 1 ≤ m ≤ 1000)가 포함됩니다.

다음 (m + 1) 행의 i 번째 행은 i 번째 플레이어의 군대를 나타내는 단일 정수 xi (1 ≤ xi ≤ 2n - 1)를 포함합니다. 우리는 Fedor가 (m + 1) 번째 플레이어임을 상기시킵니다.

산출
Fedor의 잠재적 인 친구 수를 나타내는 단일 정수를 출력하십시오.

됨
----------------------------------------------------------------------------------------------------
문제제목:B.Fedor and New Game
생성자:길경완
생성일자:2017_07_31
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
조지와 알렉스가 기숙사에서 이사 할 수있게 도와 준 후, 그들은 친구 인 페도르가 새로운 컴퓨터 게임«Call of Soldiers 3»을 할 수 있도록 돕기 위해갔습니다.
이 게임에는 (m + 1) 명의 플레이어와 n 종류의 군인이 있습니다. 플레이어«병사 3의 호출»은 형식 1에서 (m + 1)까지 번호가 매겨집니다. 군인의 유형은 0에서 n - 1까지 번호가 매겨집니다. 각 플레이어는 군대를 가지고 있습니다. i 번째 플레이어의 군대는 음이 아닌 정수 xi로 나타낼 수 있습니다. 
xi의 이진 표현을 고려하십시오 : xi의 j 번째 비트가 1과 같은 경우, i 번째 플레이어의 군대는 j 번째 유형의 군인을 갖습니다.
Fedor는 (m + 1) 번째 게임 플레이어입니다. 그는 두 군데의 군대가 군대 유형이 다른 군대가 다르면 친구가 될 수 있다고 가정합니다 (즉, 해당 숫자의 이진 표현은 기껏해야 k 비트가 다릅니다). Fedor를 도와주고 얼마나 많은 플레이어가 그의 친구가 될 수 있는지 계산하십시오.
	입력
	첫 번째 줄에는 3 개의 정수 n, m, k (1 ≤ k ≤ n ≤ 20; 1 ≤ m ≤ 1000)가 포함됩니다.
	다음 (m + 1) 행의 i 번째 행은 i 번째 플레이어의 군대를 나타내는 단일 정수 xi (1 ≤ xi ≤ 2n - 1)를 포함합니다. 
	우리는 Fedor가 (m + 1) 번째 플레이어임을 상기시킵니다.
	산출
	Fedor의 잠재적 인 친구 수를 나타내는 단일 정수를 출력하십시오.

문제해설:
ex)
	3 3 3
	1	001
	2	010
	3	011
	4	100
첫번째 입력 n은 군인의 유형 나는 이 숫자를 이것이 왜 있는지 모른다.
두번째 입력 m는 유저의 갯수.이때 이 숫자는 배열의 크기라 생각하고 1만큼 1다고 생각하자.
세번째 입력 k는 다른 비트가 다른것의 최대치이다. 1이라면 비트가 1개만 다른걸 허용하겠다는것이다.
이후 int배열을 m개 만큼 받는다.
비교 유저가 m+1이다. 이것을 비트 연산자를 이용하여서, 각유저와 비교하여서 bit_count한다 이 bit_count가 k보다 작거나 같으면 count++해준다.
처음의 입력은 이후의 입력의 갯수를 정하는 number. 이 number갯수만큼 추가로 int 배열을 입력받는다. 이 추가 입력은 1~179이여서 int로 하면된다.
 * 
 * 
 */
public class Fedor_and_New_Game {
	public static void main(String[] args) {

		/*
		 * n 클래스 숫자
		 * m 유저 숫자 1부터 m+1까지 세는 괴상한놈이다.
		 * k는 다를수 있는 비트 갯수 한계
		 */
		/*
3 3 3
1	001
2	010
3	011
4	100
		 * 
		 */
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        int input[] = new int[m+1];
        for(int i=0;i<(m+1);i++)
        {
        	input[i] = sc.nextInt();
        }
        

        for(int i=0;i<m;i++)
        {
        	int k_count=0;
    	  	int fedor = input[m];
        	for(int j=31;j>=0;j--)
        	{

        		int fedor_tmp = fedor;
        		int input_tmp = input[i];
        		fedor_tmp=fedor_tmp<<j;
        		fedor_tmp = fedor_tmp>>31;

        		input_tmp = input_tmp<<j;
        		input_tmp =input_tmp>>31;
        	
        		if(input_tmp!=fedor_tmp){
        			k_count++;
        		}
        	
        	}
        	if(k_count<=k)
        		count++;
 	
        	
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
