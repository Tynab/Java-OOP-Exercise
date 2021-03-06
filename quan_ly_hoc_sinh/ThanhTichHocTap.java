package quan_ly_hoc_sinh;

import static java.lang.String.*;
import static yan_service.YANService.*;

public class ThanhTichHocTap {
    // #region Fields
    private TheoKy hocKy1;
    private TheoKy hocKy2;
    private String hanhKiemCN;
    private double diemTrungBinhCN;
    private String xepLoaiCN;
    // #endregion

    // #region Methods
    public void xetHanhKiemCN() {
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

    public void tinhDiemTrungBinhCN() {
        try {
            diemTrungBinhCN = (hocKy1.getDiemTrungBinhTCCM() + hocKy2.getDiemTrungBinhTCCM() * 2) / 3;
        } catch (Exception e) {
            diemTrungBinhCN = 0;
        }
    }

    public void xepLoaiHocLucCN() {
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

    public void nhapHocKy1() {
        hocKy1 = new TheoKy();
        hocKy1.nhapTheoKy(1);
    }

    public void nhapHocKy2() {
        hocKy2 = new TheoKy();
        hocKy2.nhapTheoKy(2);
    }

    public void nhapThanhTichHocTap() {
        nhapHocKy1();
        nhapHocKy2();
        xetHanhKiemCN();
        tinhDiemTrungBinhCN();
        xepLoaiHocLucCN();
    }

    public void xuatHocKy1() {
        hocKy1.xuatTheoKy(1);
    }

    public void xuatHocKy2() {
        hocKy2.xuatTheoKy(2);
    }

    public void xuatHanhKiemCN() {
        printlnAdv(format("Hạnh kiểm cả năm: %s", hanhKiemCN));
    }

    public void xuatDiemTrungBinhCN() {
        printlnAdv(format("Điểm trung bình cả năm: %.1f", diemTrungBinhCN));
    }

    public void xuatXepLoaiHocLucCN() {
        printlnAdv(format("Xếp loại học lực cả năm: %s", xepLoaiCN));
    }

    public void xuatThanhTichHocTap() {
        xuatHocKy1();
        xuatHocKy2();
        xuatHanhKiemCN();
        xuatDiemTrungBinhCN();
        xuatXepLoaiHocLucCN();
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
