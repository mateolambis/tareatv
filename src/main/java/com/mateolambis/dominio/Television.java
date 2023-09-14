package com.mateolambis.dominio;

import java.util.Date;

public class Television {
    public String serial;
    public Date fechaCreacion;
    public char marca;
    public short tamanoPantalla;
    public tipoConexion tipoConexion;
    public Persona propietarioTelevision;
    public byte volumen;
    public boolean encendida;
    public int canales;
    public Television(){
        encendida= true;
        canales=1;
    }
    public void encender() {
        this.encendida = true;
        System.out.println("La television esta encendida");
    }
    public void apagar(){
        this.encendida= false;
        System.out.println("La television esta apagada");
    }
    public int cambiarCanal(int nuevoCanal){
            this.canales = nuevoCanal;
            return nuevoCanal;
    }

    public byte cambiarVolumen(byte nuevoVolumen){
        if (nuevoVolumen > 0 && nuevoVolumen <= 100){
            this.volumen = nuevoVolumen;
            return nuevoVolumen;
        }else {
            return this.volumen;
        }
    }
}
