package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class HocSinh {
    // #region Fields
    private String maHocSinh;
    private ThongTinCaNhan thongTinCaNhan;
    private ThongTinCoBan thongTinCoBan;
    private ThanhTichHocTap thanhTichHocTap;
    private final Scanner mScan = new Scanner(in);
    // #endregion

    // #region Methods
    public void nhapMaHocSinh() {
        printAdv(GREEN, "Mã học sinh: ", RESET);
        maHocSinh = mScan.nextLine();
    }

    public void nhapThongTinCaNhan() {
        thongTinCaNhan = new ThongTinCaNhan();
        thongTinCaNhan.nhapThongTinCaNhan();
    }

    public void nhapThongTinCoBan() {
        thongTinCoBan = new ThongTinCoBan();
        thongTinCoBan.nhapThongTinCoBan();
    }

    public void nhapThanhTichHocTap() {
        thanhTichHocTap = new ThanhTichHocTap();
        thanhTichHocTap.nhapThanhTichHocTap();
    }

    public void nhapHocSinh() {
        nhapMaHocSinh();
        nhapThongTinCaNhan();
        nhapThongTinCoBan();
        nhapThanhTichHocTap();
    }

    public void xuatMaHocSinh() {
        printlnAdv(format("Mã học sinh: %s", maHocSinh));
    }

    public void xuatThongTinCaNhan() {
        thongTinCaNhan.xuatThongTinCaNhan();
    }

    public void xuatThongTinCoBan() {
        thongTinCoBan.xuatThongTinCoBan();
    }

    public void xuatThanhTichHocTap() {
        thanhTichHocTap.xuatThanhTichHocTap();
    }

    public void xuatHocSinh() {
        xuatMaHocSinh();
        xuatThongTinCaNhan();
        xuatThongTinCoBan();
        xuatThanhTichHocTap();
    }
    // #endregion

    // #region Properties
    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public ThongTinCaNhan getThongTinCaNhan() {
        return thongTinCaNhan;
    }

    public void setThongTinCaNhan(ThongTinCaNhan thongTinCaNhan) {
        this.thongTinCaNhan = thongTinCaNhan;
    }

    public ThongTinCoBan getThongTinCoBan() {
        return thongTinCoBan;
    }

    public void setThongTinCoBan(ThongTinCoBan thongTinCoBan) {
        this.thongTinCoBan = thongTinCoBan;
    }

    public ThanhTichHocTap getThanhTichHocTap() {
        return thanhTichHocTap;
    }

    public void setThanhTichHocTap(ThanhTichHocTap thanhTichHocTap) {
        this.thanhTichHocTap = thanhTichHocTap;
    }
    // #endregion
}
