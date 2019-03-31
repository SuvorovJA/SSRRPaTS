package ru.sua.ssrrpats.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("application")
@Component
@Data
public class AppParams {

    private String searchSystemUrl;
    private int topNum;
    private String dataSource;

}
