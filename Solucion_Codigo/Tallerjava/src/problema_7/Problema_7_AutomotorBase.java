/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_7;

/**
 *
 * @author Core i5-Pro
 */
public class Problema_7_AutomotorBase {
    private String cedulaD;
    private String marca;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema_7_AutomotorBase(String cedulaDueno, String marca, 
            int anoFabricacion, double valorVehiculo) {
        this.cedulaD = cedulaDueno;
        this.marca = marca;
        this.anoFabricacion = anoFabricacion;
        this.valorVehiculo = valorVehiculo;
        calcularValorMatricula();  
    }

    private void calcularValorMatricula() {
        int antiguedad = 2025 - anoFabricacion; 
        valorMatricula = (0.002 / 100) * valorVehiculo * antiguedad;
    }

    @Override
    public String toString() {
        return String.format("Cedula del duenio: %s\nMarca: %s\n"
                + "Anio de fabricacion: %d\nValor del vehiculo: "
                + "%.2f\nValor de la matricula: %.2f", cedulaD, marca, 
                anoFabricacion, valorVehiculo, valorMatricula);
    }
}

