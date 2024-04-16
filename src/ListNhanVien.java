import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ListNhanVien {
  private ArrayList<NhanVien> listNhanVien;
  Scanner sc = new Scanner(System.in);
  public ListNhanVien() {
    listNhanVien = new ArrayList<>();
  }
  private void loadNhanViens() throws SQLException {
    try{
    Connection connection= JDBC.getConnection();
    String query = "SELECT * FROM nhanvien";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(query);

    while (resultSet.next()) {
        int manv = resultSet.getInt("manv");
        String hoten = resultSet.getString("hoten");
        String gioitinh = resultSet.getString("gioitinh");
        String sdt = resultSet.getString("sdt");
        String quequan = resultSet.getString("quequan");
        Date ngaysinh = resultSet.getDate("ngaysinh");
        String macv = resultSet.getString("macv");
        int password = resultSet.getInt("password");

        NhanVien nhanVien = new NhanVien(manv, hoten, gioitinh, sdt, quequan, ngaysinh, macv, password);
        listNhanVien.add(nhanVien);
    }
    resultSet.close();
    statement.close();
 }catch (SQLException e) {
    e.printStackTrace();}
}
public void changePassword() {
    Connection d = JDBC.getConnection();
    try {
        System.out.println("Enter your MANV: ");
        int manv =sc.nextInt();
        sc.nextLine();
        Statement st = d.createStatement();
        String sql = "SELECT password FROM nhanvien WHERE manv = " + manv;
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            System.out.println("Enter your current password: ");
             String oldPassword = sc.next();
            System.out.println("Enter your new password: ");
            String newPassword = sc.next();
            String currentPassword = rs.getString("password");
            if (oldPassword.equals(currentPassword)) {
                sql = "UPDATE nhanvien SET password = '" + newPassword + "' WHERE manv = " + manv;
                st.executeUpdate(sql);
                System.out.println("Password changed successfully");
            } else {
                System.out.println("Old password is incorrect");
            }
        } else {
            System.out.println("Employee not found");
        }
    st.close();
    d.close();
    System.out.println("Press Enter to exit...");
    sc.nextLine();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    } 
}
public void displayNhanVienInfo(int password) throws SQLException {
    try{
    Connection connection = JDBC.getConnection();
    Statement statement = connection.createStatement();

    String sql = "SELECT * FROM nhanvien WHERE password='"+ password+"'";
    ResultSet rs = statement.executeQuery(sql);
    if (rs.next()) {
        int MANV =rs.getInt("MANV");
        String hoten = rs.getString("hoten");
        String gioitinh = rs.getString("gioitinh");
        String sdt = rs.getString("sdt");
        String quequan = rs.getString("quequan");
        Date ngaysinh = rs.getDate("ngaysinh");
        String macv = rs.getString("macv");
        NhanVien nhanVien = new NhanVien(MANV, hoten, gioitinh, sdt, quequan, ngaysinh, macv);
        System.out.println(nhanVien.toString());
    } 
    rs.close();
    statement.close();
    System.out.print("Press Enter to exit...");
    sc.nextLine();
} catch (SQLException e) {
    e.printStackTrace();
}
}
}




