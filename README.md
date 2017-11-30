# MongoDB Spring Boot Workshop

## Workspace & IDE
- Repository klonen:

```
cd /tmp
git clone http://github.com/ttrelle/mongo-boot-workshop.git
```

- Download + Install [STS 3.9.x](https://spring.io/tools/sts/all)

## MongoDB Installation

### Nativ

- Download [MongoDB 3.4.x](http://mongodb.com/download-center#community)
- Entpacken nach $MONGO_HOME
- $MONGO_HOME/bin in Pfad aufnehmen:

```
MONGO_HOME=/Users/tobias/dev/mongodb-osx-x86_64-3.4.7
ulimit -Sn 1024
export PATH=${PATH}:${MONGO_HOME}/bin
```
- Standard-Ordner anlegen:

```
mkdir -p /data/db
```

- Server starten:

```
mongod
```

- Daten importieren:

```
# Switch to workspace location
mongorestore -d test data/pois.bson
```

### Docker

- Download und Start:

```
# Switch to workspace location
docker-compose up
```

- Daten importieren:

```
# Connect to containter
docker exec -it mongodb bash

# Data import from mount
mongorestore -d test /import/pois.bson
```

## Documentation
- [MongoDB Documentation](https://docs.mongodb.com/manual/)
- [MongoDB Java Driver](http://mongodb.github.io/mongo-java-driver/)
- [Spring Data MongoDB](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/)
- [Spring Boot](https://docs.spring.io/spring-boot/docs/1.5.8.RELEASE/reference/htmlsingle/)
- [Spring Initializr](http://start.spring.io/)
- [Spring Boot Konfiguration](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-properties-and-configuration.html)
- [Spring Data REST](https://docs.spring.io/spring-data/rest/docs/3.0.1.RELEASE/reference/html/)
- [HAL - Hypermedia Application Language](http://stateless.co/hal_specification.html)

## Slides
- [Einführung MongoDB](https://de.slideshare.net/tobiastrelle/mongo-db-einfhrung)
- [Spring Data für MongoDB](https://de.slideshare.net/tobiastrelle/mongo-db-springdatajongoco)
- [Einführung Spring Boot](http://slides.com/jonashackt/dos-spring-01#/) (by [Jonas Hecht](http://github.com/jonashackt))
- [REST mit Spring MVC](http://slides.com/jonashackt/dos-spring-01-3#/) (by Jonas Hecht)

## Misc
- Bei langen Startzeiten von Spring Boot auf Mac OS:

```
scutil --set HostName "localhost"
```






