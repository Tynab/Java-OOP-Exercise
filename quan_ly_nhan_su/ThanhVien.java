package quan_ly_nhan_su;

public class ThanhVien {
    // #region Fields
    private String maNhanVien;
    private String hoTen;
    private String soDienThoai;
    protected double soNgayLamViec;
    protected double luongThang;
    // #endregion

    // #region Methods
    public void tinhLuong() {
        luongThang = 0;
    }
    // #endregion

    // #region Properties
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(double soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }
    // #endregion
}
