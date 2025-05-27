
package ec.edu.ec.coperativafuturo;


public class Cuentas {
      private static int contador = 1;
    private int numero;
    private double saldo;
    private String tipo; // ahorro o corriente
    private Persona titular;

    public Cuentas(Persona titular, String tipo, double saldoInicial) {
        this.numero = contador++;
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldoInicial;
    }

    public Cuentas(Persona titular, String tipo) {
        this(titular, tipo, 0);
    }

    private Cuentas(Persona titular, String tipo, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }
    public boolean transferir(double monto, Cuentas destino) {
        if (this.retirar(monto)) {
            destino.depositar(monto);
            return true;
        }
        return false;
    }
    public boolean transferir(double monto) {
        Cuentas respaldo = new Cuentas(titular, "ahorro", 0); 
        System.out.println("Cuenta de respaldo creada. Transferencia fallida.");
        return false;
    }

    public void imprimir() {
        System.out.println("Cuenta Nº: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Titular:");
        titular.imprimir();
    }
    public void cerrarCuenta() {
        System.out.println("¿Está seguro de cerrar la cuenta Nº " + numero + "? (Simulación)");
        this.saldo = 0;
        this.titular = null;
    }
}

