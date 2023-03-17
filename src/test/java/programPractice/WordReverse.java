package programPractice;

public class WordReverse {

//	public static void main(String[] args) {
//		String str="reshma        chachar       ";
//		String words[]=str.split(" ");
//		String revStr="";
//		for(int i=0;i<words.length;i++)
//		{
//			String word=words[i];
//			String revword="";
//			for(int j=word.length()-1;j>=0;j--)
//			{
//				//revword=revword+word.charAt(j);
//				revStr=revStr+word.charAt(j);
//			}
//			revStr=revStr+revword;
//		//	revStr=revStr+" ";
//		}
//		System.out.println("Reverse string is="+revStr);		
//
//	}
	 public static void main(String[] args) {
	        String str="    india is my   country  aniket      jitendra      ";
	        //String words[] = str.split(" ");
	        String words = str.trim().replaceAll("\\s+"," ");
	        String reversedString = "";

	         String w[]=words.split(" ");
	        for (int i = 0; i < w.length; i++) 
	        {
	            String word = w[i];
	            String reverseWord = "";
	            for (int j = word.length() - 1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	            reversedString = reversedString + reverseWord +" ";
	        }
	      
	        
	       System.out.print("Reversed string : " + reversedString);
	    }
}
