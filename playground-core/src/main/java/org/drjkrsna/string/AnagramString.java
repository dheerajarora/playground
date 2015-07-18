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

import java.util.Arrays;

/**
 * The Class AnagramString.
 *
 * @author <a href="mailto:dheeraj6188@gmail.com">Dheeraj Arora</a>
 */
public class AnagramString {

    /**
     * Checks if is anagram.
     *
     * @param string1 the string1
     * @param string2 the string2
     * @return true, if is anagram
     */
    private static boolean isAnagram(final String string1, final String string2) {
        if (string1 == null || string2 == null) {
            return false;
        }

        if (string1.length() != string2.length()) {
            return false;
        }

        final char[] string1CharArray = string1.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        final char[] string2CharArray = string2.toLowerCase().replaceAll("[\\s]", "").toCharArray();

        Arrays.sort(string1CharArray);
        Arrays.sort(string2CharArray);

        // return string1CharArray == string2CharArray;
        return Arrays.equals(string1CharArray, string2CharArray);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        System.out.println(AnagramString.isAnagram("dheeraj arora", "rroaj dhaaree"));
    }

}
