package ru.sua.ssrrpats.service;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;
import ru.sua.ssrrpats.dao.HistoryDao;
import ru.sua.ssrrpats.domain.RequestOccuredEvent;

@Service
@AllArgsConstructor
public class DatabaseHistoryArchiver implements ApplicationListener<RequestOccuredEvent> {

    private HistoryDao repository;
    private HistoryRecordFab recordFab;

    @Override
    public void onApplicationEvent(RequestOccuredEvent requestOccuredEvent) {
        repository.insert(recordFab.convert(requestOccuredEvent.getMessage()));
    }
}
