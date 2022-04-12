package quan_ly_nhan_su;

import static java.lang.Integer.*;
import static java.lang.String.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class TruongPhong extends NhanSu {
    // #region Fields
    private int soThanhVien;
    private final double _luongNgay = 200;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay + 100 * soThanhVien;
    }

    public void NhapSoThanhVien() {
        PrintAdv(GREEN, "Số thành viên: ", RESET);
        soThanhVien = NumLimit(0, MAX_VALUE);
    }

    @Override
    public void NhapNhanSu() {
        super.NhapNhanSu();
        NhapSoThanhVien();
    }

    public void XuatSoThanhVien() {
        PrintlnAdv(format("Số thành viên: %s", soThanhVien));
    }

    public void XuatLuongThang() {
        PrintlnAdv(format("Lương tháng: %s", WritePerfectDub(luongThang)));
    }

    @Override
    public void XuatNhanSu() {
        super.XuatMaNhanVien();
        super.XuatHoTen();
        super.XuatSoDienThoai();
        PrintlnAdv("Vị trí: trưởng phòng");
        XuatSoThanhVien();
        super.XuatSoNgayLamViec();
        XuatLuongThang();
    }
    // #endregion

    // #region Properties
    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }
    // #endregion
}
