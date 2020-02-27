package concreteFactory;

import AbstractClass.Cake;
import AbstractClass.GiftBox;
import abstarctFactory.CakeFactory;
import concreteClass.SnowCake;
import concreteClass.SnowCakeGiftBox;

public class SnowCakeFactory implements CakeFactory{

	@Override
	public Cake getCake() {
		// TODO Auto-generated method stub
		return new SnowCake();
	}

	@Override
	public GiftBox getGiftBox() {
		// TODO Auto-generated method stub
		return new SnowCakeGiftBox();
	}
	
}
