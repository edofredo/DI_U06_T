/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase que determina las propiedades y comportamientos de los alumnos
 * @author Cristian
 */
public class AlumnosDAM implements Comparable<AlumnosDAM>{
   
    /**
     * Variables que almacenan las propiedades de cada instancia de alumno
     */
    private String dni, modulo, provincia;
    private double nota;
    
    /**
     * Construcor con parametros de la clase
     * @param dni el dni del alumno
     * @param modulo el módulo al que está matriculado el alumno
     * @param provincia la provincia de residencia del alumno
     * @param nota la nota del modulo del alumno
     */
    public AlumnosDAM(String dni, String modulo, String provincia, double nota) {
        this.dni = dni;
        this.modulo = modulo;
        this.provincia = provincia;
        this.nota = nota;
    }
   
    /**
     * Método que devuelve el dni de un alumno
     * @return dni del alumno
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Método que establece el dni de un alumno
     * @param dni numero del dni del alumno
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
     * Método que devuelve el módulo de un alumno
     * @return modulo al que esta matriculado el alumno
     */
    public String getModulo() {
        return modulo;
    }
    
    /**
     * Método que establece el módulo de un alumno
     * @param modulo modulo al que esta matriculado 
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    
    /**
     * Método que devuelve la provincia de residencia de un alumno
     * @return provincia de residencia del alumno
     */
    public String getProvincia() {
        return provincia;
    }
    
    /**
     * Método que establece la provincia de residencia de un alumno
     * @param provincia provincia de residencia del alumno
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    /**
     * Método que devuelve la nota de un alumno
     * @return devuelve la nota de un alumno
     */    
    public double getNota() {
        return nota;
    }

    /**
     * Método que establece la nota de un alumno
     * @param nota la nota de un alumno
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    /**
     * Método que permite clasificar los alumnos en función del módulo al que
     * están matriculados
     * @param a objeto alumno
     * @return devuelve un numero entero en función de si el objeto comparado es
     * mayor, menor o igual que el modelo
     */
    @Override
    public int compareTo(AlumnosDAM a) {
        return modulo.compareTo(a.getModulo());
    }
      
}
