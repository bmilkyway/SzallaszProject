package com.example.szallasz;

public class Ertekelesek {
    int Id;
    String Szoveg;
    int ertekeles;
    int felhasznaloId;
    int SzallasId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSzoveg() {
        return Szoveg;
    }

    public void setSzoveg(String szoveg) {
        Szoveg = szoveg;
    }

    public int getErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(int ertekeles) {
        this.ertekeles = ertekeles;
    }

    public int getFelhasznaloId() {
        return felhasznaloId;
    }

    public void setFelhasznaloId(int felhasznaloId) {
        this.felhasznaloId = felhasznaloId;
    }

    public int getSzallasId() {
        return SzallasId;
    }

    public void setSzallasId(int szallasId) {
        SzallasId = szallasId;
    }

}
