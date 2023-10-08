package com.HectorVargas.Dominio;

import java.util.ArrayList;

import java.util.List;


public class Competencia {
    private List<Equipo> equiposHV;

    public Competencia() {
        this.equiposHV = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        if (this.equiposHV.size() < 5) {
            this.equiposHV.add(equipo);
        } else {
            System.out.println("La competencia ya tiene 5 equipos.");
        }
    }

    public List<Equipo> getEquiposHV() {
        return this.equiposHV;
    }
}



