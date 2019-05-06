/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Arrays;
import java.util.LinkedList;
import presentacion.*;

/**
 *
 * @author Aldo
 */
public class Encuesta implements Comparable<Encuesta> {

    int codigo;
    private static int nro = 1;
    private String apellido, nombre;
    private int edad;
    private char genero;
    private String[] carreras;
    private int niveleducativo;

    public static int getNro() {
        return nro;
    }

    public Encuesta(String apellido, String nombre, int edad, char genero, String[] carreras, int niveleducativo) {
        this.codigo = nro;
        nro = nro + 1;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.carreras = new String[4];
        this.niveleducativo = niveleducativo;
    }

    public String[] getCarreras() {

        return carreras;
    }

    public void setCarreras(String[] carreras) {
        this.carreras = carreras;
    }
//    private String[]carreras;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getNiveleducativo() {
        return niveleducativo;
    }

    public void setNiveleducativo(int niveleducativo) {
        this.niveleducativo = niveleducativo;
    }

    @Override
    public String toString() {
        int op = niveleducativo;
        String nivel = "ninguno";
        switch (op) {
            case 2:
                nivel = "Inicial";
                break;
            case 3:
                nivel = "Primerio";
                break;
            case 4:
                nivel = "Secundario";
                break;
            case 5:
                nivel = "Terciario";
                break;
            case 6:
                nivel = "Universitario";
                break;
            case 7:
                nivel = "Posgrado";
                break;
            default:
                nivel = "ninguno";

        }
        return "codigo=" + codigo + " Apellido y nombre =" + apellido + ", " + nombre + "\t edad=" + edad + "\t genero=" + genero + " carreras= " + Arrays.toString(carreras) + " niveleducativo= " + nivel;
    }

    @Override
    public int compareTo(Encuesta obj) {
        return this.apellido.compareTo(obj.apellido);
    }

}
