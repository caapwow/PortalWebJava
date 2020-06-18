/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Cesar
 */
public class Planta {
    
    private int id_planta;
    private String planta;

    public Planta() {
        
    }

    public Planta(int id_planta) {
        this.id_planta = id_planta;
    }

    
    
    public Planta(int id_planta, String planta) {
        this.id_planta = id_planta;
        this.planta = planta;
    }

     

    public int getId_planta() {
        return id_planta;
    }

    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    @Override
    public String toString() {
        return "id_planta=" + id_planta + ", planta=" + planta;
    }

    
    
}
