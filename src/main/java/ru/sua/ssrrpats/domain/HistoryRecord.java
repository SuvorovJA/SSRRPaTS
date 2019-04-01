package ru.sua.ssrrpats.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryRecord {
    private long id;
    private String url;
    private Timestamp timestamp;
    private int totalWords;
    private int uniqWords;
    private String fullTextDelimeted;
}
