package programPracticeFirework;

public class seperateOddandEvenFromArray {

	public static void main(String[] args) {
		int a[]= {12,13,14,15,10,17};
		int left=0,temp;
		int right=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[left]%2==0)
			{
				left++;
			}
			else if(a[right]%2==1)
			{
				right--;
			}
		}
		if(left>right)
		{
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			
		}
		for(int j=0;j<a.length;j++)
		{
			//System.out.print();
		}
		
		
	}
}
