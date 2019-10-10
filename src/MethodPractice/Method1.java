

package MethodPractice;


public class Method1 {
    public static void main(String[] args){
        sayHelloWorld();
        sayHelloWorld();
       
        
        sayHelloTo("Kayla");
        sayHelloTo("Michael");
        
       int x = returnFive();
       System.out.println(x);
    }
    
    static int returnFive(){
        return 5;
    }
    
    static void sayHelloTo(String name){   //void means no return value
        System.out.println("Hello " +name);
    }
    
    static void sayHelloWorld(){
        System.out.println("Hello world");
    }
}
