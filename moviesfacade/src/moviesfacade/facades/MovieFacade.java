package moviesfacade.facades;
import de.hybris.platform.core.model.media.MediaModel;
import moviesfacade.data.MovieData;

import java.util.Collection;
import java.util.List;

public interface MovieFacade
{
    MovieData getMovie(String name);
    List<MovieData> getMovies();

    List<MovieData> getMovieByYear(String year);

    Collection<MediaModel> getMovieImage(String name);
}
