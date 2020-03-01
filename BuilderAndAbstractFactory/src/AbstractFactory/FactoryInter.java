package AbstractFactory;
import CarBody.carBody;
import CarPart.carPart;
import CarWheel.carWheel;

public interface FactoryInter {
	public carWheel getWheel();
	public carBody  getBody();
	public carPart getcarPart();
}
