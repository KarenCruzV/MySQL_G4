package com.sicg4;

import java.sql.*; 

public class App { 
 
   public static void main(String[] args) { 
      //Try-Catch para manejo de errores 
      try { 
         //Llamada a la libreria mysql conector 
         Class.forName("com.mysql.jdbc.Driver"); 
         //Nueva conexión                           conexión a localhost |   nombre de bd | ususario mysql | contraseña   
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grupo4", "usuariotabla", "pass1234"); 
         //Nuevo statement para llamada de datos 
         Statement stmt = con.createStatement(); 
         //Creación de Query | llamada a todos los datos de la tabla alumnos 
         //ResultSet rs = stmt.executeQuery("select * from participantes"); 

         //Creación de Query | ordenamiento por Apellido
         //ResultSet rs = stmt.executeQuery("select * from participantes order by Apellido asc"); 
         
         //Creación de Query | ordenamiento por Edad
         //ResultSet rs = stmt.executeQuery("select * from participantes order by Edad asc");

         //Creación de Query | ordenamiento por Unidad
         ResultSet rs = stmt.executeQuery("select * from participantes order by Unidad asc"); 
         
         //Ciclo de todos los elementos obtenidos por el query 
         while (rs.next()) 
            //Impresión de los valores 
            System.out.println(rs.getString(1) + " " + rs.getString(2)+ " " + rs.getString(3) + " " + rs.getInt(4)); 
            //Se cierra la conexión  
         con.close();
      } catch (Exception e) { 
         //Imprimir errores  
         System.out.println(e); 
      } 
   }
} 