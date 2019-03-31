package ru.sua.ssrrpats.domain;

import ru.sua.ssrrpats.config.AppParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParsingResult {

    private final List<String> fullText;
    private final Map<String, Integer> countOccurences;
    private  AppParams appParams;

    public ParsingResult(String fullText, AppParams appParams) {
        this.appParams = appParams;
        if (fullText == null) throw new UnsupportedOperationException("строка должна быть");
        countOccurences = new HashMap<>(); //
        this.fullText = new ArrayList<>(); //
    }

    public Map<String, Integer> topMax() {
        return new HashMap<>();
    }

    public Map<String, Integer> topMin() {
        return new HashMap<>();
    }

    public int uniqWordsCount() {
        return 0;
    }

}
