package BaiTap_Tuan6;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia, String nhaXuatBan, double gia,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tenSach, tacGia, nhaXuatBan, gia);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public String toString() {
        return "Sach tieu thuyet { " + super.toString()
             + ", The loai: " + theLoai
             + ", La series: " + laSachSeries
             + " }";
    }
}
   

