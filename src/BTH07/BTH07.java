package BTH07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BTH07 {
    public static void main(String[] args) {
        ArrayList<HinhHoc> L = new ArrayList<>();

        // Đọc dữ liệu từ tệp tin
        try {
            File file = new File("C:\\Users\\Nguyen Ky\\eclipse-workspace\\test\\src\\shape.txt");
            Scanner scanner = new Scanner(file);
  
            scanner.nextLine();
            int lineCount = 0;

            // Đếm số dòng trong tệp tin
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
            scanner.close();
            scanner = new Scanner(file);
            for (int i = 0; i < lineCount; i++) {
                String[] values = scanner.nextLine().split(",");
                int type = values.length;

                switch (type) {
                    case 1:
                        L.add(new HinhVuong(Double.parseDouble(values[0])));
                        break;
                    case 2:
                        L.add(new HinhChuNhat(Double.parseDouble(values[0]), Double.parseDouble(values[1])));
                        break;
                    case 3:
                        L.add(new HinhTron(Double.parseDouble(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2])));
                        break;
                    case 4:
                        L.add(new HinhVanhKhan(Double.parseDouble(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3])));
                        break;
                    default:
                        System.out.println("Invalid shape type");
                        break;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        // Menu
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. In ra thông tin từng hình trong mảng L");
            System.out.println("2. In ra tổng diện tích và tổng chu vi các hình trong danh sách.");
            System.out.println("3. In ra thông tin từng hình trong danh sách theo thứ tự diện tích tăng dần.");
            System.out.println("0. Kết thúc");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (HinhHoc hinh : L) {
                        System.out.println(hinh.toString());
                    }
                    break;
                case 2:
                    double tongDT = 0;
                    double tongCV = 0;
                    for (HinhHoc hinh : L) {
                        tongDT += hinh.getDT();
                        tongCV += hinh.getCV();
                    }
                    System.out.println("Tổng diện tích: " + tongDT);
                    System.out.println("Tổng chu vi: " + tongCV);
                    break;
                case 3:
                    Collections.sort(L, (h1, h2) -> Double.compare(h1.getDT(), h2.getDT()));
                    for (HinhHoc hinh : L) {
                        System.out.println(hinh.toString());
                    }
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
                    break;
            }
        } while (choice != 0);

        input.close();
    }
}
