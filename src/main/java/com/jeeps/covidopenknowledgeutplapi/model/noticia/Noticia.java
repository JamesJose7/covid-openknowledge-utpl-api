package com.jeeps.covidopenknowledgeutplapi.model.noticia;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Noticia extends BaseEntity {
    private String titulo;
    private String resumen;
    private String link;

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
