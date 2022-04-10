package quan_ly_hoc_sinh;

public class ThanhTichHocTap extends HocSinh {
    // #region Fields
    private CacYeuToThanhTich ky1 = new CacYeuToThanhTich();
    private CacYeuToThanhTich ky2 = new CacYeuToThanhTich();
    private CacYeuToThanhTich caNam = new CacYeuToThanhTich();
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
        caNam.setHanhKiem(hanhKiem);
        setCaNam(caNam);
    }

    public void TinhDiemTrungBinh() {
        try {
            trungBinh = (ky1.getTrungBinh() + ky2.getTrungBinh()) / 2;
        } catch (Exception e) {
            trungBinh = 0;
        }
        caNam.setTrungBinh(trungBinh);
        setCaNam(caNam);
    }
    // #endregion

    // #region Properties
    public CacYeuToThanhTich getKy1() {
        return ky1;
    }

    public void setKy1(CacYeuToThanhTich ky1) {
        this.ky1 = ky1;
    }

    public CacYeuToThanhTich getKy2() {
        return ky2;
    }

    public void setKy2(CacYeuToThanhTich ky2) {
        this.ky2 = ky2;
    }

    public CacYeuToThanhTich getCaNam() {
        return caNam;
    }

    public void setCaNam(CacYeuToThanhTich caNam) {
        this.caNam = caNam;
    }
    // #endregion
}
