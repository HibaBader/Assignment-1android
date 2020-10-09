package edu.cs.birzeit.movieslibrary.model;

public class Movie {
    private String title;
    private String typeOfMovie;
    private String Year;


    public Movie(String title, String typeOfMovie, String year) {
        title = title;
        typeOfMovie = typeOfMovie;
        Year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getType() {
        return typeOfMovie;
    }

    public void setType(String type) {
        typeOfMovie = typeOfMovie;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", typeOfMovie='" + typeOfMovie + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}
