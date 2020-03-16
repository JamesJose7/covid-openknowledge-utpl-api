package com.jeeps.covidopenknowledgeutplapi.model.caso;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Caso extends BaseEntity {
    private String lugarDiagnostico;
    private String estadoPaciente;
    private String posiblesContagios;

    public String getLugarDiagnostico() {
        return lugarDiagnostico;
    }

    public void setLugarDiagnostico(String lugarDiagnostico) {
        this.lugarDiagnostico = lugarDiagnostico;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String getPosiblesContagios() {
        return posiblesContagios;
    }

    public void setPosiblesContagios(String posiblesContagios) {
        this.posiblesContagios = posiblesContagios;
    }
}
