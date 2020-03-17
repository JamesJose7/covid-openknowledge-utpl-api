package com.jeeps.covidopenknowledgeutplapi.model.cuidado;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class ManeraPrevencion extends BaseEntity {
    private String fuente;
    private String manera;
    private String lugar;

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getManera() {
        return manera;
    }

    public void setManera(String prevencion) {
        this.manera = prevencion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
