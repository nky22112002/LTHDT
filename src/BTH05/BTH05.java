package BTH05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BTH05 {
	public static void main (String[] args) {
		String filePath = "C:\\Users\\Nguyen Ky\\eclipse-workspace\\test\\src\\BTH05\\SinhVien.txt";
		ArrayList<SinhVien> List = new ArrayList<SinhVien>();
		ArrayList<SinhVien> WorkingList = new ArrayList<SinhVien>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        	String line;
        	boolean passFirstLine = false;
            while ((line = reader.readLine()) != null) {
            	if (!passFirstLine) {
            		passFirstLine = true;
                    continue;
                }
            	String [] inf = line.split(",");
            	String id = inf[0];
                String surname = inf[1];
                String name = inf[2];
                String dateStr = inf[3];
                String major = inf[4];
                String homeTown = inf[5];
                
                String[] DateParts = dateStr.split("-");
                int day = Integer.parseInt(DateParts[0]);
                int month = Integer.parseInt(DateParts[1]);
                int year = Integer.parseInt(DateParts[2]);
                
                SinhVien sinhVien = new SinhVien(surname, name, id, major, homeTown, day, month, year);
                List.add(sinhVien);
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(System.in);
    	int choose = 1;
    	char chooseStr;
        do {
        	System.out.println("1- Lập bộ lọc theo Ngành học");
        	System.out.println("2- Kết thúc chương trình.");
        	System.out.print("Chọn: ");
            choose = scanner.nextInt();
            switch(choose) {
            case 1: 
            	do {
                	System.out.println("a- Liệt kê danh sách sinh viên.");
                	System.out.println("b- Nhập ngày D và tháng M. In danh sách các sinh viên sinh ngày D/M");
                	System.out.println("c- Nhập khuôn dạng tên T. In danh sách các sinh viên có khuôn dạng tên giống T.");
                	System.out.println("d- Nhập khuôn dạng mã số M. In danh sách các sinh viên có khuôn dạng mã số giống M.");
                	System.out.println("e- Xóa bộ lọc.");
                	System.out.print("Chọn: ");
                	chooseStr = scanner.next().charAt(0);
                	int day, month;
                	String name, id;
                	switch(chooseStr) {
                	case 'a':
                		int i = 1;
                        for(SinhVien sv : List) {
                        	System.out.println("Thông tin sinh viên " + i + ":");
                        	sv.printInf();
                        	i++;
                        }
                		break;
                	case 'b':
                		System.out.print("Nhập Ngày sinh: ");
                		day = scanner.nextInt();
                		System.out.print("Nhập tháng sinh: ");
                		month = scanner.nextInt();
                		for(SinhVien sv : List) {
                			sv.filterByDateAndMonth(day, month);
                		}
                		break;
                	case 'c':
                		System.out.print("Nhập tên cần tìm: ");
                		name = scanner.next();
                		for(SinhVien sv : List) {
                			sv.filterByName(name);
                		}
                		break;
                	case 'd':
                		System.out.print("Nhập mã số cần tìm: ");
                		id = scanner.next();
                		for(SinhVien sv : List) {
                			sv.filterByID(id);
                		}
                		break;
                	case 'e':
                		break;
                	default:
                        System.out.println("Tùy chọn không hợp lệ.");
                        break;
                	}
                	if(chooseStr == 101) {
                		break;
                	}
            	}while(chooseStr >= 97 && chooseStr < 102);
            	break;
            case 2:
            	System.out.print("Thoát chương trình...");
            	break;
            default:
                System.out.println("Tùy chọn không hợp lệ. Mời nhập lại số bất kì khác 0");
                break;
            }
            if(choose == 2) {
            	break;
            }
        }while(choose != 0);
	}
}
