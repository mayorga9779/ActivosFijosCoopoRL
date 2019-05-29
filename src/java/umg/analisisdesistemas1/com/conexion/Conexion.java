/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.analisisdesistemas1.com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELLMAYORGA
 */
public class Conexion {
    public Connection cadena_conexion(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //url = "jdbc:sqlserver://testcoopo.database.windows.net:1433;databaseName=ACTIVOS_FIJOS;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;" >
            conn = DriverManager.getConnection("jdbc:sqlserver://testcoopo.database.windows.net:1433;databaseName=ACTIVOS_FIJOS", "emayorga@testcoopo", "Test2019");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conn;
    }
}
