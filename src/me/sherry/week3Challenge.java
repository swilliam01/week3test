package me.sherry;

import java.util.Scanner;


public class week3Challenge {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int x = (keyboard.nextInt());
        int counter = x + 1;

            while (counter > 1)
            { counter = counter -1;
            }
            if  (counter % 5 ==0) {
                System.out.println(counter);
            }
            else if (counter % 7 == 0)
                { System.out.println(counter);
                }

        { System.out.println(counter);
        }
        String input = ("");
       String yesNo = ("");

         System.out.println("Would you like to enter another number (y/n) ? ");
            System.out.println();
            yesNo = keyboard.nextLine();

            System.out.println("Enter a number :");

            System.out.println("Thank you for playing !");


        }



    }




