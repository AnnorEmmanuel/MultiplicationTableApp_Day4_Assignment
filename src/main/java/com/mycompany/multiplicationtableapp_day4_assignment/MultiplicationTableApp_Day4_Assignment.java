/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multiplicationtableapp_day4_assignment;

import java.util.Scanner;

/**
 *
 * @author Alien
 */
public class MultiplicationTableApp_Day4_Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n\nEner a number\nOr press 'A' to exit");
            String input = scanner.nextLine();
            
            //A means to break out of the loop by pressing A
            if(input.equals("a") || input.equals("A")){
                break;
            }
            
            //Checking wheter user entered a valid number
            if (input.matches("[0-9]+")) {
                int num = Integer.parseInt(input);
                for (int i = 1; i <= 10; i++) {
                    int answer = num * i;
                    System.out.println(num + " × " + i + " = " + answer);
                }
            } else {
                System.out.println("Please provide a valid value\n\n");
            }
        }

    }
}
