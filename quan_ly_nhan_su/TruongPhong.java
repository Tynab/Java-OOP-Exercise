package quan_ly_nhan_su;

import static java.lang.String.*;
import static yan_lib.YANMethod.*;

public class TruongPhong extends NhanSu {
    // #region Fields
    private int soThanhVien;
    private final String _chucVu = "trưởng phòng";
    private final double _luongNgay = 200;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay + 100 * soThanhVien;
    }

    public void xuatSoThanhVien() {
        PrintlnAdv(format("Số thành viên: %d", soThanhVien));
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
        xuatSoThanhVien();
        super.xuatSoNgayLamViec();
        xuatLuongThang();
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
