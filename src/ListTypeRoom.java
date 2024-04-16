import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTypeRoom {
  private ArrayList<RoomType> rooms;
  Scanner sc = new Scanner(System.in);
  public ListTypeRoom() {
    rooms = new ArrayList<>();
  }

  public void loadRooms() throws SQLException {
 try{
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM room_types");

    while (resultSet.next()) {
      int typeId = resultSet.getInt("type_id");
      String roomType = resultSet.getString("room_type");
      int noBeds = resultSet.getInt("no_beds");
      String bedTypes = resultSet.getString("bed_types");
      int maxCapacity = resultSet.getInt("max_capacity");
      String description = resultSet.getString("description");
      double pricePerNight = resultSet.getDouble("price_per_night");
      RoomType room = new RoomType( typeId, roomType, noBeds, bedTypes, maxCapacity, description, pricePerNight);
      rooms.add(room);
    }

    resultSet.close();
    statement.close();
    connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
  }
  }

  public void addRoomType(RoomType room) throws SQLException {
try{
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    String sql = "INSERT INTO room_types (type_id, room_type, no_beds, bed_types, max_capacity, description, price_per_night) VALUES (" + room.getTypeId() + ", '" + room.getRoomType() + "', " + room.getNoBeds() + ", '" + room.getBedTypes() + "', " + room.getMaxCapacity() + ", '" + room.getDescription() + "', " + room.getPricePerNight() + ")";
    statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

    ResultSet generatedKeys = statement.getGeneratedKeys();
    if (generatedKeys.next()) {
      int id = generatedKeys.getInt(1);
      room.setTypeId(id);
      rooms.add(room);
    }
    System.out.println("ADD new room type successfully");

    generatedKeys.close();
    statement.close();
    connection.close();
    System.out.print("Press Enter to exit...");
    sc.nextLine();}
    catch (SQLException e) {
      e.printStackTrace();
  }
  }

  public void updateRoomType() throws SQLException {
    try{
    System.out.print("Nhập type_id phòng cần sửa: ");
    int ID = sc.nextInt();
    sc.nextLine();
    System.out.print("Nhập room_type mới: ");
    String roomType = sc.nextLine();

    System.out.print("Nhập no_beds mới: ");
    int noBeds = sc.nextInt();
    sc.nextLine();

    System.out.print("Nhập bed_types mới: ");
    String bedTypes = sc.nextLine();

    System.out.print("Nhập max_capacity mới: ");
    int maxCapacity = sc.nextInt();
    sc.nextLine();

    System.out.print("Nhập description mới: ");
    String description = sc.nextLine();

    System.out.print("Nhập price_per_night mới: ");
    double pricePerNight = sc.nextDouble();
    sc.nextLine();

    Connection connection = JDBC.getConnection();
    Statement statement = connection.createStatement();

    String sql = "UPDATE room_types SET room_type='" + roomType + "', no_beds=" + noBeds + ", bed_types='" + bedTypes + "', max_capacity=" + maxCapacity + ", description='" + description + "', price_per_night=" + pricePerNight +  " WHERE type_id='"+ID+"'";
    statement.executeUpdate(sql);
    System.out.println("Update successfully");
    statement.close();
    connection.close();
    System.out.println("Press Enter to exit...");
    sc.nextLine();}
    catch (SQLException e) {
      e.printStackTrace();
  }
  }

  public void deleteRoomType() throws SQLException {
    try{
    System.out.print("Nhập ID phòng cần xóa: ");
    int type_id = sc.nextInt();
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    String sql1 = "DELETE FROM service WHERE id_type_room=" + type_id;
    statement.executeUpdate(sql1);
    String sql = "DELETE FROM room_types WHERE type_id=" + type_id;
    statement.executeUpdate(sql);
    System.out.println("Delete successfully");
    statement.close();
    connection.close();
    sc.nextLine();
  } catch (SQLException e) {
    e.printStackTrace();
}
  }
  public void displayRoomTypes() throws SQLException {
    try{
    Connection connection = JDBC.getConnection();
    Statement statement = connection.createStatement();

    String sql = "SELECT * FROM room_types";
    ResultSet resultSet2 = statement.executeQuery(sql);

    while (resultSet2.next()) {
      RoomType roomType = new RoomType(
          resultSet2.getInt("type_id"),
          resultSet2.getString("room_type"),
          resultSet2.getInt("no_beds"),
          resultSet2.getString("bed_types"),
          resultSet2.getInt("max_capacity"),
          resultSet2.getString("description"),
          resultSet2.getDouble("price_per_night")
      );

      System.out.println(roomType.toString());
      System.out.println("------------------------");
    }
    resultSet2.close();
    statement.close();
    connection.close();
    System.out.print("Press Enter to exit...");
    sc.nextLine();
}catch (SQLException e) {
  e.printStackTrace();
}
}
}