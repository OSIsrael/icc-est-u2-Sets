package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // primero el apellido orden alfabetico
        //si son iguales comparo por el nombre orden alfabetico
        int result= o1.getApellido().compareTo(o2.getApellido());
        if(result==0){
            return o1.getNombre().compareTo(o2.getNombre());
        }
        return result;
    }
  
    
}
