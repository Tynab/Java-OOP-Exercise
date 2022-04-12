package quan_ly_hoc_sinh;

import static java.lang.String.*;
import static yan_lib.YANMethod.*;

public class ThanhTichHocTap extends HocSinh {
    // #region Fields
    private TheoKy hocKy1;
    private TheoKy hocKy2;
    private String hanhKiemCN;
    private double diemTrungBinhCN;
    private String xepLoaiCN;
    // #endregion

    // #region Methods
    public void XetHanhKiemCN() {
        var hk1 = hocKy1.getHanhKiem();
        var hk2 = hocKy2.getHanhKiem();
        switch (hk1) {
            case "Tốt": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiemCN = "Tốt";
                        break;
                    }
                    case "Khá": {
                        hanhKiemCN = "Khá"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiemCN = "Khá";
                        break;
                    }
                    case "Yếu": {
                        hanhKiemCN = "Trung Bình";
                        break;
                    }
                    default: {
                        hanhKiemCN = "";
                        break;
                    }
                }
                break;
            }
            case "Khá": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiemCN = "Tốt"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Khá": {
                        hanhKiemCN = "Khá";
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiemCN = "Trung Bình"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Yếu": {
                        hanhKiemCN = "Trung Bình";
                        break;
                    }
                    default: {
                        hanhKiemCN = "";
                        break;
                    }
                }
                break;
            }
            case "Trung Bình": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiemCN = "Khá";
                        break;
                    }
                    case "Khá": {
                        hanhKiemCN = "Khá"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiemCN = "Trung Bình";
                        break;
                    }
                    case "Yếu": {
                        hanhKiemCN = "Yếu"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    default: {
                        hanhKiemCN = "";
                        break;
                    }
                }
                break;
            }
            case "Yếu": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiemCN = "Khá";
                        break;
                    }
                    case "Khá": {
                        hanhKiemCN = "Trung Bình";
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiemCN = "Trung Bình"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Yếu": {
                        hanhKiemCN = "Yếu";
                        break;
                    }
                    default: {
                        hanhKiemCN = "";
                        break;
                    }
                }
                break;
            }
            default: {
                hanhKiemCN = "";
                break;
            }
        }
    }

    public void TinhDiemTrungBinhCN() {
        try {
            diemTrungBinhCN = (hocKy1.getDiemTrungBinhTCCM() + hocKy2.getDiemTrungBinhTCCM() * 2) / 3;
        } catch (Exception e) {
            diemTrungBinhCN = 0;
        }
    }

    public void XepLoaiHocLucCN() {
        if (diemTrungBinhCN >= 9) {
            xepLoaiCN = "Xuất Sắc";
        } else if (diemTrungBinhCN >= 8) {
            xepLoaiCN = "Giỏi";
        } else if (diemTrungBinhCN >= 7) {
            xepLoaiCN = "Khá";
        } else if (diemTrungBinhCN >= 5) {
            xepLoaiCN = "Trung Bình";
        } else if (diemTrungBinhCN >= 3) {
            xepLoaiCN = "Yếu";
        } else {
            xepLoaiCN = "Kém";
        }
    }

    public void NhapHocKy1() {
        hocKy1 = new TheoKy();
        hocKy1.NhapTheoKy(1);
    }

    public void NhapHocKy2() {
        hocKy2 = new TheoKy();
        hocKy2.NhapTheoKy(2);
    }

    public void NhapThanhTichHocTap() {
        NhapHocKy1();
        NhapHocKy2();
        XetHanhKiemCN();
        TinhDiemTrungBinhCN();
        XepLoaiHocLucCN();
    }

    public void XuatHocKy1() {
        hocKy1.XuatTheoKy(1);
    }

    public void XuatHocKy2() {
        hocKy2.XuatTheoKy(2);
    }

    public void XuatHanhKiemCN() {
        PrintlnAdv(format("Hạnh kiểm cả năm: %s", hanhKiemCN));
    }

    public void XuatDiemTrungBinhCN() {
        PrintlnAdv(format("Điểm trung bình cả năm: %.1f", diemTrungBinhCN));
    }

    public void XuatXepLoaiHocLucCN() {
        PrintlnAdv(format("Xếp loại học lực cả năm: %s", xepLoaiCN));
    }

    public void XuatCN() {
        XuatHanhKiemCN();
        XuatDiemTrungBinhCN();
        XuatXepLoaiHocLucCN();
    }

    public void XuatThanhTichHocTap() {
        XuatHocKy1();
        XuatHocKy2();
        XuatCN();
    }
    // #endregion

    // #region Properties
    public TheoKy getHocKy1() {
        return hocKy1;
    }

    public void setHocKy1(TheoKy hocKy1) {
        this.hocKy1 = hocKy1;
    }

    public TheoKy getHocKy2() {
        return hocKy2;
    }

    public void setHocKy2(TheoKy hocKy2) {
        this.hocKy2 = hocKy2;
    }

    public String getHanhKiemCN() {
        return hanhKiemCN;
    }

    // public void setHanhKiemCN(String hanhKiemCN) {
    // this.hanhKiemCN = hanhKiemCN;
    // }

    public double getDiemTrungBinhCN() {
        return diemTrungBinhCN;
    }

    // public void setDiemTrungBinhCN(double diemTrungBinhCN) {
    // this.diemTrungBinhCN = diemTrungBinhCN;
    // }

    public String getXepLoaiCN() {
        return xepLoaiCN;
    }

    // public void setXepLoaiCN(String xepLoaiCN) {
    // this.xepLoaiCN = xepLoaiCN;
    // }
    // #endregion
}
