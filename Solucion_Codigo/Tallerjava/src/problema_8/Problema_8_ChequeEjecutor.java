/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_8;

import java.util.Random;

/**
 *
 * @author Core i5-Pro
 */
public class Problema_8_ChequeEjecutor {
     public static void main(String[] args) {
        Random rand = new Random();

        String[] clientes = {"Cristian Flores", "Ana Villao", "Lamine Mejía"};
        String[] bancos = {"Banco Pichincha", "Banco de Guayaquil", 
            "Banco de Loja"};
        String nombreCliente = clientes[rand.nextInt(clientes.length)];
        String nombreBanco = bancos[rand.nextInt(bancos.length)];
        double valorCheque = 600 + rand.nextDouble() * 9400;  

        Problema_8_ChequeBase cheque = new Problema_8_ChequeBase(nombreCliente, 
                nombreBanco, valorCheque);

        System.out.println(cheque);
    }
}

