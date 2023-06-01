package programPractice;

public class arrayEvenOddOtherLogic {
	public static void main(String[] args) {
		
		int a[]=new int[] {12,15,17,18,20,23};
		int b[]=new int [a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			b[j++]=a[i];
		    }
		}
			for(int i=0;i<a.length;i++)
			{  if(a[i]%2==1)
			{
			b[j++]=a[i];
		    }
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}

}
