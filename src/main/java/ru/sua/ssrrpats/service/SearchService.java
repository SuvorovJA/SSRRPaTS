package ru.sua.ssrrpats.service;

import ru.sua.ssrrpats.domain.ParsingResult;

import java.io.IOException;

public interface SearchService {
    ParsingResult search(String request) throws IOException;
}
