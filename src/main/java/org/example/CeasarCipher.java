/** Project:Lab5Borrero
 * Purpose Details: Class encrypts and decrypts string of character in Ceasar Cipher, Brute Force shown for all 25 shifts
 * Course:IST 242
 * Author: Jordan Borrero
 * Date Developed: 3/24/24
 * Last Date Changed: 3/31/24
 * Rev:1

 */
package org.example;
import java.util.HashMap;
public class CeasarCipher {
    public static String encrypt(String plaintext, int shift) { //encrypts message in Caesar Cipher
        StringBuilder encryptedText = new StringBuilder();
        HashMap<Integer, String> customCodeMap = new HashMap<>();
        customCodeMap.put(1, "*"); customCodeMap.put(2, "&"); customCodeMap.put(3, "^");
        customCodeMap.put(4, "%"); customCodeMap.put(5, "$"); customCodeMap.put(6, "#");
        customCodeMap.put(7, "@"); customCodeMap.put(8, "!"); customCodeMap.put(9, "~");
        customCodeMap.put(10, "~!"); customCodeMap.put(11, "@#"); customCodeMap.put(12, "$%");
        customCodeMap.put(13, "^&"); customCodeMap.put(14, "*~"); customCodeMap.put(15, "!@");
        customCodeMap.put(16, "#@"); customCodeMap.put(17, "&$"); customCodeMap.put(18, "*!");
        customCodeMap.put(19, "%*"); customCodeMap.put(20, "%!"); customCodeMap.put(21, "~$");
        customCodeMap.put(22, "#*"); customCodeMap.put(23, "^#%"); customCodeMap.put(24, "*#@");
        customCodeMap.put(25, "#*$"); customCodeMap.put(26, "$*%^");
        for (char character : plaintext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'A' : 'A';
                int originalAlphabetPosition = character - base;
                int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                //char newCharacter = (char) (base + newAlphabetPosition);
                String newCharacter = customCodeMap.get (newAlphabetPosition + 1) + " ";
                encryptedText.append(newCharacter);
            } else {
                encryptedText.append(character);
            }
        }
        return encryptedText.toString();
    }
    public static String decrypt(String encryptedText, int shift) { // decrypts message
        StringBuilder decryptedText = new StringBuilder();
        HashMap<String, Integer> customToCharMap = new HashMap<>();
        customToCharMap.put("*", 1); customToCharMap.put("&", 2); customToCharMap.put("^", 3);
        customToCharMap.put("%", 4); customToCharMap.put("$", 5); customToCharMap.put("#", 6);
        customToCharMap.put("@", 7); customToCharMap.put("!", 8); customToCharMap.put("~", 9);
        customToCharMap.put("~!", 10); customToCharMap.put("@#", 11); customToCharMap.put("$%", 12);
        customToCharMap.put("^&", 13); customToCharMap.put("*~", 14); customToCharMap.put("!@", 15);
        customToCharMap.put("#@", 16); customToCharMap.put("&$", 17); customToCharMap.put("*!", 18);
        customToCharMap.put("%*", 19); customToCharMap.put("%!", 20); customToCharMap.put("~$", 21);
        customToCharMap.put("#*", 22); customToCharMap.put("^#%", 23); customToCharMap.put("*#@", 24);
        customToCharMap.put("#*$", 25); customToCharMap.put("$*%^", 26);

        HashMap<Integer, String> customCodeMap = new HashMap<>();
        customCodeMap.put(1, "*"); customCodeMap.put(2, "&"); customCodeMap.put(3, "^");
        customCodeMap.put(4, "%"); customCodeMap.put(5, "$"); customCodeMap.put(6, "#");
        customCodeMap.put(7, "@"); customCodeMap.put(8, "!"); customCodeMap.put(9, "~");
        customCodeMap.put(10, "~!"); customCodeMap.put(11, "@#"); customCodeMap.put(12, "$%");
        customCodeMap.put(13, "^&"); customCodeMap.put(14, "*~"); customCodeMap.put(15, "!@");
        customCodeMap.put(16, "#@"); customCodeMap.put(17, "&$"); customCodeMap.put(18, "*!");
        customCodeMap.put(19, "%*"); customCodeMap.put(20, "%!"); customCodeMap.put(21, "~$");
        customCodeMap.put(22, "#*"); customCodeMap.put(23, "^#%"); customCodeMap.put(24, "*#@");
        customCodeMap.put(25, "#*$"); customCodeMap.put(26, "$*%^");

        String[] letters = encryptedText.split(" ");
        for (String letter : letters) {
            int current = customToCharMap.get (letter);
            int after = (current - shift + 26) % 26;
            if (after == 0){
                String newCharacter1 = customCodeMap.get (26) + " ";
                decryptedText.append(newCharacter1);
            } else {
                String newCharacter = customCodeMap.get (after) + " ";
                decryptedText.append(newCharacter);
            }

        }
        return decryptedText.toString();

    }
    public static void bruteForceDecrypt(String encryptedText) { //writes brute force for all 25 character shifts
        HashMap<String, Integer> customToCharMap = new HashMap<>();
        customToCharMap.put("*", 1); customToCharMap.put("&", 2); customToCharMap.put("^", 3);
        customToCharMap.put("%", 4); customToCharMap.put("$", 5); customToCharMap.put("#", 6);
        customToCharMap.put("@", 7); customToCharMap.put("!", 8); customToCharMap.put("~", 9);
        customToCharMap.put("~!", 10); customToCharMap.put("@#", 11); customToCharMap.put("$%", 12);
        customToCharMap.put("^&", 13); customToCharMap.put("*~", 14); customToCharMap.put("!@", 15);
        customToCharMap.put("#@", 16); customToCharMap.put("&$", 17); customToCharMap.put("*!", 18);
        customToCharMap.put("%*", 19); customToCharMap.put("%!", 20); customToCharMap.put("~$", 21);
        customToCharMap.put("#*", 22); customToCharMap.put("^#%", 23); customToCharMap.put("*#@", 24);
        customToCharMap.put("#*$", 25); customToCharMap.put("$*%^", 26);

        HashMap<Integer, String> customCodeMap = new HashMap<>();
        customCodeMap.put(1, "*"); customCodeMap.put(2, "&"); customCodeMap.put(3, "^");
        customCodeMap.put(4, "%"); customCodeMap.put(5, "$"); customCodeMap.put(6, "#");
        customCodeMap.put(7, "@"); customCodeMap.put(8, "!"); customCodeMap.put(9, "~");
        customCodeMap.put(10, "~!"); customCodeMap.put(11, "@#"); customCodeMap.put(12, "$%");
        customCodeMap.put(13, "^&"); customCodeMap.put(14, "*~"); customCodeMap.put(15, "!@");
        customCodeMap.put(16, "#@"); customCodeMap.put(17, "&$"); customCodeMap.put(18, "*!");
        customCodeMap.put(19, "%*"); customCodeMap.put(20, "%!"); customCodeMap.put(21, "~$");
        customCodeMap.put(22, "#*"); customCodeMap.put(23, "^#%"); customCodeMap.put(24, "*#@");
        customCodeMap.put(25, "#*$"); customCodeMap.put(26, "$*%^");
        for (int shift = 0; shift < 26; shift++) {
            StringBuilder decryptedText = new StringBuilder();
            String[] letters = encryptedText.split(" ");
            for (String letter : letters) {
                int current = customToCharMap.get (letter);
                int after = (current - shift + 26) % 26;
                if (after == 0){
                    String newCharacter1 = customCodeMap.get (26) + " ";
                    decryptedText.append(newCharacter1);
                } else {
                    String newCharacter = customCodeMap.get (after) + " ";
                    decryptedText.append(newCharacter);
                }
            }

            System.out.println(shift + ": " + decryptedText);
        }
    }
}
