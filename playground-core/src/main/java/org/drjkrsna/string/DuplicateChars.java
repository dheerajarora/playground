package org.drjkrsna.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChars {

	private static void getDuplicateChars(final String source){
		if(source == null || source.length() == 0){
			System.out.println("No Duplicate Found.");
		}
		
		String result = "Duplicates are: ";
		char characterToMatch = source.charAt(0);
		for (int i=0; i<source.length()-1; i++) {
			char character = source.charAt(i+1);
			if(characterToMatch == character){
				result += character;
			}
			characterToMatch = character;
		}
		System.out.println(result);
	}
	
	private static void printDuplicateCharacters(final String source) {
		char[] charachters = source.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : charachters) {
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> enrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", source);
		
		for (Entry<Character, Integer> entry : enrySet) {
			if(entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}
	
	private static void removeDuplicates(final String source){
		final char[] characters = source.toCharArray();
		
		final Set<Character> characterSet = new HashSet<Character>();
		
		for (Character ch : characters) {
			characterSet.add(ch);
		}
		
		for (Character character : characterSet) {
			System.out.print(character);
		}
		
	}
	
	public static void main(String[] args) {
		DuplicateChars.getDuplicateChars("Dheeraajj");
		DuplicateChars.printDuplicateCharacters("ddhheerajj");
		DuplicateChars.removeDuplicates("ddhheerajj");
	}

}
