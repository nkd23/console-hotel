import java.util.Scanner;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;



public class Main {
    public static void createAccount() throws SQLException{
         ListKhachHang lkh1 = new ListKhachHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter information :");

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter date of birth (yyyy-mm-dd): ");
        String dobString = sc.nextLine();
        Date dateOfBirth = Date.valueOf(dobString);
        
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter country of residence: ");
        String countryOfResidence = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter state or province: ");
        String stateOrProvince = sc.nextLine();

        System.out.print("Enter postal code: ");
        String postalCode = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter user name: ");
        String account = sc.nextLine();

        System.out.print("Enter password: ");
        String password1 = sc.nextLine();
        KhachHang khachHang = new KhachHang(firstName, lastName, dateOfBirth, gender, countryOfResidence, address, city, stateOrProvince, postalCode, phone, email, password1, account);
        lkh1.addGuest(khachHang);
    }
    public static void EmployeLogin(){
        String username = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String user = sc.next();
        System.out.println("Nhap password: ");
        int password = sc.nextInt();
        Connection d= JDBC.getConnection();
    try{
            Statement st= d.createStatement();
            String sql= "SELECT MANV FROM nhanvien WHERE password ='"+ password+ "'";
            ResultSet rs = st.executeQuery(sql);
                if(rs.next())
                {
                    if(user.equals("admin") )
        {
                System.out.println("Login successful");
                ListTypeRoom lr= new ListTypeRoom();
                ListNhanVien lnv = new ListNhanVien();
                ListKhachHang lkh = new ListKhachHang();
                ListService ls= new ListService();
                 int choice;
        do {
            System.out.println("----- Welcome to hotel management page -----");
            System.out.println("1. Add/Edit/Delete/Display Room Type");
            System.out.println("2. Add/Edit/Delete/Display Service");
            System.out.println("3. Account Management");
            System.out.println("0. Log Out");
            System.out.print("Select a function: ");
            choice = sc.nextInt();

            // Xử lý lựa chọn của người dùng
            switch (choice)
                {
                case 1: // Thêm/Sửa/Xóa loại phòng
                // TODO: Xử lý chức năng Thêm/Sửa/Xóa loại phòng
                int choice1;
                do{
                    System.out.println("1. Add room type ");
                    System.out.println("2. Edit Room type ");
                    System.out.println("3. Delete Room type");
                    System.out.println("4. Displays a list of rooms type");
                    System.out.println("0. Exit");
                    System.out.print(" Select a function: ");
                    choice1 =sc.nextInt();
                switch (choice1) 
                    {
                    case 1://Thêm loại phòng
                    System.out.println("Enter information for the new room type :");// nhập thông tin phòng
                    System.out.println("ID: ");
                    int rID= sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Room type: ");
                    String rT = sc.nextLine();
                
                    System.out.print("Number of beds: ");
                    int noBeds = sc.nextInt();
                    sc.nextLine(); 
                
                    System.out.print("Bed types: ");
                    String bedTypes = sc.nextLine();
                
                    System.out.print("Maximum capacity: ");
                    int maxCapacity = sc.nextInt();
                    sc.nextLine();
                
                    System.out.print("Description: ");
                    String description = sc.nextLine();
                
                    System.out.print("Price per night: ");
                    double pricePerNight = sc.nextDouble();
                
                    RoomType room = new RoomType( rID, rT,noBeds, bedTypes, maxCapacity, description, pricePerNight);
                    lr.addRoomType(room); // thêm loại phòng vừa nhập
                    break;
                    case 2: // sửa thông tin loại phòng
                    lr.updateRoomType();
                    break;
                    case 3: // xóa loại phòng
                    lr.deleteRoomType();
                    break;
                    case 4://hiển thị thông tin danh sách loại phòng 
                    lr.displayRoomTypes();
                    break;
                    default:
                    if (choice1 != 0) {
                        System.out.println("Chon sai chuc nang !!!");
                                     }
                     else {
                        System.out.println("Ket thuc phien lam viec !!!");
                          }
                    break;
                    }} while(choice1!=0);    
                 break;
            
                case 2:
                    // Thêm/Sửa/Xóa dịch vụ
                    // TODO: Xử lý chức năng Thêm/Sửa/Xóa dịch vụ
                    int choice2;
                do{
                    System.out.println("1. Add service ");
                    System.out.println("2. Edit service ");
                    System.out.println("3. Delete service");
                    System.out.println("4. Displays a list service");
                    System.out.println("0. Exit");
                    System.out.print(" Select a function: ");
                    choice2 =sc.nextInt();
                switch (choice2) {
                    case 1: //thêm dịch vụ
                    ls.addService();
                    break;
                    case 2:// sửa dịch vụ
                    ls.updateService();
                    break;
                    case 3: // xóa dịch vụ
                    ls.deleteService();
                    break;
                    case 4: // hiển thị danh sách dịch vụ
                    ls.displayServices();
                    break;
                    default:
                    if (choice2 != 0) {
                        System.out.println("Chon sai chuc nang !!!");
                                     }
                     else {
                        System.out.println("Ket thuc phien lam viec !!!");
                          }
                    break;
                    }} while(choice2!=0);    
                 break;
            
                case 3:  // Quản lý tài khoản
                // TODO: Xử lý chức năng Quản lý tài khoản
                int choice10;
                do{
                    System.out.println("1. change Password ");
                    System.out.println("2. account information ");
                    System.out.println("3. update account guests information ");
                    System.out.println("0. Exit");
                    System.out.print(" Select a function: ");
                    choice10 =sc.nextInt();
                switch (choice10) 
                {
                    case 1:// đổi mật khẩu
                    lnv.changePassword();
                    break;
                    case 2: // hiển thị thông tin tài khoản
                    lnv.displayNhanVienInfo(password);
                    break;
                    case 3:// sửa thông tin 
                    int choice102;
                do{
                    System.out.println("1. display list guests ");
                    System.out.println("2. Delete guest ");
                    System.out.println("3. Add guest ");
                    System.out.println("0. Exit");
                    System.out.print(" Select a function: ");
                    choice102 =sc.nextInt();
                switch (choice102) 
                {
                    case 1:// hiển thị thông tin khách hàng
                    lkh.displayGuests();
                    break;
                    case 2://xóa khách hàng
                    lkh.deleteGuest();
                    break;
                    case 3:// thêm khách hàng
                    System.out.println("Enter information for the new guest :");
                    sc.nextLine(); // consume newline character
            
                    System.out.print("Enter first name: ");
                    String firstName = sc.nextLine();
            
                    System.out.print("Enter last name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Enter date of birth (yyyy-mm-dd): ");
                    String dobString = sc.nextLine();
                    Date dateOfBirth = Date.valueOf(dobString);
                    
                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();
            
                    System.out.print("Enter country of residence: ");
                    String countryOfResidence = sc.nextLine();
            
                    System.out.print("Enter address: ");
                    String address = sc.nextLine();
            
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();
            
                    System.out.print("Enter state or province: ");
                    String stateOrProvince = sc.nextLine();
            
                    System.out.print("Enter postal code: ");
                    String postalCode = sc.nextLine();
            
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
            
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter user name: ");
                    String username1 = sc.nextLine();
            
                    System.out.print("Enter password: ");
                    String password1 = sc.nextLine();
                    KhachHang khachHang = new KhachHang( firstName, lastName, dateOfBirth, gender, countryOfResidence, address, city, stateOrProvince, postalCode, phone, email, password1, username1);
                    lkh.addGuest(khachHang);
                    break;

                }
                }while(choice102!=0);

                break;
                 }} while(choice10!=0); 
                    break;
                    default:
                    if (choice != 0) {
                        System.out.println("Chon sai chuc nang !!!");
                    } else  {
                        System.out.println("Ket thuc phien lam viec !!!");
                    }
                    break;
                }
            } while (choice != 0);
        }
                    else
                        {
                        System.out.println("Login failed");
                        }
                }
            else   { System.out.println("Login failed"); }
}
        catch (Exception e)
         {
            System.out.println("Error: " + e.getMessage());
         }
}    
 /**
 * 
 */
public static void GuestsLogin() {
    try{    Connection d= JDBC.getConnection();
            Statement st= d.createStatement();
            System.out.println("Nhap username: ");
            Scanner sc = new Scanner(System.in);
            String user1 = sc.next();
            System.out.println("Nhap password: ");
             String password1 = sc.next();
             String sql = "SELECT * FROM khachhang WHERE password = '" + password1 + "' AND account = '" + user1 + "'";
             ResultSet rs = st.executeQuery(sql);
             ListKhachHang lkh =new ListKhachHang();
                        if(rs.next())
                        {
                                System.out.println("Login successful");
                                ListBooking lb= new ListBooking();
                                ListAvailableRoom lar = new ListAvailableRoom();
                                int choice;

                                do {
                                    System.out.println("\n-----Welcome to hotel management page -----");
                                    System.out.println("1. Check room availability");
                                    System.out.println("2. Book a room");
                                    System.out.println("3. Manage account");
                                    System.out.println("0. Log out");
                                    System.out.print("Choose a function: ");
                                    choice = sc.nextInt();
                        
                                    // Xử lý lựa chọn của người dùng
                                    switch (choice) {
                                        case 1:
                                            // Kiểm tra phòng trống
                                            lar.displayAvailableRoom();
                                            break;
                                        case 2:
                                            // Đặt phòng
                                            System.out.println("Enter information for ur booking :");
                                            System.out.println("So luong khach dat phong: ");
                                            int noguests = sc.nextInt();
                                            sc.nextLine(); 
                                            System.out.print("Room type: ");
                                            String roomtype = sc.nextLine();

                                            System.out.print("Booking Day: ");
                                            String bookingdateString = sc.nextLine();
                                            Date bookingdate = Date.valueOf(bookingdateString); 

                                            System.out.print("Check in Day: ");
                                            String checkinString = sc.nextLine();
                                            Date checkin = Date.valueOf(checkinString);

                                            System.out.print("Check out Day: ");
                                           String checkoutString = sc.nextLine();
                                           Date checkout = Date.valueOf(checkoutString);
                
                                            Booking book = new Booking(noguests, roomtype, bookingdate, checkin, checkout);
                                            lb.addbooking(book); 
                                            break;
                                        case 3:
                                        int choice10;
                                        do{
                                            System.out.println("1. change Password ");
                                            System.out.println("2. account information ");
                                            System.out.println("0. Exit");
                                            System.out.print(" Select a function: ");
                                            choice10 =sc.nextInt();
                                        switch (choice10) 
                                        {
                                            case 1:// đổi mật khẩu
                                            lkh.changePasswordKh();
                                            break;
                                            case 2: // hiển thị thông tin tài khoản
                                            System.out.println("Vui long nhap mat khau: ");
                                            String password= sc.next();
                                           lkh.displayKhachHangInfo(password);
                                            break;
                                          
                                         }} while(choice10!=0); 
                                            break;
                                            default:
                                            if (choice != 0) {
                                                System.out.println("Chon sai chuc nang !!!");
                                            } else {
                                                System.out.println("Ket thuc phien lam viec !!!");
                                            }
                                            break;
                                    }
                                } while(choice!=0);
                            }
                            else {
                                System.out.println("Login failed");
                            }
                        }
                catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                                   }
      }  
                
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("|----------|VUI LONG DANG NHAP|---------|");
            System.out.println("|---------1->Employee Login.------------|");
            System.out.println("|---------2->Customer Login.------------|");
            System.out.println("|---------3->create an account.---------|");
            System.out.println("|---------0->Thoat.---------------------|");
            System.out.println("|---------------------------------------|");
            System.out.println("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                EmployeLogin();
                    break;
                case 2:
                GuestsLogin();
                    break;
                case 3:
                createAccount();
                break;
                default:
                    if (chon != 0) {
                        System.out.println("Chon sai chuc nang !!!");
                    } else {
                        System.out.println("Ket thuc phien lam viec !!!");
                    }
                    break;
            }
        } while (chon != 0);
    }

}
