

package MethodPractice;


public class PersonTest {
    public static void main(String[] args){
        Person bob = new Person();
        
        bob.setName("Bob");
        bob.setAge(32);
        
        System.out.println("Hi my name is " +bob.getName());
        System.out.println("My age is " +bob.getAge());
    }
}
