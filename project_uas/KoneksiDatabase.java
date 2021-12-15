package com.project_uas;

import java.sql.*;

public class KoneksiDatabase {


    private Connection conn;
    private Statement st;
    //Buat deklarasi attribut untuk statement

    //Definisikan username, password, dan alamat, dari server mysql
    public KoneksiDatabase(){
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/datatakson";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Untuk Input Data (Insert), edit data (Update), dan Hapus data (Delete)
    public int manipulasiDataa(String query){
        try{
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
    }
    public ResultSet getDt(String query) {
        try {
            st = conn.createStatement();
            return st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
