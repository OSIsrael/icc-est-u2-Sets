import java.util.Set;

import controllers.Contactocontroller;
import controllers.Sets;


public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        /*runHasSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorReves(sets);*/
        Contactocontroller contactocontroller= new Contactocontroller();
        

    }
    public static void runHasSet(Sets sets){
        Set<String> elementos = sets.construirHashSet();
        System.out.println("------- HashSet--------");
        System.out.println("Elemento del HashSet (no se garantiza orden)");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
    public static void runLinkedHashSet(Sets sets){
        Set<String> elementos = sets.contruirLinkedHashSet();
        System.out.println("------- LinkedHashSet--------");
        System.out.println("Elemento del LinkedHashSet (respeta orden de insercion)");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
    public static void runTreeSet(Sets sets){
        Set<String> elementos = sets.construirTreeSet();
        System.out.println("------- TreeSet--------");
        System.out.println("Elemento del TreeSet (respeta orden alfabetico)");
        for (String string : elementos) {
            System.out.println(string);
        }
        
    }
    public static void runTreeSetConComparador(Sets sets){
        Set<String> elementos = sets.construirTreeSetConComparador();
        System.out.println("------- TreeSet con Comparador--------");
        System.out.println("Elemento del TreeSet (ordenados por longitud y luego alfabeticamente)");
        for (String string : elementos) {
            System.out.println(string);
        }
    }
    public static void runTreeSetConComparadorReves(Sets sets){
        Set<String> elementos = sets.construirTreeSetConComparadorReves();
        System.out.println("------- TreeSet con Comparador en otro Orden--------");
        System.out.println("Elemento del TreeSet (ordenados por longitud y luego alfabeticamente)");
        for (String string : elementos) {
            System.out.println(string);
        }
    }
    
}
