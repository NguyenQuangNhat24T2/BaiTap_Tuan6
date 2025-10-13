public class Test 
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT001", "Java Co Ban", "Nguyen Van A", 2022, 10,
                                                "Lap trinh", "Dai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 5,
                                                "Fantasy", true);
        ql.themSach(sg1);
        ql.themSach(st1);
        System.out.println("=== Danh sach sau khi them ===");
        ql.hienThiDanhSach();
        // Tìm sách
        System.out.println("=== Tim sach ma GT001 ===");
        System.out.println(ql.timSach("GT001"));
        // Cập nhật sách
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT001", "Java Nang Cao", "Nguyen Van A", 2023, 15,
                                            "Lap trinh", "Dai hoc");
        ql.capNhatSach("GT001", sg2);
        System.out.println("=== Danh sach sau khi cap nhat ===");
        ql.hienThiDanhSach();
        // Xoá sách
        ql.xoaSach("TT001");
        System.out.println("=== Danh sach sau khi xoa TT001 ===");
        ql.hienThiDanhSach();
    }
}
