package pipi;

import java.util.Scanner;

public class pipi {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String Nombre, am;
        int producto = 0, Categoria, cantidad = 0;
        int ds, dm, mes, year, hh, hh_e, mm_e, ss_e, mm, ss, stock = 0;
        float precio_u = 0, subtotal, descuento, iva, total,Id;

        // Datos del cliente
        System.out.println("Ingrese su nombre:");
        Nombre = lector.nextLine();
        System.out.println("Ingrese su ID:");
        Id = lector.nextInt();

        // Solicitar el dÃ­a de la semana (1: Lunes, ... 7: Domingo)
        System.out.println("Ingrese el numero del dia de la semana en que se realiza el pedido (1: Lunes, ... 7: Domingo):");
        ds = lector.nextInt();
        if (ds < 1 || ds > 7) {
            System.out.println("Di­a de la semana invalido. Ingrese un numero entre 1 y 7.");
            ds=lector.nextInt();
            if(ds<1 || ds>7){
                throw new AssertionError();
            }
        
        }

        // SelecciÃ³n de categorÃ­a y producto
        System.out.println("Estas son las categorÃ­as disponibles: 1.Laptops 2.Smartphones 3.Accesorios 4.Componentes PC (1-4)");
        Categoria = lector.nextInt();
        switch (Categoria) {
            case 1:
                System.out.println("Has seleccionado la opcion Laptops");
                System.out.println("Seleccione el item: 1.Ultrabook X 2.Gaming Z 3.Workstation Pro 4.Chromebook Y");
                producto = lector.nextInt();
                switch (producto) {
                    case 1:
                        System.out.println("Has seleccionado Ultrabook X");
                        stock = 10;
                        precio_u = 500000;
                        break;
                    case 2:
                        System.out.println("Has seleccionado Gaming Z");
                        stock = 15;
                        precio_u = 700000;
                        break;
                    case 3:
                        System.out.println("Has seleccionado Workstation Pro");
                        stock = 8;
                        precio_u = 900000;
                        break;
                    case 4:
                        System.out.println("Has seleccionado Chromebook Y");
                        stock = 20;
                        precio_u = 300000;
                        break;
                    default:
                        System.out.println("ERROR: producto no valido");
                        throw new AssertionError();
                }
                break;
            case 2:
                System.out.println("Has seleccionado la opcion Smartphones");
                System.out.println("Seleccione el item: 1.Galaxy Ultra 2.Iphone Pro 3.Pixel Max 4.OnePlus Speed");
                producto = lector.nextInt();
                switch (producto) {
                    case 1:
                        System.out.println("Has seleccionado Galaxy Ultra");
                        stock = 12;
                        precio_u = 1200000;
                        break;
                    case 2:
                        System.out.println("Has seleccionado Iphone Pro");
                        stock = 10;
                        precio_u = 1500000;
                        break;
                    case 3:
                        System.out.println("Has seleccionado Pixel Max");
                        stock = 14;
                        precio_u = 1100000;
                        break;
                    case 4:
                        System.out.println("Has seleccionado OnePlus Speed");
                        stock = 16;
                        precio_u = 1000000;
                        break;
                    default:
                        System.out.println("ERROR: producto no vÃ¡lido");
                        throw new AssertionError();
                }
                break;
            case 3:
                System.out.println("Has seleccionado la opcion Accesorios");
                System.out.println("Digite el numero del item a seleccionar: 1.Audifonos Inalambricos 2.Teclado Mecanico 3.Mouse Gamer 4.Cargador RÃ¡pido");
                producto = lector.nextInt();
                switch (producto) {
                    case 1:
                        System.out.println("Has seleccionado Audifonos Inalambricos");
                        stock = 25;
                        precio_u = 150000;
                        break;
                    case 2:
                        System.out.println("Has seleccionado Teclado Mecanico");
                        stock = 30;
                        precio_u = 200000;
                        break;
                    case 3:
                        System.out.println("Has seleccionado Mouse Gamer");
                        stock = 18;
                        precio_u = 180000;
                        break;
                    case 4:
                        System.out.println("Has seleccionado Cargador Rapido");
                        stock = 22;
                        precio_u = 80000;
                        break;
                    default:
                        System.out.println("ERROR: producto no valido");
                        throw new AssertionError();
                }
                break;
            case 4:
                System.out.println("Has seleccionado la opcion Componentes PC");
                System.out.println("Digite el numero del item a seleccionar: 1.Tarjeta Grafica RTX 2.Procesador i9 3.SSD NVMe 4.Fuente de poder");
                producto = lector.nextInt();
                switch (producto) {
                    case 1:
                        System.out.println("Has seleccionado Tarjeta Grafica RTX");
                        stock = 5;
                        precio_u = 2500000;
                        break;
                    case 2:
                        System.out.println("Has seleccionado Procesador i9");
                        stock = 7;
                        precio_u = 1800000;
                        break;
                    case 3:
                        System.out.println("Has seleccionado SSD NVMe");
                        stock = 9;
                        precio_u = 600000;
                        break;
                    case 4:
                        System.out.println("Has seleccionado Fuente de poder");
                        stock = 6;
                        precio_u = 400000;
                        break;
                    default:
                        System.out.println("ERROR: producto no valido");
                        throw new AssertionError();
                }
                break;
            default:
                System.out.println("ERROR: opcion no valida");
                throw new AssertionError();
        }
        
