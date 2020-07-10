package python.run;

/**
 * 代理模式
 * @author asus
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		person p = new person(new man());
		p.eat();
	}
}

interface method{
	void eat();
}

class man implements method{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("man eat");
	}
	
}

class person implements method{

	private method e;
	
	person(method e){
		this.e = e;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		e.eat();
	}
	
}