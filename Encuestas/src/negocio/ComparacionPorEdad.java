/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Comparator;

/**
 *
 * @author Aldo
 */
public class ComparacionPorEdad implements Comparator<Encuesta> {

    @Override
    public int compare(Encuesta p1, Encuesta p2) {
        return p1.getEdad() - p2.getEdad();
    }

}
