package week9_inlab1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorter {
    public static void main(String[] args) {
     
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Pulp Fiction", 8.9, 1994));

        System.out.println("Movies before sorting by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies);

        System.out.println("\nMovies after sorting by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
