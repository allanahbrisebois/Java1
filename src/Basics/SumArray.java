package Basics;


public class SumArray {
   public static void main(String[] args){
       int age[] = {21,16,86,22,55};
       int sum= 0;
       
       for(int counter = 0; counter < age.length; counter++){
           sum+=age[counter];
       }
       
       System.out.println("The sum of the ages is: " +sum);
   } 
}
