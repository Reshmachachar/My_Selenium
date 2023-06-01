package programPractice;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class HighOccurence {
   public static void main(String[] args) {
		String str="aaaab";
		str=str.toLowerCase();
		char[] a = str.toCharArray();
		char ch;
		HashMap<Character,Integer> strmap=new HashMap<Character,Integer>();
		HashMap<Character,Integer> strmap1=new HashMap<Character,Integer>();
	for(int i=0;i<str.length();i++)
		{
			ch=a[i];
			if(strmap.containsKey(ch))
			     strmap.put(ch,strmap.get(ch).intValue()+1);
			     else
			    	 strmap.put(ch,1);
		}
		int temp=0,high ;
		char ch1=0;
		for(Entry<Character,Integer> entry :strmap.entrySet())
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
					strmap1.put(ch1,temp);
					strmap1.put(entry.getKey(), entry.getValue());
				}
				else
				{
					if(temp>entry.getValue())
						strmap1.put(ch1,temp);
					else
						strmap1.put(entry.getKey(), entry.getValue());
				}
			    }
			
				}
		System.out.println(strmap1);
			}
		}
	
	

