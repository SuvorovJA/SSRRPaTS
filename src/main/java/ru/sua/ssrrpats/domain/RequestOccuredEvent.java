package ru.sua.ssrrpats.domain;

import org.springframework.context.ApplicationEvent;

public class RequestOccuredEvent extends ApplicationEvent {

    private ParsingResult parsingResult;

    public RequestOccuredEvent(Object source, ParsingResult message) {
        super(source);
        this.parsingResult = message;
    }

    public ParsingResult getMessage() {
        return parsingResult;
    }
}