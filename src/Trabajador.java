/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCC20306
 */
public class Trabajador {
    private String nombre;
    private String tipoDoc;
    private String numDoc;
    private String pension;
    private double sueldoBase;
    
    // Constructor
    public Trabajador(String nombre, String tipoDoc, String numDoc, String pension, double sueldoBase) {
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.pension = pension;
        this.sueldoBase = sueldoBase;
    }
}
