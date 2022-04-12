package quan_ly_nhan_su;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        PrintlnAdv("Bài Tập Quản Lý Nhân Sự");
        // content
        Main();
    }

    // Fields
    private static final Scanner _scan = new Scanner(in);
    private static String _tenCongTy;
    private static String _maSoThue;
    private static double _doanhThuThang;
    private static List<NhanSu> _dsNhanSu;

    // Main
    private static void Main() {
        // input
        out.println();
        PrintAdv(GREEN, "Nhập vào số thành viên: ", RESET);
        var n = NumLimit(1, MAX_VALUE);
        PrintAdv(GREEN, "Tên công ty: ", RESET);
        _tenCongTy = _scan.nextLine();
        PrintAdv(GREEN, "Mã số thuế: ", RESET);
        _maSoThue = _scan.nextLine();
        PrintAdv(GREEN, "Doanh thu tháng: ", RESET);
        _doanhThuThang = NumLimit(Double.MIN_VALUE, Double.MAX_VALUE);
        _dsNhanSu = new ArrayList<NhanSu>();
        for (var i = 0; i < n; i++) {
            out.println();
            PrintlnAdv(CYAN, format("Thành viên thứ %d", i + 1));
            var nhanSu = SplitUser();
            nhanSu.NhapNhanSu();
            _dsNhanSu.add(nhanSu);
        }
        // output
        out.println(YELLOW);

        // ctrl
        CheckOut();
    }

    // Split user
    private static NhanSu SplitUser() {
        PrintlnAdv(RESET, format("Vị trí trong công ty"));
        PrintlnAdv("1. Nhân viên   ");
        PrintlnAdv("2. Trưởng phòng");
        PrintlnAdv("3. Giám đốc    ");
        PrintAdv("Chọn 1 trong các phương án trên: ");
        switch (NumLimit(1, 3)) {
            case 1: {
                return new NhanVien();
            }
            case 2: {
                return new TruongPhong();
            }
            case 3: {
                return new GiamDoc();
            }
            default: {
                return new NhanSu();
            }
        }
    }

    // Showntime
    private static void Showntime(NhanSu hocSinh) {
        PrintlnAdv(format("Tên công ty: %s", _tenCongTy));
        PrintlnAdv(format("Mã số thuế: %s", _maSoThue));
        PrintlnAdv(format("Doanh thu tháng: %s", WritePerfectDub(_doanhThuThang)));

        out.println();
    }

    // Check out
    private static void CheckOut() {
        if (Credit() == 1) {
            Main();
        }
    }
}
