package BaiTap_Tuan6;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, String nhaXuatBan, double gia,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, nhaXuatBan, gia);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public String toString() {
        return "Sach giao trinh { " + super.toString()
             + ", Mon hoc: " + monHoc
             + ", Cap do: " + capDo
             + " }";
    }
}
