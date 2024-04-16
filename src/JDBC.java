import java.sql.*;
public class JDBC {
    public static Connection getConnection(){
        Connection c= null;
 try{DriverManager.registerDriver(new com.mysql.jdbc.Driver() );;//dang ki Mysql Driver voi DriveManager
        String jdbcurl = "jdbc:mysql://localhost:3306/test3";
        String username = "root"; 
        String password = "123456"; 
        c = DriverManager.getConnection(jdbcurl, username, password);
}
  catch (SQLException e){
    e.printStackTrace();
  }
        return c;
    }
public static void closeConnection(Connection c){
try{
    if(c!=null){ c.close();}
}
catch( Exception e){
    e.printStackTrace();
}
}
}