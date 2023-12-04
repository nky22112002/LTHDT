package BTH07;

class HinhVanhKhan extends HinhHoc {
    private double x;
    private double y;
    private double banKinh;
    private double banKinhNho;

    public HinhVanhKhan(double x, double y, double banKinh, double banKinhNho) {
        this.x = x;
        this.y = y;
        this.banKinh = banKinh;
        this.banKinhNho = banKinhNho;
    }

    @Override
    public double getDT() {
        return Math.PI * (banKinh * banKinh - banKinhNho * banKinhNho);
    }

    @Override
    public double getCV() {
        return 2 * Math.PI * banKinh + 2 * Math.PI * banKinhNho;
    }

    @Override
    public String toString() {
        return "Hình vành khăn - Tâm: (" + x + ", " + y + "), Bán kính lớn: " + banKinh + ", Bán kính nhỏ: " + banKinhNho + ", " + super.toString();
    }
}
