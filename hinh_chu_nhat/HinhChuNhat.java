package hinh_chu_nhat;

import static java.lang.Double.*;
import static java.lang.String.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

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
        printAdv(GREEN, "Chiều dài: ", RESET);
        chieuDai = numLimit(0, MAX_VALUE);
    }

    public void nhapChieuRong() {
        printAdv(GREEN, "Chiều rộng: ", RESET);
        chieuRong = numLimit(0, MAX_VALUE);
    }

    public void nhapHinhChuNhat() {
        nhapChieuDai();
        nhapChieuRong();
        tinhChuVi();
        tinhDienTich();
    }

    public void xuatChieuDai() {
        printlnAdv(format("Chiều dài: %s", writePerfectDub(chieuDai)));
    }

    public void xuatChieuRong() {
        printlnAdv(format("Chiều rộng: %s", writePerfectDub(chieuRong)));
    }

    public void xuatChuVi() {
        printlnAdv(format("Chu vi: %s", writePerfectDub(chuVi)));
    }

    public void xuatDienTich() {
        printlnAdv(format("Diện tích: %s", writePerfectDub(dienTich)));
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
