package quan_ly_hoc_sinh;

import static java.lang.String.*;

import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class DiemTungMon {
    // #region Fiedls
    private double diemKTMieng;
    private double diemKT15Phut;
    private double diemKTGiuaKy;
    private double diemKTCuoiKy;
    private double diemTrungBinhMon;
    // #endregion

    // #region Methods
    public void tinhDiemTrungBinhMon() {
        diemTrungBinhMon = (diemKTMieng + diemKT15Phut + diemKTGiuaKy * 2 + diemKTCuoiKy * 3) / 7;
    }

    public void nhapDiemKTMieng(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm trả bài %s kỳ %d: ", monHoc, hocKy), RESET);
        diemKTMieng = NumLimit(0d, 10d);
    }

    public void nhapDiemKT15Phut(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm 15' %s kỳ %d: ", monHoc, hocKy), RESET);
        diemKT15Phut = NumLimit(0d, 10d);
    }

    public void nhapDiemKTGiuaKy(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm %s giữa kỳ %d: ", monHoc, hocKy), RESET);
        diemKTGiuaKy = NumLimit(0d, 10d);
    }

    public void nhapDiemKTCuoiKy(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm %s cuối kỳ %d: ", monHoc, hocKy), RESET);
        diemKTCuoiKy = NumLimit(0d, 10d);
    }

    public void nhapDiemTungMon(String monHoc, int hocKy) {
        nhapDiemKTMieng(monHoc, hocKy);
        nhapDiemKT15Phut(monHoc, hocKy);
        nhapDiemKTGiuaKy(monHoc, hocKy);
        nhapDiemKTCuoiKy(monHoc, hocKy);
        tinhDiemTrungBinhMon();
    }

    public void xuatDiemKTMieng(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm trả bài %s kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKTMieng)));
    }

    public void xuatDiemKT15Phut(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm 15' %s kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKT15Phut)));
    }

    public void xuatDiemKTGiuaKy(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm %s giữa kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKTGiuaKy)));
    }

    public void xuatDiemKTCuoiKy(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm %s cuối kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKTCuoiKy)));
    }

    public void xuatDiemTrungBinhMon(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm trung bình môn %s kỳ %d: %.1f", monHoc, hocKy, diemTrungBinhMon));
    }

    public void xuatDiemTungMon(String monHoc, int hocKy) {
        xuatDiemKTMieng(monHoc, hocKy);
        xuatDiemKT15Phut(monHoc, hocKy);
        xuatDiemKTGiuaKy(monHoc, hocKy);
        xuatDiemKTCuoiKy(monHoc, hocKy);
        xuatDiemTrungBinhMon(monHoc, hocKy);
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
