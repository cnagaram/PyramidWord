package com.pyramidword.ws;

import java.io.*;
import java.util.*;

public class PyramidWord {
	public boolean checkPyramidWord(String inputString) throws IOException {		
		char[] charArray = new char[inputString.length()];
		HashMap<Character,Integer> letterCountMap = new HashMap<Character,Integer>();
		
		charArray = inputString.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(!letterCountMap.containsKey(charArray[i]))
			{
				letterCountMap.put(charArray[i],1);
			}
			else
			{
				int count=letterCountMap.get(charArray[i]);
				letterCountMap.put(charArray[i],count+1);
			}
		}
		List<Integer> mapValues = new ArrayList<Integer>(letterCountMap.values());
		Collections.sort(mapValues);
		int flag=0;
		if(mapValues.get(0)!=1)
		{
			return false;
		}
		else
		{
		for(int i=0;i<mapValues.size()-1;i++){
			if(mapValues.get(i)+1 != mapValues.get(i+1))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			return false;
		else
			return true;
		}
	}
}
