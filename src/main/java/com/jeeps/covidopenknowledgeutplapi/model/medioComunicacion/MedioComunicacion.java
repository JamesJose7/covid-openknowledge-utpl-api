package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;
import com.jeeps.covidopenknowledgeutplapi.model.redes.Redes;

import javax.persistence.*;

@Entity
public class MedioComunicacion extends BaseEntity {
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "redes_id", referencedColumnName = "id")
    @JsonManagedReference
    private Redes redes;
    private String fuente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Redes getRedes() {
        return redes;
    }

    public void setRedes(Redes redes) {
        this.redes = redes;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
