package com.company;

public class Main {

    public static void main(String[] args) {
        Inimene alar = new Inimene("Alar", "Aasa", "39506166019", 175, 100);
        Inimene heikki = new Inimene("Heikki", "Aasa", "28765143210", 177, 90);
        Opilane alar_opilane = new Opilane(alar, "TLÜ", "IFB-1", true);
        Tootaja heikki_tootaja = new Tootaja(heikki, "Kitman", "Paigaldaja", 3000);
        System.out.println("Alar:");
        System.out.println("Pikkus: " + alar_opilane.inimene.getPikkus());
        System.out.println("Oppeasutus: " + alar_opilane.getOppeasutuse_nimi());
        System.out.println("\nHeikki:");
        System.out.println("Ettevotte nimi: " + heikki_tootaja.getEttevotte_nimi());
        System.out.println("Kaal: " + heikki_tootaja.inimene.getPikkus());
    }
}
