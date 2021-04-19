# citest-java

[![Build Status](https://www.travis-ci.com/ezequieljsosa/citest-java.svg?branch=main)](https://www.travis-ci.com/ezequieljsosa/citest-java)

Ejemplo Tavis-Maven

El proyecto consiste en una clase que multiplica un numero por 2.

Para ejecutar los tests:
```console
mvn test
```
Para corroborar que la linea de comando funciona:
```console
# multiplica el numero 14 por 2
mvn clean compile exec:java -Dexec.mainClass="ar.edu.ahk.UnProg" -Dexec.args="14"
# Salida
[...]
xxxxxxxxxxxxxxxxxxxxxxxxxxx
28
xxxxxxxxxxxxxxxxxxxxxxxxxxx
[...]
```
Para ejecutar desde docker:
```console
docker run --rm ezequieljsosa/citest 4
xxxxxxxxxxxxxxxxxxxxxxxxxxx
8
xxxxxxxxxxxxxxxxxxxxxxxxxxx
```
En lugar de ezequieljsosa usar el repo de su cuenta en dockerhub