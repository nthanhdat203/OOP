package Dat25676901;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n================ MENU BÀI TẬP ================");
            System.out.println("1. Nhập và kiểm tra Hình Chữ Nhật");
            System.out.println("2. Nhập và kiểm tra Hình Tròn");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn (0 - 2): ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi lệnh sau nextInt()

            switch (luaChon) {
                case 1:
                    System.out.println("\n--- THÔNG TIN HÌNH CHỮ NHẬT ---");
                    System.out.print("Nhập chiều dài: ");
                    double dai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double rong = scanner.nextDouble();

                    HinhChuNhat hcn = new HinhChuNhat(dai, rong);
                    System.out.println("-> Kết quả: " + hcn.toString());
                    break;

                case 2:
                    System.out.println("\n--- THÔNG TIN HÌNH TRÒN ---");
                    System.out.print("Nhập tên tâm (VD: O, A): ");
                    String tenTam = scanner.nextLine();
                    System.out.print("Nhập tọa độ x: ");
                    float x = scanner.nextFloat();
                    System.out.print("Nhập tọa độ y: ");
                    float y = scanner.nextFloat();
                    System.out.print("Nhập bán kính: ");
                    double banKinh = scanner.nextDouble();

                    ToaDo tam = new ToaDo(tenTam, x, y);
                    HinhTron ht = new HinhTron(tam, banKinh);
                    System.out.println("-> Kết quả: " + ht.toString());
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}
