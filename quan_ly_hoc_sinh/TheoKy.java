package quan_ly_hoc_sinh;

public class TheoKy extends HocSinh {
    // #region Fiedlds
    private DiemTungMon monToan;
    private DiemTungMon monLy;
    private DiemTungMon monHoa;
    private DiemTungMon monSinh;
    private DiemTungMon monVan;
    private DiemTungMon monAnh;
    private DiemTungMon monSu;
    private DiemTungMon monDia;
    private DiemTungMon monTin;
    private DiemTungMon monCongNghe;
    private DiemTungMon monGDCD;
    private DiemTungMon monTheDuc;
    private DiemTungMon monQuocPhong;
    private DiemTungMon monNgheThuat;
    private DiemTungMon monTuChon;
    private String hanhKiem;
    private double diemTrungBinhTCCM;
    private String xepLoai;
    // #endregion

    // #region Methods
    public void TinhDiemTrungBinhTCCM() {
        try {
            diemTrungBinhTCCM = (monToan.getDiemTrungBinhMon() * 2 + monLy.getDiemTrungBinhMon()
                    + monHoa.getDiemTrungBinhMon() + monSinh.getDiemTrungBinhMon() + monVan.getDiemTrungBinhMon() * 2
                    + monAnh.getDiemTrungBinhMon() + monSu.getDiemTrungBinhMon() + monDia.getDiemTrungBinhMon()
                    + monTin.getDiemTrungBinhMon() + monCongNghe.getDiemTrungBinhMon() + monGDCD.getDiemTrungBinhMon()
                    + monTheDuc.getDiemTrungBinhMon() + monQuocPhong.getDiemTrungBinhMon()
                    + monNgheThuat.getDiemTrungBinhMon() + monTuChon.getDiemTrungBinhMon()) / 17;
        } catch (Exception e) {
            diemTrungBinhTCCM = 0;
        }
    }

    public void XepLoaiHocLuc() {
        if (diemTrungBinhTCCM >= 9) {
            xepLoai = "Xuất Sắc";
        } else if (diemTrungBinhTCCM >= 8) {
            xepLoai = "Giỏi";
        } else if (diemTrungBinhTCCM >= 7) {
            xepLoai = "Khá";
        } else if (diemTrungBinhTCCM >= 5) {
            xepLoai = "Trung Bình";
        } else if (diemTrungBinhTCCM >= 3) {
            xepLoai = "Yếu";
        } else {
            xepLoai = "Kém";
        }
    }
    // #endregion

    // #region Properties
    public DiemTungMon getMonToan() {
        return monToan;
    }

    public void setMonToan(DiemTungMon monToan) {
        this.monToan = monToan;
    }

    public DiemTungMon getMonLy() {
        return monLy;
    }

    public void setMonLy(DiemTungMon monLy) {
        this.monLy = monLy;
    }

    public DiemTungMon getMonHoa() {
        return monHoa;
    }

    public void setMonHoa(DiemTungMon monHoa) {
        this.monHoa = monHoa;
    }

    public DiemTungMon getMonSinh() {
        return monSinh;
    }

    public void setMonSinh(DiemTungMon monSinh) {
        this.monSinh = monSinh;
    }

    public DiemTungMon getMonVan() {
        return monVan;
    }

    public void setMonVan(DiemTungMon monVan) {
        this.monVan = monVan;
    }

    public DiemTungMon getMonAnh() {
        return monAnh;
    }

    public void setMonAnh(DiemTungMon monAnh) {
        this.monAnh = monAnh;
    }

    public DiemTungMon getMonSu() {
        return monSu;
    }

    public void setMonSu(DiemTungMon monSu) {
        this.monSu = monSu;
    }

    public DiemTungMon getMonDia() {
        return monDia;
    }

    public void setMonDia(DiemTungMon monDia) {
        this.monDia = monDia;
    }

    public DiemTungMon getMonTin() {
        return monTin;
    }

    public void setMonTin(DiemTungMon monTin) {
        this.monTin = monTin;
    }

    public DiemTungMon getMonCongNghe() {
        return monCongNghe;
    }

    public void setMonCongNghe(DiemTungMon monCongNghe) {
        this.monCongNghe = monCongNghe;
    }

    public DiemTungMon getMonGDCD() {
        return monGDCD;
    }

    public void setMonGDCD(DiemTungMon monGDCD) {
        this.monGDCD = monGDCD;
    }

    public DiemTungMon getMonTheDuc() {
        return monTheDuc;
    }

    public void setMonTheDuc(DiemTungMon monTheDuc) {
        this.monTheDuc = monTheDuc;
    }

    public DiemTungMon getMonQuocPhong() {
        return monQuocPhong;
    }

    public void setMonQuocPhong(DiemTungMon monQuocPhong) {
        this.monQuocPhong = monQuocPhong;
    }

    public DiemTungMon getMonNgheThuat() {
        return monNgheThuat;
    }

    public void setMonNgheThuat(DiemTungMon monNgheThuat) {
        this.monNgheThuat = monNgheThuat;
    }

    public DiemTungMon getMonTuChon() {
        return monTuChon;
    }

    public void setMonTuChon(DiemTungMon monTuChon) {
        this.monTuChon = monTuChon;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    public double getDiemTrungBinhTCCM() {
        return diemTrungBinhTCCM;
    }

    // public void setDiemTrungBinhTCCM(double diemTrungBinhTCCM) {
    // this.diemTrungBinhTCCM = diemTrungBinhTCCM;
    // }

    public String getXepLoai() {
        return xepLoai;
    }

    // public void setXepLoai(String xepLoai) {
    // this.xepLoai = xepLoai;
    // }
    // #endregion
}
