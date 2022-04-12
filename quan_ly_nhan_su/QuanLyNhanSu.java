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
            do {
                nhanSu.nhapMaNhanVien();
            } while (IsRegist(nhanSu.getMaNhanVien()));
            nhanSu.nhapNhanSu();
            _dsNhanSu.add(nhanSu);
        }
        // process
        CheckTeamLead();
        CountMemberTeam();
        // output
        out.print(CYAN);
        PrintlnAdv(" 1. Bổ nhiệm nhân viên làm trưởng phòng");
        PrintlnAdv(" 2. Thêm nhân sự                       ");
        PrintlnAdv(" 3. Xóa nhân sự                        ");
        PrintlnAdv(" 4. Xuất thông tin toàn bộ công ty     ");
        PrintlnAdv(" 5. Tính tổng lương toàn công ty       ");
        PrintlnAdv(" 6. Tìm thành viên có lương cao nhất   ");
        PrintlnAdv(" 7. Tìm trưởng phòng quản lý nhiều nhất");
        PrintlnAdv(" 8. Sắp xếp nhân sự theo tên           ");
        PrintlnAdv(" 9. Sắp xếp nhân giảm dần              ");
        PrintlnAdv("10. Tìm giám đốc có cổ phần nhiều nhất ");
        PrintlnAdv("11. Tính tổng thu nhập của mỗi giám đốc");
        PrintAdv("Chọn 1 trong các phương án trên: ");
        switch (NumLimit(1, 3)) {
            case 1: {
                UnitA();
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                UnitD();
                break;
            }
        }
        // ctrl
        CheckOut();
    }

    // Split user
    private static NhanSu SplitUser() {
        PrintlnAdv(RESET, "Vị trí trong công ty");
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

    // Check regist
    private static boolean IsRegist(String maNhanVien) {
        var is_success = false;
        for (var nhanSu : _dsNhanSu) {
            if (nhanSu.getMaNhanVien().equals(maNhanVien)) {
                PrintlnAdv(RED, "Mã nhân viên đã tồn tại!");
                is_success = true;
                break;
            }
        }
        return is_success;
    }

    // Check team leader
    private static void CheckTeamLead() {
        for (var nhanSu : _dsNhanSu) {
            if (nhanSu instanceof NhanVien) {
                var nhanVien = (NhanVien) nhanSu;
                var is_success = false;
                for (var truongPhong : _dsNhanSu) {
                    if (truongPhong instanceof TruongPhong
                            && nhanVien.getTenTruongPhong().equals(truongPhong.getHoTen())) {
                        is_success = true;
                        break;
                    }
                }
                if (!is_success) {
                    nhanVien.setTenTruongPhong("");
                }
            }
        }
    }

    // Count member in team
    private static void CountMemberTeam() {
        for (var nhanSu : _dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = ((TruongPhong) nhanSu);
                var count = 0;
                for (var nhanVien : _dsNhanSu) {
                    if (nhanVien instanceof NhanVien
                            && ((NhanVien) nhanVien).getTenTruongPhong().equals(truongPhong.getHoTen())) {
                        count++;
                    }
                }
                truongPhong.setSoThanhVien(count);
                truongPhong.tinhLuong();
            }
        }
    }

    // Find index by code user
    private static int FindIndexByCode(String maNhanVien) {
        var index = -1;
        for (var i = 0; i < _dsNhanSu.size(); i++) {
            if (_dsNhanSu.get(i).getMaNhanVien().equals(maNhanVien)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // NhanVien transform to TruongPhong
    private static TruongPhong NhanVienTransToTruongPhong(NhanSu nhanSu) {
        var truongPhong = new TruongPhong();
        truongPhong.setMaNhanVien(nhanSu.getMaNhanVien());
        truongPhong.setHoTen(nhanSu.getHoTen());
        truongPhong.setSoDienThoai(nhanSu.getSoDienThoai());
        truongPhong.setSoNgayLamViec(nhanSu.getSoNgayLamViec());
        truongPhong.setSoThanhVien(0);
        truongPhong.tinhLuong();
        return truongPhong;
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
            PrintlnAdv(RESET, "Danh sách nhân viên");
            for (var i = 0; i < max; i++) {
                var nhanVien = dsNhanVien.get(i);
                PrintlnAdv(format("%d. %s (%s)", i + 1, nhanVien.getHoTen(), nhanVien.getMaNhanVien()));
            }
            PrintAdv("Chọn 1 trong các phương án trên: ");
            // replace
            var index = FindIndexByCode(dsNhanVien.get(NumLimit(1, max) - 1).getMaNhanVien());
            _dsNhanSu.add(index, NhanVienTransToTruongPhong(_dsNhanSu.get(index)));
            _dsNhanSu.remove(index + 1);
            CountMemberTeam();
            UnitD();
        } else {
            out.println(YELLOW);
            PrintlnAdv("Công ty không có nhân viên nào!");
        }
    }

    // Unit 4
    private static void UnitD() {
        PrintlnAdv(YELLOW, format("Công ty %s", ToTitleCaseAdv(_tenCongTy)));
        PrintlnAdv(format("MST %s", _maSoThue));
        PrintlnAdv(format("Doanh Thu Tháng %s", WritePerfectDub(_doanhThuThang)));
        out.println();
        for (var nhanSu : _dsNhanSu) {
            nhanSu.xuatNhanSu();
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
