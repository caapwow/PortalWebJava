/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Cesar
 */
public class Publicacion {
    
    private int id_publicacion;
    private String titulo;
    private Date fecha;
    private String documento;
    private String descripcion;
    private Area area;
    private Funcionario funcionario;

    public Publicacion() {
    }

    public Publicacion(int id_publicacion, String titulo, Date fecha, String documento, String descripcion, Area area, Funcionario funcionario) {
        this.id_publicacion = id_publicacion;
        this.titulo = titulo;
        this.fecha = fecha;
        this.documento = documento;
        this.descripcion = descripcion;
        this.area = area;
        this.funcionario = funcionario;
    }

    
    
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    
    public int getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  

    
    
    
    
    
}
