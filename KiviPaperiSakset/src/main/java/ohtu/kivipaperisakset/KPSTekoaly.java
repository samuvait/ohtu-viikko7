package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Pelaaminen {
    
    private Tekoaly tekoaly;
    
    public KPSTekoaly() {
        tekoaly = new Tekoaly();
    }
    
    @Override
    protected String toisenSiirto(Scanner scanner) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

    @Override
    protected String printSiirto(String ekanSiirto) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return tokanSiirto;
    }
}