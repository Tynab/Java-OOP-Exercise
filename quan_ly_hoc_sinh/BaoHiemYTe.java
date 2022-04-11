package quan_ly_hoc_sinh;

import java.util.Date;

public class BaoHiemYTe extends HocSinh {
    // #region Fields
    private String soPhieu;
    private Date ngayCap;
    private String tenBVDK;
    private Date tuNgay;
    private Date denNgay;
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
