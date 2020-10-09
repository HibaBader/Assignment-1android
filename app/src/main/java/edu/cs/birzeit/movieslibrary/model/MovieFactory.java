package edu.cs.birzeit.movieslibrary.model;

public class MovieFactory {
    public IMovieDa getModel(){
        return new MovieDa();
    }
}
