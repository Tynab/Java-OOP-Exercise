package quan_ly_nhan_su;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class NhanVien extends NhanSu {
    // #region Fields
    private String tenTruongPhong;
    private final double _luongNgay = 100;
    private final Scanner _scan = new Scanner(in);
    // #endregion

    // #region Methods
    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * _luongNgay;
    }

    public void nhapTenTruongPhong() {
        PrintAdv(GREEN, "Tên trưởng phòng: ", RESET);
        tenTruongPhong = _scan.nextLine();
    }

    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapTenTruongPhong();
        tinhLuong();
    }

    public void xuatTenTruongPhong() {
        PrintlnAdv(format("Tên trưởng phòng: %s", tenTruongPhong));
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
