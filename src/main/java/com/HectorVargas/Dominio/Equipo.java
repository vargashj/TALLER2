package com.HectorVargas.Dominio;

import java.util.ArrayList;
import java.util.List;



public class Equipo {
    private final String nombreHV;
    private List<Corredor> corredoresHV;

    public Equipo(String nombreHV) {
        this.nombreHV = nombreHV;
        this.corredoresHV = new ArrayList<>();
    }

    public void agregarCorredor(Corredor corredor) {
        if (this.corredoresHV.size() < 5) {
            this.corredoresHV.add(corredor);
        } else {
            System.out.println("El equipo " + this.nombreHV + " ya tiene 5 corredores.");
        }
    }

    public String getNombreHV() {
        return this.nombreHV;
    }

    public List<Corredor> getCorredoresHV() {
        return this.corredoresHV;
    }
}


