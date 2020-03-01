package ConcreteFactroy;

import AbstractFactory.FactoryInter;
import CarBody.AoDiBody;
import CarBody.carBody;
import CarPart.AoDiPart;
import CarPart.carPart;
import CarWheel.AoDiWheel;
import CarWheel.carWheel;

public class AoDiFactory implements FactoryInter {

	@Override
	public carWheel getWheel() {
		// TODO Auto-generated method stub
		return new AoDiWheel();
	}

	@Override
	public carBody getBody() {
		// TODO Auto-generated method stub
		return new AoDiBody();
	}

	@Override
	public carPart getcarPart() {
		// TODO Auto-generated method stub
		return new AoDiPart();
	}

}
