package com.jad.show;

public abstract class ShowFactory {
    public abstract MovieShow makeMovieShow(String name, String description, String director, String yearOfRelease, MovieType movieType);
    public abstract TheaterShow makeTheaterShow(String name, String description, String director, String... actors);
    public abstract StreetShow makeStreetShow(String name, String description, String... performers);
    public abstract ConcertShow makeConcertShow(String name, String description, String artist);
}
