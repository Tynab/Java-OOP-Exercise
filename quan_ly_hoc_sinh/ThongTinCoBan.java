package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class ThongTinCoBan {
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
    public void nhapTenTruong() {
        PrintAdv(GREEN, "Tên trường: ", RESET);
        tenTruong = _scan.nextLine();
    }

    public void nhapTenBan() {
        PrintAdv(GREEN, "Tên ban: ", RESET);
        tenBan = _scan.nextLine();
    }

    public void nhapTenKhoi() {
        PrintAdv(GREEN, "Tên khối: ", RESET);
        tenKhoi = _scan.nextLine();
    }

    public void nhapTenLop() {
        PrintAdv(GREEN, "Tên lớp: ", RESET);
        tenLop = _scan.nextLine();
    }

    public void nhapThamGiaHoatDong() {
        PrintAdv(GREEN, "Tham gia hoạt động: ", RESET);
        thamGiaHoatDong = _scan.nextLine();
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
        PrintlnAdv(format("Tên trường: %s", tenTruong));
    }

    public void xuatTenBan() {
        PrintlnAdv(format("Tên ban: %s", tenBan));
    }

    public void xuatTenKhoi() {
        PrintlnAdv(format("Tên khối: %s", tenKhoi));
    }

    public void xuatTenLop() {
        PrintlnAdv(format("Tên lớp: %s", tenLop));
    }

    public void xuatThamGiaHoatDong() {
        PrintlnAdv(format("Tham gia hoạt động: %s", thamGiaHoatDong));
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
