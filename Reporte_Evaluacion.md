# Reporte de Evaluación: Actividad Evaluable 2 (Taller 2)
**Estudiante / Entregable:** 202532502615_EstructuraDeDatos
**Puntaje Total:** 39.5 / 50.0 pts

A continuación se detalla la evaluación de cada uno de los puntos requeridos en la rúbrica de la actividad:

## 1. Orden del Desarrollador (0.5 / 5 pts)
- **Estructura de Carpetas (0/1.25):** No se respetó la estructura solicitada (una carpeta por actividad). Casi todo se concentró en la carpeta `actividad2`, y el `punto 9` quedó por fuera de las convenciones.
- **Gitignore (0/1.25):** No se incluyó el archivo `.gitignore` para omitir clases compiladas e informaciones de IDE.
- **README.md (0.5/1.25):** El archivo incluye el nombre del estudiante y el índice, pero faltan las reflexiones técnicas por cada punto solicitadas.
- **Commits (0/1.25):** Los mensajes de los commits ("bn", "mn", "readme", etc.) en su mayoría no son descriptivos y no reflejan el progreso incremental de la mejor forma.

---

## 2. Desarrollo de las Actividades (39.0 / 45 pts)

### Actividad 1: Diseño Conceptual (TADs) - 3.5 / 5 pts
- **Abstracción (2/2):** Uso correcto de la palabra reservada `interface`.
- **Completitud (1.5/1.5):** Tipos de datos coherentes para entradas y salidas.
- **Clasificación (0/1.5):** No se incluyó la documentación Javadoc requerida en los métodos, ni se identificó si la estructura es lineal o no lineal.

### Actividad 2: Monitoreo Climático (Arreglos) - 5.0 / 5 pts
- **Uso de índices (2/2):** Implementación correcta del ciclo `for` con la condición `i < temperaturas.length`.
- **Delimitación (1.5/1.5):** Se implementó correctamente el `try-catch` para capturar un error manual en el índice 24.
- **Eficiencia (1.5/1.5):** El acceso directo simulado (`temperaturas[12]`) fue utilizado correctamente.

### Actividad 3: Sistema Bancario (Vector) - 5.0 / 5 pts
- **Justificación (2.5/2.5):** El comentario argumenta correctamente la naturaleza Thread-Safe de Vector.
- **Análisis de Costo (1.25/1.25):** Implementada la comprobación de la diferencia de velocidad frente a ArrayList.
- **Operatividad (1.25/1.25):** Sintaxis correcta con el uso de genéricos.

### Actividad 4: Validador de Documentos (String/StringBuilder) - 4.5 / 5 pts
- **Manipulación (2/2):** Uso adecuado de `trim`, `toUpperCase` y `substring`.
- **Concepto (1.5/2):** Aunque se imprimen las referencias de memoria de los objetos (HashCodes), **faltó el comentario explicativo** que relacione dichos hashes con el concepto de inmutabilidad en el String Pool.
- **Eficiencia (1/1):** Implementación correcta de `StringBuilder.reverse()`.

### Actividad 5: Reserva de Cine (Matrices) - 5.0 / 5 pts
- **Modelado (1.5/1.5):** Definidas de manera formal las dimensiones de la matriz [8][10].
- **Recorrido (2/2):** Recorrido y visualización con bucles for anidados de manera competente.
- **Lógica (1.5/1.5):** Validación correcta de contiguos y reservas.

### Actividad 6: Carrito de Compras (ArrayList) - 5.0 / 5 pts
- **Dinamismo (2/2):** Uso aplicado de la colección dinámica en lugar de estática.
- **Operaciones (1.5/1.5):** Implementa bien las funciones exigidas, previniendo duplicidades dentro del método con `contains()` y `removeIf()`.
- **Teoría (1.5/1.5):** Incluye la explicación teórica en `Main.java` sobre cómo Java hace el redimensionamiento interno.

### Actividad 7: Historial (Stack) - 5.0 / 5 pts
- **Lógica LIFO (2.5/2.5):** Mecanismo ejecutado sin problemas, entendiendo bien el orden.
- **API Stack (1.5/1.5):** Empleo de los métodos nativos correctos.
- **Robustez (1/1):** Controles mediante `empty()` listos.

### Actividad 8: Sistema Tickets (Queue) - 2.5 / 5 pts
- **Lógica FIFO (0/2.5):** Error de implementación. El ciclo `while (colaSoporte.isEmpty())` tiene la condición invertida, de modo que el bloque interno nunca se ejecutará, dejando la cola sin atender a nadie. Debió usarse `!colaSoporte.isEmpty()`.
- **Implementación (1.5/1.5):** Instanciación apropiada de `LinkedList`.
- **Manejo de Vacío (1/1):** Buen comentario explicativo acerca del uso de `.poll()`.

### Actividad 9: Inventario (HashMap) - 3.5 / 5 pts
- **Asociación (2/2):** Implementadas operaciones `put`/`get`.
- **Unicidad (1.5/1.5):** Mostró cómo se sobreescribe el ítem `laptop Dell` al utilizar una llave ya existente.
- **Eficiencia (0/1.5):** No hay redactado ningún concepto ni explicación acerca de que `get()` no recorre todo el mapa o que opera en O(1).
