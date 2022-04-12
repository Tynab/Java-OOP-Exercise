package quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.List;

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
            hocSinh.NhapHocSinh();
            _dsHocSinh.add(hocSinh);
        }
        // output
        out.println(YELLOW);
        for (var hocSinh : _dsHocSinh) {
            Showntime(hocSinh);
        }
        // ctrl
        CheckOut();
    }

    // Showntime
    private static void Showntime(HocSinh hocSinh) {
        PrintlnAdv(format("%s", ToUpperCaseAdv(hocSinh.getThongTinCaNhan().getHoTen())));
        hocSinh.XuatThanhTichHocTap();
        out.println();
    }

    // Check out
    private static void CheckOut() {
        if (Credit() == 1) {
            Main();
        }
    }
}
