import java.util.Date;

public class NhanVien {
    private int manv;
    private String hoten;
    private String gioitinh;
    private String sdt;
    private String quequan;
    private Date ngaysinh;
    private String macv;
    private int password;

    public NhanVien(int manv, String hoten, String gioitinh, String sdt, String quequan, Date ngaysinh, String macv) {
      this.manv = manv;
      this.hoten = hoten;
      this.gioitinh = gioitinh;
      this.sdt = sdt;
      this.quequan = quequan;
      this.ngaysinh = ngaysinh;
      this.macv = macv;
    }
  
public NhanVien(int manv, String hoten, String gioitinh, String sdt, String quequan, Date ngaysinh, String macv,int password) {
    this.manv = manv;
    this.hoten = hoten;
    this.gioitinh = gioitinh;
    this.sdt = sdt;
    this.quequan = quequan;
    this.ngaysinh = ngaysinh;
    this.macv = macv;
  }

  public int getManv() {
    return manv;
  }

  public void setManv(int manv) {
    this.manv = manv;
  }

  public String getHoten() {
    return hoten;
  }

  public void setHoten(String hoten) {
    this.hoten = hoten;
  }

  public String getGioitinh() {
    return gioitinh;
  }

  public void setGioitinh(String gioitinh) {
    this.gioitinh = gioitinh;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getQuequan() {
    return quequan;
  }

  public void setQuequan(String quequan) {
    this.quequan = quequan;
  }

  public Date getNgaysinh() {
    return ngaysinh;
  }

  public void setNgaysinh(Date ngaysinh) {
    this.ngaysinh = ngaysinh;
  }

  public String getMacv() {
    return macv;
  }

  public void setMacv(String macv) {
    this.macv = macv;
  }
  public int getPassword() {
    return password;
  }

  public void setPassword(int password) {
    this.password = password;
  }
  @Override
public String toString() {
  return "NhanVien{" +
      "manv=" + manv +
      ", hoten='" + hoten + '\'' +
      ", gioitinh='" + gioitinh + '\'' +
      ", sdt='" + sdt + '\'' +
      ", quequan='" + quequan + '\'' +
      ", ngaysinh=" + ngaysinh +
      ", macv='" + macv + '\'' +
      '}';
}

}