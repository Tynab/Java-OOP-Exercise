package quan_ly_hoc_sinh;

import java.util.Date;
import java.util.Scanner;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class ThongTinCaNhan {
    // #region Fields
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String noiSinh;
    private String noiOHienTai;
    private String quocTich;
    private String danToc;
    private String tonGiao;
    private String soDienThoai;
    private String lienHeKhanCap;
    private String thuDienTu;
    private final Scanner _scan = new Scanner(in);
    // #endregion

    // #region Methods
    public void NhapHoTen() {
        PrintAdv(GREEN, "Họ tên: ", RESET);
        hoTen = _scan.nextLine();
    }

    public void NhapGioiTinh() {
        PrintAdv(GREEN, "Giới tính: ", RESET);
        gioiTinh = _scan.nextLine();
    }

    public void NhapNgaySinh() {
        PrintAdv(GREEN, "Ngày sinh (dd/MM/yyyy): ", RESET);
        ngaySinh = ScanDate("dd/MM/yyyy");
    }

    public void NhapNoiSinh() {
        PrintAdv(GREEN, "Nơi sinh: ", RESET);
        noiSinh = _scan.nextLine();
    }

    public void NhapNoiOHienTai() {
        PrintAdv(GREEN, "Nơi ở hiện tại: ", RESET);
        noiOHienTai = _scan.nextLine();
    }

    public void NhapQuocTich() {
        PrintAdv(GREEN, "Quốc tịch: ", RESET);
        quocTich = _scan.nextLine();
    }

    public void NhapDanToc() {
        PrintAdv(GREEN, "Dân tộc: ", RESET);
        danToc = _scan.nextLine();
    }

    public void NhapTonGiao() {
        PrintAdv(GREEN, "Tôn giáo: ", RESET);
        tonGiao = _scan.nextLine();
    }

    public void NhapSoDienThoai() {
        PrintAdv(GREEN, "Số điện thoại: ", RESET);
        soDienThoai = _scan.nextLine();
    }

    public void NhapLienHeKhanCap() {
        PrintAdv(GREEN, "Liên hệ khẩn cấp: ", RESET);
        lienHeKhanCap = _scan.nextLine();
    }

    public void NhapThuDienTu() {
        PrintAdv(GREEN, "Thủ điện tử: ", RESET);
        thuDienTu = _scan.nextLine();
    }

    public void NhapThongTinCaNhan() {
        NhapHoTen();
        NhapGioiTinh();
        NhapNgaySinh();
        NhapNoiSinh();
        NhapNoiOHienTai();
        NhapQuocTich();
        NhapDanToc();
        NhapTonGiao();
        NhapSoDienThoai();
        NhapLienHeKhanCap();
        NhapThuDienTu();
    }

    public void XuatHoTen() {
        PrintlnAdv(format("Họ tên: %s", hoTen));
    }

    public void XuatGioiTinh() {
        PrintlnAdv(format("Giới tính: %s", gioiTinh));
    }

    public void XuatNgaySinh() {
        PrintlnAdv(format("Ngày sinh: %s", DateToString(ngaySinh)));
    }

    public void XuatNoiSinh() {
        PrintlnAdv(format("Nơi sinh: %s", noiSinh));
    }

    public void XuatNoiOHienTai() {
        PrintlnAdv(format("Nơi ở hiện tại: %s", noiOHienTai));
    }

    public void XuatQuocTich() {
        PrintlnAdv(format("Quốc tịch: %s", quocTich));
    }

    public void XuatDanToc() {
        PrintlnAdv(format("Dân tộc: %s", danToc));
    }

    public void XuatTonGiao() {
        PrintlnAdv(format("Tôn giáo: %s", tonGiao));
    }

    public void XuatSoDienThoai() {
        PrintlnAdv(format("Số điện thoại: %s", soDienThoai));
    }

    public void XuatLienHeKhanCap() {
        PrintlnAdv(format("Liên hệ khẩn cấp: %s", lienHeKhanCap));
    }

    public void XuatThuDienTu() {
        PrintlnAdv(format("Thủ điện tử: %s", thuDienTu));
    }

    public void XuatThongTinCaNhan() {
        XuatHoTen();
        XuatGioiTinh();
        XuatNgaySinh();
        XuatNoiSinh();
        XuatNoiOHienTai();
        XuatQuocTich();
        XuatDanToc();
        XuatTonGiao();
        XuatSoDienThoai();
        XuatLienHeKhanCap();
        XuatThuDienTu();
    }
    // #endregion

    // #region Properties
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(java.util.Date date) {
        this.ngaySinh = date;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getNoiOHienTai() {
        return noiOHienTai;
    }

    public void setNoiOHienTai(String noiOHienTai) {
        this.noiOHienTai = noiOHienTai;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getLienHeKhanCap() {
        return lienHeKhanCap;
    }

    public void setLienHeKhanCap(String lienHeKhanCap) {
        this.lienHeKhanCap = lienHeKhanCap;
    }

    public String getThuDienTu() {
        return thuDienTu;
    }

    public void setThuDienTu(String thuDienTu) {
        this.thuDienTu = thuDienTu;
    }
    // #endregion
}
