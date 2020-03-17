package com.jeeps.covidopenknowledgeutplapi.model.herramienta;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Herramienta extends BaseEntity {
    private String nombre;
    private String fuente;
    private String finalidad;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String link) {
        this.fuente = link;
    }

    public String getFinalidad() {
        return finalidad;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
