package quan_ly_hoc_sinh;

import static java.lang.String.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class TheoKy {
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
    private final DiemTungMon[] mDiemTungMons = {
            monToan,
            monLy,
            monHoa,
            monSinh,
            monVan,
            monAnh,
            monSu,
            monDia,
            monTin,
            monCongNghe,
            monGDCD,
            monTheDuc,
            monQuocPhong,
            monNgheThuat,
            monTuChon
    };
    private final String[] mMonHocs = {
            "Toán",
            "Lý",
            "Hóa",
            "Sinh",
            "Văn",
            "Anh",
            "Sử",
            "Địa",
            "Tin",
            "Công nghệ",
            "Giáo Dục Công Dân",
            "Thế Dục",
            "Quốc Phòng",
            "Nghệ Thuật",
            "Tự Chọn"
    };
    // #endregion

    // #region Methods
    public void tinhDiemTrungBinhTCCM() {
        try {
            for (int i = 0; i < mDiemTungMons.length; i++) {
                var dtbMon = mMonHocs[i].equals("Toán") || mMonHocs[i].equals("Văn")
                        ? mDiemTungMons[i].getDiemTrungBinhMon() * 2
                        : mDiemTungMons[i].getDiemTrungBinhMon();
                diemTrungBinhTCCM += dtbMon;
            }
            diemTrungBinhTCCM /= (mDiemTungMons.length + 2);
        } catch (Exception e) {
            diemTrungBinhTCCM = 0;
        }
    }

    public void xepLoaiHocLuc() {
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

    public void nhapHanhKiem(int hocKy) {
        printlnAdv(RESET, format("Hạnh kiểm học kỳ %d", hocKy));
        printlnAdv("1. Tốt       ");
        printlnAdv("2. Khá       ");
        printlnAdv("3. Trung Bình");
        printlnAdv("4. Yếu       ");
        printAdv("Chọn 1 trong các phương án trên: ");
        switch (numLimit(1, 4)) {
            case 1: {
                hanhKiem = "Tốt";
                break;
            }
            case 2: {
                hanhKiem = "Khá";
                break;
            }
            case 3: {
                hanhKiem = "Trung Bình";
                break;
            }
            case 4: {
                hanhKiem = "Yếu";
                break;
            }
        }
    }

    public void nhapDiemCacMon(int hocKy) {
        for (int i = 0; i < mDiemTungMons.length; i++) {
            mDiemTungMons[i] = new DiemTungMon();
            mDiemTungMons[i].nhapDiemTungMon(mMonHocs[i], hocKy);
        }
    }

    public void nhapTheoKy(int hocKy) {
        nhapHanhKiem(hocKy);
        nhapDiemCacMon(hocKy);
        tinhDiemTrungBinhTCCM();
        xepLoaiHocLuc();
    }

    public void xuatDiemCacMon(int hocKy) {
        for (int i = 0; i < mDiemTungMons.length; i++) {
            printlnAdv(format("Điểm trung bình môn %s kỳ %d: %.1f", mMonHocs[i], hocKy,
                    mDiemTungMons[i].getDiemTrungBinhMon()));
        }
    }

    public void xuatHanhKiem(int hocKy) {
        printlnAdv(format("Hạnh kiểm kỳ %d: %s", hocKy, hanhKiem));
    }

    public void xuatXepLoai(int hocKy) {
        printlnAdv(format("Xếp loại học lực kỳ %d: %s", hocKy, xepLoai));
    }

    public void xuatDiemTrungBinhTCCM(int hocKy) {
        printlnAdv(format("Điểm trung bình các môn kỳ %d: %.1f", hocKy, diemTrungBinhTCCM));
    }

    public void xuatTheoKy(int hocKy) {
        xuatDiemCacMon(hocKy);
        xuatHanhKiem(hocKy);
        xuatDiemTrungBinhTCCM(hocKy);
        xuatXepLoai(hocKy);
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
