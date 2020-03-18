package com.jeeps.covidopenknowledgeutplapi.model.sintoma;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Sintoma extends BaseEntity {
    private String nombre;
    private String tipo;
    private String fuente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
