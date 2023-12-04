package BT1;

public class BT1 {
	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo(10, 5);
		PhanSo ps3 = new PhanSo(2, 3);
		System.out.println("Hàm không tham số: " + ps1.khongThamSo());
		System.out.println("Hàm 1 tham số: " + ps1.motThamSo(3));
		System.out.println("Hàm 2 tham số khi mẫu khác 0: " + ps1.haiThamSo(2, 3));
		System.out.println("Hàm 2 tham số khi mẫu = 0: " + ps1.haiThamSo(2, 0));
		System.out.println("Phương thức toString(): \n" + ps1.toString());
		ps2.toiGian();
		PhanSo ketQua = ps2.congPhanSo(ps3);
		ketQua.toiGian();
        System.out.print("Tổng của hai phân số: ");
        ketQua.inPhanSo();
		PhanSo ps4 = ps2.NghichDaoPhanSo();
		System.out.print("Nghịch đảo phân số: ");
		ps4.inPhanSo();
		PhanSo ps5 = ps3.NhanPhanSo(ps4);
		ps5.toiGian();
        System.out.print("Tích của hai phân số là: ");
        ps5.inPhanSo();
        
	}
}
