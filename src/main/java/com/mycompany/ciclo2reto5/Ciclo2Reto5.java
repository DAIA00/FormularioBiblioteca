/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ciclo2reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ciclo2Reto5 {

    public static void main(String[] args) {
        Connect Connex = new Connect();
        Connection connect = Connex.getConnection();

        try {
            PreparedStatement sql = connect.prepareStatement("select * from lector");
            //System.out.println(sql);
        } catch (Exception e) {
            System.out.println("Error executing the query");
        }

    }
}
