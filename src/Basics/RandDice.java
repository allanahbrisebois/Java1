package Basics;


public class RandDice {
    public static void main(String[] args){
        int dice1 = (int)(Math.random() *6 +1);
        int dice2 = (int)(Math.random() *6 +1);
        
        if(dice1 == dice2){
            System.out.println("You win!!! Dice1 = " + dice1 + " Dice 2 =" + dice2);
        }else{
            System.out.println("Loserrrr! Dice1 = " + dice1 + " Dice 2 =" +dice2);
        }
    }
}
