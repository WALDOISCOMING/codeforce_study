package day_2017_08_03_EducationalCodeforcesRound26;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
 * A������.,
 * 
 * 
A. �ؽ�Ʈ ����
�׽�Ʈ �� �ð� ���� 1 ��
�׽�Ʈ �� �޸� ���� 256 �ް� ����Ʈ
�Է� ǥ�� �Է�
��� ǥ�� ���
�ҹ��ڿ� �빮�� ��ƾ ���ڷ� ������ ���� �������� �и� �� �ܾ��� �ؽ�Ʈ�� �����˴ϴ�.

�ܾ��� ������ �ܾ��� �빮�� ���Դϴ�. �ؽ�Ʈ�� ������ �ؽ�Ʈ�� ��� �ܾ��� �ִ� �����Դϴ�.

�־��� �ؽ�Ʈ�� ������ ����Ͻʽÿ�.

�Է�
ù ��° �ٿ��� �ϳ��� ���� n (1 �� n �� 200) - �ؽ�Ʈ�� ���̰� ���Ե˴ϴ�.

�� ��° �࿡�� �������� �и� �� s1, s2, ..., si��� �ؽ�Ʈ�� ���ԵǾ� �ֽ��ϴ�. ���� �� �빮�� ��ƾ ���ڷθ� �����˴ϴ�.

����
�ϳ��� ���� - �ؽ�Ʈ�� ���� �μ��Ͻʽÿ�.
 */

public class a {
	static int BIGCOUNT=0;
	static int BEST=0;
	public static void main(String[] args) {
		
	
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
   
        int n = sc.nextInt();
        String input = sc.nextLine();
        
        for(int i=0;i<n;i++)
        {
        	counting(input.charAt(i));
        }
        if(BEST==0)BEST=BIGCOUNT;
        out.println(BEST);
      
      
     out.close();
        
	}
	
	public static void counting(char c)
	{
		if(c>=65&&c<=90)
			BIGCOUNT++;
		if(c==' '){
			if(BIGCOUNT>BEST){
			BEST=BIGCOUNT;
			}
			BIGCOUNT=0;
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
