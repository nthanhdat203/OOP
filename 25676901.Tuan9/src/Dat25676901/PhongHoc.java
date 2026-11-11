package Dat25676901;

import java.util.Objects;

public abstract class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc() {
        this("", "", 0.0, 0);
    }

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        setMaPhong(maPhong);
        setDayNha(dayNha);
        setDienTich(dienTich);
        setSoBongDen(soBongDen);
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        if (maPhong != null && !maPhong.trim().isEmpty()) {
            this.maPhong = maPhong;
        } else {
            this.maPhong = "Chua xac dinh";
        }
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        if (dayNha != null && !dayNha.trim().isEmpty()) {
            this.dayNha = dayNha;
        } else {
            this.dayNha = "Chua xac dinh";
        }
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = (dienTich > 0) ? dienTich : 0;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = (soBongDen >= 0) ? soBongDen : 0;
    }

    public boolean duAnhSang() {
        if (soBongDen <= 0) {
            return false;
        }
        return (dienTich / soBongDen) <= 10.0;
    }

    public abstract boolean datChuan();

    @Override
    public int hashCode() {
        return Objects.hash(maPhong.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof PhongHoc)) return false;
        PhongHoc other = (PhongHoc) obj;
        return Objects.equals(this.maPhong.toLowerCase(), other.maPhong.toLowerCase());
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-10s | %10.2f | %12d | %-10s |",
                maPhong, dayNha, dienTich, soBongDen, datChuan() ? "Dat chuan" : "Khong dat");
    }
}
