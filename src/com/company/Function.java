package com.company;

import javax.swing.*;
;

/**
 * Created by Daniel_D'AGE on 28.09.2018.
 */
public class Function {

    public boolean check(Double input) {

        try {
            double x = input;
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;

        }
    }

    public void plnToDollar(double input) {

        double pln = input * 3.6;
        JOptionPane.showMessageDialog(null, "Wartośc po dzisiejszym kursie: " + pln + " PLN.");

    }

    public void euroToDollar(double input) {

        double euro = input * 1.1606;
        JOptionPane.showMessageDialog(null, "Wartośc po dzisiejszym kursie: " + euro + " euro.");

    }
}
