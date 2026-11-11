package Dat25676901;

public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh() {
        super();
        this.soMayTinh = 0;
    }

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setSoMayTinh(soMayTinh);
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = (soMayTinh >= 0) ? soMayTinh : 0;
    }

    @Override
    public boolean datChuan() {
        if (soMayTinh <= 0) {
            return false;
        }
        return duAnhSang() && (dienTich / soMayTinh <= 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" So may tinh: %-3d |", soMayTinh);
    }
}
