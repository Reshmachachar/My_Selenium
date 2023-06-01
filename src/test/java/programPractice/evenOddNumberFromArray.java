package programPractice;

//{12,15,17,18,20,23}; seperate even and odd number in the array and print it
public class evenOddNumberFromArray {
public static void main(String[] args) {
	int a[]={12,15,17,18,20,23};
	int left=0;
	int right=a.length-1;
	for(int i=0;i<a.length;i++)
	{
		if(a[left]%2==0)      //12 and 23
		{
			left++;
			//System.out.println(left);
		}
		else if(a[right]%2==1)
		{	right--;
		
		}
	
	if(left<right)
	{
		//System.out.println(left);
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
	}
	}
	for(int j=0;j<a.length;j++)
	{
		System.out.print(a[j]);
		System.out.print(" ");
	}
	
	
	
	
	
	
}
	
	
	
}
