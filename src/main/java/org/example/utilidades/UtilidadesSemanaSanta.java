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
     *
     * @param hermandades
     * @return
     */
    public static Map<DiaSalida, Integer> numHermandadesPorDiaSalida(List<Hermandad> hermandades){
        return new HashMap<>();
    }


    /**
     * Ejercico 3 (2 pts)
     *
     * @param hermandad
     * @return
     */
    public static Map<Hermano,Integer> hermanosConMayorAntiguedad(Hermandad hermandad){
        return new HashMap<>();
    }



    /**
     * Ejercico 4 (2.5  pts)
     *
     * @param hermandad
     * @return
     */
    public static JuntaGobierno elegirJuntaDeGobierno(Hermandad hermandad){
        return new JuntaGobierno();
    }



    /**
     * Ejercicio 5 (3.5 pts)
     *
     * @param hermandad
     * @return
     */
    public static InformeHermandad informeHermandad(Hermandad hermandad){
        return null;
    }


}
