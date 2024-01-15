# Демо проект по автоматизации тестирования для сайта компании [**Magnum**](https://magnum.kz/?city=astana)

<p align="center">
<img title="magnum" src="images/logo/magnum.png">
</p>

---

> #### Ведущая и крупнейшая торгово-розничная сеть в Казахстане

---

## **Содержание**:

---

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Видео выполнения тестов на Selenoid</a>

---

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/github-original.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/gradle-plain.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>
<a href="https://core.telegram.org/bots/api/"><img src="images/logo/telegram_logo.svg" width="50" height="50"  alt="Jira"/></a> 
</p>

___
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>

-  *Проверка отображения элементов меню*
-  *Поиск продукта*
-  *Переключение языка на казахский*
-  *Поиск магазина'*
-  *Проверка описания магазина*
-  *Отправка обратной связи по недостающему товару*
___

<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Project%20qa_guru_java_lesson_17_mag_maxaten/)</a>


<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Project%20qa_guru_java_lesson_17_mag_maxaten/"><img src="images/screen/jenk_build.png" alt="Jenkins" width="1920"/></a>  
</p>

### **Параметры сборки в Jenkins:**
<a href="https://jenkins.autotests.cloud/job/Project%20qa_guru_java_lesson_17_mag_maxaten/build?delay=0sec"><img src="images/screen/jenk_params.png" alt="Jenkins" width="1920"/></a>

- *task (all_tests, все тесты)*
- *browser (браузер, по умолчанию chrome)*
- *browserVersion (версия браузера, по умолчанию 100.0)*
- *browserSize (размер окна браузера, по умолчанию 1920x1080)*

___
<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
./gradlew clean test allureServe
```

___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/Project%20qa_guru_java_lesson_17_mag_maxaten/allure/)</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/allure_report.png" width="1920">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/allure_test_case.png" width="1920">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/graphic1.png" width="1920">

<img title="Allure Graphics" src="images/screen/graphic2.png" width="1920">  
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3771/dashboards">Allure TestOps</a>

### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/allure_testops.png" width="1920">  
</p>  

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/allure_tests_manual.png" width="1919">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/auto_test_allure.png" width="1919">  
</p>

___
<a id="jira"></a>
## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-944">Jira</a>


<p align="center">  
<img title="Jira" src="images/screen/jira.png" width="1920">  
</p>

___
<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/telegram_logo.svg" width="25"/></a> Уведомление в Telegram при помощи бота

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/Telegram.png" width="433">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Пример видео выполнения тестов на Selenoid

<p align="center">
<img title="Selenoid Video" src="images/video/video.gif" width="690" height="338"  alt="video">   
</p>