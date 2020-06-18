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
public class Area {
    
    private int id_area;
    private String area;

    public Area() {
    }

    public Area(int id_area, String area) {
        this.id_area = id_area;
        this.area = area;
    }

    public Area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "id_area=" + id_area + ", area=" + area;
    }
    
    
}
