package com.company;

import java.util.DoubleSummaryStatistics;

/**
 * Created by AASA on 13.02.2017.
 */
public class Inimene {
    String eesnimi;
    String perenimi;
    String isikukood;
    Integer pikkus;
    Integer kaal;

    public Inimene(String eesnimi, String perenimi, String isikukood, Integer pikkus, Integer kaal){
        if(eesnimi == null || eesnimi.length()==0){
            throw new RuntimeException("Eesnimi puudub");
        }
        if(perenimi == null || perenimi.length()==0){
            throw new RuntimeException("Perekonnanimi puudub");
        }
        if(isikukood == null || isikukood.length()==0){
            throw new RuntimeException("Isikukood puudub");
        }

        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.isikukood = isikukood;
        this.pikkus = pikkus;
        this.kaal = kaal;
    }
    public String getFirstName(){
        return eesnimi;
    }
    public String getLastName(){
        return perenimi;
    }

    public String getFullName(){
        return eesnimi + " " + perenimi;
    }

    public String getIsikukood(){
        return isikukood;
    }

    public Integer getPikkus(){
        return pikkus;
    }
    public Integer getKaal(){
        return kaal;
    }
    public Double getBMI() {
        Double dPikkus = (double)pikkus;
        dPikkus *= dPikkus;
        return (double)kaal/dPikkus;
    }

    public void editFirstName(String eesnimi){
        this.eesnimi = eesnimi;
    }

    public void editlastName(String perenimi){
        this.perenimi = perenimi;
    }

    public void editPikkus(Integer pikkus){
        this.pikkus = pikkus;
    }
    public void editKaal(Integer kaal){
        this.kaal = kaal;
    }
}

/*
Alar:
Pikkus: 175
Oppeasutus: TLÜ

Heikki:
Ettevotte nimi: Kitman
Kaal: 177
 */