/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.Scanner;

/**
 *
 * @author jenny.valencia
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Scanner sn = new Scanner(System.in);
            //sn.useDelimiter("/n");
            boolean salir = false;
            String opcion;
            Agenda agendaTelefonica = new Agenda(15);
            String nombre;
            int telefono;
            String correo;

            Contacto c = null;

            while (!salir) {

                System.out.println("A. Para agregar contacto");
                System.out.println("B. Para buscar contacto");
                System.out.println("C. Listar agenda");
                System.out.println("D Ver si la agenda está llena");                
                System.out.println("E. Ver espacios libres de la agenda");
                System.out.println("S. Para salir del programa");

                System.out.println("Ingresa una de las opciones");
                opcion = sn.nextLine();

                switch (opcion) {
                    case "A":

                        System.out.println("Escribe un nombre");
                        nombre = sn.next();

                        System.out.println("Escribe un telefono");
                        telefono = sn.nextInt();

                        System.out.println("Escribe un correo");
                        correo = sn.next();

                        c = new Contacto(nombre, telefono, correo);

                        agendaTelefonica.agregarContacto(c);

                        break;

                    case "B":
                        System.out.println("Escribe el nombre que deseas buscar");
                        nombre = sn.next();
                        agendaTelefonica.buscarContacto(nombre);

                        break;

                    case "C":
                        agendaTelefonica.listarContactos();
                        break;

                    

                    case "D":
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("AGENDA SIN ESPACIO");
                        }

                        break;

                    case "E":
                        System.out.println("Hay" + agendaTelefonica.espacioLibre() + "espacios libres");

                        break;
                        
                    case "S":
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo desde la opcion 1 a la 7");

                }
            }

        }catch(Exception e){
            System.out.println("Error al ingresar la opción en el menú");
            System.out.println(e);
        }
            

    }
}
