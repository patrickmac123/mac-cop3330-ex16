package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 16 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is your age? ");
        String stringAge = scan.nextLine();
        int age = Integer.parseInt(stringAge);

        String msg = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(msg);


    }
}