package BaiTap_Tuan6;

public class Quanlysach {
    
}
    private Sach[] ds;
    private int soLuong;

    public QuanLySach(int kichThuoc) {
        ds = new Sach[kichThuoc];
        soLuong = 0;
    }

    public void themSach(Sach s) {
        if (soLuong < ds.length) {
            ds[soLuong] = s;
            soLuong++;
        } else {
            System.out.println("Danh sach da day!");
        }
    }

    public void hienThiDanhSach() {
        if (soLuong == 0) {
            System.out.println("Danh sach rong!");
        } else {
            for (int i = 0; i < soLuong; i++) {
                ds[i].hienThiThongTin();
                System.out.println("--------------------");
            }
        }
    }

    public void timKiemTheoMa(String ma) {
        boolean timThay = false;
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaSach().equalsIgnoreCase(ma)) {
                ds[i].hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) System.out.println("Khong tim thay sach co ma " + ma);
    }

    public void xoaSach(String ma) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaSach().equalsIgnoreCase(ma)) {
                for (int j = i; j < soLuong - 1; j++) {
                    ds[j] = ds[j + 1];
                }
                ds[soLuong - 1] = null;
                soLuong--;
                System.out.println("Da xoa sach co ma " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay sach de xoa.");
    }
}

