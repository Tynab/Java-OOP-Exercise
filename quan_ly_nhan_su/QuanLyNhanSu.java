package quan_ly_nhan_su;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.*;
import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static quan_ly_nhan_su.MethodScript.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        PrintlnAdv("Bài Tập Quản Lý Nhân Sự");
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
            _dsNhanSu.add(AddNewbie(_dsNhanSu));
        }
        // process
        CheckTeamLead(_dsNhanSu);
        MemberEachTeam(_dsNhanSu);
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
        // output
        out.println(CYAN);
        PrintlnAdv(" 1. Bổ nhiệm nhân viên làm trưởng phòng");
        PrintlnAdv(" 2. Thêm nhân sự                       ");
        PrintlnAdv(" 3. Xóa nhân sự                        ");
        PrintlnAdv(" 4. Xuất thông tin toàn bộ công ty     ");
        PrintlnAdv(" 5. Tính tổng lương toàn công ty       ");
        PrintlnAdv(" 6. Tìm thành viên có lương cao nhất   ");
        PrintlnAdv(" 7. Tìm trưởng phòng quản lý nhiều nhất");
        PrintlnAdv(" 8. Sắp xếp nhân sự theo tên           ");
        PrintlnAdv(" 9. Sắp xếp nhân sự giảm dần           ");
        PrintlnAdv("10. Tìm giám đốc có cổ phần nhiều nhất ");
        PrintlnAdv("11. Tính tổng thu nhập của mỗi giám đốc");
        PrintAdv("Chọn 1 trong các phương án trên: ");
        out.print(RESET);
        switch (NumLimit(1, 11)) {
            case 1: {
                UnitA();
                break;
            }
            case 2: {
                UnitB();
                break;
            }
            case 3: {
                UnitC();
                break;
            }
            case 4: {
                UnitD();
                break;
            }
            case 5: {
                UnitE();
                break;
            }
            case 6: {
                UnitF();
                break;
            }
            case 7: {
                UnitG();
                break;
            }
            case 8: {
                UnitH();
                break;
            }
            case 9: {
                UnitI();
                break;
            }
            case 10: {
                UnitJ();
                break;
            }
            case 11: {
                UnitK();
                break;
            }
        }
        // ctrl
        CheckOut();
    }

    // Unit 1
    private static void UnitA() {
        // split nhanvien
        List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
        for (var nhanSu : _dsNhanSu) {
            if (nhanSu instanceof NhanVien) {
                dsNhanVien.add((NhanVien) nhanSu);
            }
        }
        var max = dsNhanVien.size();
        if (max > 0) {
            // cap
            out.println(RESET);
            PrintlnAdv("Danh sách nhân viên");
            for (var i = 0; i < max; i++) {
                var nhanVien = dsNhanVien.get(i);
                PrintlnAdv(format("%d. %s (%s)", i + 1, nhanVien.getHoTen(), nhanVien.getMaNhanVien()));
            }
            PrintAdv("Chọn 1 trong các phương án trên: ");
            // main
            var index = FindIndexByCode(_dsNhanSu, dsNhanVien.get(NumLimit(1, max) - 1).getMaNhanVien());
            _dsNhanSu.add(index, NhanVienTransToTruongPhong(_dsNhanSu.get(index)));
            _dsNhanSu.remove(index + 1);
            // finish
            MemberEachTeam(_dsNhanSu);
            UnitD();
        } else {
            CheckIn();
            PrintlnAdv("Công ty không có nhân viên nào!");
            out.println();
        }
    }

    // Unit 2
    private static void UnitB() {
        // cap
        out.println(CYAN);
        PrintlnAdv("Thêm thành viên mới");
        // main
        _dsNhanSu.add(AddNewbie(_dsNhanSu));
        // finish
        MemberEachTeam(_dsNhanSu);
        UnitD();
    }

    // Unit 3
    private static void UnitC() {
        // cap
        PrintlnAdv(RESET, "Danh sách nhân viên");
        var max = _dsNhanSu.size();
        for (var i = 0; i < max; i++) {
            var nhanSu = _dsNhanSu.get(i);
            PrintlnAdv(format("%d. %s (%s)", i + 1, nhanSu.getHoTen(), nhanSu.getMaNhanVien()));
        }
        PrintAdv("Chọn 1 trong các phương án trên: ");
        // main
        var index = FindIndexByCode(_dsNhanSu, _dsNhanSu.get(NumLimit(1, max) - 1).getMaNhanVien());
        _dsNhanSu.remove(index);
        // finish
        CheckTeamLead(_dsNhanSu);
        MemberEachTeam(_dsNhanSu);
        UnitD();
    }

    // Unit 4
    private static void UnitD() {
        // cap
        CheckIn();
        // shown
        for (var nhanSu : _dsNhanSu) {
            nhanSu.xuatNhanSu();
            out.println();
        }
    }

    // Unit 5
    private static void UnitE() {
        // intro
        UnitD();
        // finish
        PrintlnAdv(format("Tổng lương toàn công ty: %,.0f", SumSalary(_dsNhanSu)));
        out.println();
    }

    // Unit 6
    private static void UnitF() {
        // cap
        CheckIn();
        PrintlnAdv("Thành viên lương cao nhất");
        out.println();
        // main
        var dsTopSalary = TopSalary(_dsNhanSu);
        // shown
        for (var topNhanSu : dsTopSalary) {
            topNhanSu.xuatHoTen();
            topNhanSu.xuatChucVu();
            topNhanSu.xuatLuongThang();
            out.println();
        }
    }

    // Unit 7
    private static void UnitG() {
        // cap
        CheckIn();
        PrintlnAdv("Trưởng phòng quản lý nhiều thành viên nhât");
        out.println();
        // main
        var dsTopTeam = TopTeam(_dsNhanSu);
        // shown
        for (var topTruongPhong : dsTopTeam) {
            topTruongPhong.xuatHoTen();
            topTruongPhong.xuatSoThanhVien();
            out.println();
        }
    }

    // Unit 8
    private static void UnitH() {
        // cap
        CheckIn();
        PrintlnAdv("Sắp xếp nhân sự theo tên");
        out.println();
        // main
        var dsNhanSu = new ArrayList<NhanSu>(_dsNhanSu);
        SortByName(dsNhanSu);
        // shown
        for (var nhanSu : dsNhanSu) {
            nhanSu.xuatNhanSu();
            out.println();
        }
    }

    // Unit 9
    private static void UnitI() {
        // cap
        CheckIn();
        PrintlnAdv("Sắp xếp nhân sự giảm dần");
        out.println();
        // main
        var dsNhanSu = new ArrayList<NhanSu>(_dsNhanSu);
        SortByCode(dsNhanSu);
        reverse(dsNhanSu);
        // shown
        for (var nhanSu : dsNhanSu) {
            nhanSu.xuatNhanSu();
            out.println();
        }
    }

    // Unit 10
    private static void UnitJ() {
        // cap
        CheckIn();
        PrintlnAdv("Giám đốc có nhiều cổ phần nhất");
        out.println();
        // main
        var dsTopShare = TopShare(_dsNhanSu);
        // shown
        for (var topGiamDoc : dsTopShare) {
            topGiamDoc.xuatHoTen();
            topGiamDoc.xuatCoPhan();
            out.println();
        }
    }

    // Unit 11
    private static void UnitK() {
        // cap
        CheckIn();
        PrintlnAdv("Thu nhập giám đốc");
        out.println();
        // main
        var dsGiamDoc = AllInGiamDoc(_dsNhanSu, _doanhThuThang);
        // shown
        for (var topGiamDoc : dsGiamDoc) {
            topGiamDoc.xuatHoTen();
            topGiamDoc.xuatThuNhap();
            out.println();
        }
    }

    // Check in
    private static void CheckIn() {
        out.println(YELLOW);
        PrintlnAdv(format("Công ty %s", ToTitleCaseAdv(_tenCongTy)));
        PrintlnAdv(format("MST %s", _maSoThue));
        PrintlnAdv(format("Doanh Thu Tháng %s", WritePerfectDub(_doanhThuThang)));
        out.println();
    }

    // Check out
    private static void CheckOut() {
        if (Credit() == 1) {
            Main();
        }
    }
}
