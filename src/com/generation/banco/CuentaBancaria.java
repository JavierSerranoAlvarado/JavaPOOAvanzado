package com.generation.banco;

import jdk.nashorn.internal.objects.annotations.Setter;

public class CuentaBancaria {
    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre(){
        return this.nombre;
    }

    public String getClave(){
        return this.clave;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    /*
    public void setSaldo(float saldo) {
        if(saldo < 0){
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }

    } */

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo(){
        System.out.println(this.saldo);
    }
}
