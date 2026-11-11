package Dat25676901;

import java.util.List;
import java.util.Scanner;

public class TestPhongHoc {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QuanLyPhongHoc ql = new QuanLyPhongHoc();
        khoiTaoDuLieuMau(ql);

        int chon;
        do {
            inMenu();
            System.out.print("Nhap lua chon cua ban: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themPhongMoi(ql);
                    break;
                case 2:
                    System.out.print("Nhap ma phong can tim: ");
                    String maTim = sc.nextLine();
                    PhongHoc pTim = ql.timPhongHoc(maTim);
                    if (pTim != null) {
                        System.out.println("Tim thay: " + pTim);
                    } else {
                        System.out.println("Khong tim thay phong co ma: " + maTim);
                    }
                    break;
                case 3:
                    System.out.println("\n--- DANH SACH TOAN BO PHONG HOC ---");
                    System.out.print(ql.toString());
                    break;
                case 4:
                    System.out.println("\n--- DANH SACH PHONG HOC DAT CHUAN ---");
                    inDanhSach(ql.layDanhSachDatChuan());
                    break;
                case 5:
                    ql.sapXepTangDanTheoDayNha();
                    System.out.println("Da sap xep tang dan theo day nha:");
                    System.out.print(ql.toString());
                    break;
                case 6:
                    ql.sapXepGiamDanTheoDienTich();
                    System.out.println("Da sap xep giam dan theo dien tich:");
                    System.out.print(ql.toString());
                    break;
                case 7:
                    ql.sapXepTangDanTheoSoBongDen();
                    System.out.println("Da sap xep tang dan theo so bong den:");
                    System.out.print(ql.toString());
                    break;
                case 8:
                    System.out.print("Nhap ma phong may tinh can cap nhat: ");
                    String maCapNhat = sc.nextLine();
                    System.out.print("Nhap so luong may tinh moi: ");
                    int soMayMoi = Integer.parseInt(sc.nextLine());
                    if (ql.capNhatSoMayTinh(maCapNhat, soMayMoi)) {
                        System.out.println("Cap nhat thanh cong!");
                    } else {
                        System.out.println("Cap nhat that bai (Khong tim thay ma hoac khong phai phong may tinh).");
                    }
                    break;
                case 9:
                    System.out.print("Nhap ma phong can xoa: ");
                    String maXoa = sc.nextLine();
                    PhongHoc pXoa = ql.timPhongHoc(maXoa);
                    if (pXoa != null) {
                        System.out.println("Thong tin phong: " + pXoa);
                        System.out.print("Ban co chac chan muon xoa phong nay khong? (Y/N): ");
                        String xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("Y")) {
                            ql.xoaPhongHoc(maXoa);
                            System.out.println("Da xoa phong hoc thanh cong.");
                        } else {
                            System.out.println("Da huy thao tac xoa.");
                        }
                    } else {
                        System.out.println("Khong tim thay phong co ma: " + maXoa);
                    }
                    break;
                case 10:
                    System.out.println("Tong so phong hoc hien co: " + ql.tinhTongSoPhongHoc());
                    break;
                case 11:
                    System.out.println("\n--- DANH SACH PHONG MAY CO 60 MAY ---");
                    inDanhSach(ql.layDanhSachPhongMay60May());
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }

    private static void inMenu() {
        System.out.println("\n================ MENU QUAN LY PHONG HOC ================");
        System.out.println("1. Them mot phong hoc vao danh sach");
        System.out.println("2. Tim kiem phong hoc theo ma phong");
        System.out.println("3. Lay thong tin toan bo danh sach phong hoc");
        System.out.println("4. Lay thong tin cac phong hoc dat chuan");
        System.out.println("5. Sap xep danh sach tang dan theo day nha");
        System.out.println("6. Sap xep danh sach giam dan theo dien tich");
        System.out.println("7. Sap xep danh sach tang dan theo so bong den");
        System.out.println("8. Cap nhat so may tinh cho phong may theo ma phong");
        System.out.println("9. Xoa mot phong hoc theo ma phong (co xac minh)");
        System.out.println("10. Tinh tong so phong hoc");
        System.out.println("11. Lay danh sach cac phong may co 60 may");
        System.out.println("0. Thoat");
        System.out.println("========================================================");
    }

    private static void khoiTaoDuLieuMau(QuanLyPhongHoc ql) {
        ql.themPhongHoc(new PhongLyThuyet("LT01", "A", 100, 12, true));
        ql.themPhongHoc(new PhongLyThuyet("LT02", "C", 80, 6, false));
        ql.themPhongHoc(new PhongMayTinh("MT01", "H", 90, 10, 60));
        ql.themPhongHoc(new PhongMayTinh("MT02", "B", 60, 8, 45));
        ql.themPhongHoc(new PhongThiNghiem("TN01", "F", 120, 15, "Hoa hoc", 50, true));
        ql.themPhongHoc(new PhongThiNghiem("TN02", "D", 90, 10, "Sinh hoc", 40, false));
    }

    private static void themPhongMoi(QuanLyPhongHoc ql) {
        System.out.println("Chon loai phong can them (1: Ly thuyet, 2: May tinh, 3: Thi nghiem): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ma phong: ");
        String ma = sc.nextLine();
        if (ql.timPhongHoc(ma) != null) {
            System.out.println("Ma phong da ton tai!");
            return;
        }

        System.out.print("Nhap day nha: ");
        String dayNha = sc.nextLine();
        System.out.print("Nhap dien tich: ");
        double dienTich = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so bong den: ");
        int soBongDen = Integer.parseInt(sc.nextLine());

        PhongHoc p = null;
        if (loai == 1) {
            System.out.print("Co may chieu khong (true/false): ");
            boolean coMayChieu = Boolean.parseBoolean(sc.nextLine());
            p = new PhongLyThuyet(ma, dayNha, dienTich, soBongDen, coMayChieu);
        } else if (loai == 2) {
            System.out.print("Nhap so luong may tinh: ");
            int soMay = Integer.parseInt(sc.nextLine());
            p = new PhongMayTinh(ma, dayNha, dienTich, soBongDen, soMay);
        } else if (loai == 3) {
            System.out.print("Nhap chuyen nganh: ");
            String chuyenNganh = sc.nextLine();
            System.out.print("Nhap suc chua: ");
            int sucChua = Integer.parseInt(sc.nextLine());
            System.out.print("Co bon rua khong (true/false): ");
            boolean coBonRua = Boolean.parseBoolean(sc.nextLine());
            p = new PhongThiNghiem(ma, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
        }

        if (p != null && ql.themPhongHoc(p)) {
            System.out.println("Them phong hoc thanh cong!");
        } else {
            System.out.println("Them phong hoc that bai!");
        }
    }

    private static void inDanhSach(List<PhongHoc> list) {
        if (list.isEmpty()) {
            System.out.println("Khong co phong hoc nao thoa man.");
            return;
        }
        System.out.printf("| %-10s | %-10s | %10s | %12s | %-10s | %-35s\n",
                "Ma Phong", "Day Nha", "Dien Tich", "So Bong Den", "Danh Gia", "Thong Tin Rieng");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (PhongHoc p : list) {
            System.out.println(p);
        }
    }
}