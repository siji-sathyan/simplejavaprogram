
public class MyDate {
	private int dd,mm,yy;

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	public static void main(String[] args) {
		MyDate d=new MyDate();
		d.setDd(9);
		d.setMm(4);
		d.setYy(2021);
		System.out.println("Date="+d.getDd()+"/"+d.getMm()+"/"+d.getYy());
	}

}
