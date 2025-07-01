package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets() {

    }
    public Set<String> construirHashSet(){
        Set<String> palabras= new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
    }
    public Set<String> contruirLinkedHashSet(){
        Set<String> palabrasLinkeadas= new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");
        return palabrasLinkeadas;
    }
    public Set<String> construirTreeSet(){
        Set<String> palabrasTree= new TreeSet<>();
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        return palabrasTree;

    }
    public Set<String> construirTreeSetConComparador(){
        //Crear un Comparator
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos la longitud
                int result= Integer.compare(s1.length(), s2.length());
                //Si tienen la misma longitud,comparamos alfabeticamente
                if(result==0){
                    return s1.compareTo(s2);
                }
                return result;
            }
        };

        Set<String> palabrasTree= new TreeSet<>(comparadorLongitud);
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        palabrasTree.add("Celulas");

        return palabrasTree;
    }
     public Set<String> construirTreeSetConComparadorReves(){
        //Crear un Comparator
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos la longitud
                int result= Integer.compare(s2.length(), s1.length());
                //Si tienen la misma longitud,comparamos alfabeticamente
                if(result==0){
                    return s2.compareTo(s1);
                }
                return result;
            }
        };

        Set<String> palabrasTree= new TreeSet<>(comparadorLongitud);
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        palabrasTree.add("Celulas");

        return palabrasTree;
    }

}
