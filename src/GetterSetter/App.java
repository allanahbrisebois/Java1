package GetterSetter;

public class App {
    public static void main(String[] args){
        Movie movie1 = new Movie("The Avengers", "Joss Whedon", "PG-13");
        Movie movie2 = new Movie("Step Brothers", "Adam McKay", "R");
        
        // doesn't work anymore because private 
        //movie1.rating = "PG";
        //to change rating, must use .setRating
        movie2.setRating("PG");
                
        
        //public variable way to access 
       // System.out.println(movie2.director);
        //with private variables, it can be accessed with get method
        System.out.println(movie2.getRating());
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getDirector());
    }
    
    
}
