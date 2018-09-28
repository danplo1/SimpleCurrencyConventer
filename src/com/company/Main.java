package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // not finished

        Function function = new Function();

        double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Wpisz wartość: "));
        System.out.println(input);

        while(true){

            if(function.check(input)== true){
                function.plnToDollar(input);
                function.euroToDollar(input);
                break;

            }else{
                JOptionPane.showMessageDialog(null,"Niepoprawne dane wyjściowe! Spróbuj ponownie.");
            }

            }


    }
}
