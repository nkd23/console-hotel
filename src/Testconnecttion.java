import java.sql.*;

import com.mysql.cj.jdbc.ConnectionGroup;
public class Testconnecttion {
    public static void main(String[] args){
        Connection d= JDBC.getConnection();
        try{
            Statement st= d.createStatement();
            String sql= "SELECT MANV FROM nhanvien";
            ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    int manv= rs.getInt("MANV");
                    System.out.println(manv);
                }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    
        };
    }

