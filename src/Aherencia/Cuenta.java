package Aherencia;

public abstract class Cuenta {
    private int numero;
    private double saldo;



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean extraer(double monto);
}
