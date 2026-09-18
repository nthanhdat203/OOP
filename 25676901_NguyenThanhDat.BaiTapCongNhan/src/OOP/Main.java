package OOP;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Nhập số lượng công nhân
        System.out.print("Nhap so luong cong nhan: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xóa ký tự Enter

        DanhSachCongNhan ds = new DanhSachCongNhan(n);

        // Nhập thông tin công nhân
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap cong nhan thu " + (i + 1) + " ---");

            System.out.print("Nhap ma cong nhan: ");
            String maCN = sc.nextLine();

            System.out.print("Nhap ho: ");
            String ho = sc.nextLine();

            System.out.print("Nhap ten: ");
            String ten = sc.nextLine();

            System.out.print("Nhap so san pham: ");
            int soSP = sc.nextInt();
            sc.nextLine(); // Xóa Enter

            CongNhan cn = new CongNhan(maCN, ho, ten, soSP);

            if (ds.ThemCongNhan(cn)) {
                System.out.println("Them cong nhan thanh cong!");
            } else {
                System.out.println("Danh sach da day!");
            }
        }

        // Xuất danh sách
        System.out.println("\n========== DANH SACH CONG NHAN ==========");
        ds.XuatDanhSach();

        // Số lượng công nhân
        System.out.println("\nSo luong cong nhan: " + ds.SoLuongCongNhan());

        // Công nhân có số sản phẩm > 200
        System.out.println("\n========== CONG NHAN CO SO SP > 200 ==========");
        ds.XuatCongNhanTren200();

        // Sắp xếp giảm dần theo số sản phẩm
        ds.SapXepGiamDan();

        System.out.println("\n========== DANH SACH SAU KHI SAP XEP GIAM DAN ==========");
        ds.XuatDanhSach();

        sc.close();
    }

	}


