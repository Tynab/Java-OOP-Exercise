package quan_ly_hoc_sinh;

public class ThanhTichHocTap extends HocSinh {
    // #region Fields
    private TheoKy ky1 = new TheoKy();
    private TheoKy ky2 = new TheoKy();
    private String hanhKiem;
    private double trungBinh;
    private String xepLoai;
    // #endregion

    // #region Methods
    public void XetHanhKiem() {
        var hk1 = ky1.getHanhKiem();
        var hk2 = ky2.getHanhKiem();
        switch (hk1) {
            case "Tốt": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiem = "Tốt";
                        break;
                    }
                    case "Khá": {
                        hanhKiem = "Khá"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiem = "Khá";
                        break;
                    }
                    case "Yếu": {
                        hanhKiem = "Trung Bình";
                        break;
                    }
                    default: {
                        hanhKiem = null;
                        break;
                    }
                }
            }
            case "Khá": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiem = "Tốt"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Khá": {
                        hanhKiem = "Khá";
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiem = "Trung Bình"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Yếu": {
                        hanhKiem = "Trung Bình";
                        break;
                    }
                    default: {
                        hanhKiem = null;
                        break;
                    }
                }
            }
            case "Trung Bình": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiem = "Khá";
                        break;
                    }
                    case "Khá": {
                        hanhKiem = "Khá"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiem = "Trung Bình";
                        break;
                    }
                    case "Yếu": {
                        hanhKiem = "Yếu"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    default: {
                        hanhKiem = null;
                        break;
                    }
                }
            }
            case "Yếu": {
                switch (hk2) {
                    case "Tốt": {
                        hanhKiem = "Khá";
                        break;
                    }
                    case "Khá": {
                        hanhKiem = "Trung Bình";
                        break;
                    }
                    case "Trung Bình": {
                        hanhKiem = "Trung Bình"; // kỳ 2 quyết định cả năm
                        break;
                    }
                    case "Yếu": {
                        hanhKiem = "Yếu";
                        break;
                    }
                    default: {
                        hanhKiem = null;
                        break;
                    }
                }
            }
            default: {
                hanhKiem = null;
                break;
            }
        }
    }

    public void TinhDiemTrungBinh() {
        try {
            trungBinh = (ky1.getTrungBinh() + ky2.getTrungBinh()) / 2;
        } catch (Exception e) {
            trungBinh = 0;
        }
    }
    // #endregion

    // #region Properties
    public TheoKy getKy1() {
        return ky1;
    }

    public void setKy1(TheoKy ky1) {
        this.ky1 = ky1;
    }

    public TheoKy getKy2() {
        return ky2;
    }

    public void setKy2(TheoKy ky2) {
        this.ky2 = ky2;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    // public void setHanhKiem(String hanhKiem) {
    // this.hanhKiem = hanhKiem;
    // }

    public double getTrungBinh() {
        return trungBinh;
    }

    // public void setTrungBinh(double trungBinh) {
    // this.trungBinh = trungBinh;
    // }

    public String getXepLoai() {
        return xepLoai;
    }

    // public void setXepLoai(String xepLoai) {
    // this.xepLoai = xepLoai;
    // }
    // #endregion
}
