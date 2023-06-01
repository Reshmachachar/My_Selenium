package programPracticeFirework;

public class lowerUpperCase {
	public static void main(String[] args) {
		String str="Reshma@123";
		int u=0,l=0,s=0,n=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='A'&& c<='Z')
			   u++;
			if(c>='a' && c<='z')
				l++;
			if(c>='0' && c<='9')
				n++;
			else
				s++;
			break;
						
		}
		System.out.println("upper case"+u);
		System.out.println("lower"+l);
		System.out.println("number"+n);
		System.out.println("special"+s);
		
		
		
		
	}

}
