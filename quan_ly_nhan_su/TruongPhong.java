package quan_ly_nhan_su;

import static java.lang.String.*;
import static yan_service.YANService.*;

public class TruongPhong extends NhanSu {
    // #region Fields
    private int soThanhVien;
    private final String CHUC_VU = "trưởng phòng";
    private final double LUONG_NGAY = 200;
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * LUONG_NGAY + 100 * soThanhVien;
    }

    public void xuatSoThanhVien() {
        printlnAdv(format("Số thành viên: %d", soThanhVien));
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
