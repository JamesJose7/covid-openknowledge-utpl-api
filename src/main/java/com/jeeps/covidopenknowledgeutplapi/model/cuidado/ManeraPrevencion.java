package com.jeeps.covidopenknowledgeutplapi.model.cuidado;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class ManeraPrevencion extends BaseEntity {
    private String fuente;
    private String manera;
    private String lugar;
    private String imagenUrl;
    private String tipo;

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

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
