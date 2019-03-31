package ru.sua.ssrrpats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sua.ssrrpats.config.AppParams;
import ru.sua.ssrrpats.domain.ParsingResult;

@Service
public class SearchServiceImpl implements SearchService {

    private AppParams appParams;

    @Autowired
    public SearchServiceImpl(AppParams appParams) {
        this.appParams = appParams;
    }

    @Override
    public ParsingResult search(String request) {
        return new ParsingResult(request, appParams);
    }
}
