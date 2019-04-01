package ru.sua.ssrrpats.service;

import org.springframework.stereotype.Service;
import ru.sua.ssrrpats.domain.HistoryRecord;
import ru.sua.ssrrpats.domain.ParsingResult;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

@Service
public class ResultFormatterImpl implements ResultFormatter {

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

    @SuppressWarnings("StringBufferReplaceableByString")
    @Override
    public String format2text(HistoryRecord hr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nID: \t").append(hr.getId());
        sb.append("\nЗапрос: \t'").append(hr.getUrl());
        sb.append("'\nВремя запроса: \t").append(hr.getTimestamp());
        sb.append("\nВсего слов: \t").append(hr.getTotalWords());
        sb.append("\nВсего уникальных слов: \t").append(hr.getUniqWords());
        sb.append("\nТехт ответа: \t").append(hr.getFullTextDelimeted());
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
