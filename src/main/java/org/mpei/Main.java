package org.mpei;

import java.util.Scanner;

public class Main {
    static char oper;


    public static void main(String[] args) {
        boolean flag = true;
        while (flag==true) {
            System.out.println("Введите выражение: ");
            Scanner strScan = new Scanner(System.in);
            String input = strScan.nextLine();

            String[] inputSplited = input.split("");

            String stringNum1 = "";
            String stringNum2 = "";
            String stringOper = "";
            for (String ch : inputSplited) {
                if ((ch.equals("+")) | ch.equals("-") | ch.equals("*") | ch.equals("/")) {
                    stringOper = ch;

                } else {
                    if (stringOper == "") {
                        stringNum1 += ch;
                    } else {
                        stringNum2 += ch;
                    }
                }
            }
            int j = 2;//проверим корректность ввода и определим, в какой системе счисления ввод
            if ((NumberIdentifier.isRomanNumber(stringNum1) == true) & (NumberIdentifier.isRomanNumber(stringNum2) == true)) {
                j = 0;

            } else if ((NumberIdentifier.isArabicNumber(stringNum1) == true) & (NumberIdentifier.isArabicNumber(stringNum2) == true)) {
                j = 1;
            } else {
                System.out.println("Я не хочу так работать. Введите корректно или в арабских, или в римских символах: ");
                flag = false;
            }

            if ((stringOper.equals("+")) & (j == 0)) {
                System.out.println("Ваш ответ: " + RomanCalcs.addition(stringNum1, stringNum2));
            } else if ((stringOper.equals("-")) & (j == 0)) {
                System.out.println("Ваш ответ: " + RomanCalcs.subtraction(stringNum1, stringNum2));
            } else if ((stringOper.equals("*")) & (j == 0)) {
                System.out.println("Ваш ответ: " + RomanCalcs.multiplication(stringNum1, stringNum2));
            } else if ((stringOper.equals("/")) & (j == 0)) {
                System.out.println("Ваш ответ: " + RomanCalcs.division(stringNum1, stringNum2));
            }

            if ((stringOper.equals("+")) & (j == 1)) {
                System.out.println("Ваш ответ: " + ArabicCalcs.addition(stringNum1, stringNum2));
            } else if ((stringOper.equals("-")) & (j == 1)) {
                System.out.println("Ваш ответ: " + ArabicCalcs.subtraction(stringNum1, stringNum2));
            } else if ((stringOper.equals("*")) & (j == 1)) {
                System.out.println("Ваш ответ: " + ArabicCalcs.multiplication(stringNum1, stringNum2));
            } else if ((stringOper.equals("/")) & (j == 1)) {
                System.out.println("Ваш ответ: " + ArabicCalcs.division(stringNum1, stringNum2));
            }
        }

    }

}
