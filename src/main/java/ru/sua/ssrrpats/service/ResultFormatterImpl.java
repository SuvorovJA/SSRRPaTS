package ru.sua.ssrrpats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sua.ssrrpats.config.AppParams;
import ru.sua.ssrrpats.domain.ParsingResult;

@Service
public class ResultFormatterImpl implements ResultFormatter {

    private AppParams appParams;

    @Autowired
    public ResultFormatterImpl(AppParams appParams) {
        this.appParams = appParams;
    }

    @Override
    public String format2text(ParsingResult parsingResult) {
        return parsingResult.toString();
    }
}
