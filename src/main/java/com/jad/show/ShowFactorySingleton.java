package com.jad.show;

public class ShowFactorySingleton {
    private static ShowFactorySingleton instance;
    private CreateShowHandler chain;

    private ShowFactorySingleton() {
        MovieShowHandler movieHandler = new MovieShowHandler();
        TheaterShowHandler theaterHandler = new TheaterShowHandler();
        StreetShowHandler streetHandler = new StreetShowHandler();
        ConcertShowHandler concertHandler = new ConcertShowHandler();

        movieHandler.setNextHandler(theaterHandler);
        theaterHandler.setNextHandler(streetHandler);
        streetHandler.setNextHandler(concertHandler);

        this.chain = movieHandler;
    }

    public static ShowFactorySingleton getInstance() {
        if (instance == null) {
            instance = new ShowFactorySingleton();
        }
        return instance;
    }

    public IShow makeShow(String showDescription) {
        return chain.handleRequest(showDescription);
    }
}
