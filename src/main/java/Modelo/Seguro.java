/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FranciscoGaFe
 */
public class Seguro {
    
    private String accidentes;
    private Ambulancia ambulancia = new Ambulancia();
    private Aseguradora aseguradora = new Aseguradora();

    public Seguro() {
    }

    public Seguro(String accidentes) {
        this.accidentes = accidentes;
    }

    public String getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(String accidentes) {
        this.accidentes = accidentes;
    }

    public Ambulancia getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    
    
    
}
