package BT1;

public class PhanSo {
	private long tuSo, mauSo;
	public long khongThamSo() {
		this.mauSo = 1;
		this.tuSo = 0;
		return 0;
	}
	public PhanSo() {}
	public PhanSo(long a, long b) {
		this.tuSo = a;
		this.mauSo = b;
	}
	public long motThamSo(int k) {
		this.tuSo = k;
		this.mauSo = 1;
		long ketQua = this.tuSo / this.mauSo;
		return ketQua;
	}
	public double haiThamSo(int m, int n) {
		double tuSo = m;
		double mauSo = n;
		return (mauSo != 0) ? (tuSo / mauSo) : 0; 
	}
	public String toString() {
		String ketQua = "Gia tri cua tu so la: " + this.tuSo 
				+ "\nGia tri cua mau so la: " + this.mauSo
				+ "\nGia tri cua phan so la: " +
				((this.mauSo != 0) ? ((double)this.tuSo / (double)this.mauSo) : 0);
		return ketQua;
	}
	private int timGCD(long a, long b) {
		return (int) ((b == 0) ? a : timGCD(b, a % b));
	}
	public void toiGian() {
		int gcd = timGCD(this.tuSo, this.mauSo);
		tuSo = this.tuSo / gcd;
		mauSo = this.mauSo / gcd;
		System.out.println("Phan so sau khi toi gian " + tuSo + "/" + mauSo);
	}
	public PhanSo congPhanSo(PhanSo p) {
        int newTuSo = (int) (this.tuSo * p.mauSo + p.tuSo * this.mauSo);
        int newMauSo = (int) (this.mauSo * p.mauSo);
        return new PhanSo(newTuSo, newMauSo);
    }
	public void inPhanSo() {
        System.out.println(this.tuSo + "/" + this.mauSo);
    }
	public PhanSo NghichDaoPhanSo() {
	    if (this.tuSo == 0) {
	        System.out.println("Không thể nghịch đảo phân số với tử số bằng 0.");
	        // Trong trường hợp tử số là 0, không thể nghịch đảo phân số.
	        return null;
	    }
	    
	    return new PhanSo(this.mauSo, this.tuSo);
	}
	public PhanSo NhanPhanSo(PhanSo p) {
	    int newTuSo = (int) (this.tuSo * p.tuSo);
	    int newMauSo = (int) (this.mauSo * p.mauSo);

	    return new PhanSo(newTuSo, newMauSo);
	}
	
}
