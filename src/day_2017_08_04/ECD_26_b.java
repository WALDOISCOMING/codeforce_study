package day_2017_08_04;

import java.beans.beancontext.BeanContext;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import day_2017_08_03_EducationalCodeforcesRound26.b;


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
        
        boolean str_1=true;
        boolean str_2=true;
        int counting=0;
        int both=0;
     
        
        for(int i=0;i<n;i++){
        		input[i]=sc.nextLine();
        }
     
        
        if(n%3==0)
		{
        	both++;
        	char now=input[0].charAt(0); 
        	
        	for(int i=1;i<input[0].length();i++)
        	{
        		out.print(now);
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
        	if(now=='R')R++;
			if(now=='G')G++;
			if(now=='B')B++;
			
        	if(counting>=3)
			str_1=false;
        	
		}
        
			
		if(m%3==0)
		{
			both++;
			char now=input[0].charAt(0);        	
        	for(int i=1;i<input.length;i++)
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
        	if(now=='R')R++;
			if(now=='G')G++;
			if(now=='B')B++;
        	
        	if(counting>=3)
    			str_2=false;
		}
        
        
    out.print(both);
		if(R==G&&G==B&&(str_1==true&&str_2==true)&&both==2)
		{
			out.println("YES");
		}else if(R==G&&G==B&&(str_1==true)&&both==1)
		{
			out.println("YES");
		}else if(R==G&&G==B&&(str_2==true)&&both==1)
		{
			out.println("YES");
		}
		else{				
			out.println("NO");
		}
        
        
    
     out.close();
        
	}
	
	
	public static void A(String input[])
	{
		if(input.length%3==0)
		{
			
		}
			
		if(input[0].length()%3==0)
		{
			
		}
		
	}
	
	public static void ����()
	{
		
	}
	public static int base(String input[])
	{
		char ch = input[0].charAt(0);
		int state=0;
		for(int i=1;i<input[0].length();i++)
		{
			state=1;
			if(ch!=input[0].charAt(i)){
				state=0;
				break;
			}
		}

		if(state==1){
			return 1;
		}
		state=0;
		for(int i=1;i<input.length;i++)
		{
			
			if(ch!=input[i].charAt(0)){
				state=-1;
				break;
			}
		}
		
		
		return state;
		
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
