package day_2017_08_04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*

테스트 당 시간 제한 1 초
테스트 당 메모리 제한 256 메가 바이트
입력 표준 입력
출력 표준 출력
아주 중요한 사람 한 명은 a × b의 직사각형 형태의 종이 조각을 가지고 있습니다.

또한, 그는 물개가 있습니다. 각 도장은 xi × yi 크기의 직사각형 형태로 용지에 인상을 남깁니다. 각 인상은 종이 조각의 측면에 평행해야합니다 (그러나 씰은 90도 회전 할 수 있음).

매우 중요한 사람은 두 개의 다른 물개를 선택하고 두 번의 물개를 넣기를 원합니다. 선택한 각 물개는 정확히 한 번의 인상을줍니다. 노출 수는 겹치지 않아야합니다 (측면을 만질 수 있음). 전체 면적은 최대한 커야합니다. 두 개의 물개가 차지할 수있는 가장 큰 영역은 무엇입니까?

입력
첫 번째 줄에는 세 개의 정수 n, a 및 b (1 ≤ n, a, b ≤ 100)가 포함됩니다.

다음 n 행은 두 개의 xi, yi (1 ≤ xi, yi ≤ 100)의 숫자를 포함합니다.

산출
두 개의 물개가 차지할 수있는 가장 큰 총 면적을 인쇄하십시오. 두 개의 물개를 선택할 수 없으면 0을 인쇄하십시오

--
Examples
input
2 2 2
1 2
2 1
output
4
input
4 10 9
2 3
1 1
5 10
9 11
output
56
input
3 10 10
6 6
7 7
20 5
output
0
--
첫 번째 예제에서는 두 번째 씰을 90도 회전 할 수 있습니다. 그런 다음 첫 번째 씰의 느낌 바로 아래에 인상을 둡니다. 이것은 모든 종이를 차지할 것입니다.

두 번째 예에서는 적합하지 않기 때문에 마지막 인장을 선택할 수 없습니다. 첫 번째 및 세 번째 물개를 선택하면 가장 큰 영역을 차지하게됩니다.

세 번째 예에서는 종이 조각에 둘 다 들어갈 수있는 그런 물개 쌍이 없습니다.
--
첫 n은 씰 갯수
그 다음은 가로세로

 */
public class ECD_26_c {
	static int sum1=0;
	static int sum2=0;
	public static void main(String[] args) {
		
		
	MyScanner sc = new MyScanner();
       out = new PrintWriter(new BufferedOutputStream(System.out));
    int n =sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    //int max = a*b;
    int wmax=0;
    int hmax=0;
    int sum=0;
    
    int input[][] = new int[n][2];
    for(int i=0;i<n;i++)
    {
    	input[i][0]=sc.nextInt();input[i][1]=sc.nextInt();
    }
    
    //non non

    //90 non
    for(int i=0;i<n-1;i++)
    {
    	for(int j=1;j<n;j++)
    	{
    		if(input[i][0]+input[j][1]<=a&&input[i][1]+input[j][0]<=b){
    			
    			if(sum<input[i][0]*input[i][1]+input[j][0]*input[j][1])
    			sum=input[i][0]*input[i][1]+input[j][0]*input[j][1];
    			
    		}
    		
    		if(input[i][1]+input[j][1]<=a&&input[i][0]+input[j][0]<=b){
    			if(sum<input[i][0]*input[i][1]+input[j][0]*input[j][1])
        			sum=input[i][0]*input[i][1]+input[j][0]*input[j][1];
    			
    		}
    		
    		
    		if(input[i][0]+input[j][0]<=a&&input[i][1]+input[j][1]<=b){
    			if(sum<input[i][0]*input[i][1]+input[j][0]*input[j][1])
        			sum=input[i][0]*input[i][1]+input[j][0]*input[j][1];
    		}
    		
    		if(input[i][1]+input[j][0]<=a&&input[i][0]+input[j][1]<=b){
    			if(sum<input[i][0]*input[i][1]+input[j][0]*input[j][1])
        			sum=input[i][0]*input[i][1]+input[j][0]*input[j][1];
    		}
    		
    		
    		
    	}
    } 
 
    
    
    
    //non non 
    

    out.println(sum);
    
    out.close();
       
	}

	
	public static boolean 굴리기(int input[][],int a,int b,int i,int j)
	{
		int arr[][]=new int[a][b];
		
		for(int index=0;index<input[i][0];index++)
		{
			for(int index2=0;index2<input[i][1];index2++)
			{
				arr[index][index2]=1;
			}
			
		}
	
		for(int index=a-1;index>input[j][0];index--)
		{
			for(int index2=b-1;index2>input[j][1];index2--)
			{
				if(arr[index][index2]==1)
				{
					return false;
				}
			}
			
		}
		
		return true;
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
