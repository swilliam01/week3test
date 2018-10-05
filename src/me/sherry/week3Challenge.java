package me.sherry;

import java.util.Scanner;


public class week3Challenge {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int x = (keyboard.nextInt());
        int multiplesOf5;
        int multipleOf7;

        for ( int counter = x; counter>=10; counter--)
        {
            if (counter / 5 ==0)
            System.out.println(counter);
            System.out.println(counter-2);


        }


    }

        }



