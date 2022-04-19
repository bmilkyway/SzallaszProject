package com.example.szallasz;

public class Elozmenyek {
    int Id;
    int felhasznaloId;
    int szallasId;
    String foglalasIdeje;
    String ErtekelesId;

    public String getErtekelesId() {
        return ErtekelesId;
    }

    public void setErtekelesId(String ertekeles) {
        ErtekelesId = ertekeles;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getFelhasznaloId() {
        return felhasznaloId;
    }

    public void setFelhasznaloId(int felhasznaloId) {
        this.felhasznaloId = felhasznaloId;
    }

    public int getSzallasId() {
        return szallasId;
    }

    public void setSzallasId(int szallasId) {
        this.szallasId = szallasId;
    }

    public String getFoglalasIdeje() {
        return foglalasIdeje;
    }

    public void setFoglalasIdeje(String foglalasIdeje) {
        this.foglalasIdeje = foglalasIdeje;
    }

}
