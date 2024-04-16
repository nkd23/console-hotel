
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomType {
  private int typeId;
  private String roomType;
  private int noBeds;
  private String bedTypes;
  private int maxCapacity;
  private String description;
  private double pricePerNight;

  public RoomType( int typeId, String roomType, int noBeds, String bedTypes, int maxCapacity, String description, double pricePerNight) {
    this.typeId = typeId;
    this.roomType = roomType;
    this.noBeds = noBeds;
    this.bedTypes = bedTypes;
    this.maxCapacity = maxCapacity;
    this.description = description;
    this.pricePerNight = pricePerNight;
  }
  
  public int getTypeId() {
    return typeId;
  }
  
  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }
  
  public String getRoomType() {
    return roomType;
  }
  
  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }
  
  public int getNoBeds() {
    return noBeds;
  }
  
  public void setNoBeds(int noBeds) {
    this.noBeds = noBeds;
  }
  
  public String getBedTypes() {
    return bedTypes;
  }
  
  public void setBedTypes(String bedTypes) {
    this.bedTypes = bedTypes;
  }
  
  public int getMaxCapacity() {
    return maxCapacity;
  }
  
  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public double getPricePerNight() {
    return pricePerNight;
  }
  
  public void setPricePerNight(double pricePerNight) {
    this.pricePerNight = pricePerNight;
  }


  @Override
  public String toString() {
    return "Room{" +
        "typeId=" + typeId +
        ", roomType='" + roomType + '\'' +
        ", noBeds=" + noBeds +
        ", bedTypes='" + bedTypes + '\'' +
        ", maxCapacity=" + maxCapacity +
        ", description='" + description + '\'' +
        ", pricePerNight=" + pricePerNight +
        '}';
  }



}
