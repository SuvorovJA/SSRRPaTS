### учебный проект
SSRRPaTS: search service request result parse and text statistic 

##### основное тз

сделать приложение принимающее поисковый результат гугла, и делающее парзинг текста 
- [x] выделить весь не-html текст
- [x] собрать текстовую статистику
  - [x] общее количество слов
  - [x] количество уникальных слов
  - [x] список (топ-10) самых часто встречающихся
  - [x] список (топ-10) самых редко встречающихся
- [x] вывод результатов сделать в консоль 
---
технические уточнения
- [x] spring boot приложение
- [x] spring shell пользовательский интерфейс
  - [x] команда: search "запрос"
- [x] настройки приложения делать через проперти-файл
  - [x] yaml формат
  - [x] параметр с url поисковой системы (searchSystemUrl: гугл, яндекс, ..)
  - [x] параметр с размером топ-списков (topNum: 10)

  
##### расширенное тз
- [ ] сохранять историю запросов и результатов в базу данных
  - [ ] инициализации базы данных при её отсутсвии на старте приложения
  - [ ] параметр проперти-файла для указания DataSource
  - [ ] добавить команду spring shell для просмотра сохранённых запросов списком
    - [ ] "show history" 
- [ ] приём запроса и вывод результата оформить веб-приложением spring mvc
 