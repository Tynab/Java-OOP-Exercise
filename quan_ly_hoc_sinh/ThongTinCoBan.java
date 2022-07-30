package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class ThongTinCoBan {
    // #region Fields
    private String tenTruong;
    private String tenBan;
    private String tenKhoi;
    private String tenLop;
    private String thamGiaHoatDong;
    private BaoHiemYTe baoHiemYTe;
    private final Scanner mScan = new Scanner(in);
    // #endregion

    // #region Methods
    public void nhapTenTruong() {
        printAdv(GREEN, "Tên trường: ", RESET);
        tenTruong = mScan.nextLine();
    }

    public void nhapTenBan() {
        printAdv(GREEN, "Tên ban: ", RESET);
        tenBan = mScan.nextLine();
    }

    public void nhapTenKhoi() {
        printAdv(GREEN, "Tên khối: ", RESET);
        tenKhoi = mScan.nextLine();
    }

    public void nhapTenLop() {
        printAdv(GREEN, "Tên lớp: ", RESET);
        tenLop = mScan.nextLine();
    }

    public void nhapThamGiaHoatDong() {
        printAdv(GREEN, "Tham gia hoạt động: ", RESET);
        thamGiaHoatDong = mScan.nextLine();
    }

    public void nhapBaoHiemYTe() {
        baoHiemYTe = new BaoHiemYTe();
        baoHiemYTe.nhapBaoHiemYTe();
    }

    public void nhapThongTinCoBan() {
        nhapTenTruong();
        nhapTenBan();
        nhapTenKhoi();
        nhapTenLop();
        nhapThamGiaHoatDong();
        nhapBaoHiemYTe();
    }

    public void xuatTenTruong() {
        printlnAdv(format("Tên trường: %s", tenTruong));
    }

    public void xuatTenBan() {
        printlnAdv(format("Tên ban: %s", tenBan));
    }

    public void xuatTenKhoi() {
        printlnAdv(format("Tên khối: %s", tenKhoi));
    }

    public void xuatTenLop() {
        printlnAdv(format("Tên lớp: %s", tenLop));
    }

    public void xuatThamGiaHoatDong() {
        printlnAdv(format("Tham gia hoạt động: %s", thamGiaHoatDong));
    }

    public void xuatBaoHiemYTe() {
        baoHiemYTe.xuatBaoHiemYTe();
    }

    public void xuatThongTinCoBan() {
        xuatTenTruong();
        xuatTenBan();
        xuatTenKhoi();
        xuatTenLop();
        xuatThamGiaHoatDong();
        xuatBaoHiemYTe();
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
