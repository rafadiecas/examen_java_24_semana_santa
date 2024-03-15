package org.example.utilidades;

import org.example.enums.DiaSalida;
import org.example.enums.TipoCuota;
import org.example.modelos.Hermandad;
import org.example.modelos.Hermano;
import org.example.modelos.InformeHermandad;
import org.example.modelos.JuntaGobierno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesSemanaSanta {

    /**
     * Ejercicio 1 (1 pt)
     * El método devuelve las hermandades cuya cuota no supere la cuota máxima que se pasa como parámetro
     * y cuyo tipo Cuota sea la que se pasa como parámetro.
     *
     * @param hermandades
     * @param cuotaMaxima
     * @param tipoCuota
     * @return
     */
    public static List<Hermandad> hermandadesConCuota(List<Hermandad> hermandades, Double cuotaMaxima, TipoCuota tipoCuota){
        return new ArrayList<>();
    }


    /**
     * Ejercicio 2 (1 pt)
     * El método devuelve un Mapa con el número de hermandades que sale cada día.
     * Cabe destacar que los días que no salen hermandades no es necesario que aparezcan como claves del mapa.
     *
     * @param hermandades
     * @return
     */
    public static Map<DiaSalida, Integer> numHermandadesPorDiaSalida(List<Hermandad> hermandades){
        return new HashMap<>();
    }


    /**
     * Ejercico 3 (2 pts)
     * A partir de una hermandad el método devuelve los 5 hermanos que lleven más años en la hermandad
     * teniendo en cuenta su fecha de inscripción en la hermandad.
     * El mapa contiene los 5 hermanos más antiguos de la hermanda y el tiempo que llevan de hermanos de la hermandad.
     *
     * @param hermandad
     * @return
     */
    public static Map<Hermano,Integer> hermanosConMayorAntiguedad(Hermandad hermandad){
        return new HashMap<>();
    }



    /**
     * Ejercico 4 (2.5  pts)
     * A partir de una hermandad el método devuelve su junta de gobierno electa aleatoriamente de la siguiente manera:
     * - hermandad -> se establece la hermandad pasada como parámetro
     * - fechaInicioMandado -> la fechaActual
     * - fechaFinMandado -> la fecha actual + 4 años
     * - personalJunta -> se ha de rellanar asignando todos los cargos como claves del mapa y como valores
     *                    los hermanos escogidos al azar siguiento el orden de antiguedad por cargo (de más mayor a menos)
     *
     * @param hermandad
     * @return
     */
    public static JuntaGobierno elegirJuntaDeGobierno(Hermandad hermandad){
        return new JuntaGobierno();
    }



    /**
     * Ejercicio 5 (3.5 pts)
     * A partir de una hermandad devuelve el informe de la hermandad completo con los siguientes datos:
     * - hermandad-> La hermandad pasada como parámetro
     * - totalHermanos -> el número de hermanos que tiene la hermandad
     * - totalTitulares -> el número total de titulares que tiene la hermandad
     * - totalPasos -> el número total de pasos que tiene la hermandad
     * - totalCostaleros -> el número total de costaleros = se calcula
     *                      multiplicando de cada paso el número de costaleros * el número de cuadrillas
     *                      y luego sumando el total de cada paso.
     * - costalerosPorPaso -> contiene de clave los pasos de la hermandad y de valor el total de costaleros por cada paso
     *                        calculado de el número de costaleros * el número de cuadrillas
     * - pasoTotalFiguras -> contiene de clave los pasos de la hermandad y de valor el total se figuras del paso
     *                       que se calcula sumando el número de titulares del paso + el número de figuras segundarias
     *
     * @param hermandad
     * @return
     */
    public static InformeHermandad informeHermandad(Hermandad hermandad){
        return null;
    }


}
