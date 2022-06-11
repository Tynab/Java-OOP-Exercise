package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;

import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class QuanLyHocSinh {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        PrintlnAdv("Bài Tập Quản Lý Học Sinh");
        // content
        Main();
    }

    // Fields
    private static List<HocSinh> _dsHocSinh;

    // Main
    private static void Main() {
        // input
        out.println();
        PrintAdv(GREEN, "Nhập vào số học sinh: ", RESET);
        var n = NumLimit(1, MAX_VALUE);
        _dsHocSinh = new ArrayList<HocSinh>();
        for (var i = 0; i < n; i++) {
            out.println();
            PrintlnAdv(CYAN, format("Học sinh thứ %d", i + 1));
            var hocSinh = new HocSinh();
            do {
                hocSinh.nhapMaHocSinh();
            } while (IsRegist(hocSinh.getMaHocSinh()));
            hocSinh.nhapThongTinCaNhan();
            hocSinh.nhapThongTinCoBan();
            hocSinh.nhapThanhTichHocTap();
            _dsHocSinh.add(hocSinh);
        }
        // output
        out.println(YELLOW);
        Showntime();
        // ctrl
        CheckOut();
    }

    // Check regist
    private static boolean IsRegist(String maHocSinh) {
        var is_success = false;
        for (var hocSinh : _dsHocSinh) {
            if (hocSinh.getMaHocSinh().equals(maHocSinh)) {
                PrintlnAdv(RED, "Mã học sinh đã tồn tại!");
                is_success = true;
                break;
            }
        }
        return is_success;
    }

    // Showntime
    private static void Showntime() {
        for (var hocSinh : _dsHocSinh) {
            PrintlnAdv(format("%s", ToUpperCaseAdv(hocSinh.getThongTinCaNhan().getHoTen())));
            hocSinh.xuatThanhTichHocTap();
            out.println();
        }
    }

    // Check out
    private static void CheckOut() {
        if (Credit() == 1) {
            Main();
        }
    }
}
