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
public class ComparacionPorNombre implements Comparator<Encuesta>{

    @Override
   public int compare(Encuesta p1,Encuesta p2)
    {
        int res=p1.getApellido().compareToIgnoreCase(p2.getApellido());
        if (res==0) {
            res=p1.getNombre().compareTo(p2.getNombre());
        }
        return res;
    }

}
    

