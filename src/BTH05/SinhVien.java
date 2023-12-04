package BTH05;
public class SinhVien {
	private String hoLot, ten, maSo, nganh, queQuan;
	private int ngay, thang, nam;
	public SinhVien() {
		this.nganh = this.queQuan = this.hoLot = this.ten = this.maSo = "";
		this.ngay = this.thang = this.nam = 0;
	}
	public SinhVien(String wHolot, String wTen, String wMaSo, String wNganh,
			String wQueQuan, int ngay, int thang, int nam) {
		this.hoLot = wHolot;
		this.ten = wTen;
		this.maSo = wMaSo;
		this.nganh = wNganh;
		this.queQuan = wQueQuan;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public void printInf() {
        System.out.println("Mã sinh viên: " + maSo);
        System.out.println("Họ và tên: " + hoLot + " " + ten);
        System.out.println("Ngày sinh: " + ngay + "/" + thang + "/" + nam);
        System.out.println("Ngành học: " + nganh);
        System.out.println("Quê quán: " + queQuan);
    }
	public void filterByDateAndMonth(int day, int month) {
		if(this.ngay == day && this.thang == month) {
			System.out.println("Mã sinh viên: " + this.maSo);
	        System.out.println("Họ và tên: " + this.hoLot + " " + this.ten);
	        System.out.println("Ngày sinh: " + this.ngay + "/" + this.thang + "/" + this.nam);
	        System.out.println("Ngành học: " + this.nganh);
	        System.out.println("Quê quán: " + this.queQuan);
		}
	}
	public void filterByName(String name) {
		name = name.trim();
		if(this.ten.equalsIgnoreCase(name)) {
			System.out.println("Mã sinh viên: " + this.maSo);
	        System.out.println("Họ và tên: " + this.hoLot + " " + this.ten);
	        System.out.println("Ngày sinh: " + this.ngay + "/" + this.thang + "/" + this.nam);
	        System.out.println("Ngành học: " + this.nganh);
	        System.out.println("Quê quán: " + this.queQuan);
		}
	}
	public void filterByID(String id) {
		id.replaceAll("\\s", "");
		if(this.maSo.equalsIgnoreCase(id)) {
			System.out.println("Mã sinh viên: " + this.maSo);
	        System.out.println("Họ và tên: " + this.hoLot + " " + this.ten);
	        System.out.println("Ngày sinh: " + this.ngay + "/" + this.thang + "/" + this.nam);
	        System.out.println("Ngành học: " + this.nganh);
	        System.out.println("Quê quán: " + this.queQuan);
		}
	}
	public String getHoLot() {
        return hoLot;
    }

    public void setHoLot(String hoLot) {
        this.hoLot = hoLot;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}
	
