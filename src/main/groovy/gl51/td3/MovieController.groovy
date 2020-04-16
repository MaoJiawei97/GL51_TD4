package gl51.td3

import gl51.td3.movie.service.MovieRegistry
import gl51.td3.data.MovieRequest
import gl51.td3.movie.data.Movie
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Post

import javax.inject.Inject

@Controller("/movie")



class MovieController {
    @Inject
    MovieRegistry registry

    @Get("/")
    List<Movie> index() {
        []
    }
    @Post('/')
    HttpStatus addMovie(MovieRequest movieRequest) {
        registry.addMovieToFavorites(movieRequest.getImdbID())
        HttpStatus.CREATED
    }

}