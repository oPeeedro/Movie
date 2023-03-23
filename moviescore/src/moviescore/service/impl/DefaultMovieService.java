package moviescore.service.impl;

import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import moviescore.daos.MovieDAO;
import moviescore.model.MovieModel;
import moviescore.service.MovieService;
import org.springframework.beans.factory.annotation.Required;

import java.util.Collection;
import java.util.List;

public class DefaultMovieService implements MovieService {
    private MovieDAO movieDAO;
    /**
     * Gets all bands by delegating to {@link MovieDAO#findMovie()} ()}.
     */
    @Override
    public List<MovieModel> getMovies()
    {
        return movieDAO.findMovie();
    }
    /**
     * Gets all bands for given year by delegating to {@link MovieDAO#findMoviesByYear(String)} and then assuring
     * uniqueness of result.
     */
    @Override
    public List<MovieModel> getMoviesByYear(final String year) throws AmbiguousIdentifierException, UnknownIdentifierException
    {
        final List<MovieModel> result = movieDAO.findMoviesByYear(year);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Movie with year '" + year + "' not found!");
        }
        return result;
    }

    @Override
    public MovieModel getMovieByYear(String year) throws AmbiguousIdentifierException, UnknownIdentifierException {
        final List<MovieModel> result = movieDAO.findMovieByYear(year);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Movie with year '" + year + "' not found!");
        }
        else if (result.size() > 1)
        {
            throw new AmbiguousIdentifierException("Movie year '" + year + "' is not unique, " + result.size() + " movies found!");
        }
        return result.get(0);
    }

    @Override
    public List<MovieModel> getMoviesUntilYear(final String year) throws AmbiguousIdentifierException, UnknownIdentifierException
    {
        final List<MovieModel> result = movieDAO.findMoviesUntilYear(year);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Movie with year '" + year + "' not found!");
        }
        return result;
    }
    @Override
    public  MovieModel getMovieByName(final String name) throws AmbiguousIdentifierException, UnknownIdentifierException{
        final List<MovieModel> result = movieDAO.findMoviesByName(name);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Movie with name '" + name + "' not found!");
        }
        else if (result.size() > 1)
        {
            throw new AmbiguousIdentifierException("Movie year '" + name + "' is not unique, " + result.size() + " movies found!");
        }
        return result.get(0);
    }
    public Collection<MediaModel> getMovieImage(final String name) throws AmbiguousIdentifierException, UnknownIdentifierException{
        final List<MovieModel> result = movieDAO.findMoviesByName(name);
        if (result.isEmpty())
        {
            throw new UnknownIdentifierException("Movie with name '" + name + "' not found!");
        }
        else if (result.size() > 1)
        {
            throw new AmbiguousIdentifierException("Movie year '" + name + "' is not unique, " + result.size() + " movies found!");
        }
        return result.get(0).getImageURL().getMedias();
    }
    @Required
    public void setMovieDAO(final MovieDAO MovieDAO)
    {
        this.movieDAO = MovieDAO;
    }
}
