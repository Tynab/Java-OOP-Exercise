package quan_ly_nhan_su;

public class TruongPhong extends ThanhVien {
    // #region Fields
    private int soThanhVien;
    private final double _luongNgay = 200;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay + 100 * soThanhVien;
    }
    // #endregion

    // #region Properties
    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }
    // #endregion
}
