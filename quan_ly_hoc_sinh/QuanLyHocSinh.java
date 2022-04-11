package quan_ly_hoc_sinh;

import java.util.Scanner;

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
    private static final Scanner _scan = new Scanner(in);

    // Main
    private static void Main() {
        // input
        out.println();
        PrintAdv(GREEN, "Nhập vào số học sinh: ", RESET);
        var n = NumLimit(1, MAX_VALUE);
        var hocSinh = new HocSinh[n];
        for (var i = 0; i < n; i++) {
            PrintAdv(CYAN, format("Học sinh thứ %d", i + 1));
            out.println();
            hocSinh[i] = CreateNewStudent();
        }
        // output
        out.println(YELLOW);
        for (var i = 0; i < n; i++) {
            PrintAdv(format("%s", ToUpperCaseAdv(hocSinh[i].getThongTinCaNhan().getHoTen())));
            out.println();
            PrintAdv("Học Kỳ 1");
            out.println();
            PrintAdv(format("Hạnh kiểm: %s", hocSinh[i].getThanhTichHocTap().getHocKy1().getHanhKiem()));
            out.println();
            PrintAdv(format("Điểm trung bình các môn: %s",
                    WritePerfectDub(hocSinh[i].getThanhTichHocTap().getHocKy1().getDiemTrungBinhTCCM())));
            out.println();
            PrintAdv(format("Xếp loại: %s", hocSinh[i].getThanhTichHocTap().getHocKy1().getXepLoai()));
            out.println();
            PrintAdv("Học Kỳ 2");
            out.println();
            PrintAdv(format("Hạnh kiểm: %s", hocSinh[i].getThanhTichHocTap().getHocKy2().getHanhKiem()));
            out.println();
            PrintAdv(format("Điểm trung bình các môn: %s",
                    WritePerfectDub(hocSinh[i].getThanhTichHocTap().getHocKy2().getDiemTrungBinhTCCM())));
            out.println();
            PrintAdv(format("Xếp loại: %s", hocSinh[i].getThanhTichHocTap().getHocKy2().getXepLoai()));
            out.println();
            PrintAdv("Cả Năm");
            out.println();
            PrintAdv(format("Hạnh kiểm: %s", hocSinh[i].getThanhTichHocTap().getHanhKiemCN()));
            out.println();
            PrintAdv(format("Điểm trung bình các môn: %s",
                    WritePerfectDub(hocSinh[i].getThanhTichHocTap().getDiemTrungBinhCN())));
            out.println();
            PrintAdv(format("Xếp loại: %s", hocSinh[i].getThanhTichHocTap().getXepLoaiCN()));
            out.println();
        }
        out.println();
        // ctrl
        CheckOut();
    }

    // Create a new student
    private static HocSinh CreateNewStudent() {
        var hocSinh = new HocSinh();
        PrintAdv(GREEN, "Mã học sinh: ", RESET);
        hocSinh.setMaHocSinh(_scan.nextLine());
        // thông tin cá nhân
        var ttcn = new ThongTinCaNhan();
        PrintAdv(GREEN, "Họ tên: ", RESET);
        ttcn.setHoTen(_scan.nextLine());
        PrintAdv(GREEN, "Giới tính: ", RESET);
        ttcn.setGioiTinh(_scan.nextLine());
        PrintAdv(GREEN, "Ngày sinh (dd/mm/yyyy): ", RESET);
        ttcn.setNgaySinh(ScanDate("dd/MM/yyyy"));
        PrintAdv(GREEN, "Nơi sinh: ", RESET);
        ttcn.setNoiSinh(_scan.nextLine());
        PrintAdv(GREEN, "Nơi ở hiện tại: ", RESET);
        ttcn.setNoiOHienTai(_scan.nextLine());
        PrintAdv(GREEN, "Quốc tịch: ", RESET);
        ttcn.setQuocTich(_scan.nextLine());
        PrintAdv(GREEN, "Dân tộc: ", RESET);
        ttcn.setDanToc(_scan.nextLine());
        PrintAdv(GREEN, "Tôn giáo: ", RESET);
        ttcn.setTonGiao(_scan.nextLine());
        PrintAdv(GREEN, "Số điện thoại: ", RESET);
        ttcn.setSoDienThoai(_scan.nextLine());
        PrintAdv(GREEN, "Liên hệ khẩn cấp: ", RESET);
        ttcn.setLienHeKhanCap(_scan.nextLine());
        PrintAdv(GREEN, "Thư điện tử: ", RESET);
        ttcn.setThuDienTu(_scan.nextLine());
        hocSinh.setThongTinCaNhan(ttcn);
        // thông tin cơ bản
        var ttcb = new ThongTinCoBan();
        PrintAdv(GREEN, "Tên trường: ", RESET);
        ttcb.setTenTruong(_scan.nextLine());
        PrintAdv(GREEN, "Tên ban: ", RESET);
        ttcb.setTenBan(_scan.nextLine());
        PrintAdv(GREEN, "Tên khối: ", RESET);
        ttcb.setTenKhoi(_scan.nextLine());
        PrintAdv(GREEN, "Tên lớp: ", RESET);
        ttcb.setTenLop(_scan.nextLine());
        PrintAdv(GREEN, "Tham gia hoạt động: ", RESET);
        ttcb.setThamGiaHoatDong(_scan.nextLine());
        var bhyt = new BaoHiemYTe();
        PrintAdv(GREEN, "Số phiếu BHYT: ", RESET);
        bhyt.setSoPhieu(_scan.nextLine());
        PrintAdv(GREEN, "Ngày cấp BHYT (dd/mm/yyyy): ", RESET);
        bhyt.setNgayCap(ScanDate("dd/mm/yyyy"));
        PrintAdv(GREEN, "Tên bệnh viện đăng ký BHYT: ", RESET);
        bhyt.setTenBVDK(_scan.nextLine());
        PrintAdv(GREEN, "BHYT có giá trị từ ngày (dd/mm/yyyy): ", RESET);
        bhyt.setTuNgay(ScanDate("dd/mm/yyyy"));
        PrintAdv(GREEN, "BHYT có giá trị đến ngày (dd/mm/yyyy): ", RESET);
        bhyt.setDenNgay(ScanDate("dd/mm/yyyy"));
        ttcb.setBaoHiemYTe(bhyt);
        hocSinh.setThongTinCoBan(ttcb);
        // thành tích học tập
        var ttht = new ThanhTichHocTap();
        var hk = new TheoKy[2];
        for (var i = 0; i < 2; i++) {
            hk[i] = new TheoKy();
            PrintAdv(GREEN, format("Hạnh kiểm học kỳ %d: ", i + 1), RESET);
            hk[i].setHanhKiem(_scan.nextLine());
            var mToan = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Toán kỳ %d: ", i + 1), RESET);
            mToan.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Toán kỳ %d: ", i + 1), RESET);
            mToan.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Toán giữa kỳ %d: ", i + 1), RESET);
            mToan.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Toán cuối kỳ %d: ", i + 1), RESET);
            mToan.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonToan(mToan);
            var mLy = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Lý kỳ %d: ", i + 1), RESET);
            mLy.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Lý kỳ %d: ", i + 1), RESET);
            mLy.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Lý giữa kỳ %d: ", i + 1), RESET);
            mLy.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Lý cuối kỳ %d: ", i + 1), RESET);
            mLy.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonLy(mLy);
            var mHoa = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Hóa kỳ %d: ", i + 1), RESET);
            mHoa.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Hóa kỳ %d: ", i + 1), RESET);
            mHoa.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Hóa giữa kỳ %d: ", i + 1), RESET);
            mHoa.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Hóa cuối kỳ %d: ", i + 1), RESET);
            mHoa.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonHoa(mHoa);
            var mSinh = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Sinh kỳ %d: ", i + 1), RESET);
            mSinh.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Sinh kỳ %d: ", i + 1), RESET);
            mSinh.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Sinh giữa kỳ %d: ", i + 1), RESET);
            mSinh.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Sinh cuối kỳ %d: ", i + 1), RESET);
            mSinh.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonSinh(mSinh);
            var mVan = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Văn kỳ %d: ", i + 1), RESET);
            mVan.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Văn kỳ %d: ", i + 1), RESET);
            mVan.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Văn giữa kỳ %d: ", i + 1), RESET);
            mVan.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Văn cuối kỳ %d: ", i + 1), RESET);
            mVan.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonVan(mVan);
            var mAnh = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Anh kỳ %d: ", i + 1), RESET);
            mAnh.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Anh kỳ %d: ", i + 1), RESET);
            mAnh.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Anh giữa kỳ %d: ", i + 1), RESET);
            mAnh.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Anh cuối kỳ %d: ", i + 1), RESET);
            mAnh.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonAnh(mAnh);
            var mSu = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Sử kỳ %d: ", i + 1), RESET);
            mSu.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Sử kỳ %d: ", i + 1), RESET);
            mSu.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Sử giữa kỳ %d: ", i + 1), RESET);
            mSu.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Sử cuối kỳ %d: ", i + 1), RESET);
            mSu.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonSu(mSu);
            var mDia = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Địa kỳ %d: ", i + 1), RESET);
            mDia.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Địa kỳ %d: ", i + 1), RESET);
            mDia.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Địa giữa kỳ %d: ", i + 1), RESET);
            mDia.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Địa cuối kỳ %d: ", i + 1), RESET);
            mDia.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonDia(mDia);
            var mTin = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Tin kỳ %d: ", i + 1), RESET);
            mTin.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Tin kỳ %d: ", i + 1), RESET);
            mTin.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Tin giữa kỳ %d: ", i + 1), RESET);
            mTin.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Tin cuối kỳ %d: ", i + 1), RESET);
            mTin.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonTin(mTin);
            var mCN = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Công Nghệ kỳ %d: ", i + 1), RESET);
            mCN.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Công Nghệ kỳ %d: ", i + 1), RESET);
            mCN.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Công Nghệ giữa kỳ %d: ", i + 1), RESET);
            mCN.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Công Nghệ cuối kỳ %d: ", i + 1), RESET);
            mCN.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonCongNghe(mCN);
            var mGDCD = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Giáo Dục Công Dân kỳ %d: ", i + 1), RESET);
            mGDCD.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Giáo Dục Công Dân kỳ %d: ", i + 1), RESET);
            mGDCD.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Giáo Dục Công Dân giữa kỳ %d: ", i + 1), RESET);
            mGDCD.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Giáo Dục Công Dân cuối kỳ %d: ", i + 1), RESET);
            mGDCD.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonGDCD(mGDCD);
            var mTD = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Thể Dục kỳ %d: ", i + 1), RESET);
            mTD.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Thể Dục kỳ %d: ", i + 1), RESET);
            mTD.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Thể Dục giữa kỳ %d: ", i + 1), RESET);
            mTD.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Thể Dục cuối kỳ %d: ", i + 1), RESET);
            mTD.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonTheDuc(mTD);
            var mQP = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Quốc Phòng kỳ %d: ", i + 1), RESET);
            mQP.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Quốc Phòng kỳ %d: ", i + 1), RESET);
            mQP.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Quốc Phòng giữa kỳ %d: ", i + 1), RESET);
            mQP.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Quốc Phòng cuối kỳ %d: ", i + 1), RESET);
            mQP.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonQuocPhong(mQP);
            var mNT = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Nghệ Thuật kỳ %d: ", i + 1), RESET);
            mNT.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Nghệ Thuật kỳ %d: ", i + 1), RESET);
            mNT.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Nghệ Thuật giữa kỳ %d: ", i + 1), RESET);
            mNT.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Nghệ Thuật cuối kỳ %d: ", i + 1), RESET);
            mNT.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonNgheThuat(mNT);
            var mTC = new DiemTungMon();
            PrintAdv(GREEN, format("Điểm trả bài Tự Chọn kỳ %d: ", i + 1), RESET);
            mTC.setDiemKTMieng(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm 15' Tự Chọn kỳ %d: ", i + 1), RESET);
            mTC.setDiemKT15Phut(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Tự Chọn giữa kỳ %d: ", i + 1), RESET);
            mTC.setDiemKTGiuaKy(NumLimit(0d, 10d));
            PrintAdv(GREEN, format("Điểm Tự Chọn cuối kỳ %d: ", i + 1), RESET);
            mTC.setDiemKTCuoiKy(NumLimit(0d, 10d));
            hk[i].setMonTuChon(mTC);
            hk[i].TinhDiemTrungBinhTCCM();
            hk[i].XepLoaiHocLuc();
        }
        ttht.setHocKy1(hk[0]);
        ttht.setHocKy2(hk[1]);
        ttht.XetHanhKiemCN();
        ttht.TinhDiemTrungBinhCN();
        ttht.XepLoaiHocLucCN();
        hocSinh.setThanhTichHocTap(ttht);
        return hocSinh;
    }

    // Check out
    private static void CheckOut() {
        if (Credit() == 1) {
            Main();
        }
    }
}
