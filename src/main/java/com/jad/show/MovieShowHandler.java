package com.jad.show;

public class MovieShowHandler extends CreateShowHandler {
    @Override
    public IShow handleRequest(String showDescription) {
        if (showDescription.startsWith("MOVIE:")) {
            String[] parts = showDescription.split(";");
            String name = parts[0].split("=")[1];
            String description = parts[1].split("=")[1];
            String director = parts[2].split("=")[1];
            String yearOfRelease = parts[3].split("=")[1];
            MovieType movieType = MovieType.valueOf(parts[4].split("=")[1]);
            return new MovieShow(name, description, director, yearOfRelease, movieType);
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(showDescription);
        }
        return null;
    }
}
