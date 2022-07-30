package quan_ly_hoc_sinh;

import java.util.*;

import static java.lang.String.*;
import static java.lang.System.*;
import static yan_service.YANConstant.*;
import static yan_service.YANService.*;

public class BaoHiemYTe {
    // #region Fields
    private String soPhieu;
    private Date ngayCap;
    private String tenBVDK;
    private Date tuNgay;
    private Date denNgay;
    private final Scanner mScan = new Scanner(in);
    // #endregion

    // #region Methods
    public void nhapSoPhieu() {
        printAdv(GREEN, "Số phiếu BHYT: ", RESET);
        soPhieu = mScan.nextLine();
    }

    public void nhapNgayCap() {
        printAdv(GREEN, "Ngày cấp BHYT (dd/MM/yyyy): ", RESET);
        ngayCap = scanDate("dd/MM/yyyy");
    }

    public void nhapTenBVDK() {
        printAdv(GREEN, "Tên Bệnh viện đăng ký BHYT: ", RESET);
        tenBVDK = mScan.nextLine();
    }

    public void nhapTuNgay() {
        printAdv(GREEN, "BHYT có giá trị từ ngày (dd/MM/yyyy): ", RESET);
        tuNgay = scanDate("dd/MM/yyyy");
    }

    public void nhapDenNgay() {
        printAdv(GREEN, "BHYT có giá trị đến ngày (dd/MM/yyyy): ", RESET);
        denNgay = scanDate("dd/MM/yyyy");
    }

    public void nhapBaoHiemYTe() {
        nhapSoPhieu();
        nhapNgayCap();
        nhapTenBVDK();
        nhapTuNgay();
        nhapDenNgay();
    }

    public void xuatSoPhieu() {
        printlnAdv(format("Số phiếu BHYT: %s", soPhieu));
    }

    public void xuatNgayCap() {
        printlnAdv(format("Ngày cấp BHYT: %s", dateToString(ngayCap)));
    }

    public void xuatTenBVDK() {
        printlnAdv(format("Tên Bệnh viện đăng ký BHYT: %s", tenBVDK));
    }

    public void xuatTuNgay() {
        printlnAdv(format("BHYT có giá trị từ ngày: %s", dateToString(tuNgay)));
    }

    public void xuatDenNgay() {
        printlnAdv(format("BHYT có giá trị đến ngày: %s", dateToString(denNgay)));
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
