package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class MedioComunicacion extends BaseEntity {
    private String Nombre;
    @ElementCollection
    private List<String> redes;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<String> getRedes() {
        return redes;
    }

    public void setRedes(List<String> redes) {
        this.redes = redes;
    }
}
