package programPractice;

public class singleElementArray {
	public static void main(String[] args) {
		
		int a[]= {12,13,14,15};
  int result[]=new int[a.length];
  for(int i=0;i<a.length;i++)
  {
	  int sum=0;
	  int num=a[i];
	  while(num!=0)
	  {
		  sum+=num%10;
		  num=num/10;
	  }
	  result[i]=sum;
  }
		for(int j=0;j<result.length;j++)
 
		{
			System.out.print(result[j]+" ");
		}
		
		
		
	}

}
