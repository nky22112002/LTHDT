package BTH07;

class HinhTron extends HinhHoc {
    private double x;
    private double y;
    private double banKinh;

    public HinhTron(double x, double y, double banKinh) {
        this.x = x;
        this.y = y;
        this.banKinh = banKinh;
    }

    @Override
    public double getDT() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double getCV() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public String toString() {
        return "Hình tròn - Tâm: (" + x + ", " + y + "), Bán kính: " + banKinh + ", " + super.toString();
    }
}
