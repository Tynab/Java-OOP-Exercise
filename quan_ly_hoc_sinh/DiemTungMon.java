package quan_ly_hoc_sinh;

public class DiemTungMon extends TheoKy {
    // #region Fiedls
    private double diemKiemTraMieng;
    private double diemKiemTra15Phut;
    private double diemKiemTraGiuaKy;
    private double diemKiemTraCuoiKy;
    private double diemTrungBinh;
    // #endregion

    // #region Methods
    public void TinhDiemTrungBinh() {
        diemTrungBinh = (diemKiemTraMieng + diemKiemTra15Phut + diemKiemTraGiuaKy * 2 + diemKiemTraCuoiKy * 3) / 7;
    }
    // #endregion

    // #region Properties
    public double getDiemKiemTraMieng() {
        return diemKiemTraMieng;
    }

    public void setDiemKiemTraMieng(double diemKiemTraMieng) {
        this.diemKiemTraMieng = diemKiemTraMieng;
    }

    public double getDiemKiemTra15Phut() {
        return diemKiemTra15Phut;
    }

    public void setDiemKiemTra15Phut(double diemKiemTra15Phut) {
        this.diemKiemTra15Phut = diemKiemTra15Phut;
    }

    public double getDiemKiemTraGiuaKy() {
        return diemKiemTraGiuaKy;
    }

    public void setDiemKiemTraGiuaKy(double diemKiemTraGiuaKy) {
        this.diemKiemTraGiuaKy = diemKiemTraGiuaKy;
    }

    public double getDiemKiemTraCuoiKy() {
        return diemKiemTraCuoiKy;
    }

    public void setDiemKiemTraCuoiKy(double diemKiemTraCuoiKy) {
        this.diemKiemTraCuoiKy = diemKiemTraCuoiKy;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    // public void setDiemTrungBinh(double diemTrungBinh) {
    //     this.diemTrungBinh = diemTrungBinh;
    // }
    // #endregion
}
