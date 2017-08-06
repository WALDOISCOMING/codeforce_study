import java.util.*;
public class test{
    
    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);  
        
        int n = sc.nextInt();    
        int m = sc.nextInt();    
        int a = sc.nextInt();    
        int a1 = n%a==0?n/a:n/a+1;
        int a2 = m%a==0?m/a:m/a+1;
        
        System.out.println(a1*a2);
    }
    
   
}