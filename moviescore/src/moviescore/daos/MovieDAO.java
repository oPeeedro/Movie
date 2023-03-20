package moviescore.daos;

import moviescore.model.MovieModel;

import java.util.List;

public interface MovieDAO {
    List<MovieModel> findMovie();
    List<MovieModel> findMoviesByYear(String year);
    List<MovieModel> findMoviesByName(String name);
}
