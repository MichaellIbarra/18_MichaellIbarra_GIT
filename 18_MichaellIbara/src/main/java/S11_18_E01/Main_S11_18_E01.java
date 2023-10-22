/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_18_E01;

/**
 *
 * @author Matichelo
 */
public class Main_S11_18_E01 {
    public static void main(String[] args) {
        futbolista_18 obfut = new futbolista_18("juanito", 80, "delantero");
        
        obfut.posicion();
        
        corredor_18 obco = new corredor_18("corredor", 90, 150, "LuisManzo", 100);
        
        obco.entrenar();
        
        cliente_18 obcli = new cliente_18("5", 10, "Interbank", "Matichelo", 18);
        
        obcli.compra();
    }
}
