/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public abstract class Empleado extends Persona {
    
    protected double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }

    public Empleado(double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.salario = salario;
    }
    
    
    
}
