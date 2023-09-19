package org.mpei;

public class ArabicCalcs extends Calculations{
    public static String addition(String num1, String num2) {
        String[] roman = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int k2 = 0;
        int k1 = 0;
        int ii = 0;
        while (ii < 10) {
            if (num1.equals(roman[ii])) {
                k1 = ii + 1;
            } else if (num2.equals(roman[ii])) {
                k2 = ii + 1;
            } else {
            }
            ii++;
        }
        return (String.valueOf(k1 + k2));
    }
    public static String subtraction(String num1, String num2) {
        String[] roman = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int k2 = 0;
        int k1 = 0;
        int ii = 0;
        while (ii < 10) {
            if (num1.equals(roman[ii])) {
                k1 = ii + 1;
            } else if (num2.equals(roman[ii])) {
                k2 = ii + 1;
            } else {
            }
            ii++;
        }
        return (String.valueOf(k1 - k2));
    }
    public static String multiplication(String num1, String num2) {
        String[] roman = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int k2 = 0;
        int k1 = 0;
        int ii = 0;
        while (ii < 10) {
            if (num1.equals(roman[ii])) {
                k1 = ii + 1;
            } else if (num2.equals(roman[ii])) {
                k2 = ii + 1;
            } else {
            }
            ii++;
        }
        return (String.valueOf(k1 * k2));
    }
    public static Double division(String num1, String num2) {
        String[] roman = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        double k2 = 0;
        double k1 = 0;
        int ii = 0;
        while (ii < 10) {
            if (num1.equals(roman[ii])) {
                k1 = Double.valueOf(ii + 1);
            } else if (num2.equals(roman[ii])) {
                k2 = Double.valueOf(ii + 1);
            } else {
            }
            ii++;
        }
        if (k2 != 0.0) {
            return (Double.valueOf(k1 / k2));
        } else {
            System.out.println("Деление на 0");
            return null;
        }
    }
}



