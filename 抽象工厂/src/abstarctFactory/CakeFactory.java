package abstarctFactory;

import AbstractClass.Cake;
import AbstractClass.GiftBox;

/*cateFactory�ӿڳ��󹤳�
 * 2020/2/26
 * @author ������
 * 
 *�����еĲ�Ʒ�ṹΪ��������
 *�����弴��ν�ļ̳�ͬһ��������extends Cake
 *���Ӳ�Ʒ�ṹ�����ҵ����Ϊ�ڳ��󹤳����Ѿ�������Cake() ��GiftBox()���ֽṹ���Ҫ������Ҫ�������������Υ������ԭ��Ӧ��˵�ľ��������    
 *�ڴ��������Ӳ�Ʒ��򵥾����磺  ѩ����   ѩ����� ������ѩ��һ����   
 *
 *
 *Ϊʲôһֱ������ԭ���ǣ�
 *       ��Ϊʵ�ֹ����ӿ�֮����������ָ�����صĲ�Ʒ�ṹҲ�����磺
 *       �����һ��  papper
 *        ѩ��papper �ڹ��������������return new ѩ��papper����������������ģ���ȻҲ�������Ӳ�Ʒ�ṹӦ�ã�
 * 
 */

public interface CakeFactory {
	Cake getCake();  //Cake ��һ���������Ʒ
	GiftBox getGiftBox();  //GiftBoxͬ����һ�������Ʒ

}
