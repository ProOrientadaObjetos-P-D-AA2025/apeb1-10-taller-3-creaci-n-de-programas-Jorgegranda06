package problema_1;


public class Problema_1_TerrenoBase {
    private double costoT;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCua;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCua = valorMetroCuadrado;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void calcularCostoTerreno() {
        costoT = valorMetroCua * area;
    }

    public double getCostoTerreno() {
        return costoT;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCua;
    }

    
    @Override
    public String toString() {
        return "Terreno\n" +
                "ancho = " + ancho + "\n" + 
                "largo = " + largo + "\n" +
                "area = " + area + "\n" +
                "valorMetroCuadrado = " + valorMetroCua + "\n" +
                "costoTerreno = " + costoT + "\n";
    }
}

