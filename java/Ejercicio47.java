/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio47;
import java.util.Scanner;
/**
 *
 * @author daxid
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //

        
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        String Nombre;
        float promedio, unidades =0, descuento, precio_u,precio_t, alumno, reprobada;
        System.out.println("Digite su nombre");
        Nombre=lector.nextLine();
        System.out.println("Digite 1, si es alumno profesional o 0, si es preparatoria");
        alumno=lector.nextFloat();
        System.out.println("Digite el promedio academico");
        promedio=lector.nextFloat();
        System.out.println("Digite la cantidad de materias reprobadas");
        reprobada=lector.nextFloat();
        
        if(alumno == 0 && promedio>=9.5){
            unidades = 55;
            precio_u = unidades * 36000;
            descuento = precio_u * 0.25f;
            precio_t = precio_u - descuento;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio con descuento de: "+precio_t);
                  
        }
        else if((alumno == 0) && (promedio>=9) && (promedio<9.5)){
            unidades = 50;
            precio_u = unidades * 36000;
            descuento = precio_u * 0.1f;
            precio_t = precio_u - descuento;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio con descuento de: "+precio_t);
        }    
        else if((alumno == 0 ) && (promedio>7) && (promedio<9)){
            unidades = 50;
            precio_u = unidades * 36000;
            precio_t = precio_u;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio de: "+precio_t);
        }
        else if((alumno == 0 ) && (promedio>=7) && (reprobada<3) && (reprobada>=0)){
            unidades = 45;
            precio_u = unidades * 36000;
            precio_t = precio_u;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio de: "+precio_t);
            
        }
        else if(alumno == 0 && promedio<=7 && reprobada>=4){
            unidades = 40;
            precio_u = unidades * 36000;
            precio_t = precio_u;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio de: "+precio_t);
      
        }
        else if((alumno == 1) && (promedio>=9.5)){
            unidades = 55;
            precio_u = unidades * 60000;
            descuento = precio_u * 0.20f;
            precio_t = precio_u - descuento;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio con descuento de: "+precio_t);  
        }
        else{
            unidades = 55;
            precio_u = unidades * 60000;
            precio_t = precio_u;
            System.out.println("Querido "+Nombre+", usted podra cursar "+unidades+" unidades con un precio de: "+precio_t);
        }
    }
}
