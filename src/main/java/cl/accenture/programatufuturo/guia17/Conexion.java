package cl.accenture.programatufuturo.guia17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static void main (String[] args) {
        System.out.println("Conectando...");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Banco",
                    "root",
                    "curso2018");

            System.out.print("Conectado correctamente");
        }catch(ClassNotFoundException e){
            System.out.print("Error de conexion");
        }
        catch (SQLException ex){
            System.out.print("nope, No funciona ");
        }
    }
}
