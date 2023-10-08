package com.HectorVargas.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private List<Corredor> corredoresHV;

    public Etapa() {
        this.corredoresHV = new ArrayList<>();
    }

    public void agregarCorredor(Corredor corredor) {
        this.corredoresHV.add(corredor);
    }

    public List<Corredor> getCorredoresHV() {
        return this.corredoresHV;
    }
}


