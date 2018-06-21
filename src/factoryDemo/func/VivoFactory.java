package factoryDemo.func;

import factoryDemo.Phone;
import factoryDemo.Vivo;

public class VivoFactory implements Factory {

	@Override
	public Phone getPhone() {
		// TODO Auto-generated method stub
		return new Vivo();
	}

}
