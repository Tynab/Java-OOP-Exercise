package quan_ly_nhan_su;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class MethodScript {
    // Add new user
    public static NhanSu AddNewbie(List<NhanSu> dsNhanSu) {
        var nhanSu = UserType();
        do {
            nhanSu.nhapMaNhanVien();
        } while (IsRegist(dsNhanSu, nhanSu.getMaNhanVien()));
        nhanSu.nhapNhanSu();
        return nhanSu;
    }

    // Split user
    public static NhanSu UserType() {
        PrintlnAdv(RESET, "Vị trí trong công ty");
        PrintlnAdv("1. Nhân viên   ");
        PrintlnAdv("2. Trưởng phòng");
        PrintlnAdv("3. Giám đốc    ");
        PrintAdv("Chọn 1 trong các phương án trên: ");
        switch (NumLimit(1, 3)) {
            case 1: {
                return new NhanVien();
            }
            case 2: {
                return new TruongPhong();
            }
            case 3: {
                return new GiamDoc();
            }
            default: {
                return new NhanSu();
            }
        }
    }

    // Check regist
    public static boolean IsRegist(List<NhanSu> dsNhanSu, String maNhanVien) {
        var is_success = false;
        for (var nhanSu : dsNhanSu) {
            if (nhanSu.getMaNhanVien().equals(maNhanVien)) {
                PrintlnAdv(RED, "Mã nhân viên đã tồn tại!");
                is_success = true;
                break;
            }
        }
        return is_success;
    }

    // Check team leader
    public static void CheckTeamLead(List<NhanSu> dsNhanSu) {
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof NhanVien) {
                var nhanVien = (NhanVien) nhanSu;
                var is_success = false;
                for (var truongPhong : dsNhanSu) {
                    if (truongPhong instanceof TruongPhong
                            && nhanVien.getTenTruongPhong().equals(truongPhong.getHoTen())) {
                        is_success = true;
                        break;
                    }
                }
                if (!is_success) {
                    nhanVien.setTenTruongPhong("");
                }
            }
        }
    }

    // Count member in team
    public static void MemberEachTeam(List<NhanSu> dsNhanSu) {
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = ((TruongPhong) nhanSu);
                var count = 0;
                for (var nhanVien : dsNhanSu) {
                    if (nhanVien instanceof NhanVien
                            && ((NhanVien) nhanVien).getTenTruongPhong().equals(truongPhong.getHoTen())) {
                        count++;
                    }
                }
                truongPhong.setSoThanhVien(count);
                truongPhong.tinhLuong();
            }
        }
    }

    // Find index by code user
    public static int FindIndexByCode(List<NhanSu> dsNhanSu, String maNhanVien) {
        var index = -1;
        for (var i = 0; i < dsNhanSu.size(); i++) {
            if (dsNhanSu.get(i).getMaNhanVien().equals(maNhanVien)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // NhanVien transform to TruongPhong
    public static TruongPhong NhanVienTransToTruongPhong(NhanSu nhanSu) {
        var truongPhong = new TruongPhong();
        truongPhong.setMaNhanVien(nhanSu.getMaNhanVien());
        truongPhong.setHoTen(nhanSu.getHoTen());
        truongPhong.setSoDienThoai(nhanSu.getSoDienThoai());
        truongPhong.setSoNgayLamViec(nhanSu.getSoNgayLamViec());
        truongPhong.setSoThanhVien(0);
        truongPhong.tinhLuong();
        return truongPhong;
    }

    // Sum Salary
    public static double SumSalary(List<NhanSu> dsNhanSu) {
        var sum = 0d;
        for (var nhanSu : dsNhanSu) {
            sum += nhanSu.getLuongThang();
        }
        return sum;
    }

    // List max salary
    public static List<NhanSu> TopSalary(List<NhanSu> dsNhanSu) {
        // find max
        var dsTopSalary = new ArrayList<NhanSu>();
        var maxSalary = dsNhanSu.get(0).getLuongThang();
        for (var nhanSu : dsNhanSu) {
            if (nhanSu.getLuongThang() > maxSalary) {
                maxSalary = nhanSu.getLuongThang();
            }
        }
        // add to list
        for (var nhanSu : dsNhanSu) {
            if (nhanSu.getLuongThang() == maxSalary) {
                dsTopSalary.add(nhanSu);
            }
        }
        return dsTopSalary;
    }

    // List TruongPhong max memberF
    public static List<TruongPhong> TopTeam(List<NhanSu> dsNhanSu) {
        // find max
        var dsTopTeam = new ArrayList<TruongPhong>();
        var maxTeam = 0;
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = (TruongPhong) nhanSu;
                if (truongPhong.getSoThanhVien() > maxTeam) {
                    maxTeam = truongPhong.getSoThanhVien();
                }
            }
        }
        // add to list
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = (TruongPhong) nhanSu;
                if (truongPhong.getSoThanhVien() == maxTeam) {
                    dsTopTeam.add(truongPhong);
                }
            }
        }
        return dsTopTeam;
    }

    // Sort by name
    public static void SortByName(List<NhanSu> dsNhanSu) {
        sort(dsNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu o1, NhanSu o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    // Sort by code
    public static void SortByCode(List<NhanSu> dsNhanSu) {
        sort(dsNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu o1, NhanSu o2) {
                return o1.getMaNhanVien().compareTo(o2.getMaNhanVien());
            }
        });
    }

    // List GiamDoc max CoPhan
    public static List<GiamDoc> TopShare(List<NhanSu> dsNhanSu) {
        // find max
        var dsTopShare = new ArrayList<GiamDoc>();
        var maxShare = 0d;
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof GiamDoc) {
                var giamDoc = (GiamDoc) nhanSu;
                if (giamDoc.getCoPhan() > maxShare) {
                    maxShare = giamDoc.getCoPhan();
                }
            }
        }
        // add to list
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof GiamDoc) {
                var giamDoc = (GiamDoc) nhanSu;
                if (giamDoc.getCoPhan() == maxShare) {
                    dsTopShare.add(giamDoc);
                }
            }
        }
        return dsTopShare;
    }

    // GiamDoc all in
    public static List<GiamDoc> AllInGiamDoc(List<NhanSu> dsNhanSu, double doanhThuThang) {
        var dsAllIn = new ArrayList<GiamDoc>();
        var loiNhuan = doanhThuThang - SumSalary(dsNhanSu);
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof GiamDoc) {
                var giamDoc = (GiamDoc) nhanSu;
                giamDoc.setThuNhap(
                        giamDoc.getLuongThang() + giamDoc.getCoPhan() * loiNhuan / 100);
                dsAllIn.add(giamDoc);
            }
        }
        return dsAllIn;
    }
}
