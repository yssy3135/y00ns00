package spring_app05_maven;

public class Sniper implements Character {
	Weapon w;
	Gun g;
	StunGun s;
	
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
		System.out.println(obj+ " 조준하고 호흡을 멈추고 쏜다.");
		w.use();
		
	}
	public Sniper() {
		this.hp = 100;
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
