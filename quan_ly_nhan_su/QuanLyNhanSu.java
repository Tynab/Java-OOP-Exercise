package quan_ly_nhan_su;

import java.util.*;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static java.util.Collections.reverse;
import static quan_ly_nhan_su.Service.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        printlnAdv("Bài Tập Quản Lý Nhân Sự");
        // input
        out.println();
        printAdv(GREEN, "Nhập vào số thành viên: ", RESET);
        var n = numLimit(1, MAX_VALUE);
        printAdv(GREEN, "Tên công ty: ", RESET);
        mTenCongTy = mScan.nextLine();
        printAdv(GREEN, "Mã số thuế: ", RESET);
        mMaSoThue = mScan.nextLine();
        printAdv(GREEN, "Doanh thu tháng: ", RESET);
        mDoanhThuThang = numLimit(Double.MIN_VALUE, Double.MAX_VALUE);
        mDSNhanSu = new ArrayList<NhanSu>();
        for (var i = 0; i < n; i++) {
            out.println();
            printlnAdv(CYAN, format("Thành viên thứ %d", i + 1));
            mDSNhanSu.add(addNewbie(mDSNhanSu));
        }
        // process
        checkTeamLead(mDSNhanSu);
        memberEachTeam(mDSNhanSu);
        // content
        run();
    }

    // Fields
    private static final Scanner mScan = new Scanner(in);
    private static String mTenCongTy;
    private static String mMaSoThue;
    private static double mDoanhThuThang;
    private static List<NhanSu> mDSNhanSu;

    // Main
    private static void run() {
        // output
        out.println(CYAN);
        printlnAdv(" 1. Bổ nhiệm nhân viên làm trưởng phòng");
        printlnAdv(" 2. Thêm nhân sự                       ");
        printlnAdv(" 3. Xóa nhân sự                        ");
        printlnAdv(" 4. Xuất thông tin toàn bộ công ty     ");
        printlnAdv(" 5. Tính tổng lương toàn công ty       ");
        printlnAdv(" 6. Tìm thành viên có lương cao nhất   ");
        printlnAdv(" 7. Tìm trưởng phòng quản lý nhiều nhất");
        printlnAdv(" 8. Sắp xếp nhân sự theo tên           ");
        printlnAdv(" 9. Sắp xếp nhân sự giảm dần           ");
        printlnAdv("10. Tìm giám đốc có cổ phần nhiều nhất ");
        printlnAdv("11. Tính tổng thu nhập của mỗi giám đốc");
        printAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        switch (numLimit(1, 11)) {
            case 1: {
                unitA();
                break;
            }
            case 2: {
                unitB();
                break;
            }
            case 3: {
                unitC();
                break;
            }
            case 4: {
                unitD();
                break;
            }
            case 5: {
                unitE();
                break;
            }
            case 6: {
                unitF();
                break;
            }
            case 7: {
                unitG();
                break;
            }
            case 8: {
                unitH();
                break;
            }
            case 9: {
                unitI();
                break;
            }
            case 10: {
                unitJ();
                break;
            }
            case 11: {
                unitK();
                break;
            }
        }
        // ctrl
        checkOut();
    }

    // Unit 1
    private static void unitA() {
        // split nhanvien
        var dsNhanVien = new ArrayList<NhanVien>();
        for (var nhanSu : mDSNhanSu) {
            if (nhanSu instanceof NhanVien) {
                dsNhanVien.add((NhanVien) nhanSu);
            }
        }
        var max = dsNhanVien.size();
        if (max > 0) {
            // cap
            out.println(RESET);
            printlnAdv("Danh sách nhân viên");
            for (var i = 0; i < max; i++) {
                var nhanVien = dsNhanVien.get(i);
                printlnAdv(format("%d. %s (%s)", i + 1, nhanVien.getHoTen(), nhanVien.getMaNhanVien()));
            }
            printAdv("Chọn 1 trong các phương án trên: ");
            // main
            var index = findIndexByCode(mDSNhanSu, dsNhanVien.get(numLimit(1, max) - 1).getMaNhanVien());
            mDSNhanSu.add(index, nhanVienTransToTruongPhong(mDSNhanSu.get(index)));
            mDSNhanSu.remove(index + 1);
            // finish
            memberEachTeam(mDSNhanSu);
            unitD();
        } else {
            checkIn();
            printlnAdv("Công ty không có nhân viên nào!");
            out.println();
        }
    }

    // Unit 2
    private static void unitB() {
        // cap
        out.println(CYAN);
        printlnAdv("Thêm thành viên mới");
        // main
        mDSNhanSu.add(addNewbie(mDSNhanSu));
        // finish
        memberEachTeam(mDSNhanSu);
        unitD();
    }

    // Unit 3
    private static void unitC() {
        // cap
        printlnAdv(RESET, "Danh sách nhân viên");
        var max = mDSNhanSu.size();
        for (var i = 0; i < max; i++) {
            var nhanSu = mDSNhanSu.get(i);
            printlnAdv(format("%d. %s (%s)", i + 1, nhanSu.getHoTen(), nhanSu.getMaNhanVien()));
        }
        printAdv("Chọn 1 trong các phương án trên: ");
        // main
        var index = findIndexByCode(mDSNhanSu, mDSNhanSu.get(numLimit(1, max) - 1).getMaNhanVien());
        mDSNhanSu.remove(index);
        // finish
        checkTeamLead(mDSNhanSu);
        memberEachTeam(mDSNhanSu);
        unitD();
    }

    // Unit 4
    private static void unitD() {
        // cap
        checkIn();
        // shown
        for (var nhanSu : mDSNhanSu) {
            nhanSu.xuatNhanSu();
            out.println();
        }
    }

    // Unit 5
    private static void unitE() {
        // intro
        unitD();
        // finish
        printlnAdv(format("Tổng lương toàn công ty: %,.0f", sumSalary(mDSNhanSu)));
        out.println();
    }

    // Unit 6
    private static void unitF() {
        // cap
        checkIn();
        printlnAdv("Thành viên lương cao nhất");
        out.println();
        // main
        var dsTopSalary = topSalary(mDSNhanSu);
        // shown
        for (var topNhanSu : dsTopSalary) {
            topNhanSu.xuatHoTen();
            topNhanSu.xuatChucVu();
            topNhanSu.xuatLuongThang();
            out.println();
        }
    }

    // Unit 7
    private static void unitG() {
        // cap
        checkIn();
        printlnAdv("Trưởng phòng quản lý nhiều thành viên nhât");
        out.println();
        // main
        var dsTopTeam = topTeam(mDSNhanSu);
        // shown
        for (var topTruongPhong : dsTopTeam) {
            topTruongPhong.xuatHoTen();
            topTruongPhong.xuatSoThanhVien();
            out.println();
        }
    }

    // Unit 8
    private static void unitH() {
        // cap
        checkIn();
        printlnAdv("Sắp xếp nhân sự theo tên");
        out.println();
        // main
        var dsNhanSu = new ArrayList<NhanSu>(mDSNhanSu);
        sortByName(dsNhanSu);
        // shown
        for (var nhanSu : dsNhanSu) {
            nhanSu.xuatNhanSu();
            out.println();
        }
    }

    // Unit 9
    private static void unitI() {
        // cap
        checkIn();
        printlnAdv("Sắp xếp nhân sự giảm dần");
        out.println();
        // main
        var dsNhanSu = new ArrayList<NhanSu>(mDSNhanSu);
        sortByCode(dsNhanSu);
        reverse(dsNhanSu);
        // shown
        for (var nhanSu : dsNhanSu) {
            nhanSu.xuatNhanSu();
            out.println();
        }
    }

    // Unit 10
    private static void unitJ() {
        // cap
        checkIn();
        printlnAdv("Giám đốc có nhiều cổ phần nhất");
        out.println();
        // main
        var dsTopShare = topShare(mDSNhanSu);
        // shown
        for (var topGiamDoc : dsTopShare) {
            topGiamDoc.xuatHoTen();
            topGiamDoc.xuatCoPhan();
            out.println();
        }
    }

    // Unit 11
    private static void unitK() {
        // cap
        checkIn();
        printlnAdv("Thu nhập giám đốc");
        out.println();
        // main
        var dsGiamDoc = allInGiamDoc(mDSNhanSu, mDoanhThuThang);
        // shown
        for (var topGiamDoc : dsGiamDoc) {
            topGiamDoc.xuatHoTen();
            topGiamDoc.xuatThuNhap();
            out.println();
        }
    }

    // Check in
    private static void checkIn() {
        out.println(YELLOW);
        printlnAdv(format("Công ty %s", toTitleCaseAdv(mTenCongTy)));
        printlnAdv(format("MST %s", mMaSoThue));
        printlnAdv(format("Doanh Thu Tháng %s", writePerfectDub(mDoanhThuThang)));
        out.println();
    }

    // Check out
    private static void checkOut() {
        if (credit() == 1) {
            run();
        }
    }
}
