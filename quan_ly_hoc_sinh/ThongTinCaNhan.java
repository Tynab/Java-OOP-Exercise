package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

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
    private final Scanner mScan = new Scanner(in);
    // #endregion

    // #region Methods
    public void nhapHoTen() {
        printAdv(GREEN, "Họ tên: ", RESET);
        hoTen = mScan.nextLine();
    }

    public void nhapGioiTinh() {
        printAdv(GREEN, "Giới tính: ", RESET);
        gioiTinh = mScan.nextLine();
    }

    public void nhapNgaySinh() {
        printAdv(GREEN, "Ngày sinh (dd/MM/yyyy): ", RESET);
        ngaySinh = scanDate("dd/MM/yyyy");
    }

    public void nhapNoiSinh() {
        printAdv(GREEN, "Nơi sinh: ", RESET);
        noiSinh = mScan.nextLine();
    }

    public void nhapNoiOHienTai() {
        printAdv(GREEN, "Nơi ở hiện tại: ", RESET);
        noiOHienTai = mScan.nextLine();
    }

    public void nhapQuocTich() {
        printAdv(GREEN, "Quốc tịch: ", RESET);
        quocTich = mScan.nextLine();
    }

    public void nhapDanToc() {
        printAdv(GREEN, "Dân tộc: ", RESET);
        danToc = mScan.nextLine();
    }

    public void nhapTonGiao() {
        printAdv(GREEN, "Tôn giáo: ", RESET);
        tonGiao = mScan.nextLine();
    }

    public void nhapSoDienThoai() {
        printAdv(GREEN, "Số điện thoại: ", RESET);
        soDienThoai = mScan.nextLine();
    }

    public void nhapLienHeKhanCap() {
        printAdv(GREEN, "Liên hệ khẩn cấp: ", RESET);
        lienHeKhanCap = mScan.nextLine();
    }

    public void nhapThuDienTu() {
        printAdv(GREEN, "Thủ điện tử: ", RESET);
        thuDienTu = mScan.nextLine();
    }

    public void nhapThongTinCaNhan() {
        nhapHoTen();
        nhapGioiTinh();
        nhapNgaySinh();
        nhapNoiSinh();
        nhapNoiOHienTai();
        nhapQuocTich();
        nhapDanToc();
        nhapTonGiao();
        nhapSoDienThoai();
        nhapLienHeKhanCap();
        nhapThuDienTu();
    }

    public void xuatHoTen() {
        printlnAdv(format("Họ tên: %s", hoTen));
    }

    public void xuatGioiTinh() {
        printlnAdv(format("Giới tính: %s", gioiTinh));
    }

    public void xuatNgaySinh() {
        printlnAdv(format("Ngày sinh: %s", dateToString(ngaySinh)));
    }

    public void xuatNoiSinh() {
        printlnAdv(format("Nơi sinh: %s", noiSinh));
    }

    public void xuatNoiOHienTai() {
        printlnAdv(format("Nơi ở hiện tại: %s", noiOHienTai));
    }

    public void xuatQuocTich() {
        printlnAdv(format("Quốc tịch: %s", quocTich));
    }

    public void xuatDanToc() {
        printlnAdv(format("Dân tộc: %s", danToc));
    }

    public void xuatTonGiao() {
        printlnAdv(format("Tôn giáo: %s", tonGiao));
    }

    public void xuatSoDienThoai() {
        printlnAdv(format("Số điện thoại: %s", soDienThoai));
    }

    public void xuatLienHeKhanCap() {
        printlnAdv(format("Liên hệ khẩn cấp: %s", lienHeKhanCap));
    }

    public void xuatThuDienTu() {
        printlnAdv(format("Thủ điện tử: %s", thuDienTu));
    }

    public void xuatThongTinCaNhan() {
        xuatHoTen();
        xuatGioiTinh();
        xuatNgaySinh();
        xuatNoiSinh();
        xuatNoiOHienTai();
        xuatQuocTich();
        xuatDanToc();
        xuatTonGiao();
        xuatSoDienThoai();
        xuatLienHeKhanCap();
        xuatThuDienTu();
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
