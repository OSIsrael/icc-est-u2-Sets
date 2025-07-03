package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {
    public Ejercicios(){
        System.out.println("===================================");
        System.out.println("EJERCICIO 1: ");
        System.out.println("Arreglo 1 ---> "+tieneDuplicados(new int[]{1,2,3,4,5}));
        System.out.println("Arreglo 2 ---> "+tieneDuplicados(new int[]{1,2,3,4,5,4,3,2,45}));
        System.out.println("===================================");
        System.out.println("EJERCICIO 2:");
        System.out.println("Murcielago es isograma ---> "+esIsograma("murcielago"));
        System.out.println("Camaleon es isograma ---> "+esIsograma("camaleon"));
        System.out.println("===================================");

        System.out.println("EJERCICIO 3:");
        System.out.println("Palabras unicas: "+contarPalabrasUnicas("La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n" + //
                        "\n" + //
                        "            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n" + //
                        "\n" + //
                        "            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.\n" + //
                        ""));

    }
    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> duplicados = new HashSet<>();

        for (int numero : numeros) {
            if(!duplicados.add(numero)){
                return true;
            }
        }
        return false;
    }
    public static boolean esIsograma(String palabra){
        palabra = palabra.toLowerCase();
        Set<Character> letras = new HashSet<>();
        for (char letra : palabra.toCharArray()) {
            if(!letras.add(letra)){
                return false;
            }
        }
        return true;
    }  
    public int contarPalabrasUnicas(String frase){
        String[] palabras = frase.split(" ");
        Set<String> palabrasUnicas = new HashSet<>();
        for (String palabra : palabras) {
            palabrasUnicas.add(palabra);
        }
        return palabrasUnicas.size();

    } 
}
