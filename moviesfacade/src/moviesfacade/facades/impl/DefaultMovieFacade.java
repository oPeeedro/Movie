package moviesfacade.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import moviescore.model.MovieModel;
import moviescore.service.MovieService;
import moviesfacade.data.MovieData;
import moviesfacade.facades.MovieFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultMovieFacade implements MovieFacade
{
    private MovieService movieService;

    @Autowired
    private Converter<MovieModel, MovieData> movieConverter;
    @Override
    public List<MovieData> getMovies()
    {
        final List<MovieModel> movieModels = movieService.getMovies();
        return movieConverter.convertAll(movieModels);
    }
    @Override
    public MovieData getMovie(final String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Movie name cannot be null");
        }
        final MovieModel movie = movieService.getMovieByName(name);
        if (movie == null)
        {
            return null;
        }
       return movieConverter.convert(movie);
    }
    @Required
    public void setMovieService(final MovieService movieService)
    {
        this.movieService = movieService;
    }
}