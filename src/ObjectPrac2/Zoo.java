package ObjectPrac2;

/**
 *
 * @author lanab
 */
public class Zoo {
    public static void main(String[] args){
        
        System.out.println("Lion info: ");
        Animal lion = new Animal(12, "Male", 50);
        lion.eat();
        
        System.out.println("Bird info: ");
        Bird bird1 = new Bird(3, "Female", 2);
        bird1.eat();
        bird1.sleep();
        bird1.fly();
        
    }
}
