package day1;

public enum JenisKelamin {
	
	LAKI("Laki-laki", "L", 0), WANITA("Wanita", "W", 1);
	
	public String jenis;
	public String tipe;
	public int index;
	
	JenisKelamin(String jenis, String tipe, int index) {
		this.jenis = jenis;
		this.tipe = tipe;
		this.index = index;
	}
	
	public String getJenis() {
		return this.jenis;
	}
}
