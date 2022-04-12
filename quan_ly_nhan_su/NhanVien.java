package quan_ly_nhan_su;

public class NhanVien extends NhanSu {
    // #region Fields
    private String tenTruongPhong;
    private final double _luongNgay = 100;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay;
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
