package moviesfacade.facades;
import moviesfacade.data.MovieData;

import java.util.List;

public interface MovieFacade
{
    MovieData getMovie(String name);
    List<MovieData> getMovies();
}
