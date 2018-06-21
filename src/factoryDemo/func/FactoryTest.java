package factoryDemo.func;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new HuaweiFactory();
		System.out.println(factory.getPhone().getName());

	}

}
