import java.util.ArrayList;
import java.util.List;
public class QuanLySach 
{
    private List<Sach> danhSach = new ArrayList<>();
    // Thêm sách
    public void themSach(Sach s) 
    {
        danhSach.add(s);
    }
    // Xoá sách theo mã
    public boolean xoaSach(String maSach) 
    {
        for (Sach s : danhSach) 
            if (s.getMaSach().equals(maSach)) 
            {
                danhSach.remove(s);
                return true;
            }
        return false;
    }
    // Cập nhật sách theo mã
    public boolean capNhatSach(String maSach, Sach sMoi) 
    {
        for (int i = 0; i < danhSach.size(); i++) 
            if (danhSach.get(i).getMaSach().equals(maSach)) 
            {
                danhSach.set(i, sMoi);
                return true;
            }
        return false;
    }
    // Tìm kiếm sách theo mã
    public Sach timSach(String maSach) 
    {
        for (Sach s : danhSach) 
            if (s.getMaSach().equals(maSach)) 
            {
                return s;
            }
        return null;
    }
    // Hiển thị danh sách sách
    public void hienThiDanhSach() 
    {
        for (Sach s : danhSach) 
        {
            System.out.println(s.toString());
            System.out.println("----------------------");
        }
    }
}