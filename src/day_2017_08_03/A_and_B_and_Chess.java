package day_2017_08_03;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
A. A and B and Chess
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
A and B are preparing themselves for programming contests.

To train their logical thinking and solve problems better, A and B decided to play chess. During the game A wondered whose position is now stronger.

For each chess piece we know its weight:

the queen's weight is 9,
the rook's weight is 5,
the bishop's weight is 3,
the knight's weight is 3,
the pawn's weight is 1,
the king's weight isn't considered in evaluating position.
The player's weight equals to the sum of weights of all his pieces on the board.

As A doesn't like counting, he asked you to help him determine which player has the larger position weight.

Input
The input contains eight lines, eight characters each — the board's description.

The white pieces on the board are marked with uppercase letters, the black pieces are marked with lowercase letters.

The white pieces are denoted as follows: the queen is represented is 'Q', the rook — as 'R', the bishop — as'B', the knight — as 'N', the pawn — as 'P', the king — as 'K'.

The black pieces are denoted as 'q', 'r', 'b', 'n', 'p', 'k', respectively.

An empty square of the board is marked as '.' (a dot).

It is not guaranteed that the given chess position can be achieved in a real game. Specifically, there can be an arbitrary (possibly zero) number pieces of each type, the king may be under attack and so on.

Output
Print "White" (without quotes) if the weight of the position of the white pieces is more than the weight of the position of the black pieces, print "Black" if the weight of the black pieces is more than the weight of the white pieces and print "Draw" if the weights of the white and black pieces are equal.

----------------------------------------------------------------------------------------------------
문제제목:A. A and B and Chess
생성자:길경완
생성일자:2017_08_03
시간제한:1초
메모리제한:256mb
표준입출력.
문제내용:
입력 표준 입력
출력 표준 출력
A와 B는 프로그래밍 콘테스트를 준비하고 있습니다.

논리적 인 생각을 훈련시키고 문제를 더 잘 해결하기 위해 A와 B는 체스를하기로 결정했습니다. 경기 중 A는 누구의 위치가 더 강해지는지 궁금해했습니다.

각 체스 조각에 대해 우리는 체중을 알고 있습니다 :

여왕의 무게는 9,
루크의 체중은 5,
주교의 무게는 3,
기사의 무게는 3,
폰의 무게는 1,
왕의 체중은 위치를 평가할 때 고려되지 않습니다.
플레이어의 체중은 보드에있는 모든 조각의 무게의 합계와 같습니다.

A가 세는 것을 좋아하지 않으므로, 그는 더 큰 체중을 가진 선수를 결정할 수 있도록 도와달라고 요청했습니다.

	입력
	입력에는 보드의 설명 인 8 개의 행이 포함되어 있습니다.
	칠판의 흰 부분은 대문자로 표시되고, 검은 색 부분은 소문자로 표시됩니다.	
	흰색 조각은 다음과 같이 표시됩니다. 여왕이 'Q', 루크가 'R', 주교가 'B', 기사가 'N', 폰이 'P', 킹 - 'K'.
	검정색 조각은 각각 'q', 'r', 'b', 'n', 'p', 'k'로 표시됩니다.
	보드의 빈 사각형은 '.'로 표시됩니다. (점).
	주어진 체스 위치가 실제 게임에서 달성 될 수 있다는 보장은 없습니다. 특히, 각 유형의 임의의 (아마도 제로) 숫자 조각이있을 수 있으며, 
	왕은 공격 받고있을 수 있습니다.
	
	산출
	하얀 조각의 위치의 무게가 검은 조각의 위치의 무게보다 큰 경우 "흰색"(따옴표 제외)을 인쇄하고 검은 조각의 무게가 흰색의 무게보다 
	큰 경우 "검은 색"을 인쇄하십시오 흰색과 검은 색 조각의 무게가 같으면 "그리기"를 인쇄하십시오.


Examples
input
...QK...
........
........
........
........
........
........
...rk...
output
White
input
rnbqkbnr
pppppppp
........
........
........
........
PPPPPPPP
RNBQKBNR
output
Draw
input
rppppppr
...k....
........
........
........
........
K...Q...
........
output
Black


문제 해석:
무척쉬웠다 간단하게, 8*8에서 간단하게 조건에 따라 세면된다. 변수에 넣어주면 끝.
 * 
 * 
 */
public class A_and_B_and_Chess {
	static int black=0;
	static int white=0;
	public static void main(String[] args) {
		 MyScanner sc = new MyScanner();
	     out = new PrintWriter(new BufferedOutputStream(System.out));
	     String input[] = new String[8];
	     for(int i=0;i<8;i++)
	     {
	    	 input[i] = sc.nextLine();
	    	
	     }
	     //소문자-> black //대문자는 white
	     for(int i=0;i<8;i++)
	     {
	    	 for(int j=0;j<8;j++)
	    	 {
	    		 chess(input[i].charAt(j));
	    	 }
	     }
	     
	     
	     if(black>white){
	    	 out.println("Black");
	     }else if(white>black){
	    	 out.println("White");
	     }else{
	    	 out.println("Draw");
	     }
	    	 
	     
	    
   out.close();
    
	}
	public static void chess(char c)
	{
		switch(c)
		{
		case 'q':
			black+=9;
			break;
		case 'Q':
			white+=9;
			break;
		case 'r':
			black+=5;
			break;
		case 'R':
			white+=5;
			break;
		case 'b':
			black+=3;
			break;
		case 'B':
			white+=3;
			break;
		case 'n':
			black+=3;
			break;
		case 'N':
			white+=3;
			break;
		case 'p':
			black+=1;
			break;
		case 'P':
			white+=1;
			break;		
		
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
