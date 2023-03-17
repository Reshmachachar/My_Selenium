package programPractice;

public class ArrayEvenOdd {
	public static void main(String[] args) {
		
		int arr[]= {12,15,17,18,20,23};
		
		int left =0;
		int right=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[left]%2==0)
			{
				left++;
			}
			else if(arr[right]%2==1)
			{
				right--;
			}
		
		 if(left<right)
		 {
			 int temp=arr[left];
			 arr[left]=arr[right];
			 arr[right]=temp;
			 
		 }
		}	
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+ arr[j]);
		}
		
	}
}
