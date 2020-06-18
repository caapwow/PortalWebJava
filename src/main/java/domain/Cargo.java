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
public class Cargo {
    private int id_cargo;
    private String cargo;

    public Cargo() {
    }

    public Cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    
    
    public Cargo(int id_cargo, String cargo) {
        this.id_cargo = id_cargo;
        this.cargo = cargo;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "id_cargo=" + id_cargo + ", cargo=" + cargo;
    }

    
    
    
}
