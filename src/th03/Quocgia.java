package th03;

public class Quocgia {
	
	    private String tenQuocGia;
	    private String thuDo;
	    private int danSo;
	    private int dienTich;

	    public Quocgia(String tenQuocGia, String thuDo, int danSo, int dienTich) {
	        this.tenQuocGia = tenQuocGia;
	        this.thuDo = thuDo;
	        this.danSo = danSo;
	        this.dienTich = dienTich;
	    }

	    public String toString() {
	        return "Tên quốc gia: " + tenQuocGia +
	               ", Thủ đô: " + thuDo +
	               ", Dân số: " + danSo + " triệu người" +
	               ", Diện tích: " + dienTich + " km²";
	    }
	    
	   
	}