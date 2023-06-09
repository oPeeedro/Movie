package moviescore.service;

import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import moviescore.model.MovieModel;

import java.util.Collection;
import java.util.List;

public interface MovieService {
    /**
     * Gets all bands in the system.
     *
     * @return all bands in the system
     */
    List<MovieModel> getMovies();
    /**
     * Gets the band for the given code.
     *
     * @throws de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException in case more then one band is found for the given code
     * @throws de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException   in case no band for the given code can be found
     */
    List<MovieModel> getMoviesByYear(String code);

    MovieModel getMovieByYear(String year) throws AmbiguousIdentifierException, UnknownIdentifierException;

    List<MovieModel> getMoviesUntilYear(String year) throws AmbiguousIdentifierException, UnknownIdentifierException;

    MovieModel getMovieByName(String name);
//    MovieModel getMoviesByYear(String year) throws AmbiguousIdentifierException, UnknownIdentifierException;


    Collection<MediaModel> getMovieImage(final String name);
}
