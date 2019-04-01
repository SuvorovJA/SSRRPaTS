
операции с базой 
```
/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/bin/java -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=44207 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=localhost -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -javaagent:/home/lsua/bin/idea-IU-182.4323.46/lib/idea_rt.jar=34823:/home/lsua/bin/idea-IU-182.4323.46/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/management-agent.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-2.fc29.x86_64/jre/lib/rt.jar:/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/classes:/home/lsua/.m2/repository/org/springframework/boot/spring-boot-starter/2.0.3.RELEASE/spring-boot-starter-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/boot/spring-boot/2.0.3.RELEASE/spring-boot-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/spring-context/5.0.7.RELEASE/spring-context-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/spring-aop/5.0.7.RELEASE/spring-aop-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/spring-expression/5.0.7.RELEASE/spring-expression-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.0.3.RELEASE/spring-boot-autoconfigure-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.0.3.RELEASE/spring-boot-starter-logging-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/home/lsua/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/home/lsua/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.10.0/log4j-to-slf4j-2.10.0.jar:/home/lsua/.m2/repository/org/apache/logging/log4j/log4j-api/2.10.0/log4j-api-2.10.0.jar:/home/lsua/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:/home/lsua/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/home/lsua/.m2/repository/org/springframework/spring-core/5.0.7.RELEASE/spring-core-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/spring-jcl/5.0.7.RELEASE/spring-jcl-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/yaml/snakeyaml/1.19/snakeyaml-1.19.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-starter/2.0.0.RELEASE/spring-shell-starter-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-core/2.0.0.RELEASE/spring-shell-core-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.0.3.RELEASE/spring-boot-starter-validation-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/8.5.31/tomcat-embed-el-8.5.31.jar:/home/lsua/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.10.Final/hibernate-validator-6.0.10.Final.jar:/home/lsua/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar:/home/lsua/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/home/lsua/.m2/repository/com/fasterxml/classmate/1.3.4/classmate-1.3.4.jar:/home/lsua/.m2/repository/org/jline/jline/3.4.0/jline-3.4.0.jar:/home/lsua/.m2/repository/org/jline/jline-terminal-jna/3.4.0/jline-terminal-jna-3.4.0.jar:/home/lsua/.m2/repository/net/java/dev/jna/jna/4.5.1/jna-4.5.1.jar:/home/lsua/.m2/repository/org/jline/jline-terminal/3.4.0/jline-terminal-3.4.0.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-standard/2.0.0.RELEASE/spring-shell-standard-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-standard-commands/2.0.0.RELEASE/spring-shell-standard-commands-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-shell1-adapter/2.0.0.RELEASE/spring-shell-shell1-adapter-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-jcommander-adapter/2.0.0.RELEASE/spring-shell-jcommander-adapter-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/shell/spring-shell-table/2.0.0.RELEASE/spring-shell-table-2.0.0.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/spring-beans/5.0.7.RELEASE/spring-beans-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/boot/spring-boot-configuration-processor/2.0.3.RELEASE/spring-boot-configuration-processor-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/lsua/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.0.3.RELEASE/spring-boot-starter-jdbc-2.0.3.RELEASE.jar:/home/lsua/.m2/repository/com/zaxxer/HikariCP/2.7.9/HikariCP-2.7.9.jar:/home/lsua/.m2/repository/org/springframework/spring-jdbc/5.0.7.RELEASE/spring-jdbc-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/org/springframework/spring-tx/5.0.7.RELEASE/spring-tx-5.0.7.RELEASE.jar:/home/lsua/.m2/repository/com/h2database/h2/1.4.197/h2-1.4.197.jar:/home/lsua/.m2/repository/org/projectlombok/lombok/1.16.22/lombok-1.16.22.jar:/home/lsua/.m2/repository/org/jsoup/jsoup/1.10.2/jsoup-1.10.2.jar ru.sua.ssrrpats.Main

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.3.RELEASE)

2019-04-01 21:35:36.714  INFO 4064 --- [           main] ru.sua.ssrrpats.Main                     : Starting Main on N-PC with PID 4064 (/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/classes started by lsua in /home/lsua/DEV/OTUS/java-spring/project__googlesearch)
2019-04-01 21:35:36.719  INFO 4064 --- [           main] ru.sua.ssrrpats.Main                     : No active profile set, falling back to default profiles: default
2019-04-01 21:35:36.771  INFO 4064 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@cd3fee8: startup date [Mon Apr 01 21:35:36 NOVT 2019]; root of context hierarchy
2019-04-01 21:35:37.662  INFO 4064 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-04-01 21:35:37.695  INFO 4064 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-04-01 21:35:37.710  INFO 4064 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from URL [file:/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/classes/schema.sql]
2019-04-01 21:35:37.722  INFO 4064 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from URL [file:/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/classes/schema.sql] in 11 ms.
2019-04-01 21:35:38.168  WARN 4064 --- [           main] org.jline                                : Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
2019-04-01 21:35:38.289  INFO 4064 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2019-04-01 21:35:38.291  INFO 4064 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'dataSource' has been autodetected for JMX exposure
2019-04-01 21:35:38.296  INFO 4064 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located MBean 'dataSource': registering with JMX server as MBean [com.zaxxer.hikari:name=dataSource,type=HikariDataSource]
2019-04-01 21:35:38.310  INFO 4064 --- [           main] ru.sua.ssrrpats.Main                     : Started Main in 1.963 seconds (JVM running for 2.752)
shell:>help
AVAILABLE COMMANDS

Built-In Commands
        clear: Clear the shell screen.
        exit, quit: Exit the shell.
        help: Display help about available commands.
        script: Read and execute commands from a file.
        stacktrace: Display the full stacktrace of the last error.

Search Command
        search: Сделать запрос на поисковую систему и вывести статистику

Show Command
        show-count: распечатать количество записей в базе данных
        show-history: распечатать записи из базы данных


shell:>show-count
В базе данных сохранено запросов: 0
shell:>show-history

shell:>search BBC

--------------------
Запрос: 'https://www.google.com/search?q=BBC'
Всего слов: 567
Всего уникальных слов: 403
Чаще всего встречались: 
	[BBC=22; News=10; bbc=8; в=8; 1=7]
Реже всего встречались: 
	[Разделы=1; Джон=1; your=1; Рейт=1; viewing=1]
--------------------
shell:>search CNN

--------------------
Запрос: 'https://www.google.com/search?q=CNN'
Всего слов: 575
Всего уникальных слов: 376
Чаще всего встречались: 
	[CNN=22; news=10; and=9; News=8; cnn=8]
Реже всего встречались: 
	[сериалы=1; поискВаши=1; подразделением=1; аббр=1; день=1]
--------------------
shell:>show-count
В базе данных сохранено запросов: 2
shell:>show-history


ID: 	1
Запрос: 	'https://www.google.com/search?q=BBC'
Время запроса: 	2019-04-01 21:36:51.158
Всего слов: 	567
Всего уникальных слов: 	403
Техт ответа: 	Специальные|ссылки|Перейти|к|основному|контентуСправка|по|использованию|специальных|возможностей|Оставить|отзыв|о|специальных|возможностях|Нажмите|здесь|если|переадресация|не|будет|выполнена|в|течение|нескольких|секунд|Войти|Удалить|Пожаловаться|на|неприемлемые|подсказки|×|Режимы|поиска|Все|Видео|Новости|Картинки|КартыЕщё|ПокупкиКнигиАвиабилетыФинансы|Настройки|Настройки|поискаЯзыки|(Languages)|Включить|Безопасный|поискРасширенный|поискВаши|данные|в|ПоискеИсторияПоиск|в|справкеИнструменты|Результатов:|примерно|1|080|000|000|(0,61|сек.)|Результаты|поиска|Веб-результат|со|ссылками|на|сайт|Главная|BBC|News|Русская|служба|Сохраненная|копия|23|авг|2018|г|Русская|служба|Би-би-си|–|это|непредвзятое|освещение|событий|в|России|и|мире|на|русском|языке|Новости|Аветисян|добился|ареста|акций|"Восточного"|в|России|вопреки|Самое|популярное|BBC|News|Русская|служба|Навигация|на|сайте|Разделы|Другие|результаты|с|сайта|bbc.com|»|bbc.com:|последние|новости|"Пригожин|огорчен"|Поставщик|школьного|питания|подал|в|суд|на|Навального|BBC|1|час|назад|"Осиротели|многие"|Кем|была|Наталия|Филева|для|S7|и|ее|знакомых|BBC|1|час|назад|Убийство|брата|Ким|Чен|Ына:|последняя|обвиняемая|скоро|выйдет|на|свободу|BBC|2|часа|назад|Больше|результатов|по|запросу|"BBC"|Все|результаты|BBC|Homepage|Сохраненная|копияПеревести|эту|страницу|Breaking|news|sport|TV|radio|and|a|whole|lot|more|The|BBC|informs|educates|and|entertains|wherever|you|are|whatever|your|age|‎BBC|World|News|·|‎US|Canada|·|‎BBC|Gahuza|·|‎BBC|Ideas|BBC|News|Русская|служба|YouTube|Сохраненная|копия|Видео|Русской|службы|Би-би-си|BBC|Russian|Последние|новости|России|и|мира|и|другие|заметные|события|в|политике|обществе|науке|и|культуре|Би-би-си|Википедия|Сохраненная|копия|Похожие|Би-би-си|(также|Би-Би-Си|BBC|от|англ|British|Broadcasting|Corporation|«Британская|вещательная|корпорация»)|британская|общенациональная|Прежние|названия‎:|‎BBC|(англ|British|Broadc..|Чистая|прибыль‎:|‎5,166|млрд|(2013/14)|Число|сотрудников‎:|‎20|591|(2015)|Тип‎:|‎статутная|корпорация|BBC|Издание|ИноСМИ|Все|что|достойно|перевода|Сохраненная|копия|BBC|комплекс|радио-|интернет-|и|телевещания|Великобритании|Медиакорпорация|осуществляет|как|внутреннее|так|и|внешнее|интернет-|радио-|BBC|America|Сохраненная|копия|ПохожиеПеревести|эту|страницу|BBCAmerica.com|provides|an|easy|way|for|fans|to|get|caught|up|in|BBC|America|shows|Full|episode|viewing|offers|instant|access|to|BBC|America|shows|like|Видео|1:57|Saving|snow|leopards|in|Russia|BBC|News|BBC|News|YouTube|1|день|назад|1:34|Rare|look|at|Myanmar|military|celebrations|BBC|News|BBC|News|YouTube|1|день|назад|2:58|US-Mexico|border:|Migrants|held|as|Trump|threatens|closure|BBC|BBC|News|YouTube|1|день|назад|Все|результаты|Billionaire|Boys|Club|Сохраненная|копия|ПохожиеПеревести|эту|страницу|Official|store|of|the|Billionaire|Boys|Club|and|Icecream|clothing|lines|by|Pharrell|Williams|Вместе|с|BBC|часто|ищут|bbc|википедия|bbc|online|bbc|украина|bbc|radio|bbc|фильмы|bbc|russian|bbc|сериалы|bbc|world|news|Навигация|по|страницам|1|2|3|4|5|6|7|8|9|10|Следующая|Дополнительные|результаты|Блок|знаний|Би-би-си|Компания|ОписаниеBBC|британская|общенациональная|общественная|телерадиовещательная|организация|Википедия|Операционная|прибыль:|▲166|000|000|фунт|стерлингов|(31|марта|2016)|Основатель:|Джон|Рейт|Дата|основания:|18|октября|1922|г.|Лондон|Великобритания|Штаб-квартира:|Лондон|Великобритания|Выпущенные|фильмы:|Спасти|мистера|Бэнкса|ЕЩЁ|Сериалы|Ещё|45+Ещё|45+|Жители|Ист‑Энда|с|1985|г|Strictly|Come|Dancing|с|2004|г|По|долгу|службы|с|2012|г|Катастрофа|с|1986|г|Newsround|с|1972|г|Похожие|запросы|Ещё|15+Ещё|15+|CNN|Raidió|Teilifís|Éireann|Аль‑Джазира|Fox|News|Channel|Sky|Sports|Оставить|отзывОтказ|от|обязательств|Ссылки|в|нижнем|колонтитуле|Россия|Подробнее…|СправкаОтправить|отзывКонфиденциальностьУсловия|Аккаунт|Поиск|Карты|YouTube|Play|Новости|Почта|Контакты|Диск|Календарь|Переводчик|Фото|ПокупкиЕщё|Документы|Blogger|Hangouts|Google|Keep|Jamboard|Планета|Земля|ПодборкиДругие|сервисы|Google
--------------------

ID: 	2
Запрос: 	'https://www.google.com/search?q=CNN'
Время запроса: 	2019-04-01 21:36:59.587
Всего слов: 	575
Всего уникальных слов: 	376
Техт ответа: 	Специальные|ссылки|Перейти|к|основному|контентуСправка|по|использованию|специальных|возможностей|Оставить|отзыв|о|специальных|возможностях|Нажмите|здесь|если|переадресация|не|будет|выполнена|в|течение|нескольких|секунд|Войти|Удалить|Пожаловаться|на|неприемлемые|подсказки|×|Режимы|поиска|Все|Новости|Видео|Картинки|КартыЕщё|ПокупкиКнигиАвиабилетыФинансы|Настройки|Настройки|поискаЯзыки|(Languages)|Включить|Безопасный|поискРасширенный|поискВаши|данные|в|ПоискеИсторияПоиск|в|справкеИнструменты|Результатов:|примерно|366|000|000|(0,62|сек.)|Результаты|поиска|Веб-результат|со|ссылками|на|сайт|CNN|Breaking|News|Latest|News|and|Videos|View|the|latest|news|and|breaking|news|today|for|U.S.|world|weather|entertainment|politics|and|health|at|CNN.com|CNN|International|Politics|US|News|Brexit|Australia|HLN|HLN|is|a|national|news|network|that|airs|news|by|day|and|CNN|Breaking|News|Latest|View|the|latest|news|and|breaking|news|today|for|U.S.|world|U.S|Crime|Justice|Latest|News|Extreme|Weather|World|View|CNN|world|news|today|for|international|news|and|videos|The|Circus|Singer|and|the|The|Circus|Singer|and|the|Godfather|of|Soul|Part|1|Part|2|Другие|результаты|с|сайта|cnn.com|»|Главные|новости|CNN|рассказал|о|преимуществе|Порошенко|в|битве|с|Зеленским|Газета.Ру|2|часа|назад|CNN|(США):|на|выборах|президент|Украины|борется|против|Владимира|Путина|ИноСМИ|5|часов|назад|CNN|объявил|о|лидерстве|на|Украине|«наименее|антироссийского|кандидата»|Взгляд|6|часов|назад|Больше|результатов|по|запросу|"CNN"|Все|результаты|CNN|новости|информация|Газета.Ru|Сохраненная|копия|Информация|о|CNN|новости|события|США|Джо|Байден|впервые|лично|прокомментировал|обвинения|в|харассменте|передает|CNN|Видео|2:18|CNN's|Brian|Stelter|shocked|by|'Fox|Friends'|error|CNN.com|22|ч|назад|1:35|Watch:|'SNL'|has|Trump|celebrating|Mueller|report|CNN.com|1|день|назад|1:58|On|GPS:|What's|Venezuela's|way|out?|CNN.com|3|дня|назад|Все|результаты|CNN|Издание|ИноСМИ|Все|что|достойно|перевода|Сохраненная|копия|CNN|(читается|как|Си-эн-эн|аббревиатура|от|англ|Cable|News|Network)|телеканал|созданный|Тедом|Тёрнером|(Ted|Turner)|1|июня|1980|года|CNN|Википедия|Сохраненная|копия|Похожие|CNN|(читается|как|Си-Эн-Эн|аббр|от|англ|Cable|News|Network|Кабельная|Новостная|Сеть)|телеканал|созданный|Тедом|Тёрнером|1|июня|1980|Материнская|компания‎:|‎WarnerMedia|Основатели‎:|‎Тед|Тёрнер|Дочерние|компании‎:|‎CNN|Films|Основание‎:|‎1|июня‎|‎1980|года|CNN|YouTube|Сохраненная|копия|ПохожиеПеревести|эту|страницу|CNN|operates|as|a|division|of|Turner|Broadcasting|System|which|is|a|subsidiary|of|Warner|Media|CNN|identifies|itself|as|and|is|widely|known|to|be|the|Вместе|с|CNN|часто|ищут|cnn|на|русском|cnn|news|на|русском|cnn|online|cnn|news|online|cnn|russia|cnn|live|cnn|сериалы|cnn|нейросеть|Навигация|по|страницам|1|2|3|4|5|6|7|8|9|10|Следующая|Дополнительные|результаты|Блок|знаний|CNN|Телеканал|ОписаниеCNN|телеканал|созданный|Тедом|Тёрнером|1|июня|1980|года|Является|подразделением|компании|Turner|Broadcasting|System|которой|владеет|WarnerMedia|Компания|CNN|первой|в|мире|предложила|концепцию|24-часового|вещания|новостей|Википедия|Штаб-квартира:|Атланта|Джорджия|США|Дата|основания:|1980|г.|Атланта|Джорджия|США|Головная|организация:|Turner|Broadcasting|System|Штаб-квартира:|Центр|CNN|Основатели:|Тед|Тёрнер|Риз|Скнфелд|Сериалы|Ещё|45+Ещё|45+|CNN|Live|Today|2001|г|–|2006|г|Anthony|Bourdain:|Parts|Unk..|2013|г|–|2018|г|The|2000s|с|2018|г|Cuomo|Prime|Time|с|2017|г|State|of|the|Union|с|2009|г|Похожие|запросы|Ещё|10+Ещё|10+|Fox|News|Channel|MSNBC|Би‑би‑си|The|Huffington|Post|MSN|Оставить|отзывОтказ|от|обязательств|Заявить|права|на|блок|знаний|Ссылки|в|нижнем|колонтитуле|Россия|Подробнее…|СправкаОтправить|отзывКонфиденциальностьУсловия|Аккаунт|Поиск|Карты|YouTube|Play|Новости|Почта|Контакты|Диск|Календарь|Google+|Переводчик|Фото|ПокупкиЕщё|Документы|Blogger|Hangouts|Google|Keep|Jamboard|Планета|Земля|ПодборкиДругие|сервисы|Google
--------------------
shell:>
```


