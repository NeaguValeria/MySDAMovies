public class Main {

    public static void main(String[] args) {
        String moviesPath = "movies.txt";
        MyMoviesCollection myMoviesCollection = new MyMoviesCollection();
        myMoviesCollection.readMoviesFromFile(moviesPath);
        System.out.println(myMoviesCollection.movies.length);
        myMoviesCollection.showMovies();
        myMoviesCollection.sortMoviesByYear();
        System.out.println();
        myMoviesCollection.showMovies();
        myMoviesCollection.sortMoviesByDuration();
        myMoviesCollection.showMovies();
        System.out.println();
        myMoviesCollection.sortMoviesByScore();
        myMoviesCollection.showMovies();

    }
}
