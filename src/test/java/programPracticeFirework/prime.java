package programPracticeFirework;

public class prime {
	public static void main(String[] args) {
		int n=5,num,count=0;
		num=n;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
		
		
		
	}

}
