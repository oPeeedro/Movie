package moviescore.service;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import moviescore.model.MovieModel;

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
     * @throws de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException
     *            in case more then one band is found for the given code
     * @throws de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException
     *            in case no band for the given code can be found
     */
    MovieModel getMoviesByYear(String code);

    MovieModel getMovieByName(String name);
//    MovieModel getMoviesByYear(String year) throws AmbiguousIdentifierException, UnknownIdentifierException;
}
