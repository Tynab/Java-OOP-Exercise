package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class QuanLyHocSinh {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Quản Lý Học Sinh");
        // content
        run();
    }

    // Fields
    private static List<HocSinh> mDSHocSinh;

    // Main
    private static void run() {
        // input
        out.println();
        printAdv(GREEN, "Nhập vào số học sinh: ", RESET);
        var n = numLimit(1, MAX_VALUE);
        mDSHocSinh = new ArrayList<HocSinh>();
        for (var i = 0; i < n; i++) {
            out.println();
            printlnAdv(CYAN, format("Học sinh thứ %d", i + 1));
            var hocSinh = new HocSinh();
            do {
                hocSinh.nhapMaHocSinh();
            } while (isRegist(hocSinh.getMaHocSinh()));
            hocSinh.nhapThongTinCaNhan();
            hocSinh.nhapThongTinCoBan();
            hocSinh.nhapThanhTichHocTap();
            mDSHocSinh.add(hocSinh);
        }
        // output
        out.println(YELLOW);
        showntime();
        // ctrl
        checkOut();
    }

    // Check regist
    private static boolean isRegist(String maHocSinh) {
        var isSuccess = false;
        for (var hocSinh : mDSHocSinh) {
            if (hocSinh.getMaHocSinh().equals(maHocSinh)) {
                printlnAdv(RED, "Mã học sinh đã tồn tại!");
                isSuccess = true;
                break;
            }
        }
        return isSuccess;
    }

    // Showntime
    private static void showntime() {
        for (var hocSinh : mDSHocSinh) {
            printlnAdv(format("%s", toUpperCaseAdv(hocSinh.getThongTinCaNhan().getHoTen())));
            hocSinh.xuatThanhTichHocTap();
            out.println();
        }
    }

    // Check out
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
