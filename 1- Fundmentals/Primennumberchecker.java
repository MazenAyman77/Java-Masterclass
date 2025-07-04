package com.amigoscode;

import java.util.Scanner;

public class Primennumberchecker {

    private static boolean primeNumberCheck(int number){
        if (number <=1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(number) ; i++){
            if (number %i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("please enter your number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (primeNumberCheck(input)){
            System.out.println("Your Number is Prime");
        }else {
            System.out.println("Your Number is Not Prime");
        }
    }
}
