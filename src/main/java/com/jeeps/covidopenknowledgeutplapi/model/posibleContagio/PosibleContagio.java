package com.jeeps.covidopenknowledgeutplapi.model.posibleContagio;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;
import com.jeeps.covidopenknowledgeutplapi.model.caso.Caso;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@ApiModel
@Entity
public class PosibleContagio extends BaseEntity {
    private String nombre;
    private String relacion;
    @ManyToOne
    @JoinColumn(name = "caso_id")
    @JsonBackReference
    private Caso caso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    @ApiModelProperty(hidden = true)
    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }
}
