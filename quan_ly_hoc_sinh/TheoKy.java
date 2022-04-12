package quan_ly_hoc_sinh;

import static java.lang.String.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

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
    private final DiemTungMon[] _diemTungMons = {
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
    private final String[] _monHocs = {
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
    public void TinhDiemTrungBinhTCCM() {
        try {
            for (int i = 0; i < _diemTungMons.length; i++) {
                var dtbMon = _monHocs[i].equals("Toán") || _monHocs[i].equals("Văn")
                        ? _diemTungMons[i].getDiemTrungBinhMon() * 2
                        : _diemTungMons[i].getDiemTrungBinhMon();
                diemTrungBinhTCCM += dtbMon;
            }
            diemTrungBinhTCCM /= (_diemTungMons.length + 2);
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

    public void NhapHanhKiem(int hocKy) {
        PrintlnAdv(RESET, format("Hạnh kiểm học kỳ %d", hocKy));
        PrintlnAdv("1. Tốt       ");
        PrintlnAdv("2. Khá       ");
        PrintlnAdv("3. Trung Bình");
        PrintlnAdv("4. Yếu       ");
        PrintAdv("Chọn 1 trong các phương án trên: ");
        switch (NumLimit(1, 4)) {
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

    public void NhapDiemCacMon(int hocKy) {
        for (int i = 0; i < _diemTungMons.length; i++) {
            _diemTungMons[i] = new DiemTungMon();
            _diemTungMons[i].NhapDiemTungMon(_monHocs[i], hocKy);
        }
    }

    public void NhapTheoKy(int hocKy) {
        NhapHanhKiem(hocKy);
        NhapDiemCacMon(hocKy);
        TinhDiemTrungBinhTCCM();
        XepLoaiHocLuc();
    }

    public void XuatDiemCacMon(int hocKy) {
        for (int i = 0; i < _diemTungMons.length; i++) {
            PrintlnAdv(format("Điểm trung bình môn %s kỳ %d: %.1f", _monHocs[i], hocKy,
                    _diemTungMons[i].getDiemTrungBinhMon()));
        }
    }

    public void XuatHanhKiem(int hocKy) {
        PrintlnAdv(format("Hạnh kiểm kỳ %d: %s", hocKy, hanhKiem));
    }

    public void XuatXepLoai(int hocKy) {
        PrintlnAdv(format("Xếp loại học lực kỳ %d: %s", hocKy, xepLoai));
    }

    public void XuatDiemTrungBinhTCCM(int hocKy) {
        PrintlnAdv(format("Điểm trung bình các môn kỳ %d: %.1f", hocKy, diemTrungBinhTCCM));
    }

    public void XuatTheoKy(int hocKy) {
        XuatDiemCacMon(hocKy);
        XuatHanhKiem(hocKy);
        XuatDiemTrungBinhTCCM(hocKy);
        XuatXepLoai(hocKy);
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
