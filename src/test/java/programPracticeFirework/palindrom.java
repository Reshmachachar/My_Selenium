package programPracticeFirework;

public class palindrom {
	public static void main(String[] args) {
		int num=121,num1,sum=0,total;
		num1=num;
		while(num1!=0)
		{
			total=num1%10;
			sum=sum*10+total;
			num1=num1/10;
					
		}
		if(num==sum)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
		
		
		
	}

}
