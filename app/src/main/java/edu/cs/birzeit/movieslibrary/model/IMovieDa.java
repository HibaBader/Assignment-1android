package edu.cs.birzeit.movieslibrary.model;

import java.util.ArrayList;
import java.util.List;

public interface IMovieDa {
     List <Movie> getMovies(String key);
     List <Movie> getMoviesByType(String type);
    String[] getTypes();

}
