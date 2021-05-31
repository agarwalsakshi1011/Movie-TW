
import java.util.*;

class Movie{
    private String title;
    private String studio;
    private String rating;
    Movie(String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public String getTitle(){
        return this.title;
    }
    public static ArrayList<Movie> getPG(Movie[] movie){
        ArrayList<Movie> pgRatedMovies = new ArrayList<Movie>();
        for(int i=0;i<movie.length;i++)
            if(movie[i].rating.contains("PG"))
                pgRatedMovies.add(movie[i]);
        return pgRatedMovies;
    }
}
public class Main {

    public static void main(String[] args) {
        Movie movies[] = new Movie[4];
        movies[0] = new Movie("Casino Royale","Eon Productions","PG-13");
        movies[1] = new Movie("Avengers","Animation Studio","UA");
        movies[2] = new Movie("Wall Street","ThirdEye Productions","PG-13");
        movies[3] = new Movie("Titanic","XYZ Productions","PG");
        ArrayList<Movie> pgRatedMovies = new ArrayList<Movie>();
        pgRatedMovies = Movie.getPG(movies);
        System.out.println("PG movies: ");
        for(int i=0;i<pgRatedMovies.size();i++)
            System.out.println(pgRatedMovies.get(i).getTitle());
    }
}