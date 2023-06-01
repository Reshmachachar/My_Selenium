package programPracticeFirework;

public class swapTwoString {
	public static void main(String[] args) {
		String a="reshma";
		String b="chachar";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("a is"+a);
		System.out.println("b is"+b);
		
		
		
		
	}

}
