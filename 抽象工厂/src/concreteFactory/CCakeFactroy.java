package concreteFactory;

import AbstractClass.Cake;
import AbstractClass.GiftBox;
import abstarctFactory.CakeFactory;
import concreteClass.CCake;
import concreteClass.CCakeGiftBox;

public class CCakeFactroy  implements CakeFactory {

	@Override
	public Cake getCake() {
		// TODO Auto-generated method stub
		return new CCake();
	}

	@Override
	public GiftBox getGiftBox() {
		// TODO Auto-generated method stub
		return new CCakeGiftBox(); 
		
	}
	

}
