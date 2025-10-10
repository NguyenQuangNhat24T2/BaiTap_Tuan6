import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach(){
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s){
        danhSach.add(s);
    }

    public void xoaSach(String maSach){
        danhSach.removeIf(s -> s.getMaSach().equals(maSach));
    }

    public void capNhatTieuDe(String maSach, String tieuDeMoi){
        for(Sach s : danhSach){
            if(s.getMaSach().equals(maSach)){
                s.setTieuDe(tieuDeMoi);
                break;
            }
        }
    }

    public Sach timKiem(String maSach){
        for(Sach s : danhSach){
            if(s.getMaSach().equals(maSach)){
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach(){
        for(Sach s : danhSach){
            System.out.println(s);
        }
    }
}
