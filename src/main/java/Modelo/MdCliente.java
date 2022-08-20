
package Modelo;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class MdCliente {
    DbData dbData;
    
    public MdCliente(){
        this.dbData = new DbData();
    }
    
    public boolean crearCliente (Cliente c){
        try(Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "INSERT INTO cliente (identificacion, nombres, apellidos, direccion, telefono) VALUES (?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, c.getIdentificacion());
            statement.setString(2, c.getNombres());
            statement.setString(3, c.getApellidos());
            statement.setString(4, c.getDireccion());
            statement.setString(5, c.getTelefono());
            
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            return false;
        }
    }
    
    public Cliente buscarCliente (String identificacion){
        Cliente c = null;
        try(Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String consulta = "SELECT * FROM cliente AS c WHERE c.identificacion = ?";
            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, identificacion);
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                String ident = result.getString(2);
                String nom = result.getString(3);
                String apell = result.getString(4);
                String dir = result.getString(5);
                String tel = result.getString(6);
                c = new Cliente(ident, nom, apell, dir,tel);
            }
            return c;
        }
        catch (Exception e){
        }
        return c;
    }
    
    public boolean actualizarCliente (Cliente c){
        try(Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String consulta = "UPDATE cliente SET nombres = ?, apellidos = ?, direccion = ?, telefono = ? WHERE identificacion = ?";
            PreparedStatement statement = conn.prepareStatement(consulta);
            statement.setString(1, c.getNombres());
            statement.setString(2, c.getApellidos());
            statement.setString(3, c.getDireccion());
            statement.setString(4, c.getTelefono());
            statement.setString(5, c.getIdentificacion());
            
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean borrarCliente (Cliente c){
        try(Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String consulta = "DELETE FROM cliente WHERE identificacion = ?";
            PreparedStatement statement = conn.prepareStatement(consulta);
            statement.setString(1, c.getIdentificacion());
            
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public LinkedList <Cliente> buscarTodosClientes(){
        LinkedList <Cliente> listaClientes = new LinkedList <> ();
        
        try(Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String consulta = "SELECT * FROM clientes ORDER BY nombres";
            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                String identificacion = result.getString(2);
                String nombres = result.getString(3);
                String apellidos = result.getString(4);
                String direccion = result.getString(5);
                String telefono = result.getString(6);
                
                Cliente c = new Cliente(identificacion, nombres, apellidos, direccion,telefono);
                listaClientes.add(c);
            }
            return listaClientes;
        }
        catch (Exception e){
        }
        return listaClientes;
    }
}
