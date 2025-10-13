public class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    // Constructor mặc định
    public Sach() {}  
    // Constructor có tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }  
    // Getter & Setter (giữ nguyên)
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }
    // ... (các getter/setter khác)
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    @Override
    public String toString() 
    {
        return "Ma sach: " + maSach + "\n" +
               "Tieu de: " + tieuDe + "\n" +
               "Tac gia: " + tacGia + "\n" +
               "Nam xuat ban: " + namXuatBan + "\n" +
               "So luong: " + soLuong + "\n";
    }
}