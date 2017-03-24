/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author BD
 */
public class ContaBancaria {
    private double Saldo;
    private int Numero;
    private Pessoa Titular;

    public ContaBancaria( int Numero, Pessoa Titular, double Saldo) {
        this.Saldo = Saldo;
        this.Numero = Numero;
        this.Titular = Titular;
    }
    
}
