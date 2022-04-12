package quan_ly_hoc_sinh;

import java.util.Scanner;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class HocSinh {
    // #region Fields
    private String maHocSinh;
    private ThongTinCaNhan thongTinCaNhan;
    private ThongTinCoBan thongTinCoBan;
    private ThanhTichHocTap thanhTichHocTap;
    private final Scanner _scan = new Scanner(in);
    // #endregion

    // #region Methods
    public void NhapMaHocSinh() {
        PrintAdv(GREEN, "Mã học sinh: ", RESET);
        maHocSinh = _scan.nextLine();
    }

    public void NhapThongTinCaNhan() {
        thongTinCaNhan = new ThongTinCaNhan();
        thongTinCaNhan.NhapThongTinCaNhan();
    }

    public void NhapThongTinCoBan() {
        thongTinCoBan = new ThongTinCoBan();
        thongTinCoBan.NhapThongTinCoBan();
    }

    public void NhapThanhTichHocTap() {
        thanhTichHocTap = new ThanhTichHocTap();
        thanhTichHocTap.NhapThanhTichHocTap();
    }

    public void NhapHocSinh() {
        NhapMaHocSinh();
        NhapThongTinCaNhan();
        NhapThongTinCoBan();
        NhapThanhTichHocTap();
    }

    public void XuatMaHocSinh() {
        PrintlnAdv(format("Mã học sinh: %s", maHocSinh));
    }

    public void XuatThongTinCaNhan() {
        thongTinCaNhan.XuatThongTinCaNhan();
    }

    public void XuatThongTinCoBan() {
        thongTinCoBan.XuatThongTinCoBan();
    }

    public void XuatThanhTichHocTap() {
        thanhTichHocTap.XuatThanhTichHocTap();
    }

    public void XuatHocSinh() {
        XuatMaHocSinh();
        XuatThongTinCaNhan();
        XuatThongTinCoBan();
        XuatThanhTichHocTap();
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
