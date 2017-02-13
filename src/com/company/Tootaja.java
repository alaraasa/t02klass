package com.company;
import java.util.Date;
import java.util.StringJoiner;

/**
 * Created by AASA on 13.02.2017.
 */
public class Tootaja {
    Inimene inimene;
    String ettevotte_nimi;
    String tookoha_nimetus;
    Integer brutopalk;

    public Tootaja(Inimene inimene, String ettevotte_nimi, String tookoha_nimetus, Integer brutopalk){
        this.inimene = inimene;
        this.ettevotte_nimi = ettevotte_nimi;
        this.tookoha_nimetus = tookoha_nimetus;
        this.brutopalk = brutopalk;
    }
    public String getEttevotte_nimi() {
        return ettevotte_nimi;
    }

    public String getTookoha_nimetus() {
        return tookoha_nimetus;
    }

    public Integer getBrutopalk() {
        return brutopalk;
    }

}
