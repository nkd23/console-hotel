import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AvailableRoom {
    private int hotelId;
    private int roomId;
    private String roomType;

    public AvailableRoom(int hotelId, int roomId, String roomType) {
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.roomType = roomType;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }



    @Override
    public String toString() {
        return "AvailableRoom{" +
                "hotelId=" + hotelId +
                ", roomId=" + roomId +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
