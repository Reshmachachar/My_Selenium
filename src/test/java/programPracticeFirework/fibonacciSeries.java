package programPracticeFirework;

public class fibonacciSeries {
	public static void main(String[] args) {
		int n=10,nn,f=0,s=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(" " +f);
			nn=f+s;
			f=s;
			s=nn;
		}
		
		
		
	}

}
