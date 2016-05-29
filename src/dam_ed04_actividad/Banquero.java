/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

/**
 *
 * @author MXIII
 */
public class Banquero {
    
    private String nombre;
    private String apellido;
    private String dni;
    private boolean malaGente = true;

    public Banquero(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the malaGente
     */
    public boolean isMalaGente() {
        return malaGente;
    }

    /**
     * @param malaGente the malaGente to set
     */
    public void setMalaGente(boolean malaGente) {
        this.malaGente = malaGente;
    }
    
    

}
