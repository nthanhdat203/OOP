package Dat25676901;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem() {
        super();
        this.chuyenNganh = "";
        this.sucChua = 0;
        this.coBonRua = false;
    }

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setChuyenNganh(chuyenNganh);
        setSucChua(sucChua);
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = (chuyenNganh != null && !chuyenNganh.trim().isEmpty()) ? chuyenNganh : "Chua xac dinh";
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = (sucChua >= 0) ? sucChua : 0;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && coBonRua;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" CN: %-12s | Suc chua: %-4d | Bon rua: %-5s |",
                chuyenNganh, sucChua, coBonRua ? "Co" : "Khong");
    }
}
