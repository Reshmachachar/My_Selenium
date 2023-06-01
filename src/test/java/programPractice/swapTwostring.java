package programPractice;

public class swapTwostring {
	public static void main(String[] args) {
		
		String a="reshma";
		String b="chachar";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after swaping string is a="+a);
		System.out.println("after swaping string is b="+b);
		
		
	}
}
