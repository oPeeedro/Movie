package moviescore.daos.impl;

import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import moviescore.daos.MovieDAO;
import moviescore.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component(value = "movieDAO")
public class DefaultMovieDAO implements MovieDAO {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    private static final String SELECT_CONSTANT = "SELECT {p:" + MovieModel.PK + "} FROM {" + MovieModel._TYPECODE + " AS p}";

    @Override
    public List<MovieModel> findMovie() {
        // Build a query for the flexible search.
        final String queryString = SELECT_CONSTANT;

        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        return flexibleSearchService.<MovieModel>search(query).getResult();
    }

    @Override
    public List<MovieModel> findMoviesByYear(final String year) {
        final  String SEARCH_BY_RELEASE_YEAR = SELECT_CONSTANT + "WHERE { " + MovieModel.RELEASEYEAR + " } =releaseYear ? ";

        try {
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_RELEASE_YEAR);
            query.addQueryParameter("releaseYear", year);
            return flexibleSearchService.<MovieModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }


    @Override
    public List<MovieModel> findMoviesByName(final String name) {
        String SEARCH_BY_NAME = SELECT_CONSTANT + " WHERE { " + MovieModel.NAME + " } = ?name ";

        try {
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_NAME);
            query.addQueryParameter("name", name);
            return flexibleSearchService.<MovieModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }
    @Override
    public List<MovieModel> findMoviesUntilYear(final String year) {
        String SEARCH_BY_NAME = SELECT_CONSTANT + " WHERE { " + MovieModel.RELEASEYEAR + " } <= ?year ";

        try {
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_NAME);
            query.addQueryParameter("year", year);
            return flexibleSearchService.<MovieModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }

    @Override
    public Collection<MediaModel> findMediaByMovieName(final String name) {
        String SEARCH_BY_NAME = SELECT_CONSTANT + " WHERE { " + MovieModel.NAME + " } = ?name ";

        try {
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_NAME);
            query.addQueryParameter("name", name);
            return flexibleSearchService.<MediaModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }

    @Override
    public List<MovieModel> findMovieByYear(String year) {
        String SEARCH_BY_NAME = SELECT_CONSTANT + " WHERE { " + MovieModel.RELEASEYEAR + " } = ?year ";

        try {
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_NAME);
            query.addQueryParameter("year", year);
            return flexibleSearchService.<MovieModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }
}