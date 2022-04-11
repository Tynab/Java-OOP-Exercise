package quan_ly_hoc_sinh;

public class HocSinh {
    // #region Fields
    private ThongTinCaNhan thongTinCaNhan;
    private ThongTinCoBan thongTinCoBan;
    private ThanhTichHocTap thanhTichHocTap;
    private String maHocSinh;
    // #endregion

    // #region Properties
    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public ThongTinCaNhan getThongTinCaNhan() {
        return thongTinCaNhan;
    }

    public void setThongTinCaNhan(ThongTinCaNhan thongTinCaNhan) {
        this.thongTinCaNhan = thongTinCaNhan;
    }

    public ThongTinCoBan getThongTinCoBan() {
        return thongTinCoBan;
    }

    public void setThongTinCoBan(ThongTinCoBan thongTinCoBan) {
        this.thongTinCoBan = thongTinCoBan;
    }

    public ThanhTichHocTap getThanhTichHocTap() {
        return thanhTichHocTap;
    }

    public void setThanhTichHocTap(ThanhTichHocTap thanhTichHocTap) {
        this.thanhTichHocTap = thanhTichHocTap;
    }
    // #endregion
}
