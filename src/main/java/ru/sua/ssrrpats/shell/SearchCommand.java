package ru.sua.ssrrpats.shell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import ru.sua.ssrrpats.service.ResultFormatter;
import ru.sua.ssrrpats.service.SearchService;

@ShellComponent
public class SearchCommand {
    private final SearchService service;
    private final ResultFormatter formatter;

    @Autowired
    public SearchCommand(SearchService service, ResultFormatter formatter) {
        this.service = service;
        this.formatter = formatter;
    }

    @ShellMethod("Сделать запрос на поисковую систему и вывести статистику")
    public String search(@ShellOption String request) {
        return formatter.format2text(service.search(request));
    }
}
