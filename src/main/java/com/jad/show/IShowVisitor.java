package com.jad.show;

public interface IShowVisitor {
    void visit(MovieShow movieShow);
    void visit(TheaterShow theaterShow);
    void visit(StreetShow streetShow);
    void visit(ConcertShow concertShow);
}
