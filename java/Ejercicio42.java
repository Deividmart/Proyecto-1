/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio42;
import java.util.Scanner;

/**
 *
 * @author daxid
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá del
        //número de computadoras que compre.Si las computadoras son menos de cinco se les dará un 10%
        //de descuento sobre el total de la compra;
        //si el número de computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de descuento;
        //y si son 10 o más se les da un 40% de descuento
        //. El precio de cada computadora es de $1800000
        
        // TODO code application logic here
                
        Scanner lector = new Scanner(System.in);
        float pc, precio = 1800000, descuento, precio_f;
        System.out.println("Digite la cantidad de computadoras compradas");
        pc=lector.nextFloat();
        
        if(pc<5){
            descuento = precio * 0.10f;
            precio_f = precio - descuento;
            System.out.println("Descuento aplicado, Su valor a pagar es: "+precio_f);        
        }
        else if(pc>=5 && pc<10){
            descuento = precio * 0.20f;
            precio_f = precio - descuento;
            System.out.println("Descuento aplicado, Su valor a pagar es: "+precio_f);
        }
        else{
            descuento = precio * 0.40f;
            precio_f = precio - descuento;
            System.out.println("Descuento aplicado, Su valor a pagar es: "+precio_f);
        }
    }
    
}
