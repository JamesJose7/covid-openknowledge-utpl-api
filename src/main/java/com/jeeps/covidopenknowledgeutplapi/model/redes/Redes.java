package com.jeeps.covidopenknowledgeutplapi.model.redes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jeeps.covidopenknowledgeutplapi.core.BaseEntity;
import com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion.MedioComunicacion;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Redes extends BaseEntity {
    @OneToOne(mappedBy = "redes")
    @JsonBackReference
    private MedioComunicacion medioComunicacion;

    private String facebook;
    private String twitter;
    private String linkedIn;
    private String instagram;
    private String whatsApp;
    private String telegram;
    private String facebookMessenger;
    private String mail;
    private String web;

    public MedioComunicacion getMedioComunicacion() {
        return medioComunicacion;
    }

    public void setMedioComunicacion(MedioComunicacion medioComunicacion) {
        this.medioComunicacion = medioComunicacion;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getFacebookMessenger() {
        return facebookMessenger;
    }

    public void setFacebookMessenger(String facebookMessenger) {
        this.facebookMessenger = facebookMessenger;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
