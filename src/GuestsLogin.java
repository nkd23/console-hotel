import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner; 
public class GuestsLogin {

    public static void main(String[] args) {
        String username = "user";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String user = sc.next();
        System.out.println("Nhap password: ");
        String password = sc.next();
        Connection d= JDBC.getConnection();
        try{
            Statement st= d.createStatement();
            String sql= "SELECT phone FROM guests WHERE phone ='"+ password+ "'";
            ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    if(user.equals("user") ){
                        System.out.println("Login successful");
                    }
                    else {
                        System.out.println("Login failed");
                    }
                }
            else{ System.out.println("Login failed"); }
                
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    
        }
}