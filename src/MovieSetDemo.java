import java.util.HashSet;
import java.util.Set;

public class MovieSetDemo {
    public static void main(String[] args) {
        Set<String> movieNames = new HashSet<>();

        //add 5 movie names
        movieNames.add("Inception");
        movieNames.add("The Matrix");
        movieNames.add("Interstellar");
        movieNames.add("Avengers: Endgame");
        movieNames.add("The Dark Knight");

        //Display all movie names
        System.out.println("Initial movies: " + movieNames);

        //Try to add duplicate movie name
        movieNames.add("Inception");

        //Display after duplicate
        System.out.println("After duplicate Inception: " + movieNames);
        
        /*==================
        contains(): check if movie exists
        ==================*/
        System.out.println("Inception exists: " + movieNames.contains("Inception"));
        System.out.println("Titanic exists: " + movieNames.contains("Titanic"));

        //remove one movie name
        movieNames.remove("The Matrix");

        //Display after remove
        System.out.println("After remove The Matrix: " + movieNames);
        
        /*==================
        size(): total movie count
        ==================*/
        System.out.println("Total movies: " + movieNames.size());

        //clear all movie names
        movieNames.clear();

        //Display after clear
        System.out.println("After clear: " + movieNames);
        
        /*=================
        clear(): remove all movies
        size(): confirm empty
        ==================*/
        System.out.println("Final size: " + movieNames.size());
    }
}