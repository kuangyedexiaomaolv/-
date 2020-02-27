package Client;

import abstarctFactory.CakeFactory;
import concreteFactory.CCakeFactroy;
import concreteFactory.SnowCakeFactory;

public class Test {
	public static void main(String[] args) {
		CakeFactory cakeFactory = new SnowCakeFactory();
		cakeFactory.getCake().produce();;
		cakeFactory.getGiftBox().produce(); 
		CakeFactory cakeFactory1 = new CCakeFactroy();
		cakeFactory1.getCake().produce();
		cakeFactory1.getGiftBox().produce();  
	}
}
