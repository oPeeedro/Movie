package moviesfacade.facades.impl;

import de.hybris.platform.core.model.product.ProductModel;
import java.util.ArrayList;
import java.util.List;

import moviescore.enums.MovieType;
import moviescore.model.MovieModel;
import moviescore.service.MovieService;
import moviesfacade.data.ExhibitionSummaryData;
import moviesfacade.data.MovieData;
import moviesfacade.facades.MovieFacade;
import org.springframework.beans.factory.annotation.Required;
import java.util.Locale;

public class DefaultMovieFacade implements MovieFacade
{
    private MovieService movieService;
    @Override
    public List<MovieData> getMovies()
    {
        final List<MovieModel> bandModels = movieService.getMovies();
        final List<MovieData> bandFacadeData = new ArrayList<>();
        for (final MovieModel sm : bandModels)
        {
            final MovieData sfd = new MovieData();
            sfd.setCode(sm.getCode());
            sfd.setName(sm.getName());
            sfd.setSynopsis(sm.getSynopsis());
            sfd.setReleaseYear(sm.getReleaseYear());
            bandFacadeData.add(sfd);
        }
        return bandFacadeData;
    }
    @Override
    public MovieData getMovie(final String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Band name cannot be null");
        }
        final MovieModel movie = movieService.getMovieByName(name);
        if (movie == null)
        {
            return null;
        }

        // Create a list of genres
        final List<String> genres = new ArrayList<>();
        if (movie.getTypes() != null)
        {
            for (final MovieType movieType : movie.getTypes())
            {
                genres.add(movieType.getCode());
            }
        }
        // Create a list of TourSummaryData from the matches
        final List<ExhibitionSummaryData> exhibitionHistory = new ArrayList<>();
        if (movie.getTickets() != null)
        {
            for (final ProductModel ticket : movie.getTickets())
            {
                final ExhibitionSummaryData summary = new ExhibitionSummaryData();
                summary.setId(ticket.getCode());
                summary.setName(ticket.getName(Locale.ENGLISH));
                // making the big assumption that all variants are concerts and ignore product catalogs
                summary.setNumberOfTickets(Integer.toString(ticket.getVariants().size()));
                exhibitionHistory.add(summary);
            }
        }
        // Now we can create the BandData transfer object
        final MovieData movieData = new MovieData();
        movieData.setCode(movie.getCode());
        movieData.setName(movie.getName());
        movieData.setReleaseYear(movie.getReleaseYear());
        movieData.setSynopsis(movie.getSynopsis());
        movieData.setTypes(genres);
        movieData.setPlace(exhibitionHistory);
        return movieData;
    }
    @Required
    public void setMovieService(final MovieService movieService)
    {
        this.movieService = movieService;
    }
}