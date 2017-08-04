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
Berland�� ����� ������ ���� ������ �����ϴ� �簢�� �ʵ� n �� m�Դϴ�.

����� 'R', 'G'�� 'B'���ڿ� �ش��ϴ� �� ���� �������� �����˴ϴ�.
����� �ʺ�� ���̰� ���� 3 ���� ���� ���� ������ �ְ� ����� �������� �����˴ϴ�.
'R', 'G'�� 'B'���ڷ� ������ n �� m �ʵ尡 �����˴ϴ�. �� �ʵ尡 Berland�� �ùٸ� �÷��׿� ��ġ�ϸ� "YES"(����ǥ ����)�� ����մϴ�. 
�׷��� ������ "NO"(����ǥ ����)�� �μ��Ͻʽÿ�.

�Է�
ù ��° �ٿ��� �� ���� ���� n�� m (1 �� n, m �� 100) - �ʵ��� ũ�Ⱑ ���Ե˴ϴ�.

'R', 'G'�� 'B'm ���ڷ� ������ ���� n �� ������ �ʵ忡 ���� �����Դϴ�.

����
�־��� �ʵ尡 Berland�� �ùٸ� �÷��׿� ��ġ�ϸ� "YES"(����ǥ ����)�� ����Ͻʽÿ�. �׷��� ������ "NO"(����ǥ ����)�� �μ��Ͻʽÿ�.
 */
public class ECD_26_b {

	public static int R=1;
	
	public static int G=1;
	
	public static int B=1;

	
	
	public static void main(String[] args) {
		
	
		 MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int m = sc.nextInt();
        String input[]=new String[n];
        
        boolean str=true;
        int counting=0;
        for(int i=0;i<n;i++){
        		input[i]=sc.nextLine();
        }
        if(base(input[0]))
        {//���α���
        	char now=input[0].charAt(0);
        	
        	for(int i=1;i<n;i++)
        	{
        		if(now==input[i].charAt(0))
        		{
        			if(now=='R')R++;
        			if(now=='G')G++;
        			if(now=='B')B++;
        		}else{
        			counting++;
        			now=input[i].charAt(0);
        		}
        		
        	}
        	if(counting>=3)
			str=false;
        	
        	
        }else{
        	//���α���.
        	char now=input[0].charAt(0);
        	
        	for(int i=1;i<m;i++)
        	{
        		if(now==input[0].charAt(i))
        		{
        			if(now=='R')R++;
        			if(now=='G')G++;
        			if(now=='B')B++;
        		}else{
        			counting++;
        			now=input[0].charAt(i);
        		}
        		
        	}
        	if(counting>=3)
    			str=false;
        	
        }
        boolean check=true;
        if(n<3&&m<3)
        	check=false;
        if(R==G&&G==B&&str==true&&check)
        	out.println("YES");
        else
        	out.println("NO");
     out.close();
        
	}
	
	public static boolean base(String input)
	{
		char ch = input.charAt(0);
		for(int i=1;i<input.length();i++)
		{
			if(ch!=input.charAt(i))
				return false;
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
