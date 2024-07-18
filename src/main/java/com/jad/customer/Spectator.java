package com.jad.customer;

import com.jad.show.IShow;

public class Spectator implements ISpectator {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

       @Override
    public void watch(final IShow show) {
        show.accept(new IShowVisitor() {
            @Override
            public void visit(MovieShow movieShow) {
                System.out.println("J'ai assisté au film " + movieShow.getName() + " de " + movieShow.getDirector() + " sorti en " + movieShow.getYearOfRelease());
            }

            @Override
            public void visit(TheaterShow theaterShow) {
                System.out.println("J'ai assisté à la pièce de théâtre " + theaterShow.getName() + " de " + theaterShow.getDirector() + ". Il y avait : " + String.join(", ", theaterShow.getActors()));
            }

            @Override
            public void visit(StreetShow streetShow) {
                System.out.println("J'ai assisté au spectacle de rue " + streetShow.getName() + ". Il y avait : " + String.join(", ", streetShow.getPerformers()));
            }

            @Override
            public void visit(ConcertShow concertShow) {
                System.out.println("J'ai assisté au concert " + concertShow.getName() + " de " + concertShow.getArtist());
            }
        });
    }
}
