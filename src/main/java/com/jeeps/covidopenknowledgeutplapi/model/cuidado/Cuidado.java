package com.jeeps.covidopenknowledgeutplapi.model.cuidado;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Cuidado extends BaseEntity {
    private String prevencion;
    private String sintoma;

    public String getPrevencion() {
        return prevencion;
    }

    public void setPrevencion(String prevencion) {
        this.prevencion = prevencion;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
}
