/** Project:Lab5Borrero
 * Purpose Details: Uses SHA256 to display hash value of alphabet string
 * Course:IST 242
 * Author: Jordan Borrero
 * Date Developed: 3/24/24
 * Last Date Changed: 3/31/24
 * Rev:1

 */
package org.example;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class HashGenerator {
    public static String hashString(String inputString) throws NoSuchAlgorithmException { // creates a hash value for alphabet string
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(inputString.getBytes());
        StringBuilder hashedString = new StringBuilder();
        for (byte b : hashBytes) {
            hashedString.append(String.format("%02x", b));
        }
        return hashedString.toString();
    }
}
