package quan_ly_nhan_su;

public class NhanVien extends ThanhVien {
    // #region Fields
    private String tenTruongPhong;
    private final double luongNgay = 100;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * luongNgay;
    }
    //// #endregion

    // #region Properties
    public String getTenTruongPhong() {
        return tenTruongPhong;
    }

    public void setTenTruongPhong(String tenTruongPhong) {
        this.tenTruongPhong = tenTruongPhong;
    }
    // #endregion
}
