/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author UCC20306
 */
public class App {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Trabajador> lista = new ArrayList<>();
            
            int opcion = 0;
            
            do {
                try {
                    System.out.println("\n--- GESTIÓN RR.HH. INNOVADORES S.A. ---");
                    System.out.println("1. Registrar nuevo trabajador");
                    System.out.println("2. Listar planilla y cálculos");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                    opcion = Integer.parseInt(sc.nextLine());
                    
                    if (opcion == 1) {
                        System.out.print("Nombre completo: ");
                        String nombre = sc.nextLine();
                        
                        System.out.print("Tipo de documento (DNI/RESIDENCIA): ");
                        String tipo = sc.nextLine();
                        
                        System.out.print("Número de documento: ");
                        String numero = sc.nextLine();
                        
                        if (tipo.equalsIgnoreCase("DNI") && numero.length() != 8) {
                            throw new Exception("Error: El DNI debe tener exactamente 8 dígitos.");
                        }
                        if (tipo.equalsIgnoreCase("RESIDENCIA") && numero.length() != 11) {
                            throw new Exception("Error: El documento de Residencia debe tener 11 dígitos.");
                        }
                        
                        System.out.print("Régimen de pensión (INTEGRA/PRIMA/HABITAT/ONP): ");
                        String pension = sc.nextLine();
                        
                        System.out.print("Sueldo Base: ");
                        double sueldo = Double.parseDouble(sc.nextLine());
                        
                        Trabajador t = new Trabajador(nombre, tipo, numero, pension, sueldo);
                        lista.add(t);
                        
                        System.out.println("¡Trabajador registrado con éxito!");
                        
                    } else if (opcion == 2) {
                        System.out.println("\n--- REPORTE DE PLANILLA ---");
                        if (lista.isEmpty()) {
                            System.out.println("No hay trabajadores registrados.");
                        } else {
                            for (Trabajador emp : lista) {
                                emp.mostrarDatos();
                            }
                        }
                    }
                    
                } catch (NumberFormatException e) {
                    System.out.println("Error: Por favor, ingrese un número válido para el sueldo u opción.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            } while (opcion != 3);
            
            System.out.println("Saliendo del sistema");
        }
      }
    }
       
    
