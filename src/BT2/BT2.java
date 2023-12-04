package BT2;

public class BT2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Nguyễn", "Thanh", "102912048", 22, 11, 2002);
		System.out.print(sv1.toString());
		System.out.print("\nTuổi hiện tại của sv: " + sv1.TuoiHienTai());
		if(sv1.KhuonDangTen("Th")) {
			System.out.print("\ntrue");
		}else {
			System.out.print("\nfalse");
		}
		if(sv1.KhopNgayThang(22, 11)) {
			System.out.print("\nKhớp ngày với tháng sinh của sinh viên");
		}else {
			System.out.print("\nKhông khớp ngày tháng sinh của sinh viên");
		}
	}
}
