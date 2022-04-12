package quan_ly_nhan_su;

import java.util.Scanner;

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

    public void NhapTenTruongPhong() {
        PrintAdv(GREEN, "Tên trưởng phòng: ", RESET);
        tenTruongPhong = _scan.nextLine();
    }

    @Override
    public void NhapNhanSu() {
        super.NhapNhanSu();
        NhapTenTruongPhong();
    }

    public void XuatTenTruongPhong() {
        PrintlnAdv(format("Tên trưởng phòng: %s", tenTruongPhong));
    }

    public void XuatLuongThang() {
        PrintlnAdv(format("Lương tháng: %s", WritePerfectDub(luongThang)));
    }

    @Override
    public void XuatNhanSu() {
        super.XuatMaNhanVien();
        super.XuatHoTen();
        super.XuatSoDienThoai();
        PrintlnAdv("Vị trí: nhân viên");
        XuatTenTruongPhong();
        super.XuatSoNgayLamViec();
        XuatLuongThang();
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
