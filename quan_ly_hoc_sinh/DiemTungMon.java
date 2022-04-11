package quan_ly_hoc_sinh;

public class DiemTungMon {
    // #region Fiedls
    private double diemKTMieng;
    private double diemKT15Phut;
    private double diemKTGiuaKy;
    private double diemKTCuoiKy;
    private double diemTrungBinhMon;
    // #endregion

    // #region Methods
    public void TinhDiemTrungBinh() {
        diemTrungBinhMon = (diemKTMieng + diemKT15Phut + diemKTGiuaKy * 2 + diemKTCuoiKy * 3) / 7;
    }
    // #endregion

    // #region Properties
    public double getDiemKTMieng() {
        return diemKTMieng;
    }

    public void setDiemKTMieng(double diemKTMieng) {
        this.diemKTMieng = diemKTMieng;
    }

    public double getDiemKT15Phut() {
        return diemKT15Phut;
    }

    public void setDiemKT15Phut(double diemKT15Phut) {
        this.diemKT15Phut = diemKT15Phut;
    }

    public double getDiemKTGiuaKy() {
        return diemKTGiuaKy;
    }

    public void setDiemKTGiuaKy(double diemKTGiuaKy) {
        this.diemKTGiuaKy = diemKTGiuaKy;
    }

    public double getDiemKTCuoiKy() {
        return diemKTCuoiKy;
    }

    public void setDiemKTCuoiKy(double diemKTCuoiKy) {
        this.diemKTCuoiKy = diemKTCuoiKy;
    }

    public double getDiemTrungBinhMon() {
        return diemTrungBinhMon;
    }

    // public void setDiemTrungBinhMon(double diemTrungBinhMon) {
    // this.diemTrungBinhMon = diemTrungBinhMon;
    // }
    // #endregion
}
