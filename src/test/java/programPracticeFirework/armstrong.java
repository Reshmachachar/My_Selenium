package programPracticeFirework;

public class armstrong {
public static void main(String[] args) {
	
int n=153,num,num1 = 0,sum=0;
	n=num1;
	while(n>0)
	{
		n=n%10;
		sum=sum+n*n*n;
		n=n/10;
	}
	if(n==sum)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not");
	}
	
}	
}
