package BTH07;

class HinhVuong extends HinhHoc {
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double getDT() {
        return canh * canh;
    }

    @Override
    public double getCV() {
        return 4 * canh;
    }

    @Override
    public String toString() {
        return "Hình vuông - Cạnh: " + canh + ", " + super.toString();
    }
}