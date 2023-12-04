package BTH07_2;

class VDVBoi extends VanDongVien {
    private String monSoTruong;
    private String clbChuQuan;
    private String kieuBoi;
    private String cuLy;
    public VDVBoi(String hoTen, String monThiDau, String monSoTruong, String clbChuQuan, String cuLy, String kieuBoi) {
        super(hoTen, monThiDau);
        this.monSoTruong = monSoTruong;
        this.clbChuQuan = clbChuQuan;
        this.cuLy = cuLy;
        this.kieuBoi = kieuBoi;
    }

    public String getMonSoTruong() {
        return monSoTruong;
    }
    
    public String getKieuBoi() {
    	return kieuBoi;
    }
    
    public String getCuLy() {
    	return cuLy;
    }
    
    public String getClbChuQuan() {
        return clbChuQuan;
    }

    // Các phương thức khác tùy ý có thể thêm vào
}

