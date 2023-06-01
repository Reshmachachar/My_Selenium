package programPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class charOccByAniket {
	 public static void main(String[] args) {
	        String str="Nayar";
	        char[] a=str.toCharArray();
	        char ch;
	        
	        Map<Character,Integer> strmap=new HashMap<Character,Integer>();
	        Map<Character,Integer> strmap1=new HashMap<Character,Integer>();
	        
	        for(int i=0;i<str.length();i++)
	        {
	            ch=a[i];
	            if(strmap.containsKey(ch))
	                strmap.put(ch, strmap.get(ch).intValue()+1);
	            else
	                strmap.put(ch, 1);
	                    
	        }
	        
	        System.out.println("Map :"+strmap);
	      int temp=0,highest;
	      char ch1 = 0;
	        for(Entry<Character, Integer> entry : strmap.entrySet())
	        {
	            if(temp==0)
	            {
	                ch1=entry.getKey();
	                temp=entry.getValue();
	            }
	            else
	            {
	            if(temp==entry.getValue())
	            {
	                strmap1.put(ch1, temp);
	                strmap1.put(entry.getKey(), entry.getValue());
	            }   
	            else
	            {
	                if(temp>entry.getValue())
	                
	                    strmap1.put(ch1, temp);        
	                else
	                strmap1.put(entry.getKey(), entry.getValue());
	            }
	                
	            }
	                
	        }
	        System.out.println(strmap1);
	    }


}
