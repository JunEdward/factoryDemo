package factoryDemo.func;

import factoryDemo.Huawei;
import factoryDemo.Phone;

public class HuaweiFactory implements Factory {

	@Override
	public Phone getPhone() {
		// TODO Auto-generated method stub
		return new Huawei();
	}

}
