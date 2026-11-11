package Dat25676901;

import java.time.LocalDate;

public abstract class KhachHang {
    protected String maKH;
    protected String hoTen;
    protected LocalDate ngayLapHoaDon;

    public KhachHang(String maKH, String hoTen, LocalDate ngayLapHoaDon) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public abstract double tinhThanhTien();

    public abstract String getLoaiKhachHang();

    public LocalDate getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    @Override
    public String toString() {
        return maKH + "\t" + hoTen + "\t" + ngayLapHoaDon
                + "\t" + getLoaiKhachHang()
                + "\t" + tinhThanhTien();
    }
}