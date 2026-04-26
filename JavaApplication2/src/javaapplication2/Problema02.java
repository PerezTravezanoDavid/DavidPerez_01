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
public class Problema02 {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double pension,promedio,descuento=0,bono,total;
        int contado;
        
        System.out.print("Ingrese la pension base: ");
        pension=lector.nextInt();
        
        System.out.print("Promedio ponderado: ");
        promedio=lector.nextInt();
        
        System.out.print("¿Pagar al contado? (1:si/2:no)");
        contado=lector.nextInt();
        
        if (promedio >=18){
            descuento=pension*0.20;
         
        }else if (promedio>=15){
            descuento=pension*0.10;
        }else if(promedio>=13){
            descuento =pension*0.05;
        }else {
            descuento =0;
        }
        bono=(contado==1)?50:0;
        
        total= pension-descuento-bono;
        
        System.out.println("/n----Desglose----");
        System.out.printf("Pension base: S/ %2f/n", pension);
        System.out.printf("Descuento: S/ %2f/n", descuento);
        System.out.printf("Bono: S/ %2f/n", bono);
        System.out.printf("Total a pagar: S/ %2f/n", total);
        
        lector.close();
    }
}
