package programPractice;

public class charOccurencePractice {
	public static void main(String[] args) {
		String str="aabbc";
		
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<=str.length()-1;i++)
			{
				if(str.charAt(i)==ch)
					count++;
			}
		
		if(count!=0)
		{
			System.out.println(ch+"="+count);
		}
		}
		
		
	}

}
