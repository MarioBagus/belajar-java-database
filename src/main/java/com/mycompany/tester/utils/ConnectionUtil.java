/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tester.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author MBagus
 */
public class ConnectionUtil {
        private static HikariDataSource dataSource;
    static{
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/phpdasar?serverTimezone=Asia/Jakarta");
        config.setUsername("root");
        config.setPassword("");
        
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60 *1000);
        config.setMaxLifetime(10 * 60 *1000);
        dataSource = new HikariDataSource(config);
    }
     public static HikariDataSource getDataSource() {
        return dataSource;
     }
}
