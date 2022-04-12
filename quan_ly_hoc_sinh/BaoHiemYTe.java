package quan_ly_hoc_sinh;

import java.util.Date;
import java.util.Scanner;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class BaoHiemYTe {
    // #region Fields
    private String soPhieu;
    private Date ngayCap;
    private String tenBVDK;
    private Date tuNgay;
    private Date denNgay;
    private final Scanner _scan = new Scanner(in);
    // #endregion

    // #region Methods
    public void NhapSoPhieu() {
        PrintAdv(GREEN, "Số phiếu BHYT: ", RESET);
        soPhieu = _scan.nextLine();
    }

    public void NhapNgayCap() {
        PrintAdv(GREEN, "Ngày cấp BHYT (dd/MM/yyyy): ", RESET);
        ngayCap = ScanDate("dd/MM/yyyy");
    }

    public void NhapTenBVDK() {
        PrintAdv(GREEN, "Tên Bệnh viện đăng ký BHYT: ", RESET);
        tenBVDK = _scan.nextLine();
    }

    public void NhapTuNgay() {
        PrintAdv(GREEN, "BHYT có giá trị từ ngày (dd/MM/yyyy): ", RESET);
        tuNgay = ScanDate("dd/MM/yyyy");
    }

    public void NhapDenNgay() {
        PrintAdv(GREEN, "BHYT có giá trị đến ngày (dd/MM/yyyy): ", RESET);
        denNgay = ScanDate("dd/MM/yyyy");
    }

    public void NhapBaoHiemYTe() {
        NhapSoPhieu();
        NhapNgayCap();
        NhapTenBVDK();
        NhapTuNgay();
        NhapDenNgay();
    }

    public void XuatSoPhieu() {
        PrintlnAdv(format("Số phiếu BHYT: %s", soPhieu));
    }

    public void XuatNgayCap() {
        PrintlnAdv(format("Ngày cấp BHYT: %s", DateToString(ngayCap)));
    }

    public void XuatTenBVDK() {
        PrintlnAdv(format("Tên Bệnh viện đăng ký BHYT: %s", tenBVDK));
    }

    public void XuatTuNgay() {
        PrintlnAdv(format("BHYT có giá trị từ ngày: %s", DateToString(tuNgay)));
    }

    public void XuatDenNgay() {
        PrintlnAdv(format("BHYT có giá trị đến ngày: %s", DateToString(denNgay)));
    }

    public void XuatBaoHiemYTe() {
        XuatSoPhieu();
        XuatNgayCap();
        XuatTenBVDK();
        XuatTuNgay();
        XuatDenNgay();
    }
    // #endregion

    // #region Properties
    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getTenBVDK() {
        return tenBVDK;
    }

    public void setTenBVDK(String tenBVDK) {
        this.tenBVDK = tenBVDK;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }
    // #endregion
}
