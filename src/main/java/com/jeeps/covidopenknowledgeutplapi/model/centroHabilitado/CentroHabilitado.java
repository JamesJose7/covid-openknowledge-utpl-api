package com.jeeps.covidopenknowledgeutplapi.model.centroHabilitado;

import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class CentroHabilitado extends BaseEntity {
    private String provincia;
    private String ciudad;
    private String hospital;
    private String ubicacion;
    private String geoLink;
    private String latitud;
    private String longitud;

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getGeoLink() {
        return geoLink;
    }

    public void setGeoLink(String geoLink) {
        this.geoLink = geoLink;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
