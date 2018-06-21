package factoryDemo.simple;

import factoryDemo.Huawei;
import factoryDemo.Vivo;

public class SimpleFactory {
	
	String getName(String phoneName) {
		if("Huawei".equalsIgnoreCase(phoneName)) {
			return new Huawei().getName();
		} else if("Vivo".equalsIgnoreCase(phoneName)) {
			return new Vivo().getName();
		}
		return null;
	}

}
