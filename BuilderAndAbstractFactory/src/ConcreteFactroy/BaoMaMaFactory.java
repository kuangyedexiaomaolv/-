package ConcreteFactroy;

import AbstractFactory.FactoryInter;
import CarBody.BaoMaBody;
import CarBody.carBody;
import CarPart.BaoMaPart;
import CarPart.carPart;
import CarWheel.BaoMaWheel;
import CarWheel.carWheel;

public class BaoMaMaFactory implements FactoryInter{

	@Override
	public carWheel getWheel() {
		// TODO Auto-generated method stub
		return new BaoMaWheel();
	}

	@Override
	public carBody getBody() {
		// TODO Auto-generated method stub
		return new BaoMaBody();
	}

	@Override
	public carPart getcarPart() {
		// TODO Auto-generated method stub
		return new BaoMaPart();
	}

 

}
