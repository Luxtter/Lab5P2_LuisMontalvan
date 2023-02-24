/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Personaje {
    private String nombre, universo, fuerza, poder, aMental, aFisica, hp;

    public Personaje() {
    }

    public Personaje(String nombre, String universo, String fuerza, String poder, String aMental, String aFisica, String hp) {
        this.nombre = nombre;
        this.universo = universo;
        this.fuerza = fuerza;
        this.poder = poder;
        this.aMental = aMental;
        this.aFisica = aFisica;
        this.hp = hp;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getaMental() {
        return aMental;
    }

    public void setaMental(String aMental) {
        this.aMental = aMental;
    }

    public String getaFisica() {
        return aFisica;
    }

    public void setaFisica(String aFisica) {
        this.aFisica = aFisica;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Poder  -> "+poder+ "\nFuerza -> "+fuerza+ "\nAgilidad Fisica -> "+aFisica+"\nAgilidad Mental -> "+aMental+"HP -> "+hp;
    }
    
}
