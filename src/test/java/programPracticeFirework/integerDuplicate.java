package programPracticeFirework;

public class integerDuplicate {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,2,3};
		int count=0;
		for(int i=0;i<=a.length;i++)
		{
			
				if(a[i]==a[i+1])
				{
					count++;
					System.out.print(a[i]);
				
			}
		}
	
		
		
		
	}

}
