/**
 * Provee las clases necesarias para
 * crear una cuenta de consumo de electricidad
 * en la empresa ENSA.
 */
package ensa;

/**
 *Esta es la clase para la creacion de cuentas en ENSA
 *
 * @author Josuemgr3
 * @version 1.0
 */
public class Cuenta {
    /**
     * Esta {@Link String} es el nombre del dueñp de la cuenta
     */

    private String nombre;
    private String numero_cuenta;
    private double saldo;
    private double consumo_mensual;

    /**
     * Este constructor inicializa la cuenta recien creada.
     * @param n Este parametro indica el nombre del dueño de la cuenta
     * @param nc Este parametro indica el numero de la cuenta
     */

    public Cuenta(String n, String nc){
        this.nombre = n;
        this.numero_cuenta = nc;
        this.saldo = 0.0;
        this.consumo_mensual = 0.0;
    }

    public String mostrar() {
        String mensaje = ("INFORMACION DEL CLIENTE");
        mensaje += "\nNombre: " + this.nombre;
        mensaje += "\nCuenta" + this.numero_cuenta;
        mensaje += "\nSaldo" + this.saldo;
        mensaje += "\nConsumo" + this.consumo_mensual;
        return mensaje;
    }

    public double pagar(double pago){
        this.saldo -= pago;
        return this.saldo;
    }

    public double calcular(double consumo){
        this.consumo_mensual = consumo;
        this.saldo = this.consumo_mensual * 0.57;
            return this.saldo;
    }

}
