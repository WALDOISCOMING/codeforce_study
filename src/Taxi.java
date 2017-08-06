import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
/*
제목:B. Taxi
시간제한:time limit per test3 seconds
메모리제한:memory limit per test256 megabytes
표준입출력:
inputstandard input
outputstandard output
After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus 
to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and 
they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at 
most four passengers. What minimum number of cars will the children need if all members of each 
group should ride in the same taxi (but one taxi can take more than one group)?

Input
The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. 
The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are 
separated by a space, si is the number of children in the i-th group.

Output
Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.
 */

public class Taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 두번의 입력. 앞은 그룹의 크기, 뒤는 각 그룹의 인수.
		 * 택시에 최대 4명씩 테울 수 있으며 여기서 최소 텍시 개수를 정한다.
		 */
		//
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
       
         int groupsCount = sc.nextInt();
         String groups = sc.nextLine();
         int state = 0;
         int peples = 0;
         String group[] = groups.split(" ");
        int G1=0;
        int G2=0;
        int G3=0;
        int G4=0;
         for(int i=0;i<groupsCount;i++){
        	 if(Integer.parseInt(group[i])==1){
        		 G1++;
        	 }
        	 if(Integer.parseInt(group[i])==2){
        		 G2++;
        	 }
        	 if(Integer.parseInt(group[i])==3){
        		 G3++;
        	 }
        	 if(Integer.parseInt(group[i])==4){
        		 G4++;
        	 }
         }
         int a = G1;
         for(int i=0;i<a;i++){
        	if(G3==0)
        		break;
        	else{
        		--G3;
        		--G1;
        		G4++;       		
        	}
         }
         
         if((G1/4!=0)&&(G1%4==0)){
        	 G4 = G4+G1/4;
        	 G1 = 0;
         }else if((G1/4!=0)&&(G1%4!=0)){
        	 G4 = G4+G1/4;
        	 G1 = G1%4;
         }  
         if((G1/3!=0)&&(G1%3==0)){
        	 G3+=G1/3;
        	 G1 = 0;
         }else if((G1/3!=0)&&(G1%3!=0)){
        	 G3 = G3+G1/3;
        	 G1 = G1%3;
         }
         if((G1/2!=0)&&(G1%2==0)){
        	 G2+=G1/2;
        	 G1 = 0;
         }else if((G1/2!=0)&&(G1%2!=0)){
        	 G2 = G2+G1/2;
        	 G1 = G1%2;
         }
      	 

         if((G2/2!=0)&&(G2%2==0)){
        	 G4 =G4+ G2/2;
        	 G2 = 0;
         }else if((G2/2!=0)&&(G2%2!=0)){
        	 G4 = G4+G2/2;
        	 G2 = G2%2;
         }
         a = G1;
         for(int i=0;i<G1;i++){
        	 if(G2==0)
        		 break;
        	 else{
        		 --G1;
        		 --G2;
        		 G3++;
        	 }
         }
        
         
         int taxi = G1+G2+G3+G4;
         System.out.println(taxi);
         
        
         
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
