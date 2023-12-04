package th03;

public class ThanhTich {
    private String tenQuocGia;
    private int huyChuongVang;
    private int huyChuongBac;
    private int huyChuongDong;

    public ThanhTich(String tenQuocGia2, int huyChuongVang, int huyChuongBac, int huyChuongDong) {
        this.tenQuocGia = tenQuocGia2;
        this.huyChuongVang = huyChuongVang;
        
        this.huyChuongBac = huyChuongBac;
        this.huyChuongDong = huyChuongDong;
    }

    public String toString() {
        return "Quốc gia: " + tenQuocGia +
               ", Huy chương vàng: " + huyChuongVang +
               ", Huy chương bạc: " + huyChuongBac +
               ", Huy chương đồng: " + huyChuongDong;
    }

	public int huyChuongVang() {
		// TODO Auto-generated method stub
		return 0;
	}

    
}