package yu.factory;
import yu.game.Chacter;
import yu.game.SuWuKong;
public class SunWuKongFactory implements factoryInt {

	@Override
	public Chacter getFactory() {
		 
 		return new SuWuKong();
	}

 
}
