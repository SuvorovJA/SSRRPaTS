package ru.sua.ssrrpats.service;

import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.sua.ssrrpats.config.AppParams;
import ru.sua.ssrrpats.domain.ParsingResult;
import ru.sua.ssrrpats.domain.RequestOccuredEvent;

import java.io.IOException;

@Service
@AllArgsConstructor
public class SearchServiceImpl implements SearchService {

    private AppParams appParams;

    private ApplicationEventPublisher applicationEventPublisher;

    // default inject by lombok constructor
//    @Autowired
//    public SearchServiceImpl(AppParams appParams) {
//        this.appParams = appParams;
//    }

    @Override
    public ParsingResult search(String request) throws IOException {
        String url = appParams.getSearchSystemUrl() + request;
        String text = Jsoup.connect(url).get().body().text();
        ParsingResult parsingResult = new ParsingResult(text, appParams, url);
        applicationEventPublisher.publishEvent(new RequestOccuredEvent(this, parsingResult));
        return parsingResult;
    }
}
