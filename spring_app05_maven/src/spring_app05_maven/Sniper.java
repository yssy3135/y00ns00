package spring_app05_maven;

public class Sniper implements Character {
	Weapon w;
	Gun g;
	
	int hp;

	
	
	public Weapon getW() {
		return w;
	}
	public void setW(Weapon w) {
		this.w = w;
	}
	public Gun getG() {
		return g;
	}
	public void setG(Gun g) {
		this.g = g;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	@Override
	public void attack(Object obj) {
		System.out.println("인질범을 숨을 멈추고");
		w.use();
		System.out.println("쏜다");
	}
	public Sniper() {
		this.hp = 150;
	}
	public Sniper(Weapon w, int hp ) {
		this.w = w;
		this.hp = hp;
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		
	}
	
	
}
