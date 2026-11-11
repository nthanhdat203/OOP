package Dat25676901;


	public class HinhTron {
	    private ToaDo tam;
	    private double banKinh;

	    public HinhTron() {
	        this.tam = new ToaDo();
	        this.banKinh = 0.0;
	    }

	    public HinhTron(ToaDo tam, double banKinh) {
	        this.tam = tam;
	        setBanKinh(banKinh);
	    }

	    public ToaDo getTam() {
	        return tam;
	    }

	    public void setTam(ToaDo tam) {
	        this.tam = tam;
	    }

	    public double getBanKinh() {
	        return banKinh;
	    }

	    public void setBanKinh(double banKinh) {
	        if (banKinh > 0) {
	            this.banKinh = banKinh;
	        } else {
	            this.banKinh = 0.0;
	        }
	    }

	    public double tinhChuVi() {
	        return 2 * Math.PI * banKinh;
	    }

	    public double tinhDienTich() {
	        return Math.PI * Math.pow(banKinh, 2);
	    }

	    @Override
	    public String toString() {
	        return String.format("Hình tròn tâm %s, bán kính %.2f | Chu vi: %.2f | Diện tích: %.2f",
	                tam != null ? tam.toString() : "Chưa có", banKinh, tinhChuVi(), tinhDienTich());
	    }
	}

