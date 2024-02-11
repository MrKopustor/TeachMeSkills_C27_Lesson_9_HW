package com.teachmeskills.lesson9.task_3.client;

import com.teachmeskills.lesson9.task_3.card.BaseCard;

public class Client {

    private String name;
    private String surname;
    private String numberPassport;
    private String dateBirth;
    private String address;
    private BaseCard[] cads;

    public Client(String name, String surname, String numberPassport, String dateBirth, String address, BaseCard[] cads) {
        this.name = name;
        this.surname = surname;
        this.numberPassport = numberPassport;
        this.dateBirth = dateBirth;
        this.address = address;
        this.cads = cads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BaseCard[] getCads() {
        return cads;
    }

    public void setCads(BaseCard[] cads) {
        this.cads = cads;
    }
}
