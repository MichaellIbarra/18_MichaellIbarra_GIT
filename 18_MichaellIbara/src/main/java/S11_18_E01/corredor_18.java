/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_18_E01;

/**
 *
 * @author Matichelo
 */
public class corredor_18 extends persona_18 {

    private String deporte;
    private int medallas;
    private int altura;

    public corredor_18(String deporte, int medallas, int altura, String nombre, int edad) {
        super(nombre, edad);
        this.deporte = deporte;
        this.medallas = medallas;
        this.altura = altura;
    }

    public void entrenar() {
        System.out.println("Es una atleta que entrena para competir en " + deporte);
    }

    public void copas() {
        System.out.println(" ah ganado " + medallas + " medallas");
    }
}
