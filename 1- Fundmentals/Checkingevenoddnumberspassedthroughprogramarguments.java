package com.amigoscode;

public class Checkingevenoddnumberspassedthroughprogramarguments {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("re run the program again");
        }else {
            for (String arg : args){
                try {
                    int number = Integer.parseInt(arg);
                    if (number == 0){
                        System.out.println("this number is zero");
                    }else if(number %2 == 0){
                        System.out.println("this number is an even number");
                    }else {
                        System.out.println("this number is an odd number");
                    }
                }catch (NumberFormatException e){
                    System.out.println(arg + " is not a valid number");
                }

            }
        }
    }
}
