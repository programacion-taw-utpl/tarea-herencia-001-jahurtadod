/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author jahur
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String cedula;
    protected int edad;
    
    public Persona(String n, String a, String c, int e){
        this.setNombre(n);
        this.setApellido(a);
        this.setCedula(c);
        this.setEdad(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return String.format("\t%s %s\n"
                + "\t\t%d de edad\n"
                + "\t\tCI: %s\n", 
                this.getNombre(), this.getApellido(), 
                this.getEdad(),
                this.getCedula());
    }
    
}
