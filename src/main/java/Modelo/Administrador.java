/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class Administrador extends Empleado{
    
    private String numeroContarto;
    private String inicioContrato;
    private String finContrato;

    public Administrador(String numeroContarto, String inicioContrato, String finContrato, double salario) {
        super(salario);
        this.numeroContarto = numeroContarto;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    public Administrador(String numeroContarto, String inicioContrato, String finContrato, double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.numeroContarto = numeroContarto;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }
    
    
    
}
