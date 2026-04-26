/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int h,m,s;
    
        System.out.print("Ingrese horas (0-23)");
        h= lector.nextInt();
        System.out.print("Ingrese minutos (0-59)");
        m= lector.nextInt();
        System.out.println("Ingrese segundos (0-59)");
        s= lector.nextInt();
     
        if(h<0||h>24||m<0||m>59||s<0||s>59){
            System.out.println("Error. datos invalidos");
            
        }else{
            s++;
            if(s==60){
                s=0;
               m++;
            }
            if (m==60){
                m=0;
                h++;   
            }
            if(h==24){
                h=0;
            }
            
            System.out.printf("Horas siguientes %02d:%02d:%02d/n", h,m,s);
        }
            lector.close();
        }
    }