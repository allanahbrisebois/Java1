package ObjectPrac;

/**
 *
 * @author lanab
 */
public class Human {
    String name;
    int age;
    int height;
    String eyeColor;
    
    public Human(){
        
    }
    
    //method
    public void speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am "+height + "inches");
        System.out.println("I am " + age + "years old");
        System.out.println("My eye colour is "+ eyeColor);
        
    }
    
    public void eat(){
        System.out.println("Eating..");
    }
    
    public void walk(){
        System.out.println("Walking..");
    }
    public void work(){
        System.out.println("Working.. ");
    }
}
