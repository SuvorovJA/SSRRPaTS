package ru.sua.ssrrpats.dao;

import ru.sua.ssrrpats.domain.HistoryRecord;

import java.util.List;

public interface HistoryDao {
    int count();

    void insert(HistoryRecord record);

    List<HistoryRecord> getAll();
}
