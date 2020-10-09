package edu.cs.birzeit.movieslibrary.model;

public class Movie {
    private String title;
    private String typeOfMovie;
    private String Year;


    public Movie(String title, String typeOfMovie, String year) {
        this.title = title;
        this.typeOfMovie = typeOfMovie;
        this.Year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return typeOfMovie;
    }

    public void setType(String type) {
        this.typeOfMovie = typeOfMovie;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
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