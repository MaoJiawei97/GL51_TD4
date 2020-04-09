package gl51.td3.movie.service
import gl51.td3.movie.data.Movie


interface MovieRegistry {

    /**

     * adds a film to favorites

     * @param imdbID the id of the film

     */

    void addMovieToFavorites(String imdbID)
    /**
     * return a list of my movies with their details
     * @return
     */

    List<Movie> listFavorites()

}
