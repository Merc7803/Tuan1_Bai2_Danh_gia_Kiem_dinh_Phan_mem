import java.util.ArrayList;

class SinhVien {
    private String hoTen;
    private String ngaySinh;
    private String maSinhVien;
    private String lop;
    private double diem;

    public SinhVien(String hoTen, String ngaySinh, String maSinhVien, String lop, double diem) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}

public class Tuan1_Bai2 {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        
        // Thêm các sinh viên vào danh sách
        danhSachSinhVien.add(new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5));
        danhSachSinhVien.add(new SinhVien("Tran Thi B", "02/02/2001", "SV002", "A2", 6.0));
        danhSachSinhVien.add(new SinhVien("Le Van C", "03/03/2002", "SV003", "A1", 4.5));
        danhSachSinhVien.add(new SinhVien("Pham Thi D", "04/04/2003", "SV004", "A3", 7.5));
        
        // In ra thông tin của sinh viên có điểm trên 5
        System.out.println("Danh sach sinh vien co diem tren 5:");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getDiem() > 5.0) {
                System.out.println("Ho va ten: " + sv.getHoTen());
                System.out.println("Ngay sinh: " + sv.getNgaySinh());
                System.out.println("Ma sinh vien: " + sv.getMaSinhVien());
                System.out.println("Lop: " + sv.getLop());
                System.out.println("Diem: " + sv.getDiem());
                System.out.println("-----------------------------");
            }
        }
    }
}
