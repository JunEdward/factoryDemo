package factoryDemo.abstr;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneFactory factory = new PhoneFactory();
		System.out.println(factory.getHaiwei().getName());

	}

}
