package com.jad.show;

public abstract class CreateShowHandler {
    protected CreateShowHandler nextHandler;

    public void setNextHandler(CreateShowHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract IShow handleRequest(String showDescription);
}
