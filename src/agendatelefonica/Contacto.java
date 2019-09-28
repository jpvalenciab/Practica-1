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
public class Contacto {
    private String nombre;
    private int telefono;
    private String correo;

    public Contacto(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
       
    }

    Contacto(String nombre, int i) {
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
public boolean equals (Contacto c){
return this.nombre.equalsIgnoreCase(c.getNombre());

}

    @Override
    public String toString() {
        return "nombre" + nombre + ", telefono" + telefono + "correo" + correo;
    }
   
   
}
