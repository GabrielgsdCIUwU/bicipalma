# Proyecto BiciPalma

## Descripción

BiciPalma es una aplicación de gestión de estaciones de bicicletas públicas. Permite anclar y retirar bicicletas en diferentes estaciones, así como consultar el estado de las estaciones y los anclajes disponibles.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```
.gitignore
LICENSE
pom.xml
README.md
.vscode/
    settings.json
src/
    main/
        java/
            edu/
                estatuas/
                    apppalma/
                        BiciPalma.java
                    config/
                        LoggerConfig.java
                    domain/
                        bicicleta/
                            Bicicleta.java
                            Movil.java
                        estacion/
                            Anclaje.java
                            Anclajes.java
                            Estacion.java
                        tarjetausuario/
                            Autenticacion.java
                            TarjetaUsuario.java
test/
    java/
        edu/
            estatuas/
                domain/
                    bicicleta/
                        BicicletaTest.java
                    estacion/
                        AnclajeTest.java
                        AnclajesTest.java
                        EstacionTest.java
```

## Archivos Principales

### `BiciPalma.java`

Este es el punto de entrada de la aplicación. Contiene el método `main` que ejecuta varios casos de prueba para visualizar el estado de la estación, anclar bicicletas, consultar bicicletas ancladas y retirar bicicletas.

### `Estacion.java`

Esta clase representa una estación de bicicletas. Permite anclar y retirar bicicletas, consultar el estado de la estación y los anclajes disponibles.

### `Anclajes.java`

Esta clase gestiona un conjunto de anclajes en una estación. Permite crear anclajes, ocupar un anclaje con una bicicleta y obtener la bicicleta en un anclaje específico.

### `Anclaje.java`

Esta clase representa un anclaje individual en una estación. Permite anclar y liberar bicicletas, y consultar si el anclaje está ocupado.

### `Bicicleta.java`

Esta clase representa una bicicleta. Implementa la interfaz `Movil` y proporciona un identificador único para cada bicicleta.

### `Movil.java`

Esta interfaz define el método `getId` que debe ser implementado por cualquier clase que represente un objeto móvil, como una bicicleta.

### `TarjetaUsuario.java`

Esta clase representa una tarjeta de usuario. Implementa la interfaz `Autenticacion` y permite activar o desactivar la tarjeta.

### `Autenticacion.java`

Esta interfaz define el método `isActivada` que debe ser implementado por cualquier clase que represente un método de autenticación, como una tarjeta de usuario.

## Pruebas

El proyecto incluye pruebas unitarias para las clases principales:

- `BicicletaTest.java`
- `AnclajeTest.java`
- `AnclajesTest.java`
- `EstacionTest.java`

## Configuración del Logger

La clase `LoggerConfig.java` configura el logger para la aplicación, eliminando los handlers predeterminados y añadiendo un `ConsoleHandler` con un formato simple.

## Licencia

Este proyecto está liberado bajo la licencia Unlicense. Para más información, consulta el archivo [LICENSE](LICENSE).
