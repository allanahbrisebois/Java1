package MethodParameters;

import java.util.Scanner;

public class apples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        tuna tunaObject = new tuna();
        
        System.out.println("Enter your name here:");
        String name = sc.nextLine();
        
        tunaObject.simpleMessage(name);
    }
}