        // Solicitar la cantidad a comprar
        System.out.println("Ingrese la cantidad que desea comprar:");
        cantidad = lector.nextInt();
        
        // ValidaciÃ³n: la cantidad solicitada debe ser mayor a 0 y menor o igual al stock disponible
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            subtotal = cantidad * precio_u;
            System.out.println("Pedido valido");
            System.out.println("Stock restante: " + stock);
            System.out.println("Subtotal sin descuentos ni IVA: $" + subtotal);
            
            // Calcular la suma de los dÃ­gitos del ID sin modificarlo
            float tempId = Id;
            int sumaId = (int) ((tempId / 1000) % 10 +
                    (tempId / 100) % 10 +
                    (tempId / 10) % 10 +
                    tempId % 10);
            System.out.println("La suma de los digitos de tu ID es: " + sumaId);
            
            // Aplicar descuentos segÃºn las condiciones
            if (Id % 3 == 0) {
                if (cantidad >= 5 && cantidad <= 10) {
                    subtotal *= 0.95;  // Descuento del 5%
                    System.out.println("Descuento aplicado: 5%");
                } else if (cantidad > 10 && subtotal > 500000) {
                    subtotal *= 0.90;  // Descuento del 10%
                    System.out.println("Descuento aplicado: 10%");
                }
            } else if (sumaId % 2 != 0) {
                if (cantidad >= 8 && cantidad <= 15) {
                    subtotal *= 0.93;  // Descuento del 7%
                    System.out.println("Descuento aplicado: 7%");
                } else if (cantidad > 20 && subtotal > 1000000) {
                    subtotal *= 0.85;  // Descuento del 15%
                    System.out.println("Descuento aplicado: 15%");
                }
            } else {
                System.out.println("No se aplicaron descuentos.");
            }
            
            // Calcular IVA y total
            iva = subtotal * 0.19f;
            total = subtotal + iva;
            System.out.println("Subtotal con descuentos: $" + subtotal);
            System.out.println("IVA (19%): $" + iva);
            System.out.println("Total a pagar: $" + total);
            
            // Solicitar datos para la fecha del pedido
            System.out.println("Ingrese el dia del mes en que se realiza el pedido:");
            dm = lector.nextInt();
            if(dm<1 || dm>31){
                System.out.println("Dia Invalido");
                throw new AssertionError();
            }
            System.out.println("Ingrese el numero del mes en que se realiza el pedido (1-12):");
            mes = lector.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Mes invalido. Ingrese un numero entre 1 y 12.");
                throw new AssertionError();
            }
            System.out.println("Ingrese el año (dos digitos, ej. 25 para 2025):");
            year = lector.nextInt();
            
            // Calcular la fecha de entrega (sumando 1 di­a)
            dm += 1;
            if (mes == 2) {
                if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) && dm > 29) {
                    dm = 1;
                    mes += 1;
                } else if (dm > 28) {
                    dm = 1;
                    mes += 1;
                }
            } else if (mes == 1 || mes == 3 || mes == 5 ||
                       mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dm > 31) {
                    dm = 1;
                    mes += 1;
                }
            } else { // Meses con 30 di­as: 4,6,9,11
                if (dm > 30) {
                    dm = 1;
                    mes += 1;
                }
            }
            if (mes > 12) {
                mes = 1;
                year += 1;
            }
            int anioCompleto = 2000 + year;
            String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            String[] mesesNombre = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            System.out.println("Fecha de entrega: " + diasSemana[ds - 1] + ", " + dm + " de " + mesesNombre[mes - 1] + " de " + anioCompleto);
            
            // Solicitar datos para la hora del pedido
            System.out.println("Ingrese la hora del pedido (formato 12 horas):");
            hh = lector.nextInt();
            System.out.println("Ingrese los minutos del pedido:");
            mm = lector.nextInt();
            System.out.println("Ingrese los segundos del pedido:");
            ss = lector.nextInt();
            System.out.println("Ingrese la franja (a.m. o p.m.):");
            am = lector.next();

            // Convertir a formato 24 horas comparando el primer carÃ¡cter de 'am'
            if (am.equals("pm")) {
                hh = (hh % 12) + 12;
            } else if (am.equals("am")) {
                hh = (hh % 12);
            } else {
                System.out.println("Franja Horaria No valida");
                throw new AssertionError();
            }

            // Calcular la hora maxima de entrega (24 horas menos 1 segundo)
            hh_e = hh;
            mm_e = mm;
            ss_e = ss - 1;
            if (ss_e < 0) {
                ss_e = 59;
                mm_e -= 1;
                if (mm_e < 0) {
                    mm_e = 59;
                    hh_e -= 1;
                }
            }
            hh_e %= 24;
            System.out.println("Hora maxima de entrega: " + String.format("%02d:%02d:%02d", hh_e, mm_e, ss_e));
            
        } else {
            System.out.println("ERROR: La cantidad solicitada excede el stock disponible");
            throw new AssertionError();
            }
        }
    }

