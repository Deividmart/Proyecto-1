/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio45;
import java.util.Scanner;
/**
 *
 * @author daxid
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //El dueño de una empresa desea planificar las decisiones financieras que tomará en el siguiente
         //año. La manera de planificarlas depende de lo siguiente:
         //Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para que su
         //nuevo saldo sea de $10 000 000. Si su capital tiene actualmente un saldo positivo pedirá un
        //préstamo bancario para tener un nuevo saldo de $20 000 000, pero si su capital tiene actualmente
        //un saldo superior a los $20000000 no pedirá ningún préstamo.
        //Posteriormente repartirá su presupuesto de la siguiente manera.
        //$5 000 000 para equipo de computo
        //$2 000 000 para mobiliario
        //y del resto, la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
        //Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y, en
        //caso de que fuera necesario, a cuanto ascendería la cantidad que se pediría al banco.

        // TODO code application logic here
        
        Scanner lector = new Scanner(System.in);
        float capital, prestamo, valorn, ecomputo,mobiliario,insumos,personal, restante;
        System.out.println("Cual es su capital actual");
        capital=lector.nextFloat();
        
        if (capital<0){
            prestamo = 10000000 - capital;
            valorn = 10000000;
            System.out.println("Se ha recibido una transaccion del banco de: "+prestamo+", Su saldo acutal es de: "+valorn);
        }
        else if (capital>=0 && capital<=20000000){
            prestamo = 200000000 - capital;
            valorn = 20000000;
            System.out.println("Se ha recibido una transaccion del banco de: "+prestamo+", Su saldo acutal es de: "+valorn);
        }
        else{
            valorn = capital;
            System.out.println("Su saldo acutal es de: "+valorn);
        }
        
        ecomputo = 5000000;
        mobiliario = 2000000;
        restante = valorn - ecomputo - mobiliario;
        insumos = restante/2;
        personal = restante/2;
        
        System.out.println("La compra de insumos insumos propuestos son: "+insumos);
        System.out.println("Los incentivos para el personal propuestos son: "+personal);
        
        
        
    }
    
}
