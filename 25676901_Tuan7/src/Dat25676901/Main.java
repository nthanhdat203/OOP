package Dat25676901;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DanhSachHoaDon ds = new DanhSachHoaDon(100);

        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY HOA DON =====");
            System.out.println("1. Them hoa don theo gio");
            System.out.println("2. Them hoa don theo ngay");
            System.out.println("3. Xuat danh sach hoa don");
            System.out.println("4. Thong ke hoa don theo gio");
            System.out.println("5. Thong ke hoa don theo ngay");
            System.out.println("6. Tinh tong thanh tien theo thang");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: {
                    System.out.print("Ma hoa don: ");
                    String ma = sc.nextLine();

                    System.out.print("Ngay lap (yyyy-MM-dd): ");
                    LocalDate ngay = LocalDate.parse(sc.nextLine());

                    System.out.print("Ten khach hang: ");
                    String ten = sc.nextLine();

                    System.out.print("Ma phong: ");
                    String phong = sc.nextLine();

                    System.out.print("Don gia: ");
                    double gia = sc.nextDouble();

                    System.out.print("So gio thue: ");
                    int gio = sc.nextInt();

                    if (gio <= 0 || gio > 30) {
                        System.out.println("So gio khong hop le!");
                    } else {
                        HoaDon hd = new HoaDonTheoGio(
                                ma, ngay, ten, phong, gia, gio);

                        if (ds.them(hd)) {
                            System.out.println("Them thanh cong!");
                        } else {
                            System.out.println("Them that bai!");
                        }
                    }

                    break;
                }

                case 2: {
                    System.out.print("Ma hoa don: ");
                    String ma = sc.nextLine();

                    System.out.print("Ngay lap (yyyy-MM-dd): ");
                    LocalDate ngay = LocalDate.parse(sc.nextLine());

                    System.out.print("Ten khach hang: ");
                    String ten = sc.nextLine();

                    System.out.print("Ma phong: ");
                    String phong = sc.nextLine();

                    System.out.print("Don gia: ");
                    double gia = sc.nextDouble();

                    System.out.print("So ngay thue: ");
                    int soNgay = sc.nextInt();

                    if (soNgay <= 0) {
                        System.out.println("So ngay khong hop le!");
                    } else {
                        HoaDon hd = new HoaDonTheoNgay(
                                ma, ngay, ten, phong, gia, soNgay);

                        if (ds.them(hd)) {
                            System.out.println("Them thanh cong!");
                        } else {
                            System.out.println("Them that bai!");
                        }
                    }

                    break;
                }

                case 3:
                    ds.xuat();
                    break;

                case 4:
                    System.out.println("So hoa don theo gio: "
                            + ds.thongKeSoLuongHDTheoGio());
                    break;

                case 5:
                    System.out.println("So hoa don theo ngay: "
                            + ds.thongKeSoLuongHDTheoNgay());
                    break;

                case 6:
                    System.out.print("Nhap thang: ");
                    int thang = sc.nextInt();

                    System.out.print("Nhap nam: ");
                    int nam = sc.nextInt();

                    System.out.println("Tong thanh tien: "
                            + ds.tinhTongThanhTien(thang, nam));
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
