package com.example.foodmenu.tester;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class TestConn {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();

        try (InputStream is = TestConn.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            props.load(is);
        }

        String url = props.getProperty("spring.datasource.url");
        String user = props.getProperty("spring.datasource.username");
        String password = props.getProperty("spring.datasource.password");
//        user = "sa";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn.isValid(5)) {
                System.out.println("Connected!");
            }
        }


    }
}
