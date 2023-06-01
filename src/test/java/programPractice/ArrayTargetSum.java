package programPractice;

public class ArrayTargetSum {
	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int sum=0,j=0;
		int counter=a.length-1,count=0,count1=0;
		for(int i=0;i<a.length;i++)
		{
			j=i;
			count=0;
			counter=a.length-1;
			sum=3;
			System.out.println("Array form Given Index is : "+j);
			while(counter!=-1)
			{
				sum=sum-a[j];
				System.out.println("Given Array : "+a[j++]);
				if(j==0)
					count=1;
				if(j==a.length && count==0)
					j=0;

				//sum=sum-a[j++];
				if(sum==0)
				{
					System.out.println("There is Targeted sum----");
					count1=1;
					break;
				}
				counter--;
			}
			System.out.println("**************** ");
			if (count1==1) 
				break;
			else {
				if (i==a.length-1) 
					System.out.println("There is no targeted sum..");        
			}
		}
	}

}
