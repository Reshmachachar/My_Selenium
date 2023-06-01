package programPractice;

import java.util.HashMap;

public class CharacterOccurence {
	public static void main(String args[])   
	{  
//	String str = "ADxcvixaBR";  
//	//HashMap char as a key and occurrence as a value  
//	HashMap <Character, Integer> charCount = new HashMap<>();  
//	for (int i = str.length() - 1; i >= 0; i--) 
//	{  
//	if(charCount.containsKey(str.charAt(i)))   
//	{  
//	int count = charCount.get(str.charAt(i));
//	charCount.put(str.charAt(i),++count);  
//	}   
//	else   
//	{  
//	charCount.put(str.charAt(i),1);  
//	}  
//	}  
//	System.out.println(charCount);  
//	}  
//	 public static void main(String args[]) {
//	      
//	      String s="ADxcvixaBR";
//	      char[] chr=s.toCharArray();
//	      Map<Character,Integer> strmap = new HashMap<Character,Integer>();
//	      
//	      for(int i=0;i<chr.length;i++)
//	      {
//	          char ch=chr[i];
//	         
//	          if(strmap.containsKey(ch))
//	              {
//	                  strmap.put(ch, strmap.get(ch).intValue()+1);
//	                
//	              }
//	              else
//	              {
//	                  strmap.put(ch,1);
//	              }
//	      }
//	      
//
//	      System.out.println("String str digits counting : " + strmap);
//	    }
	
	String str="ADxcvixaBR";
	HashMap<Character,Integer> charCount=new HashMap<>();
	for(int i=str.length()-1;i>=0;i--)
	{
		if(charCount.containsKey(str.charAt(i)))
		{
			int count=charCount.get(str.charAt(i));
			charCount.put(str.charAt(i),++count);
		}
		else
			charCount.put(str.charAt(i),1);
	}
System.out.println(charCount);	


}
	
}
