import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ListAvailableRoom {
  private ArrayList<AvailableRoom> available;
  Scanner sc = new Scanner(System.in);
  public ListAvailableRoom() {
    available = new ArrayList<>();
  }

  public void loadAvailableRoom() throws SQLException {
 try{
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM available_room");

    while (resultSet.next()) {
      int hotelId = resultSet.getInt("hotel_id");
      int roomId = resultSet.getInt("room_id");
      String roomtype = resultSet.getString("room_type");
    }

    resultSet.close();
    statement.close();
    connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
  }
  }


public void displayAvailableRoom() throws SQLException {
    try{
    Connection connection = JDBC.getConnection();
    Statement statement = connection.createStatement();

    String sql = "SELECT * FROM available_room";
    ResultSet resultSet2 = statement.executeQuery(sql);

    while (resultSet2.next()) {
      AvailableRoom available = new AvailableRoom(
        resultSet2.getInt("hotel_id"),
        resultSet2.getInt("room_id"),
        resultSet2.getString("room_type")
    );

    System.out.println(available.toString());
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