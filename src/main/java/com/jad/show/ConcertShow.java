package com.jad.show;

public class ConcertShow extends Show {
    private final String artist;

     ConcertShow(final String name, final String description, final String artist) {
        super(name, description, ShowType.CONCERT);
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }
     public void accept(IShowVisitor visitor) {
        visitor.visit(this);
    }
}
