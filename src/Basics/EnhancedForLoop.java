package Basics;


public class EnhancedForLoop {
    public static void main(String[] args){
        int lana[] = {3,4,5,6,8};
        int total = 0;
        
        for(int x: lana){
            total+=x;
        }
        
        System.out.println(total);
    }
}
