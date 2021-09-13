/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the input string?");
        String input = scanner.nextLine();

        scanner.close();

        // Challenge 1
        if(input.length() == 0)
            System.out.println("Please enter a valid string.");
        else
            System.out.println(input + " has " + input.length() + " characters.");
    }
}
