package Dat25676901;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;


    public HinhChuNhat() {
        this.chieuDai = 0.0;
        this.chieuRong = 0.0;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        setChieuDai(chieuDai);
        setChieuRong(chieuRong);
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            this.chieuDai = 0.0;
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            this.chieuRong = 0.0;
        }
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return String.format("Hình chữ nhật [Dài: %.2f, Rộng: %.2f] | Chu vi: %.2f | Diện tích: %.2f",
                chieuDai, chieuRong, tinhChuVi(), tinhDienTich());
    }
}