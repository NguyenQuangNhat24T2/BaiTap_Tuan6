public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2020, 5, "CNTT", "Dai hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2005, 10, "Ky ao", true);

        ql.themSach(gt1);
        ql.themSach(tt1);

        System.out.println("=== Danh sach sach ban dau ===");
        ql.hienThiDanhSach();

        ql.capNhatTieuDe("GT01", "Lap trinh Java nang cao");
        System.out.println("\n=== Sau khi cap nhat ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== Tim kiem sach ma TT01 ===");
        System.out.println(ql.timKiem("TT01"));

        ql.xoaSach("GT01");
        System.out.println("\n=== Sau khi xoa GT01 ===");
        ql.hienThiDanhSach();
    }
}
