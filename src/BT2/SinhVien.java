package BT2;

import java.time.LocalDate;

public class SinhVien {
	private String hoLot, ten, maSo;
	private int ngay, thang, nam;
    LocalDate currentDate = LocalDate.now();
	public SinhVien() {
		this.hoLot = this.ten = this.maSo = "";
		this.ngay = this.thang = this.nam = 0;
	}
	public SinhVien(String wHolot, String wTen, String wMaSo, int wNgay, int wThang, int wNam) {
		this.hoLot = wHolot;
		this.ten = wTen;
		this.maSo = wMaSo;
		this.ngay = wNgay;
		this.thang = wThang;
		this.nam = wNam;
	}
	public String toString() {
		String thongTinSinhVien = "Họ tên: " + this.hoLot + " " + this.ten
								+ "\nMSSV: " + this.maSo + "\nNgày sinh: " + this.ngay
								+ "/" + this.thang + "/" + this.nam;
		return thongTinSinhVien;
	}
	public int TuoiHienTai() {
		int namHienTai = currentDate.getYear();
		int thangHienTai = currentDate.getMonthValue();
		int ngayHienTai = currentDate.getDayOfMonth();
		int tuoi = namHienTai - this.nam;

        if (thangHienTai < this.thang || (thangHienTai == this.thang && ngayHienTai < this.ngay)) {
            tuoi--;
        }

        return tuoi;
	}
	public boolean KhuonDangTen(String T) {
		if(this.ten.contains(T)) {
			return true;
		}
		return false;
	}
	public boolean KhopNgayThang (int D, int M) {
		if(this.ngay == D && this.thang == M) {
			return true;
			}
		return false;
	}
}
