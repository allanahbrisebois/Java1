package Basics;

public class ArrayTable {
    public static void main(String[] args){
        System.out.println("Index\tValue"); //table header
        int lana[]={10, 44, 66, 34, 66};
        
        for(int counter = 0; counter <lana.length; counter++ ){
            System.out.println(counter + "\t" + lana[counter]);
        }
    }
}
