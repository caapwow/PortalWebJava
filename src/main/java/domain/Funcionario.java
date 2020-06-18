/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Cesar
 */
public class Funcionario {
    
    private String rut;
    private String nombre;
    private String telefono;
    private String email;
    private String lider;
    private int linea;
    private String foto;
    private String password;
    private Planta planta;
    private Cargo cargo;
    private Rol rol;
    
    
    
    public Funcionario(){
    
    }

    public Funcionario(String rut, String nombre, String telefono, String email, String lider, int linea, String foto, String password, Planta planta, Cargo cargo, Rol rol) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.lider = lider;
        this.linea = linea;
        this.foto = foto;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
        this.planta = planta;
        this.cargo = cargo;
        this.rol = rol;
    }

    
    
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "rut=" + rut + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", lider=" + lider + ", linea=" + linea + ", foto=" + foto + ", password=" + password + ", planta=" + planta + ", cargo=" + cargo + ", rol=" + rol + '}';
    }

     
    
    
}
