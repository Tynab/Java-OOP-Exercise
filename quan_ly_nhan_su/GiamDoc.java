package quan_ly_nhan_su;

import static java.lang.Double.*;
import static java.lang.String.*;

import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class GiamDoc extends NhanSu {
    // #region Fields
    private double coPhan;
    private double thuNhap;
    private final String _chucVu = "giám đốc";
    private final double _luongNgay = 300;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay;
    }

    public void nhapCoPhan() {
        PrintAdv(GREEN, "Cổ phần: ", RESET);
        coPhan = NumLimit(0, MAX_VALUE);
    }

    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapCoPhan();
        tinhLuong();
    }

    public void xuatCoPhan() {
        PrintlnAdv(format("Cổ phần: %s%%", WritePerfectDub(coPhan)));
    }

    public void xuatThuNhap() {
        PrintlnAdv(format("Thu nhập: %,.0f", thuNhap));
    }

    @Override
    public void xuatChucVu() {
        PrintlnAdv(format("Chức vụ: %s", _chucVu));
    }

    @Override
    public void xuatLuongThang() {
        PrintlnAdv(format("Lương tháng: %,.0f", luongThang));
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
