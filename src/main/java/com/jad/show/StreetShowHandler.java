package com.jad.show;

public class StreetShowHandler extends CreateShowHandler {
    @Override
    public IShow handleRequest(String showDescription) {
        if (showDescription.startsWith("STREET:")) {
Ò            String[] parts = showDescription.split(";");
            String name = parts[0].split("=")[1];
            String description = parts[1].split("=")[1];
            String[] performers = parts[2].split("=")[1].split(",");
            return new StreetShow(name, description, performers);
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(showDescription);
        }
        return null;
    }
}
