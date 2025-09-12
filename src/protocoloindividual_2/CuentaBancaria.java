/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_2;

/**
 *
 * @author Sebastian
 */
public class CuentaBancaria {
    private String NumeroCuenta;
    private double saldo; 
    public String TipoCuenta; 

    public CuentaBancaria(String NumeroCuenta, double saldo, String TipoCuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.saldo = saldo;
        this.TipoCuenta = TipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
    
    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + NumeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + TipoCuenta);
    }
}
