package spring_app01;

public class Hellokr implements Hello{

	@Override
	public void sayHello(String name) {
		System.out.println(name + " 님 안녕하세요");
	}

}
