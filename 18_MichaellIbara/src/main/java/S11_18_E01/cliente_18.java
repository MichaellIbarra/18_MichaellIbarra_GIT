/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_18_E01;

/**
 *
 * @author Matichelo
 */
public class cliente_18 extends persona_18{
    private String numeroClientes;
    private double saldo;
    private String tipoCuenta;

    public cliente_18(String numeroClientes, double saldo, String tipoCuenta, String nombre, int edad) {
        super(nombre, edad);
        this.numeroClientes = numeroClientes;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
        
    public void compra() {
        System.out.println("Comprado " + saldo);
    }
    
    public void fila() {
        System.out.println("Para pagar ahi " + numeroClientes + " personas");
    }

}
