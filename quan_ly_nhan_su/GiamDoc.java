package quan_ly_nhan_su;

import static java.lang.Double.*;
import static java.lang.String.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class GiamDoc extends NhanSu {
    // #region Fields
    private double coPhan;
    private double thuNhap;
    private final String CHUC_VU = "giám đốc";
    private final double LUONG_NGAY = 300;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * LUONG_NGAY;
    }

    public void nhapCoPhan() {
        printAdv(GREEN, "Cổ phần: ", RESET);
        coPhan = numLimit(0, MAX_VALUE);
    }

    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapCoPhan();
        tinhLuong();
    }

    public void xuatCoPhan() {
        printlnAdv(format("Cổ phần: %s%%", writePerfectDub(coPhan)));
    }

    public void xuatThuNhap() {
        printlnAdv(format("Thu nhập: %,.0f", thuNhap));
    }

    @Override
    public void xuatChucVu() {
        printlnAdv(format("Chức vụ: %s", CHUC_VU));
    }

    @Override
    public void xuatLuongThang() {
        printlnAdv(format("Lương tháng: %,.0f", luongThang));
    }

    @Override
    public void xuatNhanSu() {
        super.xuatMaNhanVien();
        super.xuatHoTen();
        super.xuatSoDienThoai();
        xuatChucVu();
        xuatCoPhan();
        super.xuatSoNgayLamViec();
        xuatLuongThang();
    }
    // #endregion

    // #region Properties
    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
    // #endregion
}
