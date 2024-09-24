/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class Profesor extends Empleado{
    
    private String especialidad;
    private String fechaNacimeinto;

    public Profesor(String especialidad, String fechaNacimeinto, double salario) {
        super(salario);
        this.especialidad = especialidad;
        this.fechaNacimeinto = fechaNacimeinto;
    }

    public Profesor(String especialidad, String fechaNacimeinto, double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.especialidad = especialidad;
        this.fechaNacimeinto = fechaNacimeinto;
    }
    
    
    
}
