package Constructors;


public class tuna {
    private String girlName;
    
    //constructor method must be the same as the class name 
    public tuna(String name){
        girlName = name;
    }
    
    public void setName(String name){
        girlName = name;
    }
    
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf was %s", getName());    
    }
}
