package spring_app05_maven;

public class Gun implements Weapon {
	int bullet;
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("탕");
		bullet = 0;
	}

	@Override
	public void reuse() {
		System.out.println("재충전");
		bullet = 1;
		
	}

	@Override
	public void drop() {
		System.out.println("충전기 보급 좀.....");
		bullet = 0;
		
	}
	
	
	
	
}
