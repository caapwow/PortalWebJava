/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Publicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class PublicacionJDBC {
    
    
    private Connection conexionTransaccional;
    private static final String SQL_CREATE="INSERT INTO publicaciones(id_publicacion,titulo,fecha,documento,descripcion,areas_id_area,funcionarios_rut) SELECT ID_PUBLICACION.nextval,titulo,fecha,documento,descripcion,areas_id_area,funcionarios_rut"
            + "FROM (SELECT ? as titulo,? as fecha,? as documento,? as descripcion,? as areas_id_area, ? as funcionarios_rut FROM dual)";
    private static final String SQL_SELECT="SELECT id_publicacion,titulo,fecha,documento,descripcion,areas_id_area,funcionarios_rut FROM publicaciones";
    private static final String SQL_SELECT_BY_TITULO="SELECT id_publicacion,titulo,fecha,documento,descripcion,areas_id_area,funcionarios_rut FROM publicaciones WHERE titulo=? OR descripcion=?";
    private static final String SQL_UPDATE="UPDATE  publicaciones SET titulo=?,fecha=?,documento=?,descripcion=?,areas_id_area=? WHERE id_publicacion=?";
    private static final String SQL_DELETE="DELETE FROM publicaciones WHERE id_publicacion=?";

    public PublicacionJDBC() {
    }

    public PublicacionJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
     
    
    public List<Publicacion> listar(){
        List<Publicacion> publicaciones=new ArrayList<>();
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs= null;
        
        try {
            conn=this.conexionTransaccional!=null ? this.conexionTransaccional : ConexionOracle.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while(rs.next()){
                
                int id_publicacion=rs.getInt(1);
                String titulo=rs.getString(2);
                Date fecha=rs.getDate(3);
                String documento=rs.getString(4);
                String descripcion=rs.getString(5);
                int id_area=rs.getInt(6);
                String rut_funcionario=rs.getString(7);
                
                
            }
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
            if(this.conexionTransaccional==null){
                ConexionOracle.close(conn);
            }
            ConexionOracle.close(stmt);
            ConexionOracle.close(rs);
        
        }
        
        
        return publicaciones;
    }
    
    
    public Publicacion encontrar(Publicacion publicacion){ 
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs= null;
        
        try {
            conn=this.conexionTransaccional!=null ? this.conexionTransaccional : ConexionOracle.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            stmt.setString(1,publicacion.getTitulo());
            stmt.setString(2, publicacion.getDescripcion());
            
            rs=stmt.executeQuery();
            
                
                int id_publicacion=rs.getInt(1);
                String titulo=rs.getString(2);
                Date fecha=rs.getDate(3);
                String documento=rs.getString(4);
                String descripcion=rs.getString(5);
                int id_area=rs.getInt(6);
                String rut_funcionario=rs.getString(7); 
                
                
                publicacion.setId_publicacion(id_publicacion); 
                publicacion.setTitulo(titulo);
                publicacion.setFecha(fecha);
                publicacion.setDocumento(documento);
                publicacion.setDescripcion(descripcion);
                
             
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
            if(this.conexionTransaccional==null){
                ConexionOracle.close(conn);
            }
            ConexionOracle.close(stmt);
            ConexionOracle.close(rs);
        
        }
        
        
        return publicacion;
    }
    
    
}
