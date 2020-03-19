package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;
import com.jeeps.covidopenknowledgeutplapi.model.redes.Redes;

import javax.persistence.*;
import java.util.List;

@Entity
public class MedioComunicacion extends BaseEntity {
    private String Nombre;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "redes_id", referencedColumnName = "id")
    @JsonManagedReference
    private Redes redes;
    private String fuente;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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
