/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class Ambulancia {
    
    private int contrato;
    private String eps;

    public Ambulancia() {
    }

    public Ambulancia(int contrato, String eps) {
        this.contrato = contrato;
        this.eps = eps;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
    
    
}
