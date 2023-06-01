package programPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class highestCharOccurence {
	public static void main(String[] args) {
			
	String str="chachar";
	char[] a = str.toCharArray();
	char ch,ch1=0;
		
	HashMap<Character,Integer> strmap=new HashMap<Character,Integer>();
	HashMap<Character,Integer> strmap1=new HashMap<Character,Integer>();
	
	for(int i=0;i<str.length();i++)
	{
		ch=a[i];
		if(strmap.containsKey(ch))
		{
			strmap.put(ch, strmap.get(ch).intValue()+1);
			ch1=ch;
		}
		else
			strmap.put(ch, 1);
	}
	for(Entry<Character,Integer> entry:strmap.entrySet())
	{
		for(Entry<Character,Integer> entry1:strmap.entrySet())
		{
			if(entry.getValue()>entry1.getValue())
			{
				strmap1.put(entry.getKey(),entry.getValue());
			}
		}
		System.out.println("highest occurence"+strmap1);
		
	}
	
	}
}
