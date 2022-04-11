package quan_ly_hoc_sinh;

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
                        hanhKiemCN = null;
                        break;
                    }
                }
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
                        hanhKiemCN = null;
                        break;
                    }
                }
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
                        hanhKiemCN = null;
                        break;
                    }
                }
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
                        hanhKiemCN = null;
                        break;
                    }
                }
            }
            default: {
                hanhKiemCN = null;
                break;
            }
        }
    }

    public void TinhDiemTrungBinhCN() {
        try {
            diemTrungBinhCN = (double) (hocKy1.getDiemTrungBinhTCCM() + hocKy2.getDiemTrungBinhTCCM() * 2) / 3;
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
