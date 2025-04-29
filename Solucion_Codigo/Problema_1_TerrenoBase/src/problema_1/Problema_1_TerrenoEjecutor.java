package problema_1;

import java.util.Random;

public class Problema_1_TerrenoEjecutor {

    public static void main(String[] args) {
        Problema_1_TerrenoBase terreno = new Problema_1_TerrenoBase();

        Random random = new Random();
        double ancho = 4 + (12 - 5) * random.nextDouble();
        double largo = 16 + (55 - 40) * random.nextDouble();
        double valorMetroCuadrado = 30 + (240 - 70) * random.nextDouble();

        terreno.setAncho(ancho);
        terreno.setLargo(largo);
        terreno.setValorMetroCuadrado(valorMetroCuadrado);

        terreno.calcularArea();
        terreno.calcularCostoTerreno();

        System.out.println(terreno);
    }

}
