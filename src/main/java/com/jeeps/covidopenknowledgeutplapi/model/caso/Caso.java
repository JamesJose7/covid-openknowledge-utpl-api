package com.jeeps.covidopenknowledgeutplapi.model.caso;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;
import com.jeeps.covidopenknowledgeutplapi.model.posibleContagio.PosibleContagio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Caso extends BaseEntity {
    private String fuente;
    private String lugarDiagnostico;
    private String estadoPaciente;
    @OneToMany(
            mappedBy = "caso",
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<PosibleContagio> posiblesContagios;
    private Date fecha;
    private String longitud;
    private String latitud;
    private int edad;
    private String nacionalidad;

    public String getLugarDiagnostico() {
        return lugarDiagnostico;
    }

    public void setLugarDiagnostico(String lugarDiagnostico) {
        this.lugarDiagnostico = lugarDiagnostico;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public List<PosibleContagio> getPosiblesContagios() {
        return posiblesContagios;
    }

    public void setPosiblesContagios(List<PosibleContagio> posiblesContagios) {
        this.posiblesContagios = posiblesContagios;
    }

    public void addPosibleContagio(PosibleContagio posibleContagio) {
        if (posiblesContagios == null)
            posiblesContagios = new ArrayList<>();
        posiblesContagios.add(posibleContagio);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
