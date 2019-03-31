package ru.sua.ssrrpats.domain;

import org.junit.Before;
import org.junit.Test;
import ru.sua.ssrrpats.config.AppParams;

import static org.junit.Assert.assertEquals;

public class ParsingResultTest {

    private AppParams appParams;
    private ParsingResult parsingResult;
    private String text = "Text Text. text; @#$%@ 24245 Русский http://lala.la";
    private String request = "request";

    @Before
    public void setUp() {
        appParams = new AppParams();
        appParams.setTopNum(3);
        appParams.setSearchSystemUrl("url=");

        parsingResult = new ParsingResult(text, appParams, appParams.getSearchSystemUrl()+request);
    }

    @Test
    public void topMax() {
        assertEquals(3,parsingResult.topMax().size());
    }

    @Test
    public void topMin() {
        assertEquals(3,parsingResult.topMin().size());
    }

    @Test
    public void uniqWordsCount() {
        assertEquals(4,parsingResult.uniqWordsCount());
    }

    @Test
    public void totalWordsCount() {
        assertEquals(5, parsingResult.totalWordsCount());
    }

    @Test
    public void getRequestUrl() {
        assertEquals("url=request", parsingResult.getRequestUrl());
    }
}