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
    public void TinhDiemTrungBinhMon() {
        diemTrungBinhMon = (diemKTMieng + diemKT15Phut + diemKTGiuaKy * 2 + diemKTCuoiKy * 3) / 7;
    }

    public void NhapDiemKTMieng(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm trả bài %s kỳ %d: ", monHoc, hocKy), RESET);
        diemKTMieng = NumLimit(0d, 10d);
    }

    public void NhapDiemKT15Phut(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm 15' %s kỳ %d: ", monHoc, hocKy), RESET);
        diemKT15Phut = NumLimit(0d, 10d);
    }

    public void NhapDiemKTGiuaKy(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm %s giữa kỳ %d: ", monHoc, hocKy), RESET);
        diemKTGiuaKy = NumLimit(0d, 10d);
    }

    public void NhapDiemKTCuoiKy(String monHoc, int hocKy) {
        PrintAdv(GREEN, format("Điểm %s cuối kỳ %d: ", monHoc, hocKy), RESET);
        diemKTCuoiKy = NumLimit(0d, 10d);
    }

    public void NhapDiemTungMon(String monHoc, int hocKy) {
        NhapDiemKTMieng(monHoc, hocKy);
        NhapDiemKT15Phut(monHoc, hocKy);
        NhapDiemKTGiuaKy(monHoc, hocKy);
        NhapDiemKTCuoiKy(monHoc, hocKy);
        TinhDiemTrungBinhMon();
    }

    public void XuatDiemKTMieng(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm trả bài %s kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKTMieng)));
    }

    public void XuatDiemKT15Phut(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm 15' %s kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKT15Phut)));
    }

    public void XuatDiemKTGiuaKy(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm %s giữa kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKTGiuaKy)));
    }

    public void XuatDiemKTCuoiKy(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm %s cuối kỳ %d: %s", monHoc, hocKy, WritePerfectDub(diemKTCuoiKy)));
    }

    public void XuatDiemTrungBinhMon(String monHoc, int hocKy) {
        PrintlnAdv(format("Điểm trung bình môn %s kỳ %d: %.1f", monHoc, hocKy, diemTrungBinhMon));
    }

    public void XuatDiemTungMon(String monHoc, int hocKy) {
        XuatDiemKTMieng(monHoc, hocKy);
        XuatDiemKT15Phut(monHoc, hocKy);
        XuatDiemKTGiuaKy(monHoc, hocKy);
        XuatDiemKTCuoiKy(monHoc, hocKy);
        XuatDiemTrungBinhMon(monHoc, hocKy);
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
