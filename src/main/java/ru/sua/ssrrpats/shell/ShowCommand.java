package ru.sua.ssrrpats.shell;

import lombok.AllArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.sua.ssrrpats.dao.HistoryDao;
import ru.sua.ssrrpats.domain.HistoryRecord;
import ru.sua.ssrrpats.service.ResultFormatter;

import java.util.List;

@ShellComponent
@AllArgsConstructor
public class ShowCommand {

    private HistoryDao dao;
    private ResultFormatter formatter;

    @ShellMethod("распечатать количество записей в базе данных")
    public String showCount() {
        return "В базе данных сохранено запросов: " + dao.count();
    }

    @ShellMethod("распечатать записи из базы данных")
    public String showHistory() {
        List<HistoryRecord> all = dao.getAll();
        StringBuilder sb = new StringBuilder();
        for (HistoryRecord historyRecord : all) {
            sb.append("\n").append(formatter.format2text(historyRecord));
        }
        return sb.toString();
    }

}
