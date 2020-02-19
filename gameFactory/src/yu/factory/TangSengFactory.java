package yu.factory;

import yu.game.Chacter;
import yu.game.TangSeng;

public class TangSengFactory implements factoryInt {

	@Override
	public Chacter getFactory() {
		// TODO Auto-generated method stub
		return new TangSeng();
	}

}
