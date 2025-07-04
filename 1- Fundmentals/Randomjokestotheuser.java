package com.amigoscode;

import java.util.Random;
import java.util.Scanner;

public class Randomjokestotheuser {
    public static void main(String[] args) {

        String[] jokes = {"mara se3edy",
        "mara yabany",
        "mara atnen",
        "mara wa7ed hendy"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("Do you wana hear a joke : Yes/No");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("yes")){
                int randomnumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomnumber]);
            }else if (answer.equals("no")){
                break;
            }else {
                System.out.println("I dont understand you");
            }
        }
        scanner.close();
        System.out.println("Glad I made you happy");

    }
}
