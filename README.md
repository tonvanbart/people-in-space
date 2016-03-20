## How many people are in space right now?

Quickie example project reading how many people are in space right now, 
from http://api.open-notify.org/astros.json.
Uses Java8 stream API to group astronauts by craft and produce a nice message.

To run, from commandline type `mvn spring-boot:run` or `./gradlew bootRun`.

Result should contain a message looking like this:
```
2016-03-20 21:40:00.177  INFO 13995 --- [           main] hello.Application                        : 6 people in ISS: Yuri Malenchenko, Timothy Kopra, Timothy Peake, Alexey Ovchinin, Oleg Skripochka, Jeff Williams
```
