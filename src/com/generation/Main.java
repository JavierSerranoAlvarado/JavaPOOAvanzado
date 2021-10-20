package com.generation;


import com.generation.banco.CuentaBancaria;
import paquete2.Animal;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        /* Los metodos sin ser privados ni usar get y set puede romper la logica del prorama
        cuenta.nombre = "Javier Eduardo";
        cuenta.clave = "XYZ-56421541";
        cuenta.saldo = -5000;
        */

        /*
        cuenta.setNombre("Javier Eduardo");
        cuenta.setClave("XYZ-56421541");
        cuenta.setSaldo(-5000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
        */
        /*
        Animal animal = new Animal();
        //modificador de acceso por default
        animal.nombre = "Iguana"; // <- no deja entrar por que estamos en otro paquete
         */
        /*
        Persona persona = new Persona();
        // Cuando es private solamente la misma clase pueda acceder a sus variables.
        //Desde otro lado no se puede acceder
        persona.nombre = "Carlos";
        persona.edad = 31;
        */

        Person person= new Person("Santiago", 33, "102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());

    }
}
