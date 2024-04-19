import org.junit.*;
import static org.junit.Assert.assertEquals;

public class Tuan1_Bai2Test {

    @Test
    public void testGetHoTen() {
        SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
        assertEquals("Nguyen Van A", sv.getHoTen());
    }

    @Test
    public void testSetHoTen() {
        SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
        sv.setHoTen("Tran Thi B");
        assertEquals("Tran Thi B", sv.getHoTen());
    }

    @Test
    public void testGetNgaySinh() {
        SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
        assertEquals("01/01/2000", sv.getNgaySinh());
    }

    @Test
    public void testSetNgaySinh() {
        SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
        sv.setNgaySinh("02/02/2000");
        assertEquals("02/02/2000", sv.getNgaySinh());
    }

    @Test
    public void testGetMaSinhVien() {
        SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
        assertEquals("SV001", sv.getMaSinhVien());
    }

    @Test
    public void testSetMaSinhVien() {
        SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
        sv.setMaSinhVien("SV002");
        assertEquals("SV002", sv.getMaSinhVien());
    }

    @Test
    public void testGetLop() {
    SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
    assertEquals("A1", sv.getLop());
    }

    @Test
    public void testSetLop() {
    SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
    sv.setLop("A2");
    assertEquals("A2", sv.getLop());
    }

    @Test
    public void testGetDiem() {
    SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
    assertEquals(8.5, sv.getDiem(), 0.01); // Chấp nhận sai số 0.01 khi so sánh double
}

    @Test
    public void testSetDiem() {
    SinhVien sv = new SinhVien("Nguyen Van A", "01/01/2000", "SV001", "A1", 8.5);
    sv.setDiem(7.5);
    assertEquals(7.5, sv.getDiem(), 0.01); // Chấp nhận sai số 0.01 khi so sánh double
    }


    @Test
    public void testMain() {
        
    }
}

