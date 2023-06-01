package programPractice;

public class fibonacciSeries {
	public static void main(String[] args) {
		
		int f=1,s=1,nn,n=7;
		for(int i=1;i<=n;i++)
		{
			System.out.println(f);
			nn=f+s;
			f=s;
			s=nn;
			
		}
		
		
		
	}

}
