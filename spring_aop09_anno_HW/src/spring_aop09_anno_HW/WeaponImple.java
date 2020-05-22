package spring_aop09_anno_HW;

public class WeaponImple implements Weapon {

	String w;
	
	
	
	
	public void setW(String w) {
		this.w = w;
	}

	@Override
	public void fire() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(w+ "발사함");
		
	}

	@Override
	public void reload() {
		System.out.println("재장전");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(w + "재장전 완료");
	}

}
