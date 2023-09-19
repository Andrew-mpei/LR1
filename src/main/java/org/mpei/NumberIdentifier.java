package org.mpei;

public class NumberIdentifier {

    public static boolean isArabicNumber(String number) {
        if (number.length() == 0) {
            return false;
        }

        char[] numberCharArray = number.toCharArray();

        for (char digit : numberCharArray) {
            if ((digit<'0')|(digit>'9')) {
                return false;
            }
        }
        return true;
    }
    public static boolean isRomanNumber(String number) {
        // Строка нулевая?
        if (number.length() == 0) {
            return false;
        }
        String[] numberSplited = number.split("");

        for (String digit : numberSplited) {
            if ((digit.equals("I")) | digit.equals("V") | digit.equals("X")) {

            } else {
                return false;
            }
        }
        return true;
    }
}


