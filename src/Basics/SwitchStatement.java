package Basics;


public class SwitchStatement {
    public static void main(String[] args){
        int age;
        age = 10;
        switch(age){
            case 1:
                System.out.println("You can crawl");
                break; //exits the switch statement
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get into trouble");
                break;
            default: // if no values are true
                System.out.println("I don't know how old you are. ");
                break;
        }
    }
}
