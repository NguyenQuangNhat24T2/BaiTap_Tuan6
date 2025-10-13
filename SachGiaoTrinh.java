package BaiTap_Tuan6;

public class SachGiaoTrinh extends Sach {
    private String monHoc; // Môn học 
    private String capDo;  // Cấp độ (VD: Đại học, Phổ thông) 
    // Constructor đầy đủ tham số
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong); // Gọi constructor lớp cha 
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // Getter & Setter
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    // Ghi đè phương thức toString() 
    @Override
    public String toString() {
        return super.toString() + // Sử dụng super.toString() để lấy thông tin lớp cha 
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo +
               "\n----------------------";
    }
    // Giữ lại phương thức hienThiThongTin() của lớp cha (hoặc ghi đè nếu cần, nhưng yêu cầu chỉ ghi đè toString())
}