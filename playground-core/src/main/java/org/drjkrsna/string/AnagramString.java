package org.drjkrsna.string;

import java.util.Arrays;

public class AnagramString {

	private static boolean isAnagram(final String string1, final String string2) {
		if(string1 == null || string2 == null){
			return false;
		}
		
		if(string1.length() != string2.length()){
			return false;
		}
		
		final char[] string1CharArray = string1.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		final char[] string2CharArray = string2.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		
		Arrays.sort(string1CharArray);
		Arrays.sort(string2CharArray);
		
//		return string1CharArray == string2CharArray;
		return Arrays.equals(string1CharArray, string2CharArray);
	}
	
	public static void main(String[] args) {
		System.out.println(AnagramString.isAnagram("dheeraj arora", "rroaj dhaaree"));
	}

}
