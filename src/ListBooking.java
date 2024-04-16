import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ListBooking {
  private ArrayList<Booking> books;
  Scanner sc = new Scanner(System.in);
  public ListBooking() {
    books = new ArrayList<>();
  }

  public void loadBooking() throws SQLException {
 try{
    Connection connection= JDBC.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM bookings");

    while (resultSet.next()) {
      int noguests = resultSet.getInt("no_guests");
      String roomtype = resultSet.getString("room_type");
      Date bookingdate = resultSet.getDate("booking_date");
      Date checkin = resultSet.getDate("check_in");
      Date checkout = resultSet.getDate("check_out");
      Booking book = new Booking(noguests, roomtype, bookingdate, checkin, checkout);
      books.add(book);
    }

    resultSet.close();
    statement.close();
    connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
  }
  }

  public void addbooking(Booking book) throws SQLException {
try{
    String sql = "INSERT INTO bookings (no_guests, room_type, booking_date, check_in, check_out) VALUES ( ?, ?, ?, ?, ?)";
    Connection connection = JDBC.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setInt(1, book.getnoguests());
    statement.setString(2, book.getroomtype());
    statement.setDate(3, book.getbookingdate());
    statement.setDate(4, book.getcheckin());
    statement.setDate(5, book.getcheckout());
    statement.executeUpdate();

   
    System.out.println("ADD new booking successfully");

    statement.close();
    connection.close();
    System.out.print("Press Enter to exit...");
    sc.nextLine();}
    catch (SQLException e) {
      e.printStackTrace();
  }
}
}
  
