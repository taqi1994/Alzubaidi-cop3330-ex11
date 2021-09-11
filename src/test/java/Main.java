/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */

import java.util.Scanner;

class to_exchange
{
    double currency;
    double rate;
    public void func1 ()
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner reader = new Scanner(System.in);

        this.currency = reader.nextDouble();

        System.out.print("What is the exchange rate? ");
        this.rate = reader.nextDouble();
    }

    public void func2()
    {
        double convert;

        System.out.println(currency+" euros at an exchange rate of "+rate+" is");
        convert = currency * rate;

        System.out.printf("%.2f U.S. dollars.",convert);
    }
}


public class Main
{
    public static void main(String args[])
    {

        to_exchange func = new to_exchange(); //calling functions:
        func.func1();
        func.func2();
    }
}