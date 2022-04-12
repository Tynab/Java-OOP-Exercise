package quan_ly_nhan_su;

public class GiamDoc extends NhanSu {
    // #region Fields
    private double coPhan;
    private final double _luongNgay = 300;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay;
    }
    // #endregion

    // #region Properties
    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }
    // #endregion
}
