/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.analisisdesistemas1.com.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;
import umg.analisisdesistemas1.com.conexion.Conexion;

/**
 *
 * @author DELLMAYORGA
 */
public class ModeloReporte {
    private DataSource ds;
    private Conexion conn = new Conexion();
    private Connection conexion = null;
    
    public ModeloReporte(DataSource ds) {
        this.ds = ds;
    }
    
    public Connection obtenerConexion(){
        //Connection conexion = null;
        Statement st = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        
        try{
            //conexion = ds.getConnection();
            conexion = conn.cadena_conexion();
        } catch(Exception e){
            
        }
        
        return conexion;
    }
}
