package quan_ly_hoc_sinh;

import java.util.Scanner;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class ThongTinCoBan extends HocSinh {
    // #region Fields
    private String tenTruong;
    private String tenBan;
    private String tenKhoi;
    private String tenLop;
    private String thamGiaHoatDong;
    private BaoHiemYTe baoHiemYTe;
    private final Scanner _scan = new Scanner(in);
    // #endregion

    // #region Methods
    public void NhapTenTruong() {
        PrintAdv(GREEN, "Tên trường: ", RESET);
        tenTruong = _scan.nextLine();
    }

    public void NhapTenBan() {
        PrintAdv(GREEN, "Tên ban: ", RESET);
        tenBan = _scan.nextLine();
    }

    public void NhapTenKhoi() {
        PrintAdv(GREEN, "Tên khối: ", RESET);
        tenKhoi = _scan.nextLine();
    }

    public void NhapTenLop() {
        PrintAdv(GREEN, "Tên lớp: ", RESET);
        tenLop = _scan.nextLine();
    }

    public void NhapThamGiaHoatDong() {
        PrintAdv(GREEN, "Tham gia hoạt động: ", RESET);
        thamGiaHoatDong = _scan.nextLine();
    }

    public void NhapBaoHiemYTe() {
        baoHiemYTe = new BaoHiemYTe();
        baoHiemYTe.NhapBaoHiemYTe();
    }

    public void NhapThongTinCoBan() {
        NhapTenTruong();
        NhapTenBan();
        NhapTenKhoi();
        NhapTenLop();
        NhapThamGiaHoatDong();
        NhapBaoHiemYTe();
    }

    public void XuatTenTruong() {
        PrintlnAdv(format("Tên trường: %s", tenTruong));
    }

    public void XuatTenBan() {
        PrintlnAdv(format("Tên ban: %s", tenBan));
    }

    public void XuatTenKhoi() {
        PrintlnAdv(format("Tên khối: %s", tenKhoi));
    }

    public void XuatTenLop() {
        PrintlnAdv(format("Tên lớp: %s", tenLop));
    }

    public void XuatThamGiaHoatDong() {
        PrintlnAdv(format("Tham gia hoạt động: %s", thamGiaHoatDong));
    }

    public void XuatBaoHiemYTe() {
        baoHiemYTe.XuatBaoHiemYTe();
    }

    public void XuatThongTinCoBan() {
        XuatTenTruong();
        XuatTenBan();
        XuatTenKhoi();
        XuatTenLop();
        XuatThamGiaHoatDong();
        XuatBaoHiemYTe();
    }
    // #endregion

    // #region Properties
    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTenKhoi() {
        return tenKhoi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getThamGiaHoatDong() {
        return thamGiaHoatDong;
    }

    public void setThamGiaHoatDong(String thamGiaHoatDong) {
        this.thamGiaHoatDong = thamGiaHoatDong;
    }

    public BaoHiemYTe getBaoHiemYTe() {
        return baoHiemYTe;
    }

    public void setBaoHiemYTe(BaoHiemYTe baoHiemYTe) {
        this.baoHiemYTe = baoHiemYTe;
    }
    // #endregion
}
