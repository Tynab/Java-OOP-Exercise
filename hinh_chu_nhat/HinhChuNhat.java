package hinh_chu_nhat;

import static java.lang.Double.*;
import static java.lang.String.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class HinhChuNhat {
    // #region Fields
    private double chieuDai;
    private double chieuRong;
    private double chuVi;
    private double dienTich;
    // #endregion

    // #region Methods
    public void tinhChuVi() {
        chuVi = 2 * (chieuDai + chieuRong);
    }

    public void tinhDienTich() {
        dienTich = chieuDai * chieuRong;
    }

    public void nhapChieuDai() {
        PrintAdv(GREEN, "Chiều dài: ", RESET);
        chieuDai = NumLimit(0, MAX_VALUE);
    }

    public void nhapChieuRong() {
        PrintAdv(GREEN, "Chiều rộng: ", RESET);
        chieuRong = NumLimit(0, MAX_VALUE);
    }

    public void nhapHinhChuNhat() {
        nhapChieuDai();
        nhapChieuRong();
        tinhChuVi();
        tinhDienTich();
    }

    public void xuatChieuDai() {
        PrintlnAdv(format("Chiều dài: %s", WritePerfectDub(chieuDai)));
    }

    public void xuatChieuRong() {
        PrintlnAdv(format("Chiều rộng: %s", WritePerfectDub(chieuRong)));
    }

    public void xuatChuVi() {
        PrintlnAdv(format("Chu vi: %s", WritePerfectDub(chuVi)));
    }

    public void xuatDienTich() {
        PrintlnAdv(format("Diện tích: %s", WritePerfectDub(dienTich)));
    }

    public void xuatHinhChuNhat() {
        xuatChieuDai();
        xuatChieuRong();
        xuatChuVi();
        xuatDienTich();
    }
    // #endregion

    // #region Properties
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChuVi() {
        return chuVi;
    }

    // public void setChuVi(double chuVi) {
    // this.chuVi = chuVi;
    // }

    public double getDienTich() {
        return dienTich;
    }

    // public void setDienTich(double dienTich) {
    // this.dienTich = dienTich;
    // }
    // #endregion
}
