/** Project:Lab5Borrero
 * Purpose Details: Converts String of characters to a Custom Alphabet
 * Course:IST 242
 * Author: Jordan Borrero
 * Date Developed: 3/24/24
 * Last Date Changed: 3/31/24
 * Rev:1

 */
package org.example;
import java.util.HashMap;
public class AlphabetConverter {
    public static String convertToCustom(String text) { //Converts English String to custom alphabet using provided characters
        HashMap<Character, String> customCodeMap = new HashMap<>();
        customCodeMap.put('A', "*"); customCodeMap.put('B', "&"); customCodeMap.put('C', "^");
        customCodeMap.put('D', "%"); customCodeMap.put('E', "$"); customCodeMap.put('F', "#");
        customCodeMap.put('G', "@"); customCodeMap.put('H', "!"); customCodeMap.put('I', "~");
        customCodeMap.put('J', "~!"); customCodeMap.put('K', "@#"); customCodeMap.put('L', "$%");
        customCodeMap.put('M', "^&"); customCodeMap.put('N', "*~"); customCodeMap.put('O', "!@");
        customCodeMap.put('P', "#@"); customCodeMap.put('Q', "&$"); customCodeMap.put('R', "*!");
        customCodeMap.put('S', "%*"); customCodeMap.put('T', "%!"); customCodeMap.put('U', "~$");
        customCodeMap.put('V', "#*"); customCodeMap.put('W', "^#%"); customCodeMap.put('X', "*#@");
        customCodeMap.put('Y', "#*$"); customCodeMap.put('Z', "$*%^");
        StringBuilder morseCodeBuilder = new StringBuilder();
        text = text.toUpperCase();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morseCodeBuilder.append(" ");
            } else if (customCodeMap.containsKey(c)) {
                morseCodeBuilder.append(customCodeMap.get(c)).append(" ");
            }
        }
        return morseCodeBuilder.toString().trim();
    }
    public static String convertFromCustom(String text) { // Converts custom alphabet back to English
        HashMap<String, Character> customToCharMap = new HashMap<>();
        customToCharMap.put("*", 'A'); customToCharMap.put("&", 'B'); customToCharMap.put("^", 'C');
        customToCharMap.put("%", 'D'); customToCharMap.put("$", 'E'); customToCharMap.put("#", 'F');
        customToCharMap.put("@", 'G'); customToCharMap.put("!", 'H'); customToCharMap.put("~", 'I');
        customToCharMap.put("~!", 'J'); customToCharMap.put("@#", 'K'); customToCharMap.put("$%", 'L');
        customToCharMap.put("^&", 'M'); customToCharMap.put("*~", 'N'); customToCharMap.put("!@", 'O');
        customToCharMap.put("#@", 'P'); customToCharMap.put("&$", 'Q'); customToCharMap.put("*!", 'R');
        customToCharMap.put("%*", 'S'); customToCharMap.put("%!", 'T'); customToCharMap.put("~$", 'U');
        customToCharMap.put("#*", 'V'); customToCharMap.put("^#%", 'W'); customToCharMap.put("*#@", 'X');
        customToCharMap.put("#*$", 'Y'); customToCharMap.put("$*%^", 'Z');
        StringBuilder result = new StringBuilder();
        String[] letters = text.split(" "); // Split by space to get individual characters
        for (String letter : letters) {
            if (customToCharMap.containsKey(letter)) {
                result.append(customToCharMap.get(letter));
            }
        }
        return result.toString();
    }
}
