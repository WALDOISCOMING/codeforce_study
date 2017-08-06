
public class suck {
public static void main(String args[]){
	
	
	re(5);
}
static int re(int n){
	int i;
	if(n<1){
		return 2;
	}
	else{
		i=2*re(n-1)+1;
		System.out.println(i);
		return i;
	}
}
}
