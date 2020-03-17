package com.jeeps.covidopenknowledgeutplapi.model.noticia;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Noticia extends BaseEntity {
    private String titulo;
    private String resumen;
    private String fuente;
    private Date fecha;
    @Column(columnDefinition = "boolean default false")
    private boolean estadoCuarentena;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String link) {
        this.fuente = link;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstadoCuarentena() {
        return estadoCuarentena;
    }

    public void setEstadoCuarentena(boolean estadoCuarentena) {
        this.estadoCuarentena = estadoCuarentena;
    }
}
