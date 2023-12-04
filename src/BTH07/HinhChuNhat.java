package BTH07;

class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double getDT() {
        return chieuDai * chieuRong;
    }

    @Override
    public double getCV() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật - Chiều dài: " + chieuDai + ", Chiều rộng: " + chieuRong + ", " + super.toString();
    }
}