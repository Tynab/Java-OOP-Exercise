package quan_ly_nhan_su;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class NhanVien extends NhanSu {
    // #region Fields
    private String tenTruongPhong;
    private final double LUONG_NGAY = 100;
    private final Scanner mScan = new Scanner(in);
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * LUONG_NGAY;
    }

    public void nhapTenTruongPhong() {
        printAdv(GREEN, "Tên trưởng phòng: ", RESET);
        tenTruongPhong = mScan.nextLine();
    }

    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapTenTruongPhong();
        tinhLuong();
    }

    public void xuatTenTruongPhong() {
        printlnAdv(format("Tên trưởng phòng: %s", tenTruongPhong));
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
        super.xuatChucVu();
        xuatTenTruongPhong();
        super.xuatSoNgayLamViec();
        xuatLuongThang();
    }
    // #endregion

    // #region Properties
    public String getTenTruongPhong() {
        return tenTruongPhong;
    }

    public void setTenTruongPhong(String tenTruongPhong) {
        this.tenTruongPhong = tenTruongPhong;
    }
    // #endregion
}
