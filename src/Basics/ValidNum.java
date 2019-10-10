package Basics;

import java.util.Scanner;

public class ValidNum {
      public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          
          System.out.println("Please enter a department number: ");
          int department = sc.nextInt();
          
          if(department <= 50 || department > 200){
          System.out.println("This is a valid department ID.");
            }else{
              System.out.println("This is not a valid department number.");
          }
      }
}
