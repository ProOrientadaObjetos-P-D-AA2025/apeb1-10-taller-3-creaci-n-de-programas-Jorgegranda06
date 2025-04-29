/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_8;

/**
 *
 * @author Core i5-Pro
 */
public class Problema_8_ChequeBase {
    private String nombreCli;
    private String nombreBan;
    private double valorChe;
    private double comision;

    public Problema_8_ChequeBase(String nombreCliente, String nombreBanco, 
            double valorCheque) {
        this.nombreCli = nombreCliente;
        this.nombreBan = nombreBanco;
        this.valorChe = valorCheque;
        calcularComision();
    }

    private void calcularComision() {
        comision = valorChe * 0.003 / 100;
    }

    @Override
    public String toString() {
        return String.format("""
            Cliente: %s
            Banco: %s
            Valor del Cheque: %.2f
            Comision del Banco (0.003%%): %.6f
            """, nombreCli, nombreBan, valorChe, comision);
    }
}

