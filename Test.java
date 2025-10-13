package BaiTap_Tuan5;

public class Test 
{
    public static void main(String[] args) 
    {
        // Khởi tạo đối tượng quản lý sách
        QuanLySach qlSach = new QuanLySach();

        // 1. Thêm mới các loại sách (Sach, SachGiaoTrinh, SachTieuThuyet)
        System.out.println("--- THEM MOI SACH ---");
        
        // Sách thường
        Sach sachCoBan = new Sach("B001", "Java Co ban", "Nguyen Van A", 2022, 10);
        qlSach.themMoi(sachCoBan);
        
        // Sách giáo trình
        SachGiaoTrinh sGiaoTrinh = new SachGiaoTrinh("GT01", "Cau truc du lieu", "Tran Thi B", 2023, 50, 
                                                     "Khoa hoc may tinh", "Dai hoc");
        qlSach.themMoi(sGiaoTrinh);
        
        // Sách tiểu thuyết
        SachTieuThuyet sTieuThuyet = new SachTieuThuyet("TT01", "Nha gia kim", "Paulo Coelho", 1988, 100, 
                                                        "Huyen ao", false);
        qlSach.themMoi(sTieuThuyet);
        
        SachTieuThuyet sTieuThuyetSeries = new SachTieuThuyet("TT02", "Harry Potter: Hon da phu thuy", "J. K. Rowling", 1997, 75, 
                                                              "Huyen ao", true);
        qlSach.themMoi(sTieuThuyetSeries);

        // Thử thêm sách trùng mã
        Sach sachTrung = new Sach("B001", "Sach bi trung", "Tester", 2024, 1);
        qlSach.themMoi(sachTrung); 

        // 2. Hiển thị danh sách sách (sử dụng toString() đa hình)
        qlSach.hienThiDanhSach();

        // 3. Tìm kiếm theo mã sách
        System.out.println("--- TIM KIEM SACH ---");
        String maTim = "TT01";
        qlSach.hienThiThongTinSach(maTim); // Tìm thấy

        String maKhongTonTai = "X999";
        qlSach.hienThiThongTinSach(maKhongTonTai); // Không tìm thấy

        // 4. Cập nhật thông tin sách
        System.out.println("--- CAP NHAT SACH ---");
        qlSach.capNhatTheoMa("B001", "Java Nang Cao", "Nguyen Van A", 2023, 15);
        qlSach.hienThiThongTinSach("B001");

        // 5. Xóa sách
        System.out.println("--- XOA SACH ---");
        qlSach.xoaTheoMa("GT01");
        
        // 6. Hiển thị lại danh sách sau khi xóa
        qlSach.hienThiDanhSach();
    }
}