запуск приложения из fat jar
``` 
lsua@N-PC:~/bin/idea-IC-191.6183.87/bin - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - [21:47:56]
$ java -jar /home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/SSRRPaTS-0.042.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.3.RELEASE)

2019-04-01 21:48:04.178  INFO 7264 --- [           main] ru.sua.ssrrpats.Main                     : Starting Main v0.042 on N-PC with PID 7264 (/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/SSRRPaTS-0.042.jar started by lsua in /home/lsua/bin/idea-IC-191.6183.87/bin)
2019-04-01 21:48:04.183  INFO 7264 --- [           main] ru.sua.ssrrpats.Main                     : No active profile set, falling back to default profiles: default
2019-04-01 21:48:04.241  INFO 7264 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@449b2d27: startup date [Mon Apr 01 21:48:04 NOVT 2019]; root of context hierarchy
2019-04-01 21:48:05.358  INFO 7264 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-04-01 21:48:05.500  INFO 7264 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-04-01 21:48:05.529  INFO 7264 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from URL [jar:file:/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/SSRRPaTS-0.042.jar!/BOOT-INF/classes!/schema.sql]
2019-04-01 21:48:05.552  INFO 7264 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from URL [jar:file:/home/lsua/DEV/OTUS/java-spring/project__googlesearch/target/SSRRPaTS-0.042.jar!/BOOT-INF/classes!/schema.sql] in 23 ms.
2019-04-01 21:48:06.421  INFO 7264 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2019-04-01 21:48:06.423  INFO 7264 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'dataSource' has been autodetected for JMX exposure
2019-04-01 21:48:06.428  INFO 7264 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located MBean 'dataSource': registering with JMX server as MBean [com.zaxxer.hikari:name=dataSource,type=HikariDataSource]
2019-04-01 21:48:06.446  INFO 7264 --- [           main] ru.sua.ssrrpats.Main                     : Started Main in 2.936 seconds (JVM running for 3.549)
shell:>search васюки

--------------------
Запрос: 'https://www.google.com/search?q=васюки'
Всего слов: 477
Всего уникальных слов: 320
Чаще всего встречались: 
        [Васюки=12; в=11; васюки=11; копия=9; Сохраненная=9]
Реже всего встречались: 
        [поискВаши=1; ВАСЮКИ?=1; Новости=1; Илья=1; «12=1]
--------------------
shell:>show-history


ID:     1
Запрос:         'https://www.google.com/search?q=васюки'
Время запроса:  2019-04-01 21:48:17.763
Всего слов:     477
Всего уникальных слов:  320
Техт ответа:    Специальные|ссылки|Перейти|к|основному|контентуСправка|по|использованию|специальных|возможностей|Оставить|отзыв|о|специальных|возможностях|Нажмите|здесь|если|переадресация|не|будет|выполнена|в|течение|нескольких|секунд|Войти|Удалить|Пожаловаться|на|неприемлемые|подсказки|×|Режимы|поиска|Все|Карты|Картинки|Видео|ПокупкиЕщё|НовостиКнигиАвиабилетыФинансы|Настройки|Настройки|поискаЯзыки|(Languages)|Включить|Безопасный|поискРасширенный|поискВаши|данные|в|ПоискеИсторияПоиск|в|справкеИнструменты|Результатов:|примерно|509|000|(0,38|сек.)|Результаты|поиска|Все|результаты|Васюки|Википедия|Сохраненная|копия|Похожие|4|Примечания|Васюки|название|населённых|пунктов:|Витебской|области|Васюки|деревня|в|Сморгонском|районе|Гродненской|области|Видео|1:06|НЬЮ|ВАСЮКИ|Garyk|Crimea|YouTube|17|сент|2015|г|4:02|МОСКВА|Нью|Васюки|serg9015|YouTube|24|июл|2011|г|4:01|нью|васюки|DARK|CITY_beta|YouTube|23|авг|2011|г|Все|результаты|ВАСЮКИ|это..|Что|такое|ВАСЮКИ?|Сохраненная|копия|Новые|Васюки|Разг|Ирон|О|каком|л|малозначительном|городе|или|селении|претендующем|на|роль|грандиозного|центра|чего|л|/em>|Васюки|Новые|Васюки|это..|Что|такое|Новые|Васюки?|Сохраненная|копия|Разг|Ирон|О|каком|л|малозначительном|городе|или|селении|претендующем|на|роль|грандиозного|центра|чего|л|/em>|Васюки|название|Значение|фразеологизма|"Нью-Васюки"|непроявленный-мир.рф/126-znachenie-frazeologizma-nyu-vasyuki.html|Сохраненная|копия|Похожие|22|февр|2015|г|нью|васюки|что|значит|В|русском|языке|за|последние|сто|лет|появилось|множество|крылатых|выражений|несущих|ироничный|подтекст|Васюки|Wiki.risk.ru|wiki.risk.ru/index.php/Васюки|Сохраненная|копия|16|янв|2011|г|Есть|на|берегу|Волги|не|большой|город|–|Козьмодемьянск|В|своей|книге|Илья|Ильф|и|Евгений|Петров|«12|стульев»|назвали|этот|12|стульев|Тексты|фильмов|Сохраненная|копия|Знаете|ли|вы|что|клуб|"Четырех|коней"|может|совершенно|преобразить|город|Васюки?|Я|предлагаю:|в|Васюках|надо|устроить|международный|Значение|фразеологизма|"Нью-Васюки"|Присхождение|chtooznachaet.ru/znachenie-frazeologizma-nyu-vasyuki.html|Сохраненная|копия|Похожие|Значение|фразеологизма|"Нью-Васюки"|Присхождение|крылатой|фразы|"Нью-Васюки"|Использование|выражения|"Нью-Васюки"|Остап|Бендер|в|Новых|Васюках|незабываемый|шахматный|турнир|chesswood.ru/humor/ostap-bender-shahmatnyj-turnir.html|Сохраненная|копия|Похожие|16|февр|2015|г|Знаете|ли|вы|что|шахматный|клуб|четырех|коней|при|правильной|постановке|дела|сможет|совершенно|преобразить|город|Васюки?»|New|Васюки:|cheger|Сохраненная|копия|14|мая|2015|г|New|Васюки|Про|один|из|городов|который|послужил|местом|съемок|фильма|по|мотивам|романов|Ильфа|и|Петрова|я|как-то|уже|Вместе|с|васюки|часто|ищут|васюки|на|волге|васюки|клуб|васюки|3|буквы|васюки|жуковский|москва|васюки|откуда|взялись|нью|васюки|васюки|туапсе|столица|переносится|в|нью|васюки|Навигация|по|страницам|1|2|3|4|5|6|7|8|9|10|Следующая|Дополнительные|результаты|Блок|знаний|Васюки|Деревня|в|России|ОписаниеВасюки́|деревня|в|Смоленской|области|России|в|Глинковском|районе|По|состоянию|на|2007|год|постоянного|населения|не|имеет|Википедия|Площадь:|11|га|Местное|время:|понедельник|17:48|Погода:|6°C|ветер|СЗ|7|м/с|влажность|41|Похожие|запросы|Ещё|3+Ещё|3+|Верхнеднепровский|Иваново|Починок|Дорогобуж|Рязань|Оставить|отзыв|Возможно|вы|искали|Васюки|(Дорогобужский|район)|Площадь:|5,77|км²|Местное|время:|понедельник|17:48|Ссылки|в|нижнем|колонтитуле|Россия|Подробнее…|СправкаОтправить|отзывКонфиденциальностьУсловия|Аккаунт|Поиск|Карты|YouTube|Play|Новости|Почта|Контакты|Диск|Календарь|Переводчик|Фото|ПокупкиЕщё|Документы|Blogger|Hangouts|Google|Keep|Jamboard|Планета|Земля|ПодборкиДругие|сервисы|Google
--------------------
shell:>

```