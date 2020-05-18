package spring_app09_anno;

public class Gun implements Weapon {
	int bullet = 0;
	
	
	
	public Gun() {
		this.bullet = 6;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet>0) {
			System.out.println("탕~!");
			bullet--;
		}
	
	
	}

	@Override
	public void reuse() {
		System.out.println("재장전중");
		bullet = 6;
		
	}

	@Override
	public void drop() {
		System.out.println("아놔");
		
		bullet = 0;
		
	}
	
	
	
	
}
