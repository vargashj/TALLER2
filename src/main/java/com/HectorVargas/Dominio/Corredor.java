package com.HectorVargas.Dominio;

public class Corredor {
    private final String nombreHV;
    private Equipo equipoHV;

    public Corredor(String nombreHV, Equipo equipoHV) {
        this.nombreHV = nombreHV;
        this.equipoHV = equipoHV;
        this.equipoHV.agregarCorredor(this);
    }

    public String getNombreHV() {
        return this.nombreHV;
    }

    public Equipo getEquipoHV() {
        return this.equipoHV;
    }
}

