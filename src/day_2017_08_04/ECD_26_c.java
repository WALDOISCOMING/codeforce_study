package day_2017_08_04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*

�׽�Ʈ �� �ð� ���� 1 ��
�׽�Ʈ �� �޸� ���� 256 �ް� ����Ʈ
�Է� ǥ�� �Է�
��� ǥ�� ���
���� �߿��� ��� �� ���� a �� b�� ���簢�� ������ ���� ������ ������ �ֽ��ϴ�.

����, �״� ������ �ֽ��ϴ�. �� ������ xi �� yi ũ���� ���簢�� ���·� ������ �λ��� ����ϴ�. �� �λ��� ���� ������ ���鿡 �����ؾ��մϴ� (�׷��� ���� 90�� ȸ�� �� �� ����).

�ſ� �߿��� ����� �� ���� �ٸ� ������ �����ϰ� �� ���� ������ �ֱ⸦ ���մϴ�. ������ �� ������ ��Ȯ�� �� ���� �λ����ݴϴ�. ���� ���� ��ġ�� �ʾƾ��մϴ� (������ ���� �� ����). ��ü ������ �ִ��� Ŀ���մϴ�. �� ���� ������ ������ ���ִ� ���� ū ������ �����Դϱ�?

�Է�
ù ��° �ٿ��� �� ���� ���� n, a �� b (1 �� n, a, b �� 100)�� ���Ե˴ϴ�.

���� n ���� �� ���� xi, yi (1 �� xi, yi �� 100)�� ���ڸ� �����մϴ�.

����
�� ���� ������ ������ ���ִ� ���� ū �� ������ �μ��Ͻʽÿ�. �� ���� ������ ������ �� ������ 0�� �μ��Ͻʽÿ�

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
ù ��° ���������� �� ��° ���� 90�� ȸ�� �� �� �ֽ��ϴ�. �׷� ���� ù ��° ���� ���� �ٷ� �Ʒ��� �λ��� �Ӵϴ�. �̰��� ��� ���̸� ������ ���Դϴ�.

�� ��° �������� �������� �ʱ� ������ ������ ������ ������ �� �����ϴ�. ù ��° �� �� ��° ������ �����ϸ� ���� ū ������ �����ϰԵ˴ϴ�.

�� ��° �������� ���� ������ �� �� �� ���ִ� �׷� ���� ���� �����ϴ�.
--
ù n�� �� ����
�� ������ ���μ���

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

	
	public static boolean ������(int input[][],int a,int b,int i,int j)
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
