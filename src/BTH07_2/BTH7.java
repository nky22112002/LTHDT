package BTH07_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class BTH7 {
	public static void main(String[] args) {
        ArrayList<VanDongVien> DSVDV = new ArrayList<>();

        try {
            File file = new File("C:\\Users\\Nguyen Ky\\eclipse-workspace\\test\\src\\VanDongVien.txt");
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String hoTen = parts[0];
                String monThiDau = parts[1];
                if (parts.length == 4) {
                    // VDV Bóng Đá
                    String viTri = parts[1];
                    int soAo = Integer.parseInt(parts[2]);
                    String clbChuQuan = parts[3];

                    VDVBongDa vdvBongDa = new VDVBongDa(hoTen, "Bong Da", viTri, soAo, clbChuQuan);
                    DSVDV.add(vdvBongDa);
                } else if (parts.length == 3) {
                    // VDV Bơi Lội
                    String monChiTiet[] = parts[2].split("m ");
                	String kieuBoi = monChiTiet[1];
                	String cuLi = monChiTiet[0];
                    String monSoTruong = parts[2];
                    String clbChuQuan = parts[1];

                    VDVBoi vdvBoi = new VDVBoi(hoTen, "Boi Loi", monSoTruong, clbChuQuan, cuLi, kieuBoi);
                    DSVDV.add(vdvBoi);
                } else {
                	VanDongVien vdv = new VanDongVien(hoTen, monThiDau);
                	DSVDV.add(vdv);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tập tin VanDongVien.txt");
            e.printStackTrace();
        }

        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1- In ra danh sách toàn bộ VDV");
            System.out.println("2- Nhập tên môn thể thao, in ra danh sách các VDV của môn này");
            System.out.println("3- Nhập vị trí thi đấu trong môn bóng đá, in ra các cầu thủ đá ở vị trí này");
            System.out.println("4- Nhập tên CLB, in ra các cầu thủ thuộc CLB này");
            System.out.println("5- Nhập cự ly và kiểu bơi, in ra các VDV bơi lội thi đấu ở cự ly này");
            System.out.println("0- Kết thúc");

            System.out.print("Nhập lựa chọn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    inDanhSachVDV(DSVDV);
                    break;
                case 2:
                    input.nextLine(); 
                    System.out.print("Nhập tên môn thể thao: ");
                    String monThiDau = input.nextLine();
                    inDanhSachTheoMon(DSVDV, monThiDau);
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Nhập vị trí thi đấu: ");
                    String viTri = input.nextLine();
                    inCauThuTheoViTri(DSVDV, viTri);
                    break;
                case 4:
                    input.nextLine();
                    System.out.print("Nhập tên CLB: ");
                    String tenCLB = input.nextLine();
                    inCauThuTheoCLB(DSVDV, tenCLB);
                    break;
                case 5:
                    input.nextLine();
                    System.out.print("Nhập cự ly: ");
                    String cuLy = input.next();
                    input.nextLine();
                    System.out.print("Nhập kiểu bơi: ");
                    String kieuBoi = input.nextLine();
                    inVDVBoiLoiTheoCuLy(DSVDV, cuLy, kieuBoi);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
                    break;
            }

        } while (choice != 0);
    }

    private static void inDanhSachVDV(ArrayList<VanDongVien> ds) {
        System.out.println("\nDanh sách toàn bộ VDV:");
        for (VanDongVien vdv : ds) {
            System.out.println(vdv.getHoTen() + " - " + vdv.getMonThiDau());
        }
    }

    private static void inDanhSachTheoMon(ArrayList<VanDongVien> ds, String mon) {
        System.out.println("\nDanh sách VDV của môn " + mon + ":");
        for (VanDongVien vdv : ds) {
            if (vdv.getMonThiDau().equalsIgnoreCase(mon)) {
                System.out.println(vdv.getHoTen());
            }
        }
    }

    private static void inCauThuTheoViTri(ArrayList<VanDongVien> ds, String viTri) {
        System.out.println("\nCác cầu thủ đá ở vị trí " + viTri + ":");
        for (VanDongVien vdv : ds) {
            if (vdv instanceof VDVBongDa) {
                VDVBongDa bongDa = (VDVBongDa) vdv;
                if (bongDa.getViTri().equalsIgnoreCase(viTri)) {
                    System.out.println(bongDa.getHoTen());
                }
            }
        }
    }

    private static void inCauThuTheoCLB(ArrayList<VanDongVien> ds, String clb) {
        System.out.println("\nCác cầu thủ thuộc CLB " + clb + ":");
        for (VanDongVien vdv : ds) {
            if (vdv instanceof VDVBongDa) {
                VDVBongDa bongDa = (VDVBongDa) vdv;
                if (bongDa.getClbChuQuan().equalsIgnoreCase(clb)) {
                    System.out.println(bongDa.getHoTen());
                }
            }
        }
    }

    private static void inVDVBoiLoiTheoCuLy(ArrayList<VanDongVien> ds, String cuLy, String kieuBoi) {
        System.out.println("\nCác VDV bơi lội ở cự ly " + cuLy + "m và kiểu bơi " + kieuBoi + ":");
        for (VanDongVien vdv : ds) {
            if (vdv instanceof VDVBoi) {
                VDVBoi boiLoi = (VDVBoi) vdv;
                if (boiLoi.getKieuBoi().equalsIgnoreCase(kieuBoi) && boiLoi.getCuLy().equalsIgnoreCase(cuLy)) {
                    System.out.println(boiLoi.getHoTen());
                }
            }
        }
    }
}
