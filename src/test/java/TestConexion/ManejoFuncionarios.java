/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestConexion;

import datos.ConexionOracle;
import datos.FuncionarioJDBC;
import domain.Cargo;
import domain.Funcionario;
import domain.Planta;
import domain.Rol;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class ManejoFuncionarios {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = ConexionOracle.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            FuncionarioJDBC funcionarioJDBC = new FuncionarioJDBC(conexion);

            ArrayList<Funcionario> list=(ArrayList<Funcionario>) funcionarioJDBC.listar();
            
            for(Funcionario obj:list){
                System.out.println(obj);
            }
            Funcionario funcionario = new Funcionario();
            funcionario.setRut("194209274"); 
            System.out.println(funcionarioJDBC.encontrar(funcionario));

            Funcionario f1 = new Funcionario();
            f1.setRut("194209274");
//            f1.setNombre("andres");
//            f1.setTelefono("+56954016494");
//            f1.setEmail("cesar@gmail.com");
//            f1.setLider("Luis");
//            f1.setLinea(3);
//            f1.setFoto("");
//            f1.setPassword("hola");
//            f1.setPlanta(new Planta(2));
//            f1.setCargo(new Cargo(12));
//            f1.setRol(new Rol(1));
//            funcionarioJDBC.update(f1);
             funcionarioJDBC.delete(f1);
//            
//            Funcionario f2= new Funcionario("107348808", "Euguenia", "66461204", "kenna@live.com","Luis",3,"","cesar", new Planta(2), new Cargo(11), new Rol(1));
//            funcionarioJDBC.create(f2);
            conexion.commit();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
