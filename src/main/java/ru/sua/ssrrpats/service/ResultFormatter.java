package ru.sua.ssrrpats.service;

import ru.sua.ssrrpats.domain.ParsingResult;

public interface ResultFormatter {
    String format2text(ParsingResult parsingResult);
}
