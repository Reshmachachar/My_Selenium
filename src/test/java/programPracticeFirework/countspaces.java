package programPracticeFirework;

public class countspaces {
	public static void main(String[] args) {
		
	String str=" hello helo hello hello hello  ";
	int count=0;
	for(char ch:str.toCharArray())
	{
		if(ch==' ')
		{
			count++;
		}
	}
		System.out.println(count);
		
	}

}
