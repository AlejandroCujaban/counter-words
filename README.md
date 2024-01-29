# Contador de Frecuencia de Palabras

Este programa en Java cuenta la frecuencia de las palabras en un archivo de texto y muestra el recuento total de palabras, el recuento total de caracteres y el recuento total de caracteres en el archivo.

## Observaciones sobre la Complejidad Computacional

- La complejidad computacional de cada línea del algoritmo es la siguiente:

1. Lectura del archivo de texto: Lineal, O(n), donde n es el número de líneas en el archivo.
2. Conteo de caracteres en la línea: Lineal, O(m), donde m es la longitud de la línea.
3. División de la línea en palabras: Lineal, O(k), donde k es el número de palabras en la línea.
4. Actualización de la frecuencia de cada palabra en el mapa: Constante, O(1), ya que es una operación de acceso y actualización en un mapa hash.
5. Creación de una lista a partir de las entradas del mapa: Lineal, O(p), donde p es el número de entradas en el mapa.
6. Ordenamiento de la lista en función de los valores de frecuencia: O(n log n) donde n es el número de elementos en la lista a ordenar.
7. Impresión del recuento de palabras y caracteres: Lineal, O(p), donde p es el número de entradas en la lista.

## Ejecución del Programa

Para ejecutar el programa, sigue estos pasos:

1. Asegúrate de tener instalado Java en tu sistema.
2. Clona este repositorio en tu máquina local.
3. Compila el programa utilizando el comando `javac Main.java`.
4. Ejecuta el programa utilizando el comando `java Main`.


## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún problema o quieres mejorar el programa, no dudes en crear un pull request o abrir un issue en el repositorio.

