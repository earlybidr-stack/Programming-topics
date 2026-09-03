/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demomultipleinputs;

import java.util.Scanner;

/**
 *
 * @author CORESIS_CPE113
 */
//unlisted video youtube
public class DEMOMultipleInputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        while (option >= 0) {
            System.out.println("Hello Earl <3 the Great");
            String choice = input.next();
            if (choice.equals("A")) {
                System.out.println("Enter a String");
                String name1 = input.next();
                System.out.println("Enter a String");
                String name2 = input.next();
                String ans = name1 + name2;
                System.out.println("okay" + ans);
            } else if (choice.equals("B")) {
                System.out.println("Enter a String");
                String name1 = input.next();
                System.out.println("Enter a String");
                String name2 = input.next();
                String ans = name1 + name2;
                System.out.println("HAHA KYUT" + ans);
            } else if (choice.equals("C")) {
                System.out.println("whoihoohohowho");
            } else if (choice.equals("Exit")) {
                break;
            }
        }
    }
}
