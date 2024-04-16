
public class Service {
    private int sid;
    private String tenDichVu;
    private double giaDichVu;
    private int idTypeRoom;

    public Service(int sid, String tenDichVu, double giaDichVu, int idTypeRoom) {
        this.sid = sid;
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
        this.idTypeRoom = idTypeRoom;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(double giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    public int getIdTypeRoom() {
        return idTypeRoom;
    }

    public void setIdTypeRoom(int typeId) {
        this.idTypeRoom = idTypeRoom;
    }

    @Override
    public String toString() {
        return "Service{" +
                "sid=" + sid +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", giaDichVu=" + giaDichVu +
                ", typeId=" + idTypeRoom+
                '}';
    }

}