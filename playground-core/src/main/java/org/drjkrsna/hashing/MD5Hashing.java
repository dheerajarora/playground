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

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The Class MD5Hashing.
 *
 * @author <a href="mailto:dheeraj6188@gmail.com">Dheeraj Arora</a>
 */
public class MD5Hashing {

    private static String getMD5Hash(final String originalPassword) {
        try {
            // Instantiating Message Digest
            final MessageDigest messageDigest = MessageDigest.getInstance("MD5");

            // Adding bytes to the digest
            messageDigest.update(originalPassword.getBytes());

            // Get the hash's bytes
            final byte[] bytes = messageDigest.digest();

            // Convert it to hexadecimal format
            final StringBuilder sb = new StringBuilder();
            for (final byte b : bytes) {
                System.out.println("Byte b: " + b);
                final String hexadecimalFormat = Integer.toString((b & 0xff) + 0x100, 16).substring(1);
                System.out.println("Hexadecimal Byte :" + hexadecimalFormat);
                sb.append(hexadecimalFormat);
            }
            // Get complete hashed password in hex format
            return sb.toString();

        } catch (final NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(final String[] args) {
        final String originalPassword = "Dheeraj";
        final String md5Hash = getMD5Hash(originalPassword);
        System.out.println("OriginalPassword is: " + originalPassword + " and corresponding MD5 Hash is: " + md5Hash);
    }
}
