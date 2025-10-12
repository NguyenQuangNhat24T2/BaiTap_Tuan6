package BaiTap_Tuan6;

public class Test {
    // Test.java

    public static void main(String[] args) {
        System.out.println("=== Test Quan Ly Sach ===");

        QuanLySach qls = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT001", "Lap trinh C", "Nguyen A", "NXB ABC", 120000, "Lap trinh", "Dai hoc");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT002", "Co so du lieu", "Tran B", "NXB XYZ", 150000, "CSDL", "Dai hoc");

        SachTieuThuyet st1 = new SachTieuThuyet("TT001", "Tinh yeu mua dong", "Le C", "NXB Love", 80000, "Lang man", false);
        SachTieuThuyet st2 = new SachTieuThuyet("TT002", "Du hanh vu tru", "Pham D", "NXB SciFi", 95000, "Khoa hoc vien tuong", true);

        qls.them(sg1);
        qls.them(sg2);
        qls.them(st1);
        qls.them(st2);

        qls.hienThiTatCa();
        System.out.println();

        String maTim = "TT002";
        System.out.println("Tim sach ma: " + maTim);
        Sach found = qls.timTheoMa(maTim);
        if (found != null) {
            System.out.println("Tim thay: " + found);
        } else {
            System.out.println("Khong tim thay sach co ma " + maTim);
        }
        System.out.println();

        System.out.println("Cap nhat sach ma TT001:");
        SachTieuThuyet st1CapNhat = new SachTieuThuyet("TT001", "Tinh yeu mua dong - phat hanh 2", "Le C", "NXB Love", 85000, "Lang man", false);
        boolean ok = qls.capNhat("TT001", st1CapNhat);
        System.out.println("Cap nhat " + (ok ? "thanh cong" : "that bai"));
        qls.hienThiTatCa();
        System.out.println();

        System.out.println("Xoa sach ma GT002:");
        boolean del = qls.xoaTheoMa("GT002");
        System.out.println("Xoa " + (del ? "thanh cong" : "that bai"));
        qls.hienThiTatCa();

        System.out.println("=== Ket thuc test ===");
    }
}


