/*******************************************************************************
 * Copyright 2015 DrjKrsna.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.drjkrsna.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * The Class DuplicateChars.
 *
 * @author <a href="mailto:dheeraj6188@gmail.com">Dheeraj Arora</a>
 */
public class DuplicateChars {

    /**
     * Gets the duplicate chars.
     *
     * @param source the source
     * @return the duplicate chars
     */
    private static void getDuplicateChars(final String source) {
        if (source == null || source.length() == 0) {
            System.out.println("No Duplicate Found.");
        }

        String result = "Duplicates are: ";
        char characterToMatch = source.charAt(0);
        for (int i = 0; i < source.length() - 1; i++) {
            final char character = source.charAt(i + 1);
            if (characterToMatch == character) {
                result += character;
            }
            characterToMatch = character;
        }
        System.out.println(result);
    }

    /**
     * Prints the duplicate characters.
     *
     * @param source the source
     */
    private static void printDuplicateCharacters(final String source) {
        final char[] charachters = source.toCharArray();

        final Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (final Character ch : charachters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        final Set<Entry<Character, Integer>> enrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", source);

        for (final Entry<Character, Integer> entry : enrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * Removes the duplicates.
     *
     * @param source the source
     */
    private static void removeDuplicates(final String source) {
        final char[] characters = source.toCharArray();

        final Set<Character> characterSet = new HashSet<Character>();

        for (final Character ch : characters) {
            characterSet.add(ch);
        }

        for (final Character character : characterSet) {
            System.out.print(character);
        }

    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        DuplicateChars.getDuplicateChars("Dheeraajj");
        DuplicateChars.printDuplicateCharacters("ddhheerajj");
        DuplicateChars.removeDuplicates("ddhheerajj");
    }

}
