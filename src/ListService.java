import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ListService {
  private ArrayList<Service> listService;
  Scanner sc = new Scanner(System.in);
  public ListService() {
    listService = new ArrayList<>();
    try {
        loadServices();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void loadServices() throws SQLException {
    try{
    Connection connection = JDBC.getConnection();
    String sql = "SELECT * FROM service";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    while (resultSet.next()) {
        int sid = resultSet.getInt("sid");
        String tenDichVu = resultSet.getString("ten_dich_vu");
        double giaDichVu = resultSet.getDouble("gia_dich_vu");
        int idTypeRoom = resultSet.getInt("id_type_room");

        Service service = new Service(sid, tenDichVu, giaDichVu, idTypeRoom);
        listService.add(service);
    }

    resultSet.close();
    statement.close();
    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}}
public void displayServices() {
    System.out.println("List of services:");
    for (Service service : listService) {
        System.out.println(service.toString());
    }
}
public void addService() throws SQLException {
    try{
    System.out.print("Enter service ID: ");
    int sid = Integer.parseInt(sc.nextLine());

    System.out.print("Enter service name: ");
    String tenDichVu = sc.nextLine();

    System.out.print("Enter service price: ");
    double giaDichVu = Double.parseDouble(sc.nextLine());

    System.out.print("Enter type room ID: ");
    int idTypeRoom = Integer.parseInt(sc.nextLine());

    Connection connection = JDBC.getConnection();
    String sql = "INSERT INTO service (sid, ten_dich_vu, gia_dich_vu, id_type_room) VALUES (" + sid + ", '" + tenDichVu + "', " + giaDichVu + ", " + idTypeRoom + ")";
    Statement statement = connection.createStatement();
    statement.executeUpdate(sql);

    sql = "SELECT * FROM service WHERE sid=" + sid;
    ResultSet resultSet = statement.executeQuery(sql);
    if (resultSet.next()) {
        Service service = new Service(sid, tenDichVu, giaDichVu, idTypeRoom);
        listService.add(service);
        System.out.println("Service added successfully.");
    }

    resultSet.close();
    statement.close();
    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}}
public void updateService() throws SQLException {
    try{
    System.out.print("Enter service ID to update: ");
    int sid = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter new service name: ");
    String tenDichVu = sc.nextLine();

    System.out.print("Enter new service price: ");
    double giaDichVu = Double.parseDouble(sc.nextLine());

    System.out.print("Enter new type room ID: ");
    int idTypeRoom = Integer.parseInt(sc.nextLine());

    Connection connection = JDBC.getConnection();
    String sql = "UPDATE service SET ten_dich_vu='" + tenDichVu + "', gia_dich_vu=" + giaDichVu + ", id_type_room=" + idTypeRoom + " WHERE sid=" + sid;
    Statement statement = connection.createStatement();
    statement.executeUpdate(sql);
    System.out.println("Update successfully");
    statement.close();
    connection.close();
    System.out.println("Press Enter to exit...");
    sc.nextLine();
} catch (SQLException e) {
    e.printStackTrace(); } 
}
public void deleteService() throws SQLException {
    try{
    System.out.print("Enter the service ID to delete: ");
    int sid = sc.nextInt();
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    String sql = "DELETE FROM service WHERE sid=" + sid;
    statement.executeUpdate(sql);
    System.out.println("Delete successfully");
    statement.close();
    connection.close();
    sc.nextLine();
  } catch (SQLException e) {
    e.printStackTrace();
}
}
}