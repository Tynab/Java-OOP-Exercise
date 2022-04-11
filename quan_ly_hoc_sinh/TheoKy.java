package quan_ly_hoc_sinh;

public class TheoKy extends ThanhTichHocTap {
    // #region Fiedlds
    private DiemTungMon monToan = new DiemTungMon();
    private DiemTungMon monLy = new DiemTungMon();
    private DiemTungMon monHoa = new DiemTungMon();
    private DiemTungMon monSinh = new DiemTungMon();
    private DiemTungMon monVan = new DiemTungMon();
    private DiemTungMon monAnh = new DiemTungMon();
    private DiemTungMon monSu = new DiemTungMon();
    private DiemTungMon monDia = new DiemTungMon();
    private DiemTungMon monTin = new DiemTungMon();
    private DiemTungMon monCongNghe = new DiemTungMon();
    private DiemTungMon monGDCD = new DiemTungMon();
    private DiemTungMon monTheDuc = new DiemTungMon();
    private DiemTungMon monQuocPhong = new DiemTungMon();
    private DiemTungMon monNgheThuat = new DiemTungMon();
    private DiemTungMon monTuChon = new DiemTungMon();
    private String hanhKiem;
    private double diemTrungBinhCacMon;
    private String xepLoai;
    // #endregion

    // #region Methods
    public void TinhDiemTrungBinhCacMon() {
        try {
            diemTrungBinhCacMon = (monToan.getDiemTrungBinh() * 2 + monLy.getDiemTrungBinh() + monHoa.getDiemTrungBinh()
                    + monSinh.getDiemTrungBinh() + monVan.getDiemTrungBinh() * 2 + monAnh.getDiemTrungBinh()
                    + monSu.getDiemTrungBinh() + monDia.getDiemTrungBinh() + monTin.getDiemTrungBinh()
                    + monCongNghe.getDiemTrungBinh() + monGDCD.getDiemTrungBinh() + monTheDuc.getDiemTrungBinh()
                    + monQuocPhong.getDiemTrungBinh() + monNgheThuat.getDiemTrungBinh() + monTuChon.getDiemTrungBinh())
                    / 17;
        } catch (Exception e) {
            diemTrungBinhCacMon = 0;
        }
    }

    public void XepLoaiHocLuc() {
        if (diemTrungBinhCacMon >= 9) {
            xepLoai = "Xuất Sắc";
        } else if (diemTrungBinhCacMon >= 8) {
            xepLoai = "Giỏi";
        } else if (diemTrungBinhCacMon >= 7) {
            xepLoai = "Khá";
        } else if (diemTrungBinhCacMon >= 5) {
            xepLoai = "Trung Bình";
        } else if (diemTrungBinhCacMon >= 3) {
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

    public double getDiemTrungBinhCacMon() {
        return diemTrungBinhCacMon;
    }

    // public void setDiemTrungBinhCacMon(double diemTrungBinhCacMon) {
    // this.diemTrungBinhCacMon = diemTrungBinhCacMon;
    // }

    public String getXepLoai() {
        return xepLoai;
    }

    // public void setXepLoai(String xepLoai) {
    // this.xepLoai = xepLoai;
    // }
    // #endregion
}
