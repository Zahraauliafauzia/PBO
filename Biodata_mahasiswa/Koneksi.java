package com.pboreg;

import java.sql.*;

public class Koneksi {

    private Connection conn;

    //Buat deklarasi attribut untuk statement
    private Statement st;

    //Definisikan username, password, dan alamat, dari server mysql
    public Koneksi(){
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/datamhs";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Untuk Input Data (Insert), edit data (Update), dan Hapus data (Delete)
    public int manipulasiData(String query){
        try{
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
    }

}
