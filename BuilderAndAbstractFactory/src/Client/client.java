package Client;

import AbstractFactory.FactoryInter;
import Builder.Car;
import ConcreteFactroy.AoDiFactory;
import ConcreteFactroy.BaoMaMaFactory;

public class client {
	public static void main(String[] args) {
	   FactoryInter factoryInter = new BaoMaMaFactory();
	   AoDiFactory aoDiFactory = new AoDiFactory();
	   Car car = new Car.myBuilder()
			   .buildercarBody(factoryInter.getBody())
			   .buildercarPart(aoDiFactory.getcarPart())
			   .buildercarWheel(factoryInter.getWheel())
			   .builder();
	  car.getCarBody().produce();
	  car.getCarPart().produce();
	  car.getCarWheel().produce();
	}
}
