package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto>{
     @Override
    public int compare(Contacto o1, Contacto o2) {
        // primero el apellido orden alfabetico
        
        int result= o1.getApellido().compareTo(o2.getApellido());
        if(result!=0){
            return result;
        }
        //si son iguales comparo por el nombre orden alfabetico
        int result2= o1.getNombre().compareTo(o2.getNombre());
        if (result2!=0) {
            return result2;
        }
        //COMPARO NUMERO DE MANERA DESCENDENTE
        int result3= o2.getTelefono().compareTo(o1.getTelefono());
        if(result3!=0){
            return result3;
        }
        return result;

        
    }
}
