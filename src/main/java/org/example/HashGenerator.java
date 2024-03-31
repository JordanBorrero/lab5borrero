package org.example;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class HashGenerator {
    public static String hashString(String inputString) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(inputString.getBytes());
        StringBuilder hashedString = new StringBuilder();
        for (byte b : hashBytes) {
            hashedString.append(String.format("%02x", b));
        }
        return hashedString.toString();
    }
}
