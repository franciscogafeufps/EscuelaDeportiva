/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class AuxiliarContable extends Empleado {
    
    private int edad;

      
    public AuxiliarContable(int edad, double salario) {
        super(salario);
        this.edad = edad;
    }

    public AuxiliarContable(int edad, double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.edad = edad;
    }
    
    
    
}
