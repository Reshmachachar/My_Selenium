package programPractice;

public class lowerToUpperCase {
	public static void main(String[] args) {
		
		String str="ThiS is THE UPpEr StRiNg ";
		String mod="";
		for(int i=0;i<str.length();i++)
		{
        if(str.charAt(i)>=65 && str.charAt(i)<=90)
        	mod=mod+(char)(str.charAt(i)+32);
        else if(str.charAt(i)>=97 && str.charAt(i)<=122)
        	mod=mod+(char)(str.charAt(i)-32);
        else
        	mod=mod+str.charAt(i);
		}
		System.out.println(mod);
        
					   	
		}
		
	}
		
		
	


