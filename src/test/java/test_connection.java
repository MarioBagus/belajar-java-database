
import com.mycompany.tester.utils.ConnectionUtil;
import entity.Murid;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MBagus
 */
public class test_connection {
    Repository repoMurid;
    @BeforeEach
    void setup(){
        repoMurid = new Repository();
    }
    
    @Test
    void testUtil() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
  }
    
    @Test
    void testFindAll() {
    List<Murid> muridData = repoMurid.findAll();
    System.out.println(muridData.size());
  }
    @Test
    void insert() {
    Murid murid = new Murid("Bagus",23,"Cogil","bagus.jpg");
    repoMurid.insert(murid);
  }
    @Test
    void deleteTest() {
    repoMurid.delete(35);
  }
}
