package co.edu.cesde;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        int i, hamburguesa, perro, salchipapas, chorizos, cantPersonas, pedido, total;
        int conHamburguesa, conPerro, conSalchipapa, conChorizos;
        int tHamburguesa, tPerro, tSalchipapa, tChorizos;
        int propina, vpropina, desc, descTotal, totalCompra, totalGeneral, tConDescuento;

        // Personas
        cantPersonas = 0;

        // Productos
        hamburguesa = 10000;
        perro = 8000;
        salchipapas = 6000;
        chorizos = 7000;

        // Contadores
        conHamburguesa = 0;
        conPerro = 0;
        conSalchipapa = 0;
        conChorizos = 0;
        tHamburguesa = 0;
        tPerro = 0;
        tSalchipapa = 0;
        tChorizos = 0;

        System.out.println("---- Restaurante Muerte Lenta -----");
        System.out.println("--- Solicitud de pedios ---");
        System.out.println(" Ingrese el número de comensales ");
        cantPersonas = inputData.nextInt();

        for (i = 1 ; i <= cantPersonas ; i++) {

            System.out.println("Ingrese pedido del comensal " + i + " ---Seleccione el numero del producto---");
            System.out.println("1. Hamburguesa");
            System.out.println("2. Perro");
            System.out.println("3. Salchipapas");
            System.out.println("4. Chorizo");
            pedido = inputData.nextInt();

            switch (pedido) {

                case 1 :
                    conHamburguesa = conHamburguesa + 1;
                    tHamburguesa = hamburguesa * conHamburguesa;
                    break;

                case 2 :
                     conPerro = conPerro + 1;
                     tPerro = perro * conPerro;
                    break;

                case 3 :
                    conSalchipapa = conSalchipapa + 1;
                    tSalchipapa = salchipapas * conSalchipapa;
                    break;

                case 4 :
                    conChorizos = conChorizos + 1;
                    tChorizos = chorizos * conChorizos;
                    break;
                default:
                    System.out.println("Numero no valido");
                    break;
            }
        }

        if (conHamburguesa > 1 || conPerro > 1 || conSalchipapa > 1 || conChorizos > 1) {
            total = tHamburguesa + tPerro + tSalchipapa + tChorizos;
            desc = total * 5 / 100;
            totalCompra = total - desc;

            if (totalCompra > 20000) {
                descTotal = totalCompra * 10 / 100;
                tConDescuento = totalCompra - descTotal;

                System.out.println(" ------------- ");
                System.out.println("Desea incluir el servicio?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                propina = inputData.nextInt();

                switch (propina) {

                    case 1:
                        vpropina = tConDescuento * 10 / 100;
                        totalGeneral = tConDescuento + vpropina;
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Descuento Productos Gemelos: " + desc);
                        System.out.println("Descuento compra superior a 20000: " + descTotal);
                        System.out.println("Servicio 10%: " + vpropina);
                        System.out.println("Total a Pagar: " + totalGeneral);
                        break;

                    case 2:
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Descuento Productos Gemelos: " + desc);
                        System.out.println("Descuento compra superior a 20000: " + descTotal);
                        System.out.println("Total a Pagar: " + tConDescuento);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
            else if (totalCompra <= 20000){

                System.out.println(" ------------- ");
                System.out.println("Desea incluir el servicio?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                propina = inputData.nextInt();

                switch (propina) {

                    case 1:
                        vpropina = totalCompra * 10 / 100;
                        totalGeneral = totalCompra + vpropina;
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Descuento Productos Gemelos: " + desc);
                        System.out.println("Servicio 10%: " + vpropina);
                        System.out.println("Total a Pagar: " + totalGeneral);
                        break;

                    case 2:
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + conSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Descuento Productos Gemelos: " + desc);
                        System.out.println("Total a Pagar: " + totalCompra);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }

        }
        else if (conHamburguesa <= 1 && conPerro <= 1 && conSalchipapa <= 1 && conChorizos <= 1){
            total = tHamburguesa + tPerro + tSalchipapa + tChorizos;

            if (total > 20000) {
                descTotal = total * 10 / 100;
                tConDescuento = total - descTotal;

                System.out.println(" ------------- ");
                System.out.println("Desea incluir el servicio?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                propina = inputData.nextInt();

                switch (propina) {

                    case 1:
                        vpropina = tConDescuento * 10 / 100;
                        totalGeneral = tConDescuento + vpropina;
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Descuento compra superior a 20000: " + descTotal);
                        System.out.println("Servicio 10%: " + vpropina);
                        System.out.println("Total a Pagar: " + totalGeneral);
                        break;

                    case 2:
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Descuento compra superior a 20000: " + descTotal);
                        System.out.println("Total a Pagar: " + tConDescuento);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
            else if (total <= 20000){

                System.out.println(" ------------- ");
                System.out.println("Desea incluir el servicio?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                propina = inputData.nextInt();

                switch (propina) {

                    case 1:
                        vpropina = total * 10 / 100;
                        totalGeneral = total + vpropina;
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Servicio 10%: " + vpropina);
                        System.out.println("Total a Pagar: " + totalGeneral);
                        break;

                    case 2:
                        System.out.println("---- Restaurante Muerte Lenta -----");
                        System.out.println("---- Factura De Venta -----");
                        System.out.println(conHamburguesa + " Hamburguesa ----- " + tHamburguesa);
                        System.out.println(conPerro + " Perro ----- " + tPerro);
                        System.out.println(conSalchipapa + " Salchipapa ----- " + tSalchipapa);
                        System.out.println(conChorizos + " Chorizo ----- " + tChorizos);
                        System.out.println("Total Neto: " + total);
                        System.out.println("Total a Pagar: " + total);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
        }
    }
}
