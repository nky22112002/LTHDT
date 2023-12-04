package th03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OlympicTokyo {
    public static void main(String[] args) {
        Quocgia[] QGList = new Quocgia[20];
        ThanhTich[] TTList = new ThanhTich[20];
        // Đọc dữ liệu từ tập tin Top20Tokyo.txt và cấp phát đối tượng vào mảng TTList
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Nguyen Ky\\eclipse-workspace\\test\\src\\th03\\Top20Tokyo.txt"))) {
            String line;
            int index = 0;
            String[] tenQuocGia = new String[20]; // Mảng lưu tên quốc gia
            int vang, bac, dong;
            vang = bac = dong = 0;
            int numberOfCountries = 0;
            
            while ((line = reader.readLine()) != null) {
                if (index == 0) {
                    // Xác định dòng đầu tiên và bỏ qua nó
                    index++;
                } else if (index == 1) {
                    // Xác định dòng thứ hai là số lượng quốc gia
                    numberOfCountries = Integer.parseInt(line);
                    index++;
                } else if (index == 2) {
                    // Đọc danh sách quốc gia từ dòng thứ ba và chia thành mảng chuỗi
                    line = line.trim();
                    tenQuocGia = line.split(",");
                    index++;
                } else if(index > 2){
                    // Bỏ qua số liệu quốc gia, chỉ đọc dữ liệu thành tích
                	line = line.trim();
                    String[] data = line.split(",");
                    vang = Integer.parseInt(data[0]);
                    bac = Integer.parseInt(data[1]);
                    dong = Integer.parseInt(data[2]);
                    // Gán thông tin vào mảng TTList tương ứng với quốc gia
                    TTList[index - 3] = new ThanhTich(tenQuocGia[index - 3], vang, bac, dong);
                    index++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        // Đọc dữ liệu từ tập tin Top20TokyoInfo.txt và cấp phát đối tượng vào mảng QGList
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Nguyen Ky\\eclipse-workspace\\test\\src\\th03\\Top20TokyoInfo.txt"))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                if(index == 0) {
                	index++;
                }
                else if(index > 0 && index < 20) {
                	String[] data = line.split(",");
                    String tenQuocGia = data[0];
                    String thuDo = data[1];
                    int danSo = Integer.parseInt(data[2]);
                    int dienTich = Integer.parseInt(data[3]);
                    QGList[index] = new Quocgia(tenQuocGia, thuDo, danSo, dienTich);
                    index++;
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1- In ra thông tin tất cả các quốc gia trong Top 20 Olympic Tokyo");
            System.out.println("2- In ra thông tin thành tích các quốc gia trong Top 20 Olympic Tokyo");
            System.out.println("3- Nhập tên 1 quốc gia, in ra thông tin đất nước và thành tích tại Olympic Tokyo của quốc gia đó.");
            System.out.println("4- Nhập số nguyên V, in ra màn hình thông tin các quốc gia đoạt huy chương vàng >= V trên màn hình.");
            System.out.println("5- Nhập vị trí và tên tập tin F. Chương trình sẽ in ra thông tin đất nước cùng bảng thành tích tại Tokyo của top 20 quốc gia ra tập tin F.");
            System.out.println("6- Kết thúc");

            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Quocgia quocGia : QGList) {
                        System.out.println(quocGia);
                    }
                    break;
                case 2:
                    for (ThanhTich thanhTich : TTList) {
                        System.out.println(thanhTich);
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên quốc gia: ");
                    String tenQuocGia = scanner.next();
                    for (int i = 0; i < 20; i++) {
                        if (QGList[i].toString().contains(tenQuocGia)) {
                            System.out.println(QGList[i]);
                            System.out.println(TTList[i]);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập số nguyên V: ");
                    int V = scanner.nextInt();
                    for (int i = 0; i < 20; i++) {
                        if (TTList[i].huyChuongVang() >= V) {
                            System.out.println(QGList[i]);
                            System.out.println(TTList[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập vị trí: ");
                    int position = scanner.nextInt();
                    System.out.print("Nhập tên tập tin F: ");
                    String fileName = scanner.next();
                    if (position >= 0 && position < 20) {
                        try (FileWriter writer = new FileWriter(fileName, true)) {
                            writer.write(QGList[position].toString() + "\n");
                            writer.write(TTList[position].toString() + "\n");
                            writer.write("\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ.");
                    break;
            }
        }
        
    }
}
