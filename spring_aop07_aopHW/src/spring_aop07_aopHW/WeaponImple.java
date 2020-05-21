package spring_aop07_aopHW;

public class WeaponImple implements Weapon {

	String w;
	
	
	
	
	public void setW(String w) {
		this.w = w;
	}

	@Override
	public void fire() {
		System.out.println(w+"이거 쓸거");
		
	}

	@Override
	public void reload() {
		System.out.println("재장전");
	}

}
