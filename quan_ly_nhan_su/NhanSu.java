package quan_ly_nhan_su;

import java.util.Scanner;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class NhanSu {
    // #region Fields
    private String maNhanVien;
    private String hoTen;
    private String soDienThoai;
    protected double soNgayLamViec;
    protected double luongThang;
    private final Scanner _scan = new Scanner(in);
    // #endregion

    // #region Methods
    public void tinhLuong() {
        luongThang = 0;
    }

    public void NhapMaNhanVien() {
        PrintAdv(GREEN, "Mã nhân viên: ", RESET);
        maNhanVien = _scan.nextLine();
    }

    public void NhapHoTen() {
        PrintAdv(GREEN, "Họ tên: ", RESET);
        hoTen = _scan.nextLine();
    }

    public void NhapSoDienThoai() {
        PrintAdv(GREEN, "Số điện thoại: ", RESET);
        soDienThoai = _scan.nextLine();
    }

    public void NhapSoNgayLamViec() {
        PrintAdv(GREEN, "Số ngày làm việc: ", RESET);
        soNgayLamViec = NumLimit(0d, 31d);
    }

    public void NhapNhanSu() {
        NhapMaNhanVien();
        NhapHoTen();
        NhapSoDienThoai();
        NhapSoNgayLamViec();
    }

    public void XuatMaNhanVien() {
        PrintlnAdv(format("Mã nhân viên: %s", maNhanVien));
    }

    public void XuatHoTen() {
        PrintlnAdv(format("Họ tên: %s", hoTen));
    }

    public void XuatSoDienThoai() {
        PrintlnAdv(format("Số điện thoại: %s", soDienThoai));
    }

    public void XuatSoNgayLamViec() {
        PrintlnAdv(format("Số ngày làm việc: %.1f", soNgayLamViec));
    }

    public void XuatNhanSu() {
        XuatMaNhanVien();
        XuatHoTen();
        XuatSoDienThoai();
        XuatSoNgayLamViec();
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

    public double getLuongThang() {
        return luongThang;
    }

    // public void setLuongThang(double luongThang) {
    // this.luongThang = luongThang;
    // }
    // #endregion
}
