

package ec.edu.ec.coperativafuturo;


public class CooperativaFuturo {

    public static void modificarTasa(double tasa) {
        tasa = tasa + 1;
        System.out.println("Tasa dentro de la función: " + tasa);
    }

    public static void aplicarInteres(Cuentas cuenta, double tasa) {
        double interes = cuenta.getSaldo() * (tasa / 100);
        cuenta.depositar(interes);
    }

    public static void main(String[] args) {
Persona p1 = new Persona("Welinton Sacon", "1102321456", "Wilo@mail.com");
Persona p2 = new Persona("Elena Tapuy");

Cuentas c1 = new Cuentas(p1, "ahorro", 500);
Cuentas c2 = new Cuentas(p1, "corriente");
Cuentas c3 = new Cuentas(p2, "ahorro", 1000);



        System.out.println(" Estado Inicial ");
        c1.imprimir();
        System.out.println();
        c2.imprimir();

        System.out.println(" Depósito ");
        c2.depositar(200);
        c2.imprimir();

        System.out.println("Retiro ");
        boolean exitoRetiro = c1.retirar(100);
        System.out.println("Retiro exitoso: " + exitoRetiro);
        c1.imprimir();

        System.out.println("Transferencia ");
        boolean exitoTransf = c1.transferir(200, c3);
        System.out.println("Transferencia exitosa: " + exitoTransf);

        System.out.println("\n Cuenta Origen ");
        c1.imprimir();
        System.out.println("\nCuenta Destino ");
        c3.imprimir();

        double tasa = 5.0;
        System.out.println("\n--- Paso por valor ---");
        System.out.println("Tasa original: " + tasa);
        modificarTasa(tasa);
        System.out.println("Tasa después de función: " + tasa);

        System.out.println("\n Paso por referencia ---");
        aplicarInteres(c3, 10);
        c3.imprimir();

        System.out.println(" Cierre de cuenta ");
        c2.cerrarCuenta();
        c2.imprimir();

        Cuentas cuentaNula = null;
        if (cuentaNula == null) {
            System.out.println("\n¡Error! La cuenta aún no ha sido creada.");
        }
    }
}
