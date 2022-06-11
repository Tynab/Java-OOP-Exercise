package quan_ly_hoc_sinh;

import java.util.*;

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
    public void nhapSoPhieu() {
        PrintAdv(GREEN, "Số phiếu BHYT: ", RESET);
        soPhieu = _scan.nextLine();
    }

    public void nhapNgayCap() {
        PrintAdv(GREEN, "Ngày cấp BHYT (dd/MM/yyyy): ", RESET);
        ngayCap = ScanDate("dd/MM/yyyy");
    }

    public void nhapTenBVDK() {
        PrintAdv(GREEN, "Tên Bệnh viện đăng ký BHYT: ", RESET);
        tenBVDK = _scan.nextLine();
    }

    public void nhapTuNgay() {
        PrintAdv(GREEN, "BHYT có giá trị từ ngày (dd/MM/yyyy): ", RESET);
        tuNgay = ScanDate("dd/MM/yyyy");
    }

    public void nhapDenNgay() {
        PrintAdv(GREEN, "BHYT có giá trị đến ngày (dd/MM/yyyy): ", RESET);
        denNgay = ScanDate("dd/MM/yyyy");
    }

    public void nhapBaoHiemYTe() {
        nhapSoPhieu();
        nhapNgayCap();
        nhapTenBVDK();
        nhapTuNgay();
        nhapDenNgay();
    }

    public void xuatSoPhieu() {
        PrintlnAdv(format("Số phiếu BHYT: %s", soPhieu));
    }

    public void xuatNgayCap() {
        PrintlnAdv(format("Ngày cấp BHYT: %s", DateToString(ngayCap)));
    }

    public void xuatTenBVDK() {
        PrintlnAdv(format("Tên Bệnh viện đăng ký BHYT: %s", tenBVDK));
    }

    public void xuatTuNgay() {
        PrintlnAdv(format("BHYT có giá trị từ ngày: %s", DateToString(tuNgay)));
    }

    public void xuatDenNgay() {
        PrintlnAdv(format("BHYT có giá trị đến ngày: %s", DateToString(denNgay)));
    }

    public void xuatBaoHiemYTe() {
        xuatSoPhieu();
        xuatNgayCap();
        xuatTenBVDK();
        xuatTuNgay();
        xuatDenNgay();
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
