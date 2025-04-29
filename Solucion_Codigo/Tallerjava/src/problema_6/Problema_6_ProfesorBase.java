/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_6;

/**
 *
 * @author Core i5-Pro
 */
public class Problema_6_ProfesorBase {
    private String nombre;
    private String apellido;
    private double sueldoB;
    private double sueldoT;
    private String cedula;

    public Problema_6_ProfesorBase(String nombre, String apellido, 
            double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoB = sueldoBasico;
        this.cedula = cedula;
        calcularSueldoTotal();  
    }

    private void calcularSueldoTotal() {
        sueldoT = sueldoB + (sueldoB * 0.20);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s %s\nSueldo Basico: %.2f\nSueldo Total:"
                + " %.2f\nCedula: %s", nombre, apellido, sueldoB, 
                sueldoT, cedula);
    }
}

