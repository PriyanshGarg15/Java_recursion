package recursion;
public class A2_factorial_head_recursion {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		if(n==0)
			return 1;
		return n*fac(n-1);	
	}

}
