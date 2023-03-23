package moviescore.daos;

import de.hybris.platform.core.model.media.MediaModel;
import moviescore.model.MovieModel;

import java.util.Collection;
import java.util.List;

public interface MovieDAO {
    List<MovieModel> findMovie();
    List<MovieModel> findMoviesByYear(String year);
    List<MovieModel> findMoviesByName(String name);

    List<MovieModel> findMoviesUntilYear(String year);

    Collection<MediaModel> findMediaByMovieName(String name);

    List<MovieModel> findMovieByYear(String year);
}
