/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

/**
 *
 * @author jenny.valencia
 */
public class Agenda {

    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[15];

    }

    public Agenda(int tamaño) {
        this.contactos = new Contacto[tamaño];
    }

    public void agregarContacto(Contacto c) {

        if (existeContacto(c)) {
            System.out.println("Ya existe un contacto con ese nombre");
        } else if (agendaLlena()) {
            System.out.println("AGENDA SIN ESPACIO");

        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println("Se agregó el contacto");
            } else {
                System.out.println("No se pudo agregar el contacto");
            }
        }

    }

    public boolean buscarContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;

            }
        }
        return false;

    }

    public void listarContactos() {
        if (espacioLibre() == contactos.length) {

        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println(contactos[i]);

                }

            }
        }

    }

    public void buscarNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El telefono es" + contactos[i].getTelefono());
                encontrado = true;

            }

        }

        if (!encontrado) {
            System.out.println("No se ha podido encontrar el contacto");
        }

    }

    public boolean agendaLlena() {
        for (Contacto contacto : contactos) {
            if (contacto == null) {
                return false;
            }
        }

        return true;
    }

    public int espacioLibre() {
        int contadorLibres = 0;
        for (Contacto contacto : contactos) {
            if (contacto != null) {
                contadorLibres++;
            }
        }
        return contadorLibres;

    }

    boolean existeContacto(Contacto c) {
        return false;

    }

    void buscarContacto(String contacto) {

    }

    void listarContacto() {

    }

}
