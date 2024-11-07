
# Proyecto de Diagnóstico de Computadora en Java

Este proyecto implementa un sistema de diagnóstico para computadoras utilizando un **árbol de decisiones**. El árbol se construye a partir de preguntas simples que ayudan a determinar qué componente de la computadora podría estar fallando. El sistema hace preguntas al usuario y, dependiendo de las respuestas, proporciona una posible solución.

Además, el proyecto genera un **diagrama visual** del árbol de decisiones utilizando la biblioteca **Graphviz** para representar gráficamente el flujo de preguntas y respuestas.

## Estructura del Árbol de Decisiones

El árbol de decisiones es el siguiente:

```
                         ¿La computadora enciende?
                            /           \
                          Sí             No
                         /  \              \
           ¿La pantalla muestra algo?    Problema con la fuente de poder
                    /     \
                 Sí       No
                 /  \
¿El sistema operativo carga?  Problema con la pantalla
/  \
Sí    No
Problema con el hardware  Problema con el sistema operativo
```

### Preguntas de Diagnóstico

1. **¿La computadora enciende?**
   - Sí: Proceder a la siguiente pregunta.
   - No: El problema es con la fuente de poder.

2. **¿La pantalla muestra algo?**
   - Sí: Proceder a la siguiente pregunta.
   - No: El problema es con la pantalla.

3. **¿El sistema operativo carga?**
   - Sí: El problema es con el hardware.
   - No: El problema es con el sistema operativo.

## Requisitos

- **Java 8 o superior**: Este proyecto está desarrollado en Java y requiere al menos la versión 8 de JDK.
- **Maven (opcional)**: Para gestionar las dependencias (Graphviz y JGraphT).

## Instalación

1. **Clona este repositorio**:

   Si aún no has clonado el proyecto, puedes hacerlo ejecutando el siguiente comando:

   ```bash
   git clone https://github.com/tu_usuario/diagnostico-computadora-java.git
   ```

2. **Importar el Proyecto en IntelliJ IDEA**:

    - Abre IntelliJ IDEA.
    - Selecciona `Open` y navega a la carpeta donde clonaste el repositorio.
    - Selecciona el archivo `pom.xml` (si estás usando Maven) o simplemente abre la carpeta del proyecto.

3. **Agrega las dependencias**:

   Si usas Maven, las dependencias necesarias se pueden agregar automáticamente al importar el `pom.xml`.

   Si no usas Maven, puedes descargar las dependencias de **Graphviz** y **JGraphT** y agregarlas manualmente al proyecto.

### Dependencias

El proyecto utiliza las siguientes bibliotecas:

- **Graphviz**: Para generar la visualización del árbol de decisiones.
- **JGraphT**: (Opcional) Para representar y manipular el árbol de decisiones como un grafo.

#### Si usas Maven:

Asegúrate de agregar estas dependencias al archivo `pom.xml`:

```xml
<dependencies>
    <!-- Dependencia de Graphviz -->
    <dependency>
        <groupId>guru.nidi</groupId>
        <artifactId>graphviz-java</artifactId>
        <version>0.18.1</version>
    </dependency>

    <!-- Dependencia de JGraphT (opcional) -->
    <dependency>
        <groupId>org.jgrapht</groupId>
        <artifactId>jgrapht-core</artifactId>
        <version>1.5.1</version>
    </dependency>
</dependencies>
```

## Ejecución

Para ejecutar el programa:

1. **Ejecuta el archivo `Main.java`**:
    - Al ejecutar este archivo, el sistema comenzará a hacer preguntas al usuario sobre el estado de la computadora.
    - Responde "Sí" o "No" según las indicaciones y el sistema te dará un diagnóstico.

2. **Generar el gráfico del árbol de decisiones**:
    - El proyecto también genera un gráfico visual del árbol de decisiones en formato **PNG** o **SVG**.
    - Si estás usando Graphviz para renderizar el árbol, ejecuta el programa y el archivo visual será generado automáticamente.

## Ejemplo de Ejecución

Cuando ejecutes el programa, se te hará una serie de preguntas en la consola. Aquí tienes un ejemplo:

```
¿La computadora enciende? (Sí/No):
Sí
¿La pantalla muestra algo? (Sí/No):
Sí
¿El sistema operativo carga? (Sí/No):
No
Problema con el sistema operativo
```

## Generar el Diagrama Visual

Este proyecto también incluye una función para generar un diagrama visual del árbol de decisiones utilizando **Graphviz**. Al ejecutar el programa, se creará una imagen (por ejemplo, `arbol.png`) que representa gráficamente las preguntas y soluciones del árbol.

Para ver el diagrama, simplemente ejecuta el programa y encontrarás el archivo de imagen en el directorio raíz del proyecto.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

```

Este archivo `README.md` explica la funcionalidad del proyecto, cómo configurarlo e instalarlo, y cómo ejecutarlo. Puedes usarlo tal como está o modificarlo según sea necesario para tu repositorio.

¡Espero que te sea útil! Si necesitas más ajustes, no dudes en pedírmelo.