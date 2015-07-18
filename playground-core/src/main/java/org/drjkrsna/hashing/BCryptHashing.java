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
package org.drjkrsna.hashing;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * The Class BCryptHashing.
 *
 * @author <a href="mailto:dheeraj6188@gmail.com">Dheeraj Arora</a>
 */
public class BCryptHashing {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        SecureRandom saltGen = null;
        try {
            saltGen = SecureRandom.getInstance("SHA1PRNG");
        } catch (final NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        final String hashed = BCrypt.hashpw("Dheeraj", BCrypt.gensalt(5, saltGen));
        System.out.println("Hashed password: " + hashed);

        final boolean isMatched = BCrypt.checkpw("Dheeraj", "$2a$05$IYfRarp756ijW.lB/vM/yuep6pdlZoMunShuBeHhMvgVQk.C9NIB2");

        System.out.println(isMatched);
    }

}
