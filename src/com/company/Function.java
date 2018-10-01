package com.company;

import javax.swing.*;
;

/**
 * Created by Daniel_D'AGE on 28.09.2018.
 */
public class Function {

    public boolean check(String input) {

        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;

        }
    }

    public void plnToDollar(double Minput) {

        double pln = Minput * 3.6;
        JOptionPane.showMessageDialog(null, "Wartość po dzisiejszym kursie: " + pln + " PLN.");

    }

    public void euroToDollar(double Minput) {

        double euro = Minput * 1.1606;
        JOptionPane.showMessageDialog(null, "Wartość po dzisiejszym kursie: " + euro + " euro.");

    }
}
