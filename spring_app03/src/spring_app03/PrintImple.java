package spring_app03;

public class PrintImple implements Printer {
	
	String msg;
	
	@Override
	public void print(String msg) {
		this.msg = msg;

	}
	public PrintImple() {
	
	}
	
	public PrintImple(String msg) {
		this.msg = msg;
		System.out.println("따다다다다닥~~~"+msg);
	}

	
	public void LaserPrinter(String msg) {
		this.msg = msg;
		System.out.println("지이이이잉~~~~~~~"+msg);
	}
	

}
