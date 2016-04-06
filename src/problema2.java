/*
Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
int n = 20; //sau o alta valoare ; Sn=n(n+1):2  sir {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
 */

import javax.swing.*;

public class problema2 {
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void main(String[] args) {
        int n = readIntGUI("Introduceti un numar natural");
        int count=0;
        int sum = 0;

        do{
            sum = sum +count;
            count++;
            } while
                (count<=n);
        System.out.println("Suma primelor " + n + "numere naturale este: " + sum);

        }
    }

