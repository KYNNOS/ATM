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

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Pessoa getTitular() {
        return Titular;
    }

    public void setTitular(Pessoa Titular) {
        this.Titular = Titular;
    }
    
}
