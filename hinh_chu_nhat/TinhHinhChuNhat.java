package hinh_chu_nhat;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class TinhHinhChuNhat {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        PrintlnAdv("Bài Tính Hình Chữ Nhật");
        // content
        Main();
    }

    // Fields
    private static List<HinhChuNhat> _dsHinhChuNhat;

    // Main
    private static void Main() {
        // input
        out.println();
        PrintAdv(GREEN, "Nhập vào số hình chữ nhật: ", RESET);
        var n = NumLimit(1, MAX_VALUE);
        _dsHinhChuNhat = new ArrayList<HinhChuNhat>();
        for (var i = 0; i < n; i++) {
            out.println();
            PrintlnAdv(CYAN, format("Hình chữ nhật thứ %d", i + 1));
            var hinhChuNhat = new HinhChuNhat();
            hinhChuNhat.nhapHinhChuNhat();
            _dsHinhChuNhat.add(hinhChuNhat);
        }
        // output
        out.println(YELLOW);
        Showntime();
        // ctrl
        CheckOut();
    }

    // Showntime
    private static void Showntime() {
        for (var i = 0; i < _dsHinhChuNhat.size(); i++) {
            PrintlnAdv(format("Hình chữ nhật thứ %d", i + 1));
            _dsHinhChuNhat.get(i).xuatHinhChuNhat();
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
