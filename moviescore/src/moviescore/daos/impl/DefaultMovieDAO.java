package moviescore.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import moviescore.daos.MovieDAO;
import moviescore.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component(value = "movieDAO")
public class DefaultMovieDAO implements MovieDAO {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<MovieModel> findMovie() {
        // Build a query for the flexible search.
        final String queryString = //
                "SELECT {p:" + MovieModel.PK + "} "//
                        + "FROM {" + MovieModel._TYPECODE + " AS p} ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        return flexibleSearchService.<MovieModel>search(query).getResult();
    }

    @Override
    public List<MovieModel> findMoviesByYear(final String year) {
        String SEARCH_BY_RELEASE_YEAR = "SELECT {p:" + MovieModel.PK + "} "//
                + "FROM {" + MovieModel._TYPECODE + " AS p} WHERE { " + MovieModel.RELEASEYEAR + " } >= ?startDate "
                + " AND {" + MovieModel.RELEASEYEAR + "} <= ?endDate";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date startDate = sdf.parse(String.format("%s-01-01 00:00:00", year));
            Date endDate = sdf.parse(String.format("%s-12-31 23:59:59", year));
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_RELEASE_YEAR);
            query.addQueryParameter("startDate", startDate);
            query.addQueryParameter("endDate", endDate);
            return flexibleSearchService.<MovieModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }
    @Override
    public List<MovieModel> findMoviesByName(final String name) {
        String SEARCH_BY_NAME = "SELECT {p:" + MovieModel.PK + "} "//
                + "FROM {" + MovieModel._TYPECODE + " AS p} WHERE { " + MovieModel.NAME + " } = ?name ";

        try {
            final FlexibleSearchQuery query = new FlexibleSearchQuery(SEARCH_BY_NAME);
            query.addQueryParameter("name", name);
            return flexibleSearchService.<MovieModel>search(query).getResult();
        } catch (Exception ex) {
            //
        }
        return null;
    }
}