package programPractice;

public class WORDcOUNT {
	public static void main(String[] args) {
		int count=0;
		String str ="java is java so java is java";
		String[] c = str.split(" ");
		for (int i=0;i<c.length;i++)
		{
			if(c[i].equals("java"))
					{
				count++;
					}
		}
		System.out.println(count);
			
	}

}
