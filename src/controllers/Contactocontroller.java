package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class Contactocontroller {
    public Contactocontroller() {
        runTreeContacto();
        runTreeContactoConNumero();
    }

    private void runTreeContacto(){

        ContactoComparator contactoComparator= new ContactoComparator();
        Set<Contacto> contactos= new TreeSet<>(contactoComparator);
        contactos.add(new Contacto("Pedro","Lopez","222222222"));
        contactos.add(new Contacto("Luis","Perez","111111111"));
        contactos.add(new Contacto("Pedro","Gonzales","123456789"));
        contactos.add(new Contacto("Ana","Perez", "987654321"));
        contactos.add(new Contacto("Pedro","Lopez","123456789"));
        System.out.println();
        System.out.println("Contactos orden alfabetico apellido - nombre");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
     private void runTreeContactoConNumero(){
        ContactoComparatorConNumero contactoComparator= new ContactoComparatorConNumero();
        Set<Contacto> contactos= new TreeSet<>(contactoComparator);
        contactos.add(new Contacto("Pedro","Lopez","222222222"));
        contactos.add(new Contacto("Luis","Perez","111111111"));
        contactos.add(new Contacto("Pedro","Gonzales","123456789"));
        contactos.add(new Contacto("Ana","Perez", "987654321"));
        contactos.add(new Contacto("Pedro","Lopez","123456789"));
        System.out.println();
        System.out.println("Contactos orden alfabetico apellido - nombre - telefono (des)");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }


    
}
