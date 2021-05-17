import java.util.InputMismatchException;
import java.util.Scanner;

//package com.example;
public class Hello {
    //private static final int number2 = 0;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Integer number1, number2;
        try{
            System.out.print("Enter a numeric value : ");
            number1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter a numeric value : ");
            number2 = scanner.nextInt();
            scanner.nextLine();
        } 
        catch(InputMismatchException e){
            System.out.print("format not matched");
            return;
        }
        
        System.out.print("Enter any operation(+,-,*,/) : ");
        //scanner.close();
        var operation = scanner.nextLine();
        Integer result;
        switch (operation){
            case "+":
                result = number1 + number2; 
                break;
            case "-":
                result= number1-number2;   
                break; 
            case "*":
                result= number1*number2; 
                break;
            case "/":
                result= number1/number2;
                break;
            default:
                System.out.println(" Operation is not matched");
                return ;
        }
        System.out.println(result);
    }
}