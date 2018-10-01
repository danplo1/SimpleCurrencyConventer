package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Function function = new Function();
        Object[] option1 = {"$$", "EUR", "Quit"};
        Object[] option2 = {"Spróbuj ponownie", "Quit"};


        while (true) {
            String input = JOptionPane.showInputDialog(null, "Wpisz wartość: ");
            System.out.println(input);


            if (function.check(input) == true) {
                double Minput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Wybierz walutę, którą chcesz " +
                                "przekonwertować: ", "Przelicznik walut", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                if (choice1 == 0) {

                    function.plnToDollar(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "Co chcesz zrobić ?",
                            "Przelicznik walut", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, option2, option2[1]);

                } else if (choice1 == 1) {
                    function.euroToDollar(Minput);

                } else {
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Niepoprawne dane wyjściowe!");
                int choice2 = JOptionPane.showOptionDialog(null, "Co chcesz zrobić ?",
                        "Przelicznik walut", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, option2, option2[1]);

                if (choice2 == 0) {

                } else {
                    break;
                }
            }

        }


    }
}
