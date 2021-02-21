## Desafio Técnico Datum
![GitHub Workflow Status](https://img.shields.io/github/workflow/status/clevsampaio/desafio_tecnico_datum_java/maven?style=for-the-badge)

Este projeto foi exclusivamente feito para prova técnica para [Datum](https://www.datum.inf.br/).

### O que foi utilizado?

O projeto foi construido com a estrutura [Maven 3](http://maven.apache.org/download.cgi), [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) e algumas dependências como:
[TestNG](https://mvnrepository.com/artifact/org.testng/testng/7.3.0),
[Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59),
[WebDriverManager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.3.1),
[ExtentReports](https://mvnrepository.com/artifact/com.aventstack/extentreports/4.0.9),
[ExtentReports TestNG Adapter](https://mvnrepository.com/artifact/com.aventstack/extentreports-testng-adapter/1.0.3),
[Java Faker](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2),
[Rest Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.3.3),
[Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.16).

### Como executar?
Para executar em sua máquina local, basta utilizar o comando `mvn test` ou através de sua IDE, por padrão é utilizado o chrome.
Para executar no firefox, basta mudar em properties > browser em pom.xml ou acrescentar seguinte o comando `-Dbrowser=firefox` quando for utilizar linha de comandos.

É possivel executar o tipo de suite de teste utilizando:

`-DsuiteName=AllSuite|Web|Api` (default: AllSuite).

Observações:
- Lembrando que é necessário haver o respectivo browser instalado em sua máquina!

- Caso queira executar em sua máquina local utilizando [zalenium](https://opensource.zalando.com/zalenium/), basta utilizar o seguinte comando
  `mvn test -Dtype=remote`.
  
- Para execução por linha de comandos utilizando `mvn test` é necessário haver instalado em sua máquina o [Apache Maven](https://maven.apache.org/download.cgi).

- Necessário haver o plugins [Lombok](https://plugins.jetbrains.com/plugin/6317-lombok) instalada em sua IDE para tal funcionamento.

Para executar em uma máquina remota utilizando [zalenium](https://opensource.zalando.com/zalenium/),
basta utilizar o comando `mvn test -Dtype=remote -Dhub=http://localhost:4444/wd/hub` (ou a url definida pelo serviço).