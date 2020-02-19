package Test;

import yu.factory.SunWuKongFactory;
import yu.factory.TangSengFactory;
import yu.factory.factoryInt;

public class test {
	public static void main(String[] args) {
	 factoryInt factoryInt = new TangSengFactory();
	 String name = factoryInt.getFactory().getName();
	 System.out.println(name); 
	}
}
