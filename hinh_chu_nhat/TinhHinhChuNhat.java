package hinh_chu_nhat;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class TinhHinhChuNhat {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tính Hình Chữ Nhật");
        // content
        run();
    }

    // Fields
    private static List<HinhChuNhat> mDSHinhChuNhat;

    // Main
    private static void run() {
        // input
        out.println();
        printAdv(GREEN, "Nhập vào số hình chữ nhật: ", RESET);
        var n = numLimit(1, MAX_VALUE);
        mDSHinhChuNhat = new ArrayList<HinhChuNhat>();
        for (var i = 0; i < n; i++) {
            out.println();
            printlnAdv(CYAN, format("Hình chữ nhật thứ %d", i + 1));
            var hinhChuNhat = new HinhChuNhat();
            hinhChuNhat.nhapHinhChuNhat();
            mDSHinhChuNhat.add(hinhChuNhat);
        }
        // output
        out.println(YELLOW);
        showntime();
        // ctrl
        checkOut();
    }

    // Showntime
    private static void showntime() {
        for (var i = 0; i < mDSHinhChuNhat.size(); i++) {
            printlnAdv(format("Hình chữ nhật thứ %d", i + 1));
            mDSHinhChuNhat.get(i).xuatHinhChuNhat();
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
