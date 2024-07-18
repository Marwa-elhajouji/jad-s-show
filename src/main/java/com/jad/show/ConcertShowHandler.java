package com.jad.show;

public class ConcertShowHandler extends CreateShowHandler {
    @Override
    public IShow handleRequest(String showDescription) {
        if (showDescription.startsWith("CONCERT:")) {
            String[] parts = showDescription.split(";");
            String name = parts[0].split("=")[1];
            String description = parts[1].split("=")[1];
            String artist = parts[2].split("=")[1];
            return new ConcertShow(name, description, artist);
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(showDescription);
        }
        return null;
    }
}
