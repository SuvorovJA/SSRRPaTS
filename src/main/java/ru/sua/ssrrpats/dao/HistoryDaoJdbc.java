package ru.sua.ssrrpats.dao;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;
import ru.sua.ssrrpats.domain.HistoryRecord;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class HistoryDaoJdbc implements HistoryDao {

    private final NamedParameterJdbcOperations jdbc;

    @Override
    public int count() {
        Map<String, Object> params = Collections.emptyMap();
        Integer integer = jdbc.queryForObject("select count(*) from history", params, Integer.class);
        return integer; // TODO npe warning

    }

    @Override
    public void insert(HistoryRecord record) {
        Map<String, Object> params = new HashMap<>(6);
        params.put("id", record.getId());
        params.put("url", record.getUrl());
        params.put("uniqWords", record.getUniqWords());
        params.put("totalWords", record.getTotalWords());
        params.put("timestmp", record.getTimestamp());
        params.put("fullText", record.getFullTextDelimeted());

        if (record.getId() == 0) {
            jdbc.update("insert into history (url,timestmp,uniqWords,totalWords,fullTextDelimeted) values (:url,:timestmp,:uniqWords,:totalWords,:fullText)", params);
            // TODO get id (KeyHolder keyHolder = new GeneratedKeyHolder();)
        } else {
            jdbc.update("insert into history (id,url,timestmp,uniqWords,totalWords,fullTextDelimeted) values (:id,:url,:timestmp,:uniqWords,:totalWords,:fullText)", params);
        }
    }

    @Override
    public List<HistoryRecord> getAll() {
        return jdbc.query("select * from history", new HistoryMapper());
    }


    private static class HistoryMapper implements RowMapper<HistoryRecord> {

        @Override
        public HistoryRecord mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String url = resultSet.getString("url");
            String fulltext = resultSet.getString("fullTextDelimeted");
            int total = resultSet.getInt("totalWords");
            int uniq = resultSet.getInt("uniqWords");
            Timestamp timestamp = resultSet.getTimestamp("timestmp");
            return new HistoryRecord(id, url, timestamp, total, uniq, fulltext);
        }
    }
}
