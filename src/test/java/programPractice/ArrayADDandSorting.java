package programPractice;
//a={1,2,3,5,8} add first to second,second to third and so on and add last number to first and after 
//sort them
public class ArrayADDandSorting {
	int[]a= {1,2,3,5,8};
	public static void main(String[] args) {
		int temp=0,temp1 = 0;
		int[]a= {1,2,6,5,8};
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==0)
				temp=a[i];
			if(i==a.length-1)
			
			 a[i]=a[i]+temp;
			else
			{
				a[i]=a[i]+a[i+1];
			}
		//	System.out.println(a[i]);
			for(int j=0;j<=i;j++)
			{
				if(a[i]<a[j])
				{
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
					
				}
			}
			
			}
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]);

		}
}
}
	//System.out.println(temp1);
					
		
	


