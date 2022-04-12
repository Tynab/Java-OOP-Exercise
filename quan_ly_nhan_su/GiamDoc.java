package quan_ly_nhan_su;

import static java.lang.Double.*;
import static java.lang.String.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class GiamDoc extends NhanSu {
    // #region Fields
    private double coPhan;
    private final double _luongNgay = 300;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay;
    }

    public void NhapCoPhan() {
        PrintAdv(GREEN, "Cổ phần: ", RESET);
        coPhan = NumLimit(0, MAX_VALUE);
    }

    @Override
    public void NhapNhanSu() {
        super.NhapNhanSu();
        NhapCoPhan();
    }

    public void XuatCoPhan() {
        PrintlnAdv(format("Cổ phần: %s", coPhan));
    }

    public void XuatLuongThang() {
        PrintlnAdv(format("Lương tháng: %s", WritePerfectDub(luongThang)));
    }

    @Override
    public void XuatNhanSu() {
        super.XuatMaNhanVien();
        super.XuatHoTen();
        super.XuatSoDienThoai();
        PrintlnAdv("Vị trí: giám đốc");
        XuatCoPhan();
        super.XuatSoNgayLamViec();
        XuatLuongThang();
    }
    // #endregion

    // #region Properties
    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }
    // #endregion
}
