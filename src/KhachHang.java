import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class KhachHang {
  private int gid;
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private String gender;
  private String countryOfResidence;
  private String address;
  private String city;
  private String stateOrProvince;
  private String postalCode;
  private String phone;
  private String email;
  private String account;
  private String password;
  
  public KhachHang(int gid, String firstName, String lastName, Date dateOfBirth, String gender, String countryOfResidence, String address, String city, String stateOrProvince, String postalCode, String phone, String email) {
    this.gid = gid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.countryOfResidence = countryOfResidence;
    this.address = address;
    this.city = city;
    this.stateOrProvince = stateOrProvince;
    this.postalCode = postalCode;
    this.phone = phone;
    this.email = email;
  }

  public KhachHang(int gid, String firstName, String lastName, Date dateOfBirth, String gender, String countryOfResidence, String address, String city, String stateOrProvince, String postalCode, String phone, String email, String account, String password) {
    this.gid = gid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.countryOfResidence = countryOfResidence;
    this.address = address;
    this.city = city;
    this.stateOrProvince = stateOrProvince;
    this.postalCode = postalCode;
    this.phone = phone;
    this.email = email;
    this.account= account;
    this.password=password;
  }

  public KhachHang(String firstName, String lastName, Date dateOfBirth, String gender, String countryOfResidence,
      String address, String city, String stateOrProvince, String postalCode, String phone, String email,
      String password, String account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.countryOfResidence = countryOfResidence;
        this.address = address;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.account= account;
        this.password=password;
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getCountryOfResidence() {
    return countryOfResidence;
  }

  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStateOrProvince() {
    return stateOrProvince;}

  public void setStateOrProvince() {
    this.stateOrProvince = stateOrProvince;
  }
 
  public String getPostalCode() {
    return postalCode;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public void setPostalCode() {
    this.postalCode = postalCode;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone() {
    this.phone =  phone ;}

  public String getEmail(){
    return email;
  }


  public void setEmail() {
    this.email = email;
  }
  @Override
  public String toString() {
    return "KhachHang{" +
        "gid=" + gid +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        ", gender='" + gender + '\'' +
        ", countryOfResidence='" + countryOfResidence + '\'' +
        ", address='" + address + '\'' +
        ", city='" + city + '\'' +
        ", stateOrProvince='" + stateOrProvince + '\'' +
        ", postalCode='" + postalCode + '\'' +
        ", phone='" + phone + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

}