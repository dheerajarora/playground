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
package org.drjkrsna.util;

import java.util.Date;

/**
 * The Class TimeComplexity.
 *
 * @author <a href="mailto:dheeraj6188@gmail.com">Dheeraj Arora</a>
 */
public class TimeComplexity {

    /**
     * Checks if is prime a.
     *
     * @param number the number
     */
    public static void isPrimeA(final long number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                System.out.println("Number " + number + " is not prime.");
                break;
            }
        }
        System.out.println("Number " + number + " is prime.");
    }

    /**
     * Checks if is prime b.
     *
     * @param number the number
     */
    public static void isPrimeB(final long number) {
        final long sqrt = (long) Math.sqrt(number);
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                System.out.println("Number " + number + " is not prime.");
                break;
            }
        }
        System.out.println("Number " + number + " is prime.");
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        System.out.println("Start time of method B: " + new Date());
        isPrimeB(203993941);
        System.out.println("End time of method B: " + new Date());
        System.out.println("\n\n");
        System.out.println("Start time of method A: " + new Date());
        isPrimeA(203993941);
        System.out.println("End time of method A: " + new Date());
    }

}
