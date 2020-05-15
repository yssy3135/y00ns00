package spring_app02;

public class BevImple implements Beverage {
	
	
	String product;
	
	public BevImple() { // 생성자는 데이터 초기화를 목적으로 한다.
		this.product = "냉수";
	}
	
	public BevImple(String product) {
		this.product = product;
	}
	
	
	@Override
	public void drink(String name) {
		// TODO Auto-generated method stub
		System.out.println(name +"님이 " + product + "를 홀짝홀짝 마셔요");
	}
}
