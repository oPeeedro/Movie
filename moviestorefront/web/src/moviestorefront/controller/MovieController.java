package moviestorefront.controller;

import de.hybris.platform.catalog.CatalogVersionService;
import moviesfacade.data.MovieData;
import moviesfacade.facades.MovieFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller
public class MovieController{
    private static final String CATALOG_ID = "moviesProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";
    private CatalogVersionService catalogVersionService;
    private MovieFacade movieFacade;
    @RequestMapping(value = "/movies")
    public String showMovies(final Model model)
    {
        final List<MovieData> movies = movieFacade.getMovies();
        model.addAttribute("movies", movies);
        return "MovieList";
    }
    @RequestMapping(value = "/movies/{movieName}")
    public String showBandDetails(@PathVariable final String movieName, final Model model) throws UnsupportedEncodingException
    {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        final String decodedBandId = URLDecoder.decode(movieName, "UTF-8");
        final MovieData movie = movieFacade.getMovie(decodedBandId);
        model.addAttribute("movie", movie);
        return "MovieDetails";
    }
    @Autowired
    public void setCatalogVersionService(final CatalogVersionService catalogVersionServiceService)
    {
        this.catalogVersionService = catalogVersionServiceService;
    }
    @Autowired
    public void setFacade(final MovieFacade facade)
    {
        this.movieFacade = facade;
    }
}