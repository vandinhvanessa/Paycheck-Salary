/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarypaycheck;

/**
 *
 * @author vvan
 */
public class MyFavoriteApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double john = calculateNetPay (7432, 11456.00, 0);
        double samuel = calculateNetPay (1971, 4500.00, 1);
        double sarah = calculateNetPay (58 ,9758.00, 1);
        double janet = calculateNetPay (2345, 2194.00, 0);
    }

    public static double calculateNetPay(int id, double gross, int status) {
        double g = gross;
        double fed;
        double state;
        double retire = g * .05;
        double health = g * .065;
        double net;
        int m = status;
        int i = id;

        if (m == 0) {
            if (gross < 2001) {
                fed = gross * .10;
                state = (g - fed) * .035;
                net = g - (fed - state - retire - health);
            System.out.println("Employee ID: " + i);
            System.out.println("Gross Amount: " + g);
            System.out.println("Federal Income Tax: " + fed);
            System.out.println("State Tax: " + state);
            System.out.println("Retirement plan: " + retire);
            System.out.println("Health Insurance: " + health);
            System.out.println("Net Salary: " + net);
            } else if (gross < 5000 && gross >= 2001) {
                fed = (2000 * .10) + ((gross - 2000) * .20);
                state = (g - fed) * .035;
                net = g - (fed - state - retire - health);
            System.out.println("Employee ID: " + i);
            System.out.println("Gross Amount: " + g);
            System.out.println("Federal Income Tax: " + fed);
            System.out.println("State Tax: " + state);
            System.out.println("Retirement plan: " + retire);
            System.out.println("Health Insurance: " + health);
            System.out.println("Net Salary: " + net);
            } else {
                fed = 800 + ((gross - 5000) * .30);
                state = (g - fed) * .035;
                net = g - (fed - state - retire - health);
            System.out.println("Employee ID: " + i);
            System.out.println("Gross Amount: " + g);
            System.out.println("Federal Income Tax: " + fed);
            System.out.println("State Tax: " + state);
            System.out.println("Retirement plan: " + retire);
            System.out.println("Health Insurance: " + health);
            System.out.println("Net Salary: " + net);
            }
            
        }
        if (m == 1) {
            if (gross < 4001) {
                fed = gross * .10;
                state = (g - fed) * .035;
                net = g - (fed - state - retire - health);
            System.out.println("Employee ID: " + i);
            System.out.println("Gross Amount: " + g);
            System.out.println("Federal Income Tax: " + fed);
            System.out.println("State Tax: " + state);
            System.out.println("Retirement plan: " + retire);
            System.out.println("Health Insurance: " + health);
            System.out.println("Net Salary: " + net);
            } else if (gross < 7000 && gross >= 4001) {
                fed = (4000 * .10) + ((gross - 4000) * .20);
                state = (g - fed) * .035;
                net = g - (fed - state - retire - health);
            System.out.println("Employee ID: " + i);
            System.out.println("Gross Amount: " + g);
            System.out.println("Federal Income Tax: " + fed);
            System.out.println("State Tax: " + state);
            System.out.println("Retirement plan: " + retire);
            System.out.println("Health Insurance: " + health);
            System.out.println("Net Salary: " + net);
            } else {
                fed = 1000 + ((gross - 7000) * .30);
                state = (g - fed) * .035;
                net = g - (fed - state - retire - health);
            System.out.println("Employee ID: " + i);
            System.out.println("Gross Amount: " + g);
            System.out.println("Federal Income Tax: " + fed);
            System.out.println("State Tax: " + state);
            System.out.println("Retirement plan: " + retire);
            System.out.println("Health Insurance: " + health);
            System.out.println("Net Salary: " + net);
            }
        }
        return g;
    }

}
//
