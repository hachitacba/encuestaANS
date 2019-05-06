/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Aldo
 */
public class GestorEncuestas {

    private LinkedList<Encuesta> encuesta;

    public GestorEncuestas() {
        encuesta = new LinkedList();
    }

    public boolean addencuesta(Encuesta p) {
        return encuesta.add(p);
    }

    public String ordenarPor(int crit) {
        /*crit=0 -> ordenamiento natural (apellido)
          crit=1 -> por edad
          crit=2 -> por genero
         */
        switch (crit) {
            case 0:
                Collections.sort(encuesta);
                break;
            case 1:
                Collections.sort(encuesta, new ComparacionPorNombre());
                break;
            case 2:
                Collections.sort(encuesta, new ComparacionPorEdad());
                break;
            case 3:
                Collections.sort(encuesta, new ComparacionPorGenero());
                break;
            default:
                Collections.sort(encuesta);
        }
        return toString();
    }

    public float CalculoPromedio() {
        float prom = 0f, acu = 0f;
        if (encuesta.size() != 0) {

            for (int i = 0; i < encuesta.size(); i++) {
                acu += encuesta.get(i).getEdad();
            }
            prom = acu / encuesta.size();
        } else {
            prom = 0;
        }
        return prom;
    }

    @Override
    public String toString() {
        
        String aux = "";
        for (int i = 0; i < encuesta.size(); i++) {
            aux = aux + "\n" + encuesta.get(i).toString();
        }
        return aux;
    }

}
