/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Problema03 {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double soles, resultado=0;
        int opcion;
        
        System.out.print("Ingrese la cantidad en soles (PEN): ");
        soles = lector.nextDouble();
        
        System.out.println("/n Seleccione la moneda Destino: ");
        System.out.println("1. Dolares Americanos (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Libras Esterlinas (GBP)");
        System.out.println("4. Pesos Mexicanos (MXN)");
        System.out.print("Opcion: ");
        opcion=lector.nextInt();
        
        switch(opcion){
            
            case 1:
                    resultado= soles*0.27;
                System.out.printf("Resultado %2f soles equivalen a %2f UDS/n", soles, resultado);
                break;
                
           case 2:
                    resultado= soles*0.25;
                System.out.printf("Resultado %2f soles equivalen a %2f EUR/n", soles, resultado);
                break;
           
           case 3:
                    resultado= soles*0.21;
                System.out.printf("Resultado %2f soles equivalen a %2f GBP/n", soles, resultado);
                break;
              
           case 4:
                    resultado= soles*4.50;
                System.out.printf("Resultado %2f soles equivalen a %2f MXN/n", soles, resultado);
                break;
                
           default:
               System.out.println("Moneda no disponible");
        }
        
        lector.close();
}
