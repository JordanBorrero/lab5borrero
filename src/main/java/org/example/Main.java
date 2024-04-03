/** Project:Lab5Borrero
 * Purpose Details: Main class that converts English String to new alphabet, displays hash value, uses Caesar Cipher to perform 5 character shift, and writes brute force for all 25 shifts of new alphabet string
 * Course:IST 242
 * Author: Jordan Borrero
 * Date Developed: 3/24/24
 * Last Date Changed: 3/31/24
 * Rev:1

 */
package org.example;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
// Prompt user for English string
        System.out.print("Enter English string to convert to custom alphabet: ");
        String englishString = scanner.nextLine().toUpperCase();
// Convert English string to custom alphabet string
        String customAlphabetString = AlphabetConverter.convertToCustom(englishString);
        System.out.println("String in custom alphabet: " + customAlphabetString);
// Convert custom alphabet string back to English
        String originalEnglishString = AlphabetConverter.convertFromCustom(customAlphabetString);
        System.out.println("String converted back to English: " + originalEnglishString);
        try {
// Hash custom alphabet string using SHA-256
            String hashedString = HashGenerator.hashString(customAlphabetString);
            System.out.println("SHA-256 Hash of custom alphabet string: " + hashedString);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: SHA-256 algorithm not available.");
        }
// Encrypt original English string with Caesar cipher using a 5-character shift
        java.lang.String encryptedString = CeasarCipher.encrypt(englishString, 5);
        System.out.println("Caesar Cipher encrypted string: " + encryptedString);
// Decrypt Caesar cipher encrypted string
        String decryptedString = CeasarCipher.decrypt(encryptedString, 5);
        System.out.println("Caesar Cipher decrypted string: " + decryptedString);
// Brute force decryption of Caesar cipher encrypted string
        System.out.println("Brute force decryption:");
        CeasarCipher.bruteForceDecrypt(encryptedString);
        scanner.close();
    }
}