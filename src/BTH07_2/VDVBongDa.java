package BTH07_2;

class VDVBongDa extends VanDongVien {
    private String viTri;
    private int soAo;
    private String clbChuQuan;

    public VDVBongDa(String hoTen, String monThiDau, String viTri, int soAo, String clbChuQuan) {
        super(hoTen, monThiDau);
        this.viTri = viTri;
        this.soAo = soAo;
        this.clbChuQuan = clbChuQuan;
    }

    public String getViTri() {
        return viTri;
    }

    public int getSoAo() {
        return soAo;
    }

    public String getClbChuQuan() {
        return clbChuQuan;
    }

    // Các phương thức khác tùy ý có thể thêm vào
}