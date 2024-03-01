package me.xdf.hello;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class HelloWorld {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/dbjsp";
        String user = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        
        String sql = "SELECT * FROM student;";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.print("pId=" + resultSet.getString("pId"));
            System.out.println("\tname=" + resultSet.getString("name"));
        }

        System.out.println("GitHub进行了修改");
    }
}
