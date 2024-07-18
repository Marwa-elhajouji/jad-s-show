package com.jad.show;

public class ConcreteShowFactory extends ShowFactory {
    @Override
    public MovieShow makeMovieShow(String name, String description, String director, String yearOfRelease, MovieType movieType) {
        return new MovieShow(name, description, director, yearOfRelease, movieType);
    }

    @Override
    public TheaterShow makeTheaterShow(String name, String description, String director, String... actors) {
        return new TheaterShow(name, description, director, actors);
    }

    @Override
    public StreetShow makeStreetShow(String name, String description, String... performers) {
        return new StreetShow(name, description, performers);
    }

    @Override
    public ConcertShow makeConcertShow(String name, String description, String artist) {
        return new ConcertShow(name, description, artist);
    }
}
