import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Booking {
  private int noguests;
  private String roomtype;
  private Date bookingdate;
  private Date checkin;
  private Date checkout;

  public Booking( int noguests, String roomtype, Date bookingdate, Date checkin, Date checkout) {
    this.noguests = noguests;
    this.roomtype = roomtype;
    this.bookingdate = bookingdate;
    this.checkin = checkin;
    this.checkout = checkout;
  }
  
  public int getnoguests() {
    return noguests;
  }
  
  public void setnoguest(int noguests) {
    this.noguests = noguests;
  }
  
  public String getroomtype() {
    return roomtype;
  }
  
  public void setroomtype(String roomtype) {
    this.roomtype = roomtype;
  }
  
  public Date getbookingdate() {
    return bookingdate;
  }
  
  public void setbookingdate(Date bookingdate) {
    this.bookingdate = bookingdate;
  }

  public Date getcheckin() {
    return checkin;
  }
  
  public void setcheckin(Date checkin) {
    this.checkin = checkin;
  }
  
  public Date getcheckout() {
    return checkout;
  }
  
  public void setcheckout(Date checkout) {
    this.checkout = checkout;
  }

 
  @Override
  public String toString() {
    return "Booking{" +
        "noguests=" + noguests +
        ", roomtype='" + roomtype + '\'' +
        ", bookingdate=" + bookingdate + '\'' +
        ", checkin='" + checkin + '\'' +
        ", checkout=" + checkout + '\'' +
        '}';
  }



}