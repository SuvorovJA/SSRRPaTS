package ru.sua.ssrrpats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sua.ssrrpats.config.AppParams;
import ru.sua.ssrrpats.domain.ParsingResult;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

@Service
public class ResultFormatterImpl implements ResultFormatter {

    private AppParams appParams;

    @Autowired
    public ResultFormatterImpl(AppParams appParams) {
        this.appParams = appParams;
    }

    @SuppressWarnings("StringBufferReplaceableByString")
    @Override
    public String format2text(ParsingResult parsingResult) {
        StringBuilder sb = new StringBuilder();
        sb.append(dashLine());
        sb.append("\nЗапрос: '");
        sb.append(parsingResult.getRequestUrl());
        sb.append("'\nВсего слов: ");
        sb.append(parsingResult.totalWordsCount());
        sb.append("\nВсего уникальных слов: ");
        sb.append(parsingResult.uniqWordsCount());
        sb.append("\nЧаще всего встречались: \n\t");
        sb.append(mapToString(parsingResult.topMax()));
        sb.append("\nРеже всего встречались: \n\t");
        sb.append(mapToString(parsingResult.topMin()));
        sb.append(dashLine());
        return sb.toString();
    }

    private String mapToString(Map<String, Integer> stringIntegerMap) {
        return stringIntegerMap.entrySet().stream()
                .map(Map.Entry::toString)
                .collect(joining("; ", "[", "]"));
    }

    private String dashLine() {
        return "\n" + Stream.generate(() -> "-").limit(20L).collect(Collectors.joining());
    }
}
