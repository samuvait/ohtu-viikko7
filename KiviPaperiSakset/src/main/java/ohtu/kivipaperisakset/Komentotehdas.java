
package ohtu.kivipaperisakset;

import java.util.HashMap;


public class Komentotehdas {
    private final HashMap<String, Pelaaminen> komennot;
    
    public Komentotehdas() {
        komennot = new HashMap<>();
        komennot.put("a", new KPSPelaajaVsPelaaja());
        komennot.put("b", new KPSTekoaly());
        komennot.put("c", new KPSParempiTekoaly());
    }
    
    public Pelaaminen get(String choice) {
        return komennot.get(choice);
    }
}
