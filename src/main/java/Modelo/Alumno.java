/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class Alumno extends Persona {
    
    private String fechaNacimiento;

    public Alumno(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno(String fechaNacimiento, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.fechaNacimiento = fechaNacimiento;
    }

}
