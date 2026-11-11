package Dat25676901;

import java.time.LocalDate;

public abstract class HoaDon {
    protected String maHoaDon;
    protected LocalDate ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected double donGia;

    public HoaDon(String maHoaDon, LocalDate ngayHoaDon,
                  String tenKhachHang, String maPhong,
                  double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public abstract double tinhThanhTien();

    public abstract String getLoaiHoaDon();

    public LocalDate getNgayHoaDon() {
        return ngayHoaDon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof HoaDon)) return false;

        HoaDon hd = (HoaDon) obj;

        return maHoaDon.equalsIgnoreCase(hd.maHoaDon);
    }

    @Override
    public String toString() {
        return String.format(
                "%-12s %-12s %-20s %-10s %-12.2f %-15s %-15.2f",
                maHoaDon, ngayHoaDon, tenKhachHang,
                maPhong, donGia, getLoaiHoaDon(), tinhThanhTien()
        );
    }
}