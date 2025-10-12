package BaiTap_Tuan6;

    public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach(10);

        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT01", "Lap trinh C", "Nguyen Van A", 2021, 10, "Tin hoc", "Dai hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2005, 5, "Phieu luu", true);

        ql.themSach(sgk1);
        ql.themSach(stt1);

        System.out.println("=== DANH SACH SACH ===");
        ql.hienThiDanhSach();

        System.out.println("=== TIM KIEM MA TT01 ===");
        ql.timKiemTheoMa("TT01");

        System.out.println("=== XOA MA GT01 ===");
        ql.xoaSach("GT01");

        System.out.println("=== DANH SACH SAU KHI XOA ===");
        ql.hienThiDanhSach();
    }
}

    
}
