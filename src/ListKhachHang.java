
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
public class ListKhachHang {
  private ArrayList<KhachHang> listKhachHang;
  Scanner sc = new Scanner(System.in);
  public ListKhachHang() {
    listKhachHang = new ArrayList<>();
  }
  private void loadKhachHang() throws SQLException {
    try{
    Connection connection= JDBC.getConnection();
    String sql = "SELECT * FROM khachhang";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
    while (resultSet.next()) {
        int gid = resultSet.getInt("gid");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        Date dateOfBirth = resultSet.getDate("date_of_birth");
        String gender = resultSet.getString("gender");
        String countryOfResidence = resultSet.getString("country_of_residence");
        String address = resultSet.getString("address");
        String city = resultSet.getString("city");
        String stateOrProvince = resultSet.getString("state_or_province");
        String postalCode = resultSet.getString("postal_code");
        String phone = resultSet.getString("phone");
        String email = resultSet.getString("email");
        String password = resultSet.getString("password");
        String account = resultSet.getString("account");

        KhachHang khachHang = new KhachHang(gid, firstName, lastName, dateOfBirth, gender, countryOfResidence, address, city, stateOrProvince, postalCode, phone, email, password, account);
        listKhachHang.add(khachHang);
    }

    resultSet.close();
    statement.close();
}catch (SQLException e) {
  e.printStackTrace();
}} 
public void displayGuests() throws SQLException {
  try{
    Connection connection = JDBC.getConnection();
    Statement statement = connection.createStatement();

    String sql = "SELECT * FROM khachhang";
    ResultSet resultSet2 = statement.executeQuery(sql);

    while (resultSet2.next()) {
        KhachHang khachHang = new KhachHang(
           resultSet2.getInt("gid"),
           resultSet2.getString("first_name"),
           resultSet2.getString("last_name"),
           resultSet2.getDate("date_of_birth"),
           resultSet2.getString("gender"),
           resultSet2.getString("country_of_residence"),
           resultSet2.getString("address"),
           resultSet2.getString("city"),
           resultSet2.getString("state_or_province"),
           resultSet2.getString("postal_code"),
           resultSet2.getString("phone"),
           resultSet2.getString("email"),
           resultSet2.getString("account"),
           resultSet2.getString("password")
      );
      System.out.println(khachHang.toString());
      System.out.println("------------------------");
    }
    resultSet2.close();
    statement.close();
    connection.close();
    System.out.print("Press Enter to exit...");
    sc.nextLine();
  } 
    catch (SQLException e) {
      e.printStackTrace();
  }

}
public void deleteGuest() throws SQLException {
  try{
    System.out.print("Nhập ID khách cần xóa: ");
    int gid = sc.nextInt();
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    String sql = "DELETE FROM khachhang WHERE gid=" + gid;
    statement.executeUpdate(sql);
    System.out.println("Delete successfully");
    statement.close();
    connection.close();
    sc.nextLine();}
     catch (SQLException e) {
      e.printStackTrace();
  }
  }
  public void addGuest(KhachHang khachHang) throws SQLException {
    String selectSql = "SELECT MAX(gid) FROM khachhang";
    String insertSql = "INSERT INTO khachhang (gid, first_name, last_name, date_of_birth, gender, country_of_residence, address, city, state_or_province, postal_code, phone, email, password, account) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try (Connection connection = JDBC.getConnection();
         Statement selectStatement = connection.createStatement();
         PreparedStatement insertStatement = connection.prepareStatement(insertSql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        
        ResultSet maxIdResultSet = selectStatement.executeQuery(selectSql);
        if (maxIdResultSet.next()) {
            int maxId = maxIdResultSet.getInt(1);
            int nextId = maxId + 1;
            khachHang.setGid(nextId);
        }
        
        insertStatement.setInt(1, khachHang.getGid());
        insertStatement.setString(2, khachHang.getFirstName());
        insertStatement.setString(3, khachHang.getLastName());
        insertStatement.setDate(4, khachHang.getDateOfBirth());
        insertStatement.setString(5, khachHang.getGender());
        insertStatement.setString(6, khachHang.getCountryOfResidence());
        insertStatement.setString(7, khachHang.getAddress());
        insertStatement.setString(8, khachHang.getCity());
        insertStatement.setString(9, khachHang.getStateOrProvince());
        insertStatement.setString(10, khachHang.getPostalCode());
        insertStatement.setString(11, khachHang.getPhone());
        insertStatement.setString(12, khachHang.getEmail());
        insertStatement.setString(13, khachHang.getPassword());
        insertStatement.setString(14, khachHang.getAccount());
        insertStatement.executeUpdate();
        
        ResultSet generatedKeys = insertStatement.getGeneratedKeys();
        if (generatedKeys.next()) {
            int generatedId = generatedKeys.getInt(1);
            khachHang.setGid(generatedId);
        }
        
        System.out.println("ADD new guest successfully");
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
public void changePasswordKh() {
  Connection d = JDBC.getConnection();
  try {
      System.out.println("Enter your phone: ");
    String ph =sc.nextLine();
      Statement st = d.createStatement();
      String sql = "SELECT password FROM khachhang WHERE phone = " + ph;
      ResultSet rs = st.executeQuery(sql);
      if (rs.next()) {
          System.out.println("Enter your current password: ");
           String oldPassword = sc.next();
          System.out.println("Enter your new password: ");
          String newPassword = sc.next();
          String currentPassword = rs.getString("password");
          if (oldPassword.equals(currentPassword)) {
              sql = "UPDATE khachhang SET password = '" + newPassword + "' WHERE phone = " + ph;
              st.executeUpdate(sql);
              System.out.println("Password changed successfully");
          } else {
              System.out.println("Old password is incorrect");
          }
      } else {
          System.out.println("Guest not found");
      }
  st.close();
  d.close();
  System.out.println("Press Enter to exit...");
  sc.nextLine();
  } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
  } 
}
public void displayKhachHangInfo(String password) throws SQLException {
  try{
  Connection connection = JDBC.getConnection();
  Statement statement = connection.createStatement();

  String sql = "SELECT * FROM khachhang WHERE password='"+ password+"'";
  ResultSet rs = statement.executeQuery(sql);
  if (rs.next()) {
    int gid= rs.getInt("gid");
      String firstName =  rs.getString("first_name");
      String lastName = rs.getString("last_name");
      Date dobString = rs.getDate("date_of_birth");
      String gender =  rs.getString("gender");
      String countryOfResidence =  rs.getString("country_of_residence");
      String address = rs.getString("address");
      String city =rs.getString("city");
      String stateOrProvince = rs.getString("state_or_province");
      String postalCode = rs.getString("postal_code");
      String phone1 = rs.getString("phone");
      String email = rs.getString("email");
      String username1 = rs.getString("account");;
      String password1 = rs.getString("password");
      KhachHang khachHang = new KhachHang( gid, firstName, lastName, dobString, gender, countryOfResidence, address, city, stateOrProvince, postalCode, phone1, email, password1, username1);
      System.out.println(khachHang.toString());
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