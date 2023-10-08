package com.HectorVargas.App;

import com.HectorVargas.Dominio.Competencia;
import com.HectorVargas.Dominio.Corredor;
import com.HectorVargas.Dominio.Equipo;
import com.HectorVargas.Dominio.Etapa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Competencia competencia = new Competencia();

        Equipo equipo1 = new Equipo("Equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2");
        Equipo equipo3 = new Equipo("Equipo 3");
        Equipo equipo4 = new Equipo("Equipo 4");
        Equipo equipo5 = new Equipo("Equipo 5");

        competencia.agregarEquipo(equipo1);
        competencia.agregarEquipo(equipo2);
        competencia.agregarEquipo(equipo3);
        competencia.agregarEquipo(equipo4);
        competencia.agregarEquipo(equipo5);


        Etapa[] etapas = new Etapa[10];
        for (int i = 0; i < 10; i++) {
            etapas[i] = new Etapa();
        }

        Corredor corredor1 = new Corredor("Corredor 1 = JUAN", equipo1);
        Corredor corredor2 = new Corredor("Corredor 2  = PABLO", equipo1);
        Corredor corredor3 = new Corredor("Corredor 3 = LUCIA", equipo1);
        Corredor corredor4 = new Corredor("Corredor 4 = MARIA", equipo1);
        Corredor corredor5 = new Corredor("Corredor 5 = ROBERTO", equipo1);

        Corredor corredor6 = new Corredor("Corredor 6 = NICOLAS", equipo2);
        Corredor corredor7 = new Corredor("Corredor 7 = PETRO", equipo2);
        Corredor corredor8 = new Corredor("Corredor 8 = JHON", equipo2);
        Corredor corredor9 = new Corredor("Corredor 9 = RICARDO", equipo2);
        Corredor corredor10 = new Corredor("Corredor 10 = FRANSISCO", equipo2);

        Corredor corredor11 = new Corredor("Corredor 11 = PEDRO", equipo3);
        Corredor corredor12 = new Corredor("Corredor 12 = MARIA", equipo3);
        Corredor corredor13= new Corredor("Corredor 13 = LUISA", equipo3);
        Corredor corredor14 = new Corredor("Corredor 14 = DUVAN", equipo3);
        Corredor corredor15 = new Corredor("Corredor 15 = SIMON", equipo3);

        Corredor corredor16 = new Corredor("Corredor 16 = JESUS", equipo4);
        Corredor corredor17 = new Corredor("Corredor 17  = JULIAN", equipo4);
        Corredor corredor18 = new Corredor("Corredor 18 = JOSE", equipo4);
        Corredor corredor19 = new Corredor("Corredor 19 = CAROL", equipo4);
        Corredor corredor20 = new Corredor("Corredor 20 = RODRIGO", equipo4);


        Corredor corredor21 = new Corredor("Corredor 21 = TOMY", equipo5);
        Corredor corredor22 = new Corredor("Corredor 22  = ANDRES", equipo5);
        Corredor corredor23 = new Corredor("Corredor 23 = JOSUE", equipo5);
        Corredor corredor24 = new Corredor("Corredor 24 = CAROLINA", equipo5);
        Corredor corredor25 = new Corredor("Corredor 25 = JAMES", equipo5);

        etapas[0].agregarCorredor(corredor1);
        etapas[0].agregarCorredor(corredor6);
        etapas[1].agregarCorredor(corredor5);
        etapas[2].agregarCorredor(corredor20);
        etapas[2].agregarCorredor(corredor8);
        etapas[3].agregarCorredor(corredor15);
        etapas[3].agregarCorredor(corredor17);
        etapas[3].agregarCorredor(corredor16);
        etapas[4].agregarCorredor(corredor9);
        etapas[5].agregarCorredor(corredor22);
        etapas[5].agregarCorredor(corredor3);
        etapas[6].agregarCorredor(corredor13);
        etapas[6].agregarCorredor(corredor12);
        etapas[7].agregarCorredor(corredor18);
        etapas[7].agregarCorredor(corredor4);
        etapas[8].agregarCorredor(corredor14);
        etapas[8].agregarCorredor(corredor25);
        etapas[9].agregarCorredor(corredor10);



        List<Equipo> equipos = competencia.getEquiposHV();
        System.out.println("Equipos de la competencia:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombreHV());
        }


        List<List<Corredor>> resultadosEtapa = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            resultadosEtapa.add(etapas[i].getCorredoresHV());
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Resultados de la Etapa " + (i + 1) + ":");
            List<Corredor> corredoresEtapa = resultadosEtapa.get(i);
            for (Corredor corredor : corredoresEtapa) {
                System.out.println(corredor.getNombreHV());
            }
        }


        Equipo equipoSeleccionado = equipo1;
        List<Corredor> corredoresEquipo1 = equipoSeleccionado.getCorredoresHV();
        System.out.println("Corredores del equipo " + equipoSeleccionado.getNombreHV() + ":");
        for (Corredor corredor : corredoresEquipo1) {
            System.out.println(corredor.getNombreHV());
        }
        Equipo equipoSeleccionado1 = equipo2;
        List<Corredor> corredoresEquipo2 = equipoSeleccionado1.getCorredoresHV();
        System.out.println("Corredores del equipo " + equipoSeleccionado1.getNombreHV() + ":");
        for (Corredor corredor : corredoresEquipo2) {
            System.out.println(corredor.getNombreHV());
        }
        Equipo equipoSeleccionado2 = equipo3;
        List<Corredor> corredoresEquipo3 = equipoSeleccionado2.getCorredoresHV();
        System.out.println("Corredores del equipo " + equipoSeleccionado2.getNombreHV() + ":");
        for (Corredor corredor : corredoresEquipo3) {
            System.out.println(corredor.getNombreHV());
        }

        Equipo equipoSeleccionado3 = equipo4;
        List<Corredor> corredoresEquipo4 = equipoSeleccionado3.getCorredoresHV();
        System.out.println("Corredores del equipo " + equipoSeleccionado3.getNombreHV() + ":");
        for (Corredor corredor : corredoresEquipo4) {
            System.out.println(corredor.getNombreHV());
        }

        Equipo equipoSeleccionado4 = equipo5;
        List<Corredor> corredoresEquipo5 = equipoSeleccionado4.getCorredoresHV();
        System.out.println("Corredores del equipo " + equipoSeleccionado4.getNombreHV() + ":");
        for (Corredor corredor : corredoresEquipo5) {
            System.out.println(corredor.getNombreHV());
        }


        Map<Equipo, Long> tiemposEquipos = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            List<Corredor> corredoresEtapa = resultadosEtapa.get(i);
            for (Corredor corredor : corredoresEtapa) {
                Equipo equipo = corredor.getEquipoHV();
                long tiempo = i + 1; // Simular tiempo
                if (tiemposEquipos.containsKey(equipo)) {
                    tiempo += tiemposEquipos.get(equipo);
                }
                tiemposEquipos.put(equipo, tiempo);
            }
        }

        List<Map.Entry<Equipo, Long>> tiemposEquiposOrdenados = new ArrayList<>(tiemposEquipos.entrySet());
        tiemposEquiposOrdenados.sort(Map.Entry.comparingByValue());

        List<Equipo> top10Equipos = new ArrayList<>();
        for (int i = 0; i < 10 && i < tiemposEquiposOrdenados.size(); i++) {
            top10Equipos.add(tiemposEquiposOrdenados.get(i).getKey());
        }

        System.out.println("Tabla de Posiciones (Top 10):");
        for (int i = 0; i < top10Equipos.size(); i++) {
            System.out.println((i + 1) + ". " + top10Equipos.get(i).getNombreHV());
        }
    }
}

