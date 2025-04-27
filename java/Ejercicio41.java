/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author daxid
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // El IMSS requiere clasificar a las personas que se jubilaran en el año de 1997. Existen tres tipos de
        //jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas adscritas a la
        //jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de menos de 25
        //años. Las personas adscritas a la jubilación por antigüedad joven deben tener menos de 60 años y
        //una antigüedad en su empleo de 25 años o más.
        //Las personas adscritas a la jubilación por antigüedad adulta deben tener 60 años o más y una
        //antigüedad en su empleo de 25 años o más.
        //Determinar en que tipo de jubilación, quedará adscrita una persona.

        Scanner lector = new Scanner(System.in);
        float ant, edad;
        String Nombre;
        System.out.println("Digite su nombre");
        Nombre=lector.nextLine();
        System.out.println("Digite su edad");
        edad=lector.nextFloat();
        System.out.println("Digite en años la antiguedad en el empleo");
        ant=lector.nextFloat();
        
        if (edad>=60 && ant<25){
            System.out.println("Querido "+Nombre+", Usted Ha sido adsctito al programa de Jubilacion por Edad");
        }
        else if(edad<60 && ant>=25){
            System.out.println("Querido "+Nombre+", Usted ha sido adscrito al programa de Jubilacion Joven");
        }
        else{
            System.out.println("Querido "+Nombre+", usted ha sido adscrito al programa de Jubilacion Adulta ");
        }
                
     
    }
    
}
