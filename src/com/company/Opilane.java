package com.company;
import java.util.Date;
import java.util.StringJoiner;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by AASA on 13.02.2017.
 */
public class Opilane {
    Inimene inimene;
    String oppeasutuse_nimi;
    String oppekoha_nimi;
    Boolean riigieelarveline;

    public Opilane(Inimene inimene, String oppeasutuse_nimi, String oppekoha_nimi, Boolean riigieelarveline){
        this.inimene = inimene;
        this.oppeasutuse_nimi = oppeasutuse_nimi;
        this.oppekoha_nimi = oppekoha_nimi;
        this.riigieelarveline = riigieelarveline;
    }

    public String getOppeasutuse_nimi() {
        return oppeasutuse_nimi;
    }

    public String getOppekoha_nimi() {
        return oppekoha_nimi;
    }

    public Boolean getRiigieelarveline() {
        return riigieelarveline;
    }
}
