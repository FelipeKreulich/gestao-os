/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author felip
 */
public class ModuloConexao {
    
    // Método Responsável por estabelecer a conexão com o DB
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // Chama o driver responsável pela conexão do DB
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referentes ao DB
        String URL = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        String USER = "dba";
        String SENHA = "Felipek2002@";
        
        // Estabelecendo conexão com o DB com Try Catch
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(URL, USER, SENHA);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }
    }
    
}
