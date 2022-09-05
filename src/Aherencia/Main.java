package Aherencia;

public class Main {
    public static void main(String[] args) {

        //Vinculación dinamica
        Cuenta cuenta = new CuentaCorriente();
        cuenta.setSaldo(1000);
        //Polimorfismo
        cuenta.extraer(1050);

        System.out.println(cuenta.getSaldo());
    }
}
