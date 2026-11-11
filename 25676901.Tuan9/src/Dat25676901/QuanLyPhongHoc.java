package Dat25676901;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyPhongHoc {
    private List<PhongHoc> ds;

    public QuanLyPhongHoc() {
        ds = new ArrayList<>();
    }

    public boolean themPhongHoc(PhongHoc p) {
        if (p == null || ds.contains(p)) {
            return false;
        }
        return ds.add(p);
    }

    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc p : ds) {
            if (p.getMaPhong().equalsIgnoreCase(maPhong)) {
                return p;
            }
        }
        return null;
    }

    public List<PhongHoc> layToanBoDanhSach() {
        return new ArrayList<>(ds);
    }

    public List<PhongHoc> layDanhSachDatChuan() {
        List<PhongHoc> kq = new ArrayList<>();
        for (PhongHoc p : ds) {
            if (p.datChuan()) {
                kq.add(p);
            }
        }
        return kq;
    }

    public void sapXepTangDanTheoDayNha() {
        ds.sort(Comparator.comparing(PhongHoc::getDayNha, String.CASE_INSENSITIVE_ORDER));
    }

    public void sapXepGiamDanTheoDienTich() {
        ds.sort(Comparator.comparingDouble(PhongHoc::getDienTich).reversed());
    }

    public void sapXepTangDanTheoSoBongDen() {
        ds.sort(Comparator.comparingInt(PhongHoc::getSoBongDen));
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayMoi) {
        PhongHoc p = timPhongHoc(maPhong);
        if (p instanceof PhongMayTinh) {
            ((PhongMayTinh) p).setSoMayTinh(soMayMoi);
            return true;
        }
        return false;
    }

    public boolean xoaPhongHoc(String maPhong) {
        PhongHoc p = timPhongHoc(maPhong);
        if (p != null) {
            return ds.remove(p);
        }
        return false;
    }

    public int tinhTongSoPhongHoc() {
        return ds.size();
    }

    public List<PhongHoc> layDanhSachPhongMay60May() {
        List<PhongHoc> kq = new ArrayList<>();
        for (PhongHoc p : ds) {
            if (p instanceof PhongMayTinh && ((PhongMayTinh) p).getSoMayTinh() == 60) {
                kq.add(p);
            }
        }
        return kq;
    }

    @Override
    public String toString() {
        if (ds.isEmpty()) {
            return "Danh sach phong hoc trong.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("| %-10s | %-10s | %10s | %12s | %-10s | %-35s\n",
                "Ma Phong", "Day Nha", "Dien Tich", "So Bong Den", "Danh Gia", "Thong Tin Rieng"));
        sb.append("----------------------------------------------------------------------------------------------------------------\n");
        for (PhongHoc p : ds) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
