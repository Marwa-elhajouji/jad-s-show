package com.jad.show;

public class TheaterShowHandler extends CreateShowHandler {
    @Override
    public IShow handleRequest(String showDescription) {
        if (showDescription.startsWith("THEATER:")) {
Ò            String[] parts = showDescription.split(";");
            String name = parts[0].split("=")[1];
            String description = parts[1].split("=")[1];
            String director = parts[2].split("=")[1];
            String[] actors = parts[3].split("=")[1].split(",");
            return new TheaterShow(name, description, director, actors);
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(showDescription);
        }
        return null;
    }
}
