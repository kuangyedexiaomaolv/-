package abstarctFactory;

import AbstractClass.Cake;
import AbstractClass.GiftBox;

/*cateFactory接口抽象工厂
 * 2020/2/26
 * @author 于增才
 * 
 *此类中的产品结构为蛋糕和礼盒
 *增加族即所谓的继承同一个父类如extends Cake
 *增加产品结构困难我的理解为在抽象工厂中已经给定了Cake() 和GiftBox()两种结构如果要增加则要在其中另外添加违反开闭原则应该说的就是这个，    
 *在此例中增加产品族简单就是如：  雪花糕   雪花礼盒 都属于雪花一个族   
 *
 *
 *为什么一直不理解的原因是：
 *       认为实现工厂接口之后在子类中指定返回的产品结构也可以如：
 *       我添加一个  papper
 *        雪花papper 在工厂的子类中添加return new 雪花papper（这种理解是这错误的，虽然也可以增加产品结构应该）
 * 
 */

public interface CakeFactory {
	Cake getCake();  //Cake 是一个抽象类产品
	GiftBox getGiftBox();  //GiftBox同样是一个抽象产品

}
