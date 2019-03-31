package ru.sua.ssrrpats.service;

import ru.sua.ssrrpats.domain.ParsingResult;

public interface SearchService {
    ParsingResult search(String request);
}
