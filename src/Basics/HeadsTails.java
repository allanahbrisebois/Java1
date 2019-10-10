package Basics;

import java.util.Scanner;

public class HeadsTails {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double rand = (Math.random());
        
        if(rand<0.5){
            System.out.println("Heads " + rand);
        }else{
            System.out.println("Tails " + rand);
        }
    }
}
