package BaiTap_Tuan6;

public class SachTieuThuyet extends Sach {
    private String theLoai;      // Thể loại (VD: Lãng mạn, Khoa học viễn tưởng)
    private boolean laSachSeries; // Sách có thuộc loại series hay không 

    // Constructor đầy đủ tham số 
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    // Getter & Setter
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    // Ghi đè phương thức toString() 
    @Override
    public String toString() {
        String isSeries = laSachSeries ? "Co" : "Khong";
        return super.toString() +
               "\nThe loai: " + theLoai +
               "\nLa sach series: " + isSeries +
               "\n----------------------";
    }
}