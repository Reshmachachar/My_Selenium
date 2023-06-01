package programPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharOccurencebyotherlogicAniket
{
		    public static void main(String[] args)
		    {
	        // TODO Auto-generated method stub
	        //Write a program to find the highest occurrence of characters in a given word for example if the word is
	        //        Nayar the output is a:2 and if the word is "aabbc" the output should be "a:2,b:2"

	        String str="aabbc";
	        char[] a=str.toCharArray();
	        char ch,ch1 = 0;
	        int temp=0;

	        Map<Character,Integer> strmap=new HashMap<Character,Integer>();
	        Map<Character,Integer> strmap1=new HashMap<Character,Integer>();

	        for(int i=0;i<str.length();i++)
	        {
	            ch=a[i];
	            if(strmap.containsKey(ch))     
	                strmap.put(ch, strmap.get(ch).intValue()+1);
	                else {
	                    strmap.put(ch, 1);    
	                    ch1=ch;
	                }

	        }

	        System.out.println("Map :"+strmap);

	        //int temp=0,highest;
	        //char ch1 = 0;
	        for(Entry<Character, Integer> entry : strmap.entrySet())
	        {
	            for(Entry<Character, Integer> entry1 : strmap.entrySet())
	            {
	                if(entry.getValue() > entry1.getValue())
	                    strmap1.put(entry.getKey(), entry.getValue());

	            }

	        }
	        System.out.println("Highest Occurence : "+strmap1);
	    }

	}


