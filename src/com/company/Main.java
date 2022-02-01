package com.company;
/*
* Quintin Amon
* Exercise 3
* 01 February 2022
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fToC();

    }
    static void fToC(){
        double fehr = userInput();
        double celsius = covertToCelsius(fehr);
        displayAll(fehr, celsius);
    }


    static double userInput(){
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter the degrees in Fahrenheit: ");
        double usrTemp = name.nextDouble();
        if (usrTemp < -460)
            System.exit(0);
        return usrTemp;
    }
    static double covertToCelsius(double a){
        double b = (a - 32) * 5.0/9;
        double bRounded = Math.round(b*100.0)/100.0;
        return bRounded;
    }
    static void displayAll(double f, double c){
        System.out.println(f+" degrees fahrenheit is equal to "+ c + " degrees Celsius");
        fToC();
    }
}
