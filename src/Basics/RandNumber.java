package Basics;

import java.util.Random;

public class RandNumber {
    public static void main(String[] args){
        Random dice = new Random();
        int number;
        
        for(int counter = 1; counter <= 10; counter++){
            //1+ starts it at 1 instead of 0
            //(6) is the number it can go up to
            number = 1+ dice.nextInt(6);
            System.out.println(number);
        }
    }
}
