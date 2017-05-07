package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Pelaaminen {

    private Scanner scanner;
    
    @Override
    protected String toisenSiirto(Scanner scanner) {
        this.scanner = scanner;
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = scanner.nextLine();
        return tokanSiirto;
    }

    @Override
    protected String printSiirto(String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = scanner.nextLine();
        return tokanSiirto;
    }
}