import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner; 
public class EmployeeLogin {
    public void changePassword(int MANV, String oldPassword, String newPassword) {
        Connection d = JDBC.getConnection();
        try {
            Statement st = d.createStatement();
            String sql = "SELECT password FROM nhanvien WHERE manv = " + MANV;
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String currentPassword = rs.getString("password");
                if (oldPassword.equals(currentPassword)) {
                    sql = "UPDATE nhanvien SET password = '" + newPassword + "' WHERE manv = " + MANV;
                    st.executeUpdate(sql);
                    System.out.println("Password changed successfully");
                } else {
                    System.out.println("Old password is incorrect");
                }
            } else {
                System.out.println("Employee not found");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        String username = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String user = sc.next();
        System.out.println("Nhap password: ");
        String password = sc.next();
        Connection d= JDBC.getConnection();
        try{
            Statement st= d.createStatement();
            String sql= "SELECT MANV FROM nhanvien WHERE password ='"+ password+ "'";
            ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    if(user.equals("admin") ){
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
    