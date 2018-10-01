/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celsiustofahrenheit;

/**
 *
 * @author Megan
 */

import java.util.Scanner;
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        int tempc, tempf;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the tempurature in Celsius: ");
        tempc = keyboard.nextInt();

        tempf = (9/5)*tempc + 32;
        
        System.out.println("The tempurature in degrees fahrenheit is: " + tempf);
    }

}
