/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class Responsable extends Persona {
    
    private String email;

    public Responsable(String email) {
        this.email = email;
    }

    public Responsable(String email, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.email = email;
    }
    
}
