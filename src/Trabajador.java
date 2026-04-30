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
    
    public double getRetencion() {
        if (pension.equalsIgnoreCase("INTEGRA")) return sueldoBase * 0.121;
        if (pension.equalsIgnoreCase("PRIMA"))   return sueldoBase * 0.125;
        if (pension.equalsIgnoreCase("HABITAT")) return sueldoBase * 0.127;
        if (pension.equalsIgnoreCase("ONP"))     return sueldoBase * 0.130;
        return 0;
    }
    
    public double getSueldoNeto() { 
        return sueldoBase - getRetencion();
    }

    public void mostrarDatos() {
        System.out.println("ID: " + numDoc + " | Empleado: " + nombre + 
                           " | Pensión: " + pension + " | Neto a Pagar: S/ " + getSueldoNeto());
    }
    
    public String getTipoDoc() { return tipoDoc; }
    public String getNumDoc() { return numDoc; }
    
}
