package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseString {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(ReverseString.class.getName());

        logger.log(Level.INFO, () -> reverseWithJavaAPI("Gilson"));
        logger.log(Level.INFO, () -> reverseWithLoop("Silva"));
        logger.log(Level.INFO, () -> reverseWithSwap("Gabriel"));
    }

    private static String reverseWithJavaAPI(final String valeu) {
        return new StringBuffer(valeu).reverse().toString();
    }

    private static String reverseWithLoop(final String valeu) {
        final var reversed = new StringBuilder();

        for (int i = valeu.length() - 1; i >= 0; i--) {
            reversed.append(valeu.charAt(i));
        }

        return reversed.toString();
    }

    private static String reverseWithSwap(final String valeu) {
        final var arrayReversed = valeu.toCharArray();
        final var lastIndex = valeu.length() - 1;

        for (int i = 0; i < valeu.length() / 2; i++) {
            arrayReversed[i] = valeu.charAt(lastIndex - i);
            arrayReversed[lastIndex - i] = valeu.charAt(i);
        }

        return String.valueOf(arrayReversed);
    }
}
