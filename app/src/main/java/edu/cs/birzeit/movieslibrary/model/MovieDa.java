package edu.cs.birzeit.movieslibrary.model;


import java.util.ArrayList;
import java.util.List;

class MovieDa implements IMovieDa {

    private ArrayList<Movie> movies = new ArrayList<>();
    public MovieDa(){
        movies.add(new Movie("Mulan", "Action","2020"));
        movies.add(new Movie("Tenet", "Action","2020"));
        movies.add(new Movie("Get Out", "Horror","2017"));
        movies.add(new Movie("The Irishman", "Drama","2019"));
        movies.add(new Movie("Knives out", "Comedy","2019"));
        movies.add(new Movie("The Social Network", "Drama","2010"));




    }
    public List<Movie> getMovies(String key){
        ArrayList<Movie>data=new ArrayList<>();
        for(Movie m:movies){
            if(m.getTitle().contains(key) || m.getYear().equals(key)){
                data.add(m);
            }
        }
        return data;
    }


    public List<Movie> getMoviesByType(String type) {
        ArrayList<Movie>data=new ArrayList<>();
        for(Movie m:movies){
            if(m.getType().equals(type)){
                data.add(m);
            }
        }
        return data;

    }


    public String[] getTypes(){
        String[] types=new String[]{"Action","Horror","Drama","Comedy"};

        return types;

    }


}
