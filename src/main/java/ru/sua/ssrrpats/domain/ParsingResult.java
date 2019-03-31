package ru.sua.ssrrpats.domain;

import ru.sua.ssrrpats.config.AppParams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class ParsingResult {

    private final List<String> fullText;
    private final Map<String, Integer> countOccurences;
    private AppParams appParams;
    private String requestUrl;

    public ParsingResult(String text, AppParams appParams, String requestUrl) {
        this.appParams = appParams;
        this.requestUrl = requestUrl;
        if (text == null) throw new UnsupportedOperationException("строка должна быть");
        this.fullText = Arrays.stream(text.split("[\\s\\xA0]+"))
                .filter(s -> !s.isEmpty())
                .filter(s -> !s.matches("[—\"~,+.!?\\[\\]{}()*|\\-$^%`'@#:;&<>=_/\\\\]+"))
                .filter(s -> !isUrl(s))
                .map(s -> s.replaceFirst("[,.;]$", ""))
                .collect(Collectors.toList());
        countOccurences = new HashMap<>();
        for (String word : fullText) {
            countOccurences.merge(word, 1, (a, b) -> a + b);
        }

    }

    private boolean isUrl(String s) {
        return s.startsWith("http://") ||
                s.startsWith("https://") ||
                s.startsWith("ftp://") ||
                s.startsWith("www.");
    }

    public Map<String, Integer> topMax() {
        return countOccurences.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(appParams.getTopNum())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    public Map<String, Integer> topMin() {
        return countOccurences.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(appParams.getTopNum())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    public int uniqWordsCount() {
        return countOccurences.size();
    }

    public int totalWordsCount() {
        return fullText.size();
    }

    public String getRequestUrl() {
        return requestUrl;
    }
}
