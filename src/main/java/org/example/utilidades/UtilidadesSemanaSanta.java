package org.example.utilidades;

import org.example.enums.CargoJunta;
import org.example.enums.DiaSalida;
import org.example.enums.TipoCuota;
import org.example.modelos.Hermandad;
import org.example.modelos.Hermano;
import org.example.modelos.InformeHermandad;
import org.example.modelos.JuntaGobierno;

import java.sql.ClientInfoStatus;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

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
        return hermandades.stream().filter(h->h.getCuotaHermano()<=cuotaMaxima && h.getTipoCuota().equals(tipoCuota)).collect(Collectors.toList());
    }


    /**
     * Ejercicio 2 (1 pt)
     *
     * @param hermandades
     * @return
     */
    public static Map<DiaSalida, Integer> numHermandadesPorDiaSalida(List<Hermandad> hermandades){
        return hermandades.stream().collect(Collectors.groupingBy(Hermandad::getDiaSalida,Collectors.summingInt(h->1)));
    }


    /**
     * Ejercico 3 (2 pts)
     *
     * @param hermandad
     * @return
     */
    public static Map<Hermano,Integer> hermanosConMayorAntiguedad(Hermandad hermandad){
        Map<Hermano,Integer> solucion = new HashMap<>();
        List<Hermano> ordenada = hermandad.getHermanos().stream().sorted(Comparator.comparing(Hermano::getFechaInscripcionHermandad)).toList();

        for (int i = 0; i<5; i++){
            solucion.put(ordenada.get(i),Period.between(ordenada.get(i).getFechaInscripcionHermandad(), LocalDate.now()).getYears());

        }

        return solucion;

    }



    /**
     * Ejercico 4 (2.5  pts)
     *
     * @param hermandad
     * @return
     */
    public static JuntaGobierno elegirJuntaDeGobierno(Hermandad hermandad){

        JuntaGobierno juntaGobierno = new JuntaGobierno();
        juntaGobierno.setHermandad(hermandad);
        juntaGobierno.setFechaInicioMandato(LocalDate.now());
        juntaGobierno.setFechaFinMandato(LocalDate.now().plusYears(4));

        Map<CargoJunta, Hermano> mapa = new HashMap<>();


        List<Hermano> ordenada = hermandad.getHermanos().stream().sorted(Comparator.comparing(Hermano::getFechaInscripcionHermandad)).toList();
        //List<Hermano> ordenada = new ArrayList<>(hermandad.getHermanos().stream().sorted(Comparator.comparing(Hermano::getFechaInscripcionHermandad)).toList());
        int i = 0;

        for (CargoJunta cargoJunta : CargoJunta.values()){
            mapa.put(cargoJunta,ordenada.get(i));
            i++;

        }

        //for (CargoJunta cargoJunta : CargoJunta.values()){
            //mapa.put(cargoJunta,ordenada.get(0));
            //ordenada.remove(0);
        //}

        //los comentarios es otra forma de hacerlo, usando una arraylist y borrando

        juntaGobierno.setPersonalJunta(mapa);
        return juntaGobierno;
    }



    /**
     * Ejercicio 5 (3.5 pts)
     *
     * @param hermandad
     * @return
     */
    public static InformeHermandad informeHermandad(Hermandad hermandad){
        InformeHermandad informeHermandad = new InformeHermandad();
        informeHermandad.setHermandad(hermandad);
        informeHermandad.setTotalHermanos(hermandad.getHermanos().size());
        informeHermandad.setTotalTitulares(hermandad.getTitulares().size());
        informeHermandad.setTotalPasos(hermandad.getPasos().size());
        informeHermandad.setTotalCostaleros(hermandad.getPasos().stream().mapToInt(p->p.getNumCostaleros()*p.getNumCuadrillas()).sum());
        informeHermandad.setCostalerosPorPaso(hermandad.getPasos().stream().collect(Collectors.toMap(p->p,p->p.getNumCuadrillas()*p.getNumCostaleros())));
        informeHermandad.setPasoTotalFiguras(hermandad.getPasos().stream().collect(Collectors.toMap(p->p,p->p.getNumFigurasSegundarias()+p.getTitulares().size())));

        return informeHermandad;
    }


}
