/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        System.out.println("What is your username?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("What is your password?");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.next();
        if(password.contentEquals("bigdog1234")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
