/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import com.mycompany.tester.utils.ConnectionUtil;
import entity.Murid;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author MBagus
 */
public class Repository {
    public List<Murid> findAll(){
        
        try(Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement()){
            String sql = "Select * from Murid";
            try(ResultSet resultSet = statement.executeQuery(sql);){
                List<Murid> muridList=new ArrayList<>();;
                while(resultSet.next()){
                    muridList.add(new Murid(
                            resultSet.getInt("id"), 
                            resultSet.getString("nama"),
                            resultSet.getInt("umur"),
                            resultSet.getString("quirk"),
                            resultSet.getString("gambar")
                        ));
                }
                return muridList;
            }
        }catch(SQLException exception){
            throw new RuntimeException(exception);
        }   
    }
    
    public void insert(Murid murid){
            String sql = "INSERT INTO murid(nama,umur,quirk, gambar) VALUES (?, ?, ?,?)";
            try(Connection connection = ConnectionUtil.getDataSource().getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
                 statement.setString(1, murid.getName());
                 statement.setInt(2, murid.getUmur());
                 statement.setString(3, murid.getQuirk());
                 statement.setString(4, murid.getGambar());
                 statement.executeUpdate();
            }catch(SQLException exception){
            throw new RuntimeException(exception);
        }
    }
        public void delete(int id){
            String sql = "DELETE FROM murid where id = ?";
            try(Connection connection = ConnectionUtil.getDataSource().getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
                 statement.setInt(1, id);
    
                 statement.executeUpdate();
            }catch(SQLException exception){
            throw new RuntimeException(exception);
        }
    }
}
