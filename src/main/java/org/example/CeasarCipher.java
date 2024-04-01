/** Project:Lab5Borrero
 * Purpose Details: Class encrypts and decrypts string of character in Ceasar Cipher, Brute Force shown for all 25 shifts
 * Course:IST 242
 * Author: Jordan Borrero
 * Date Developed: 3/24/24
 * Last Date Changed: 3/31/24
 * Rev:1

 */
package org.example;
public class CeasarCipher {
    public static String encrypt(String plaintext, int shift) { //encrypts message in Caesar Cipher
        StringBuilder encryptedText = new StringBuilder();
        for (char character : plaintext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'A' : 'A';
                int originalAlphabetPosition = character - base;
                int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                char newCharacter = (char) (base + newAlphabetPosition);
                encryptedText.append(newCharacter);
            } else {
                encryptedText.append(character);
            }
        }
        return encryptedText.toString();
    }
    public static String decrypt(String encryptedText, int shift) { // decrypts message
        StringBuilder decryptedText = new StringBuilder();
        for (char character : encryptedText.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'A' : 'A';
                int originalAlphabetPosition = character - base;
                int newAlphabetPosition = (originalAlphabetPosition - shift + 26) % 26;
                char newCharacter = (char) (base + newAlphabetPosition);
                decryptedText.append(newCharacter);
            } else {
                decryptedText.append(character);
            }
        }
        return decryptedText.toString();
    }
    public static void bruteForceDecrypt(String encryptedText) { //writes brute force for all 25 character shifts
        for (int shift = 0; shift < 26; shift++) {
            StringBuilder decryptedText = new StringBuilder();
            for (char character : encryptedText.toCharArray()) {
                if (Character.isLetter(character)) {
                    int originalPosition = Character.toUpperCase(character) - 'A';
                    int newPosition = (originalPosition - shift + 26) % 26;
                    char newCharacter = (char) ('A' + newPosition);
                    decryptedText.append(Character.isLowerCase(character) ? Character.toLowerCase(newCharacter) : newCharacter);
                } else {
                    decryptedText.append(character);
                }
            }
            System.out.println(shift + ": " + decryptedText);
        }
    }
}
