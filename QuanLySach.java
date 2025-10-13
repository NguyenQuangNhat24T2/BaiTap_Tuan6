package BaiTap_Tuan6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<Sach> danhSachSach; // Quản lý danh sách các loại sách 

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }
    
    // --- Các chức năng quản lý sách  ---

    // 1. Thêm mới sách
    public void themMoi(Sach sach) {
        // Kiểm tra trùng mã trước khi thêm
        if (timKiemTheoMa(sach.getMaSach()) != null) {
            System.out.println("(!) Loi: Ma sach '" + sach.getMaSach() + "' da ton tai.");
            return;
        }
        danhSachSach.add(sach);
        System.out.println("(+) Da them sach thanh cong.");
    }
    
    // 2. Xóa sách theo mã
    public boolean xoaTheoMa(String maSach) {
        Sach sachCanXoa = timKiemTheoMa(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("(-) Da xoa sach ma '" + maSach + "' thanh cong.");
            return true;
        }
        System.out.println("(!) Loi: Khong tim thay sach voi ma '" + maSach + "' de xoa.");
        return false;
    }
    
    // 3. Cập nhật sách theo mã (chỉ cập nhật thông tin chung, không cập nhật loại)
    public boolean capNhatTheoMa(String maSach, String tieuDeMoi, String tacGiaMoi, int namXuatBanMoi, int soLuongMoi) {
        Sach sachCanCapNhat = timKiemTheoMa(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setTieuDe(tieuDeMoi);
            sachCanCapNhat.setTacGia(tacGiaMoi);
            sachCanCapNhat.setNamXuatBan(namXuatBanMoi);
            sachCanCapNhat.setSoLuong(soLuongMoi);
            System.out.println("(~) Da cap nhat sach ma '" + maSach + "' thanh cong.");
            return true;
        }
        System.out.println("(!) Loi: Khong tim thay sach voi ma '" + maSach + "' de cap nhat.");
        return false;
    }

    // 4. Tìm kiếm sách theo mã sách
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null; // Không tìm thấy
    }

    // 5. Hiển thị danh sách sách
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach hien dang trong.");
            return;
        }
        System.out.println("\n===== DANH SACH SACH =====");
        for (Sach sach : danhSachSach) {
            // Sử dụng toString() (đa hình) để in ra thông tin chi tiết của từng loại sách
            System.out.println(sach.toString()); 
        }
        System.out.println("==========================\n");
    }
    
    // Phương thức hiển thị chi tiết 1 sách tìm được
    public void hienThiThongTinSach(String maSach) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach != null) {
            System.out.println("\n===== THONG TIN SACH TIM DUOC =====");
            System.out.println(sach.toString()); // Sử dụng đa hình qua toString()
            System.out.println("===================================\n");
        } else {
            System.out.println("(!) Khong tim thay sach voi ma: " + maSach);
        }
    }
}