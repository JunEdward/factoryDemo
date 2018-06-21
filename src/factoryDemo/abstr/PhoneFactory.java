package factoryDemo.abstr;

import factoryDemo.Phone;
import factoryDemo.func.HuaweiFactory;
import factoryDemo.func.VivoFactory;

public class PhoneFactory extends AbstractFactory {

	@Override
	Phone getHaiwei() {
		// TODO Auto-generated method stub
		return new HuaweiFactory().getPhone();
	}

	@Override
	Phone getVivo() {
		// TODO Auto-generated method stub
		return new VivoFactory().getPhone();
	}

}
