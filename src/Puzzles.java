import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*

 A. Puzzles
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
The end of the school year is near and Ms. Manana, the teacher, will soon have to say goodbye to a yet another class. She decided to prepare a goodbye present for her n students and give each of them a jigsaw puzzle (which, as wikipedia states, is a tiling puzzle that requires the assembly of numerous small, often oddly shaped, interlocking and tessellating pieces).

The shop assistant told the teacher that there are m puzzles in the shop, but they might differ in difficulty and size. Specifically, the first jigsaw puzzle consists of f1 pieces, the second one consists of f2 pieces and so on.

Ms. Manana doesn't want to upset the children, so she decided that the difference between the numbers of pieces in her presents must be as small as possible. Let A be the number of pieces in the largest puzzle that the teacher buys and B be the number of pieces in the smallest such puzzle. She wants to choose such n puzzles that A - B is minimum possible. Help the teacher and find the least possible value of A - B.

Input
The first line contains space-separated integers n and m (2 ≤ n ≤ m ≤ 50). The second line contains m space-separated integers f1, f2, ..., fm (4 ≤ fi ≤ 1000) — the quantities of pieces in the puzzles sold in the shop.

Output
Print a single integer — the least possible difference the teacher can obtain.

 */

public class Puzzles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyScanner sc = new MyScanner();
         out = new PrintWriter(new BufferedOutputStream(System.out));
     //첫번 째 입력 n은 학생 수, m은 뒤에 입력될 퍼즐 숫자
         //두번째 입력은 한줄에 총 m개의 정수가 입력되며, 이들 중 n개만큼 선택하는데, 서로의 차이가 가장 적어야한다.
         //그래프로 탐욕 알고리즘 이용하자.
         //숫자를 큰 수대로 정렬 한 뒤에, 그것들의 차를 넣은 간선들을 만든다.
         
         
       String first = sc.nextLine();
       String firstStr[] = first.split(" ");
       int n = Integer.parseInt(firstStr[0]);//학생수
       int m = Integer.parseInt(firstStr[1]);//퍼즐갯수
       
       String second = sc.nextLine();
       String secondStr[] = second.split(" ");
              
       int puzzle[] = new int[m];
      

       for(int i=0;i<m;i++){
    	   puzzle[i] = Integer.parseInt(secondStr[i]);
       }
       
       Arrays.sort(puzzle);
       reverseArrayInt(puzzle);
       
      
       
       int diff[] = new int[m-1];
       boolean check[] = new boolean[m-1];
       
       
       for(int i=0;i<m-1;i++){
    	   diff[i] = puzzle[i]-puzzle[i+1];
       }

       for(int i=0;i<n-1;i++){
    	   int small=0;
    	   for(int j=0;j<m-1-1;j++){
    		   if(diff[j]>=diff[j+1] &&check[j+1]==false ){
    			   small = j+1;
    		   }
    		   if(diff[j]<diff[j+1] &&check[j]==false ){
    			   small = j;
    		   }	   
    	   }
    	   
    	   check[small] = true;
    	   
       }

   
       int large = 0;
       int small = 0;
       for(int i=0;i<m-1;i++){
    	   if(check[i]==true){
    		   large = i;
    	   		break;
    	   }
       }
       for(int i=m-1-1;i>0;i--){
    	   if(check[i] == true){
    		   small = i;
    		   break;
    	   }
       }
       System.out.println(puzzle[large]-puzzle[small]);
    		
   
       
       
       
    
	}
	//내림차순 정렬
	 public static void reverseArrayInt(int[] array) {
		    int temp;

		    for (int i = 0; i < array.length / 2; i++) {
		      temp = array[i];
		      array[i] = array[(array.length - 1) - i];
		      array[(array.length - 1) - i] = temp;
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
