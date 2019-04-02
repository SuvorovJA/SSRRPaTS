package ru.sua.ssrrpats.shell;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import ru.sua.ssrrpats.service.ResultFormatter;
import ru.sua.ssrrpats.service.SearchService;

import java.io.IOException;

@ShellComponent
@AllArgsConstructor
public class SearchCommand {
    private final SearchService service;
    private final ResultFormatter formatter;

    @ShellMethod("Сделать запрос на поисковую систему и вывести статистику")
    public String search(@ShellOption String request) {
        try {
            return formatter.format2text(service.search(request));
        } catch (IOException e) {
            return "Ошибка: " + e.getClass() + ": " + e.getMessage();
        }
    }
}
