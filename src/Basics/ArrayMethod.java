package Basics;


public class ArrayMethod {
    public static void main(String[] args){
        int lana[] = {4, 5, 5, 6, 8};  
        change(lana);
        
        for(int y:lana)
            System.out.println(y);
    }
    
    public static void change(int x[]){
        for(int counter = 0; counter < x.length; counter++){
            x[counter]+=5;
        }
    }
}
