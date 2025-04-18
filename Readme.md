# Actividad 2 - Programación Vanguardia

Este proyecto es parte de la **Actividad 2** de la materia **Programación Visual**, desarrollado con **Java**, utilizando el gestor de dependencias **Maven** y el entorno de desarrollo **IntelliJ IDEA Community Edition**.

---

## 🎯 Objetivo

Desarrollar una aplicación de consola en Java que:

- Use Maven como gestor de dependencias.
- Genere un archivo `.jar` ejecutable.
- Utilice las librerías externas `commons-cli` y `log4j`.
- Se pueda ejecutar desde Maven.
- Sea versionada y subida a GitHub.

---

## ⚙️ Configuración del Proyecto

- **GroupId:** `ar.edu.udeci.pv`
- **ArtifactId:** `Actividad2`
- **Versión:** `1.0-SNAPSHOT`
- **Tipo de empaquetado:** `jar`
- **JDK utilizado:** Java 17
- **Gestor de dependencias:** Maven
- **IDE usado:** IntelliJ IDEA CE

---

## 📚 Dependencias utilizadas

### 1. [Commons CLI](https://commons.apache.org/proper/commons-cli/)
Permite el análisis de argumentos desde la línea de comandos.

**Ejemplo incluido:**
```java
Options options = new Options();
options.addOption("n", true, "Nombre de la persona");

CommandLineParser parser = new DefaultParser();
CommandLine cmd = parser.parse(options, args);

String nombre = cmd.getOptionValue("n");
System.out.println("¡Hola, " + nombre + "!");

🚀 Cómo compilar y ejecutar
1. Compilar y generar el archivo .jar
Desde la raíz del proyecto, ejecutar:

mvn clean package
Esto crea el archivo:
target/Actividad2-1.0-SNAPSHOT.jar

2. Ejecutar la aplicación desde Maven
mvn exec:java
El programa imprimirá un saludo utilizando un nombre pasado por argumento y mostrará logs del inicio y fin del programa.

Salida esperada:

2025-04-18 INFO  ar.edu.udeci.pv.App - Inicio de la aplicación
¡Hola, Juan!
2025-04-18 INFO  ar.edu.udeci.pv.App - Fin de la aplicación


Actividad2/
├── pom.xml
├── README.md
├── src/
│   └── main/
│       ├── java/
│       │   └── ar/edu/udeci/pv/App.java
│       └── resources/
│           └── log4j.properties
└── target/
    └── Actividad2-1.0-SNAPSHOT.jar
