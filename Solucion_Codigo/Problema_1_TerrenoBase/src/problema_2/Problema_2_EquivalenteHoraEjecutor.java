package problema_2;

import java.util.Random;


public class Problema_2_EquivalenteHoraEjecutor {
     public static void main(String[] args) {
        Random random = new Random();
        double horas = 4 + random.nextDouble() * 300; 

        Problema_2_EquivalenteHoraBase equivalente = new 
        Problema_2_EquivalenteHoraBase(horas);

        System.out.println(equivalente);
    }
}

