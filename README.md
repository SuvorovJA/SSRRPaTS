### учебный проект
SSRRPaTS: search service request result parse and text statistic 

##### основное тз

сделать приложение принимающее поисковый результат гугла, и делающее парзинг текста 
- [ ] выделить весь не-html текст
- [ ] собрать текстовую статистику
  - [ ] общее количество слов
  - [ ] количество уникальных слов
  - [ ] список (топ-10) самых часто встречающихся
  - [ ] список (топ-10) самых редко встречающихся
- [ ] вывод результатов сделать в консоль 
---
технические уточнения
- [ ] spring boot приложение
- [ ] spring shell пользовательский интерфейс
  - [ ] команда: search "запрос"
- [ ] настройки приложения делать через проперти-файл
  - [ ] yaml формат
  - [ ] параметр с url поисковой системы (searchSystemUrl: гугл, яндекс, ..)
  - [ ] параметр с размером топ-списков (topNum: 10)
  - [ ] ...

  
##### расширенное тз
- [ ] сохранять историю запросов и результатов в базу данных
  - [ ] инициализации базы данных при её отсутсвии на старте приложения
  - [ ] параметр проперти-файла для указания DataSource
  - [ ] добавить команду spring shell для просмотра сохранённых запросов списком
    - [ ] "show history" 
- [ ] приём запроса и вывод результата оформить веб-приложением spring mvc
 