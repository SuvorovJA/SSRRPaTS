package ru.sua.ssrrpats.service;

import ru.sua.ssrrpats.domain.HistoryRecord;
import ru.sua.ssrrpats.domain.ParsingResult;

public interface HistoryRecordFab {
    HistoryRecord convert(ParsingResult parsingResult);
}
