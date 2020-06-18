package datos;

import domain.Cargo;
import domain.Funcionario;
import domain.Planta;
import domain.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class FuncionarioJDBC {

    private Connection conexionTransaccional;
    private static final String SQL_CREATE = "INSERT INTO funcionarios(rut,nombre,telefono,email,lider,linea,foto,password,plantas_id_planta,cargos_id_cargo,roles_id_rol)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM funcionarios WHERE rut=?";
    private static final String SQL_SELECT = "SELECT f.rut ,f.nombre,f.telefono,f.email,f.lider,f.linea,f.foto,f.password,f.plantas_id_planta,p.planta,f.cargos_id_cargo,c.cargo,f.roles_id_rol,r.rol FROM funcionarios f INNER JOIN cargos c on f.cargos_id_cargo=c.id_cargo INNER JOIN plantas p  on f.plantas_id_planta=p.id_planta INNER JOIN roles r on f.roles_id_rol=r.id_rol";
    private static final String SQL_UPDATE = "UPDATE funcionarios SET rut=?,nombre=?,telefono=?,email=?,lider=?,linea=?,foto=?,password=?,plantas_id_planta=?,cargos_id_cargo=?,roles_id_rol=? WHERE rut=?";
    private static final String SQL_SELECT_BY_RUT = "SELECT f.rut ,f.nombre,f.telefono,f.email,f.lider,f.linea,f.foto,f.password,f.plantas_id_planta,p.planta,f.cargos_id_cargo,c.cargo,f.roles_id_rol,r.rol FROM funcionarios f INNER JOIN cargos c on f.cargos_id_cargo=c.id_cargo INNER JOIN plantas p  on f.plantas_id_planta=p.id_planta INNER JOIN roles r on f.roles_id_rol=r.id_rol  WHERE f.rut=?";

    public FuncionarioJDBC() {
    }

    public FuncionarioJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Funcionario> listar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            //si el objeto transaccional no es null,utilizamos conexionTransaccional sino utilizamos otra conexion
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionOracle.getConnection();
             System.out.println("Ejecutando Query:"+SQL_SELECT);
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String telefono = rs.getString(3);
                String email = rs.getString(4);
                String lider = rs.getString(5);
                int linea = rs.getInt(6);
                String foto = rs.getString(7);
                String password = rs.getString(8);
                int id_planta = rs.getInt(9);
                String planta = rs.getString(10);
                int id_cargo = rs.getInt(11);
                String cargo = rs.getString(12);
                int id_rol = rs.getInt(13);
                String rol = rs.getString(14);

                Funcionario func = new Funcionario(rut, nombre, telefono, email, lider, linea, foto, password, new Planta(id_planta, planta), new Cargo(id_cargo, cargo), new Rol(id_rol, rol));
                funcionarios.add(func);
            }
       
        } finally {
            if (this.conexionTransaccional == null) {
                ConexionOracle.close(conn);
            }

            ConexionOracle.close(stmt);
            ConexionOracle.close(rs);
        }
        return funcionarios;
    }

    public Funcionario encontrar(Funcionario funcionario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionOracle.getConnection();
             System.out.println("Ejecutando Query:"+SQL_SELECT_BY_RUT);
            stmt = conn.prepareStatement(SQL_SELECT_BY_RUT);
            stmt.setString(1, funcionario.getRut());
            rs = stmt.executeQuery();
            rs.next();
            
            String rut = rs.getString(1);
            String nombre = rs.getString(2);
            String telefono = rs.getString(3);
            String email = rs.getString(4);
            String lider = rs.getString(5);
            int linea = rs.getInt(6);
            String foto = rs.getString(7);
            String password = rs.getString(8);
            int id_planta = rs.getInt(9);
            String planta = rs.getString(10);
            int id_cargo = rs.getInt(11);
            String cargo = rs.getString(12);
            int id_rol = rs.getInt(13);
            String rol = rs.getString(14);
            Cargo carg = new Cargo(id_cargo, rol);
            Rol ro = new Rol(id_rol, rol);
            Planta plan = new Planta(id_planta, planta);
            
            funcionario.setRut(rut);
            funcionario.setNombre(nombre);
            funcionario.setTelefono(telefono);
            funcionario.setEmail(email); 
            funcionario.setLider(lider);
            funcionario.setLinea(linea);
            funcionario.setFoto(foto);            
            funcionario.setPassword(password);  
            
            funcionario.setCargo(carg);
            
            funcionario.setRol(ro);
            
            funcionario.setPlanta(plan);

        
        } finally {
            if (this.conexionTransaccional == null) {
                ConexionOracle.close(conn);
            }

            ConexionOracle.close(stmt);
            ConexionOracle.close(rs);
        }
        return funcionario;
    }

    public int delete(Funcionario funcionario) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionOracle.getConnection();
             System.out.println("Ejecutando Query:"+SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, funcionario.getRut());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
       
        } finally {
            if (this.conexionTransaccional == null) {
                ConexionOracle.close(conn);
            }
            ConexionOracle.close(stmt);
        }
        return rows;
    }

    public int update(Funcionario funcionario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionOracle.getConnection();
            System.out.println("Ejecutando Query:"+SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            
            stmt.setString(1, funcionario.getRut());
            stmt.setString(2, funcionario.getNombre());
            stmt.setString(3, funcionario.getTelefono());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getLider());
            stmt.setInt(6, funcionario.getLinea());
            stmt.setString(7, funcionario.getFoto());
            stmt.setString(8, funcionario.getPassword());
            stmt.setInt(9, funcionario.getPlanta().getId_planta()); 
            stmt.setInt(10, funcionario.getCargo().getId_cargo());
            stmt.setInt(11, funcionario.getRol().getId_rol());
            
            stmt.setString(12, funcionario.getRut());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
        
        } finally {
            if (this.conexionTransaccional == null) {
                ConexionOracle.close(conn);
            }
            ConexionOracle.close(stmt);
        }

        return rows;
    }

    public int create(Funcionario funcionario) throws SQLException {

        int rows = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionOracle.getConnection();
             System.out.println("Ejecutando Query:"+SQL_CREATE);
            stmt = conn.prepareStatement(SQL_CREATE);
            stmt.setString(1, funcionario.getRut());
            stmt.setString(2, funcionario.getNombre());
            stmt.setString(3, funcionario.getTelefono());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getLider());
            stmt.setInt(6, funcionario.getLinea());
            stmt.setString(7, funcionario.getFoto());
            stmt.setString(8, funcionario.getPassword());
            stmt.setInt(9, funcionario.getPlanta().getId_planta());
            stmt.setInt(10, funcionario.getCargo().getId_cargo());
            stmt.setInt(11, funcionario.getRol().getId_rol());

            rows = stmt.executeUpdate();

            System.out.println("Registros afectados:" + rows);
         
        } finally {
            if (this.conexionTransaccional == null) {
                ConexionOracle.close(conn);
            }
            ConexionOracle.close(stmt);
        }
        return rows;
    }
}
