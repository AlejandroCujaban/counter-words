/**
 * Autor: oscaralejandroflorez@gmail.com
 * Fecha: 25/01/2024
 * Descripción: Este programa cuenta la frecuencia de las palabras en un archivo de texto,
 * muestra el recuento total de palabras, y el recuento total de caracteres en el archivo.
 */

package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Ruta del archivo de texto
        String filePath = "src/main/resources/texto.txt";
        int characters = 0;

        // Crear un mapa para almacenar la frecuencia de las palabras
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Leer el archivo de texto y contar la frecuencia de las palabras
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Contar caracteres en la línea
                characters += line.length();

                // Dividir la línea en palabras usando espacios como delimitadores
                String[] words = line.split("\\s+");

                // Actualizar la frecuencia de cada palabra en el mapa
                for (String word : words) {
                    // Convertir la palabra a minúsculas para evitar diferencias de capitalización
                    String lowercaseWord = word.toLowerCase();
                    // Obtener la frecuencia actual de la palabra, o 0 si no existe
                    int frequency = wordFrequencyMap.getOrDefault(lowercaseWord, 0);
                    // Incrementar la frecuencia y actualizar el mapa
                    wordFrequencyMap.put(lowercaseWord, frequency + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crear una lista a partir de las entradas del mapa
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordFrequencyMap.entrySet());

        // Ordenar la lista en función de los valores de frecuencia en orden descendente
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                // Orden descendente
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        // Imprimir el recuento de palabras y caracteres
        int totalWords = 0;
        int totalCharacters = 0;
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
            totalWords += entry.getValue();
            totalCharacters += entry.getKey().length() * entry.getValue();
        }
        System.out.println("Total words: " + totalWords);
        System.out.println("Total characters: " + characters);
    }
}
