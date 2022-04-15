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
    private final String _chucVu = "nhân viên";
    // #endregion

    // #region Methods
    public void tinhLuong() {
        luongThang = 0;
    }

    public void nhapMaNhanVien() {
        PrintAdv(GREEN, "Mã nhân viên: ", RESET);
        maNhanVien = _scan.nextLine();
    }

    public void nhapHoTen() {
        PrintAdv(GREEN, "Họ tên: ", RESET);
        hoTen = _scan.nextLine();
    }

    public void nhapSoDienThoai() {
        PrintAdv(GREEN, "Số điện thoại: ", RESET);
        soDienThoai = _scan.nextLine();
    }

    public void nhapSoNgayLamViec() {
        PrintAdv(GREEN, "Số ngày làm việc: ", RESET);
        soNgayLamViec = NumLimit(0d, 31d);
    }

    public void nhapNhanSu() {
        nhapHoTen();
        nhapSoDienThoai();
        nhapSoNgayLamViec();
    }

    public void xuatMaNhanVien() {
        PrintlnAdv(format("Mã nhân viên: %s", maNhanVien));
    }

    public void xuatHoTen() {
        PrintlnAdv(format("Họ tên: %s", hoTen));
    }

    public void xuatSoDienThoai() {
        PrintlnAdv(format("Số điện thoại: %s", soDienThoai));
    }

    public void xuatChucVu() {
        PrintlnAdv(format("Chức vụ: %s", _chucVu));
    }

    public void xuatSoNgayLamViec() {
        PrintlnAdv(format("Số ngày làm việc: %s", WritePerfectDub(soNgayLamViec)));
    }

    public void xuatLuongThang() {
        PrintlnAdv(format("Lương tháng: %,.0f", luongThang));
    }

    public void xuatNhanSu() {
        xuatMaNhanVien();
        xuatHoTen();
        xuatSoDienThoai();
        xuatChucVu();
        xuatSoNgayLamViec();
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
