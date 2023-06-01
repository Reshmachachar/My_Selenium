package programPracticeFirework;

public class reverseString {

	public static void main(String[] args) {
		
	String str="madam";
	String rev=" ";
	for(int i=str.length()-1;i>0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str==rev)
	{
		System.out.println("palindrom");
	}
	else
		System.out.println("not palindrom");
}
}